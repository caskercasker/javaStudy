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

	//게임이 필요한 데이터
	int[] com = new int[3];
	int[] user = new int[3];
	int s,b;

	public MainClass2() {
		ta = new JTextArea();
		ta.setEditable(false); //입력 방지를 위해 edit방지
		//ta.setText("sjfiejf");
		//ta.setEnabled(false);
		//ta.setText("sjfiejf");
		JScrollPane js = new JScrollPane(ta);
		tf = new JTextField(13); //글자크기
		tf.setEnabled(false);

		b1 = new JButton("시작");
		b2 = new JButton("종료");

		JPanel p=new JPanel();
		p.add(tf);p.add(b1);p.add(b2);

		//배치
		add("Center",js);
		add("South",p);


		setSize(450, 500);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //X를 눌렀을 때  frame 창에서 건드리는 부분. JFrame
		//DO_NOTHING_ON_CLOSE 버튼이 작동하지 않도록 만듬


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
			//난수 => 중복이 안된경우에만 => com[]에 저장
			bCheck=true;
			while(bCheck) {
				//난수 발생
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				//저장된 (com[]) 값, 난수가 발생된 값 (su) 중복여부 확인
				//중복된 경우에는 bChek => true => while문을 다시 수행

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
		// 버튼 클릭시 처리
		if(e.getSource()==b1) {
			getRand();
			Message("게임을 시작합니다");
			tf.setEnabled(true); //입력창값 활성화
			b1.setEnabled(false); //게임 시작과 동시에 시작버튼은 비활성화
			//JOptionPane.showMessageDialog(this,"게임을 시작합니다"); //this 어느창 위에 띄울것이냐.
			//tf.requestFocus(); //입력 커서 가져다 두기 ******
			ta.append("*********게임시작*********\n");
		}

		else if(e.getSource()==b2) {
			dispose(); //메모리 회수 메소드
			System.exit(0); //프로그램 종료

		}
		else if(e.getSource()==tf) {
			String input = tf.getText().trim();
			//input = input.trim();//공백제거해서 입력값 넘김

			if(input.length()<1 ) {
				Message("세자리 정수를 입력하세요");
				// javascript => alert()
				return;
			}

			int no=0;
			try {
				//정수 변환
				no=Integer.parseInt(input);//문자열을 정수로 바꿈
			} catch (Exception ex) {
				Message("세자리 정수만 입력이 가능합니다");
				return;
			}
			//잘못된 입력
			if(no<100 || no>999) {
				Message("세자리 정수만 입력이 가능합니다");
			}
			//user[]에 저장
			user[0]=no/100;
			user[1]=(no%100)/10;
			user[2]=no%10;

			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				Message("중복된 수는 안됩니다.");
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				Message("0은 사용할 수 없습니다.");
				return;
			}
			s=0;
			b=0;
			for(int i=0;i<3;i++) {
				for(int j=0; j<3;j++) {
					if(com[i]==user[j])// 숫자확인
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}

			//힌트
			String hint = "Input Number:"+no+",Result:"+s+"S-"+b+"B\n";
			ta.append(hint);
			if(s==3) {
				ta.append("*********게임종료*********");
				int res = JOptionPane.showConfirmDialog(this,"종료할까요?", "종료",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
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


