package com.sist.main;
import com.sist.board.Board;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b = new Board(1,"게시판","2020-01-02");
		b.boardList(); //no,name,regdate 등 하나씩만 가지고 오고 싶을 때 getter,setter
	}

}
