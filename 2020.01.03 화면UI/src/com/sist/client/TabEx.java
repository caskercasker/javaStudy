package com.sist.client;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabEx {
	JFrame f = new JFrame();
	public TabEx() {
		JTabbedPane tp =new JTabbedPane();
		JPanel p1 = new JPanel();
		p1.setBackground(Color.cyan);

		JPanel p2 = new JPanel();
		p2.setBackground(Color.yellow);

		JPanel p3 = new JPanel();
		p3.setBackground(Color.pink);

		tp.setTabPlacement(tp.RIGHT);//top(default) ,right,left,bottom

		tp.addTab("로그인", p1);
		tp.addTab("회원가입", p2);
		tp.addTab("메인", p3);

		JMenuBar bar = new JMenuBar(); //메뉴바 => 메뉴 => 메뉴 아이템
		JMenu m1 = new JMenu("File");
		JMenuItem mi1 = new JMenuItem("New");
		JMenuItem mi2 = new JMenuItem("Open");
		JMenuItem mi3 = new JMenuItem("Close");
		JMenu m2 = new JMenu("Edit");
		JMenuItem mi4 = new JMenuItem("Undo");
		JMenuItem mi5 = new JMenuItem("Redo");
		JMenuItem mi6 = new JMenuItem("Find");
		m1.add(mi1);m1.add(mi2);m1.add(mi3);
		m2.add(mi4);m2.add(mi5);m2.add(mi6);

		bar.add(m1); bar.add(m2);

		f.setJMenuBar(bar);

		f.add("Center",tp);
		f.setSize(640, 480);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TabEx();
	}

}
