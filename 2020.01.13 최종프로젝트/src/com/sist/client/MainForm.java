package com.sist.client;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
//Server
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.sist.common.Function;
import com.sist.dao.MemberDAO;

 public class MainForm extends JFrame implements ActionListener,Runnable,MouseListener{
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	GameRoom gr=new GameRoom();
	MakeRoom mr=new MakeRoom();
	CardLayout card=new CardLayout();
	// ��������� ���õ� ���̺귯��
	Socket s;// ��������
	OutputStream out; // ������ ������ ����
	BufferedReader in; // �������� ������ �����͸� ����
	/*
	 *  1) ������ ���� ������ ������ => �̺�Ʈ �߻�
	 *
	 *  2) �������� ������ ������  => Thread�̿��ؼ� ��� (Function)
	 */
	String myRoom,myId;
	MainForm() {

		setLayout(card);
		add("LOGIN", login);
		add("WR",wr);
		add("GAME", gr);

		setBounds(448,216,1024, 780);
		setVisible(true); //�����츦 ������

		setResizable(false);  // ȭ�����
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		login.b1.addActionListener(this);
		wr.tf.addActionListener(this); // enter �� ����
		wr.b6.addActionListener(this); // b6 =������ ��ư
		wr.b1.addActionListener(this); // b1 = �游��� ��ư

		 mr.b1.addActionListener(this); // ���� �游���
		 mr.b2.addActionListener(this);
		 wr.table1.addMouseListener(this);

		 gr.tf.addActionListener(this);
		 gr.b5.addActionListener(this);    ///b5= �� ������ ��ư
		 gr.b2.addActionListener(this);
	}
	public static void main(String[] args) {
	 	try
	 	{
	 		UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
	 		JFrame.setDefaultLookAndFeelDecorated(true);
	 	}
	 catch(Exception e) {}
	 new MainForm();


}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			String id=login.tf.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID���Է��Ͻÿ�");
				login.tf.requestFocus();
				return;
		    }
			String pw=String.valueOf(login.pf.getPassword());
			if(pw.length()<1)
			{
				JOptionPane.showMessageDialog(this, "PW�Է��Ͻÿ�");
				login.pf.requestFocus();

				return;
		    }

			//ó��
			MemberDAO dao=new MemberDAO();
			String result=dao.isLogin(id,pw);
			if(result.equals("NOID"))
			{
				JOptionPane.showMessageDialog(this, "ID�� �������� �ʽ��ϴ�");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();

			}
			else if (result.equals("NOPW"))
			{
				JOptionPane.showMessageDialog(this, "��й�ȣ�� Ʋ���ϴ�");
				login.pf.setText("");
				login.pf.requestFocus();

			}
			else
			{

				connection(result);
				System.out.println(result);
			}
		}
		else if(e.getSource()==wr.tf) // ����ä��
		{
			//�Էµ� ���ڿ� �б�
			String msg=wr.tf.getText();
			if(msg.length()<1)
			{
				wr.tf.requestFocus();
				return;
			}
			// ������ ����
			try
			{
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			wr.tf.setText("");
		}

		// ������
		else if(e.getSource()==wr.b6)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
				/*
				 * 	������ =>  ��û
				 * 						===
				 * 						ó�� => ����
				 * 						������ => Ŭ���̾�Ʈ
				 * 				 */
			}catch(Exception ex) {}
		}
		else  if (e.getSource()==wr.b1) // �游��� ��ư Ŭ��
		{

			// �ʱ�ȭ �ڵ�
			mr.tf.setText("");
			mr.rb1.setSelected(true);
			mr.box.setSelectedIndex(0);
			mr.la4.setVisible(false);
			mr.pf.setVisible(false);
			mr.pf.setText("");
			mr.tf.requestFocus();
			 mr.setVisible(true);
		}
		else  if(e.getSource()==mr.b1)
		{
			// 1. ���̸�
			String rn=mr.tf.getText();
			if(rn.length()<1)
			{
				JOptionPane.showMessageDialog(this, "���̸��� �Է��ϼ���");
				mr.tf.requestFocus();
				return;  // ����
			}
			for(int i=0; i<wr.model1.getRowCount();i++)
			{
				String roomName=wr.model1.getValueAt(i, 0).toString();
				if(rn.equals(roomName))
				{
					JOptionPane.showMessageDialog(this, "�̹� �����ϴ� ���Դϴ� \n �ٽ� �Է��ϼ���");
					mr.tf.setText("");
					mr.tf.requestFocus();
					return;   // ����
				}

		}

		String rs="";
		String rp="";
		if(mr.rb1.isSelected())
		{
			rs="����";
			rp=" ";  // �����ϳ� ��� ĭ�� �ʿ��� ( stringTokenizer�� ���ڸ�)
		}
		else
		{
			rs="�����";
			rp=String.valueOf(mr.pf.getPassword());
		}
		// �ο�
		int inwon=mr.box.getSelectedIndex()+2;
		// ������ ����
		try
		{
		out.write((Function.MAKEROOM+"|"+rn+"|"+rs+"|"+rp+"|"+inwon+"\n").getBytes());
		}catch (Exception ex) {}
		mr.setVisible(false);
		}
		else if(e.getSource()==mr.b2)
		 {
			 mr.setVisible(false);
		 }////
		else if(e.getSource()==gr.tf)
		{
			String msg=gr.tf.getText();
			if(msg.length()<1)
				return;
			try
			{ // ������ ������												���̸�
				out.write((Function.ROOMCHAT+"|"+myRoom+"|"+msg+"\n").getBytes());
			}catch(Exception ex){}
			gr.tf.setText("");
		}
		else if(e.getSource()==gr.b5) // �׹� ������.
		{
			try
			{
				out.write((Function.ROOMOUT+"|"+myRoom+"\n").getBytes());
			}catch(Exception ex) {}
		}
		else if(e.getSource()==gr.b2)
		{
			String youId=gr.box.getSelectedItem().toString();
			try
			{
				out.write((Function.KANG+"|"+myRoom+"|"+youId+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}// actionperformed end
	public void connection(String userData)
	{
		try
		{
			s=new Socket("localhost",8888);
			//�ۼ��� Ȯ��
			// �۽�
			out = s.getOutputStream();
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));

			//�α��� ������ ������
			// 100 | hong | ȫ�浿 |���� | ���� ( ����ġ ) \n
			out.write((Function.LOGIN+"|"+userData+"\n").getBytes());
		}catch(Exception ex) {}
		new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
			System.out.println(msg);
			StringTokenizer st=new StringTokenizer(msg,"|");
			int protocol=Integer.parseInt(st.nextToken());
			switch(protocol)
			{
				case Function.LOGIN:
				{
					String [] data= {
							st.nextToken(),   // id
							st.nextToken(),  // name
							st.nextToken(),  //sex
							st.nextToken()  //loc
						};
					wr.model2.addRow(data);
					break;
				}
				case Function.MYLOG:
				{
					String id=st.nextToken();
					setTitle(id);
					card.show(getContentPane(), "WR");
					break;
				}
				case Function.WAITCHAT:
				{
					wr.tp.append(st.nextToken()+"\n");
					break;
				}
				case Function.EXIT: //�����ִ� ���
				{
					String id=st.nextToken(); // ������� id�� ã�Ƽ� i ��° 0ĭ�� ��ġ�ϸ� �� �� ������
					for(int i=0; i<wr.model2.getRowCount(); i++)
					{
						String mid=wr.model2.getValueAt(i, 0).toString();
								//String mid=(String)wr.model2.getValueAt(i, 0)
						if(mid.equals(id))
						{
							wr.model2.removeRow(i);
						}
					}
					break;
				}
				case Function.MYEXIT: //���� ������ ���
				{
					dispose();
					System.exit(0);  // ���α׷� ����
				}
				case Function.MAKEROOM:
				{
					String[] data= {
							st.nextToken(), // ���̸�
							st.nextToken(), // ����
							st.nextToken() // 1/6
					};
					wr.model1.addRow(data);
					break;
				}
				case Function.ROOMIN:
				{
					/*
					 * messageTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avatar);
					 * break;
					 */
					myRoom=st.nextToken();
					String id=st.nextToken();
					String sex=st.nextToken();
					String avatar=st.nextToken();
					//String bang=st.nextToken();
					myId=id;
					String temp="";
					if(sex.equals("����"))
					{
						temp="m"+avatar;
					}
					else
					{
						temp="w"+avatar;  //m1.png�� �Ǿ�����
					}
					// ȭ���̵�
					card.show(getContentPane(), "GAME");  // game���� �̵��ض�
					for(int i=0;i<6;i++)
					{
						if(gr.sw[i]==false)
						{
							gr.sw[i]=true;
							gr.pans[i].removeAll();  // ���� ������ ���ο� ���� �ø� �� �ִ�
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+".png"), 150, 120))));
							gr.pans[i].validate();  // ���ġ remove-validate
							gr.ids[i].setText(id);
							break;
						}
					}
					break;
				}
				case Function.ROOMADD:
				{
					String id=st.nextToken();
					String sex=st.nextToken();
					String avatar=st.nextToken();

					String temp="";
					if(sex.equals("����"))
					{
						temp="m"+avatar;
					}
					else
					{
						temp="w"+avatar;  //m1.png�� �Ǿ�����
					}
					for(int i=0;i<6;i++)
					{
						if(gr.sw[i]==false)
						{
							gr.sw[i]=true;
							gr.pans[i].removeAll();  // ���� ������ ���ο� ���� �ø� �� �ִ�
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+".png"), 150, 120))));
							gr.pans[i].validate();  // ���ġ remove-validate
							gr.ids[i].setText(id);
							break;
						}
					}
					gr.box.addItem(id);
					break;
				}
				case Function.ROOMCHAT:
				{
					gr.ta.append(st.nextToken()+"\n");
					break;
				}/////////////
				case Function.WAITUPDATE:
				{
					//messageAll(Function.WAITUPDATE+"|"+room.roomName+"|"+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
					String rn=st.nextToken();
					String current=st.nextToken();
					String maxcount=st.nextToken();
					String id=st.nextToken();
					String pos=st.nextToken();


					// t1���� ���� ã��
					for(int i=0; i<wr.model1.getRowCount(); i++)
					{
						String roomName=wr.model1.getValueAt(i, 0).toString();
						if(rn.equals(roomName))
						{
							if(Integer.parseInt(current)==0)
							{
									wr.model1.removeRow(i);
							}
							else
							{
									wr.model1.setValueAt(current+"/"+maxcount, i, 2);
							}
							break;
						}
					}
					//������ ��� ����
					for( int i=0; i<wr.model2.getRowCount();i++)
					{
						String mid=wr.model2.getValueAt(i, 0).toString();
						if(mid.equals(id))
						{
							wr.model2.setValueAt(pos, i, 3);
						}
					}
					break;
				}
				case Function.POSCHANGE:
				{
					String id=st.nextToken();
					String pos=st.nextToken();
					//String bang=st.nextToken();
					for( int i=0; i<wr.model2.getRowCount();i++)
					{
						String mid=wr.model2.getValueAt(i, 0).toString();
						if(mid.equals(id))
						{
							wr.model2.setValueAt(pos, i, 3);
						}
					}
					break;
				}
				case Function.ROOMOUT:
				{/////
					String id=st.nextToken();
					for(int i=0;i<6;i++)
					{
						String mid=gr.ids[i].getText();
						if(id.equals(mid))  // ���̵� ������ �����ض�
						{
							gr.sw[i]=false;
							gr.pans[i].removeAll();
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));
							gr.pans[i].validate();
							gr.ids[i].setText("");
							break;
						}
					}
					break;
				}
				case Function.MYROOMOUT:
				{
					// �ʱ�ȭ ( ���� ���������� ���� )
					for(int i=0;i<6;i++)
					{
						gr.sw[i]=false;
						gr.pans[i].removeAll();
						gr.pans[i].setLayout(new BorderLayout());
						gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));
						gr.pans[i].validate();
						gr.ids[i].setText("");
					}
					gr.ta.setText("");
					gr.tf.setText("");
					card.show(getContentPane(), "WR");  // ���Ƿ� �̵��ض�
					break;
				}
				case Function.KANG:
				{
					String rn=st.nextToken();
					JOptionPane.showMessageDialog(this, rn+"�濡�� ����Ǿ����ϴ�");
					out.write((Function.ROOMOUT+"|"+rn+"\n").getBytes());
					break;
				}
			  }
			}
		}catch (Exception ex ) {}
	}
	/*
	 * 		swtich(no)
	 *   {
	 *     case1:
	 *     	int num=3;
	 *     	break;
	 *     case2:
	 *     	int num=5;
	 *     	break;
	 *     case3:
	 *     	int num=7;
	 *     	break;
	 *    }
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==wr.table1)
		{
			if(e.getClickCount()==2) // ���� Ŭ�� => ���̸� �˻��ؼ� ����
			{
				//���̸�
				int row=wr.table1.getSelectedRow();  // ��° �� ����?
				String rn=wr.model1.getValueAt(row, 0).toString();
				String inwon=wr.model1.getValueAt(row, 2).toString();  // �� ��?
				// String state=wr.model1.getValueAt(row, 1).toString();
				StringTokenizer st=new StringTokenizer(inwon,"/");
				int no1=Integer.parseInt(st.nextToken());  // 1
				int no2=Integer.parseInt(st.nextToken());  //   /2
				if(no1==no2)
				{
					// �濡 �� �� ����
					JOptionPane.showMessageDialog(this,
							"�̹� ���� �� á���ϴ�\n �ٸ� ���� �����ϼ���");

				}
				else
				{
					// ��й�ȣ �Է�
					try
					{
						out.write((Function.ROOMIN+"|"+rn+"\n").getBytes());
					}catch(Exception ex) {}
				}
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
