package com.sist.Exception1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainClass2 extends JFrame implements ActionListener{
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;

	//������ �ʿ��� ������
	int[] com = new int[3];
	int[] user = new int[3];
	int s,b;

	public MainClass2() {
		ta = new JTextArea();
		ta.setEditable(false); //�Է� ������ ���� edit����
		//ta.setText("sjfiejf");
		//ta.setEnabled(false);
		//ta.setText("sjfiejf");
		JScrollPane js = new JScrollPane(ta);
		tf = new JTextField(13); //����ũ��
		tf.setEnabled(false);

		b1 = new JButton("����");
		b2 = new JButton("����");

		JPanel p=new JPanel();
		p.add(tf);p.add(b1);p.add(b2);

		//��ġ
		add("Center",js);
		add("South",p);


		setSize(450, 500);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //X�� ������ ��  frame â���� �ǵ帮�� �κ�. JFrame
		//DO_NOTHING_ON_CLOSE ��ư�� �۵����� �ʵ��� ����


		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();

	}
	public void getRand() {
		int su=0;
		boolean bCheck=false;
		for(int i=0; i<3; i++) {
			//���� => �ߺ��� �ȵȰ�쿡�� => com[]�� ����
			bCheck=true;
			while(bCheck) {
				//���� �߻�
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				//����� (com[]) ��, ������ �߻��� �� (su) �ߺ����� Ȯ��
				//�ߺ��� ��쿡�� bChek => true => while���� �ٽ� ����

				for(int j=0;j<i;j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// ��ư Ŭ���� ó��
		if(e.getSource()==b1) {
			getRand();
			Message("������ �����մϴ�");
			tf.setEnabled(true); //�Է�â�� Ȱ��ȭ
			b1.setEnabled(false); //���� ���۰� ���ÿ� ���۹�ư�� ��Ȱ��ȭ
			//JOptionPane.showMessageDialog(this,"������ �����մϴ�"); //this ���â ���� �����̳�.
			//tf.requestFocus(); //�Է� Ŀ�� ������ �α� ******
			ta.append("*********���ӽ���*********\n");
		}

		else if(e.getSource()==b2) {
			dispose(); //�޸� ȸ�� �޼ҵ�
			System.exit(0); //���α׷� ����

		}
		else if(e.getSource()==tf) {
			String input = tf.getText().trim();
			//input = input.trim();//���������ؼ� �Է°� �ѱ�

			if(input.length()<1 ) {
				Message("���ڸ� ������ �Է��ϼ���");
				// javascript => alert()
				return;
			}

			int no=0;
			try {
				//���� ��ȯ
				no=Integer.parseInt(input);//���ڿ��� ������ �ٲ�
			} catch (Exception ex) {
				Message("���ڸ� ������ �Է��� �����մϴ�");
				return;
			}
			//�߸��� �Է�
			if(no<100 || no>999) {
				Message("���ڸ� ������ �Է��� �����մϴ�");
			}
			//user[]�� ����
			user[0]=no/100;
			user[1]=(no%100)/10;
			user[2]=no%10;

			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				Message("�ߺ��� ���� �ȵ˴ϴ�.");
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				Message("0�� ����� �� �����ϴ�.");
				return;
			}
			s=0;
			b=0;
			for(int i=0;i<3;i++) {
				for(int j=0; j<3;j++) {
					if(com[i]==user[j])// ����Ȯ��
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}

			//��Ʈ
			String hint = "Input Number:"+no+",Result:"+s+"S-"+b+"B\n";
			ta.append(hint);
			if(s==3) {
				ta.append("*********��������*********");
				int res = JOptionPane.showConfirmDialog(this,"�����ұ��?", "����",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(res==JOptionPane.YES_OPTION) {
					dispose();
					System.exit(0);
				}else {
					ta.setText("");
					tf.setText("");
					tf.setEnabled(true);
					b1.setEnabled(true);
					//return;
				}
			}
			tf.setText("");
			tf.requestFocus();


		}
	}
		public void Message(String s) {
			JOptionPane.showMessageDialog(this, s);
			tf.setText("");
			tf.requestFocus();
		}
	}


