package com.sist.board;
/*
 *  public 		(protected	 default)	 private (�ڽ��� Ŭ���������� 	)
 *  				���� ����(��Ű��)
 *  			=> ��� => �ٸ� ��Ű���� ���� ���� (protected)
 *  ======================================================
 *  ��� Ŭ����
 */
public class Board {
	int no;
	String name;
	String regdate;
	//default => ���� ����
	public Board(int no, String name, String regdate){
		this.no = no;
		this.name = name;
		this.regdate = regdate;

	}

	public void boardList() {
		System.out.println("��ȣ:"+no);
		System.out.println("�̸�:"+name);
		System.out.println("�����:"+regdate);
	}
}
