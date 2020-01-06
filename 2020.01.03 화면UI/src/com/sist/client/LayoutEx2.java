package com.sist.client;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
 * java		=> 1.2이전 라이브러리가 많이 생김  1.8에 sun 에서 oracle로 변경
 * javax	============> x (extends)
 *
 * HTML => XML(사용자정의)
 *
 *
 * function aaa(){
 * 		return 10;
 * }
 *
 * ()=>{
 * 		return 10;
 * }
 */
//setbounds 크기 위치 고정
public class LayoutEx2 {
	JFrame frame = new JFrame();
	public LayoutEx2() {
		//frame.setLayout(new FlowLayout());
		frame.setLayout(new GridLayout(3,2,10,50));
		JButton b1 = new JButton("국어");
		JButton b2 = new JButton("영어");
		JButton b3 = new JButton("수학");
		JButton b4 = new JButton("국어");
		JButton b5 = new JButton("영어");
		JButton b6 = new JButton("수학");

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);


		frame.setSize(300,200);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutEx2();
	}

}
