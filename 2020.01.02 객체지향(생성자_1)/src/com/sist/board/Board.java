package com.sist.board;
/*
 *  public 		(protected	 default)	 private (자신의 클래스에서만 	)
 *  				같은 폴더(패키지)
 *  			=> 상속 => 다른 패키지도 접근 가능 (protected)
 *  ======================================================
 *  모든 클래스
 */
public class Board {
	int no;
	String name;
	String regdate;
	//default => 같은 폴더
	public Board(int no, String name, String regdate){
		this.no = no;
		this.name = name;
		this.regdate = regdate;

	}

	public void boardList() {
		System.out.println("번호:"+no);
		System.out.println("이름:"+name);
		System.out.println("등록일:"+regdate);
	}
}
