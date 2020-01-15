package javatest;

import java.util.Scanner;

public class Solution {
	static String userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력");
		String s = scan.next();
		return s;
	}
	static void middle(String s) {
		if(s.length()%2==0) {
			char charAt = s.charAt(s.length()/2-1);
			char charAtnext = s.charAt(s.length()/2);

			System.out.println("charAt:" + charAt);
			System.out.println("charAtnext: " + charAtnext);
		}else {
			char charAt = s.charAt(s.length()/2);
			System.out.println("charAt: " + charAt);
		}

	}
	static void process() {
		String input = userInput();
		middle(input);
		//System.out.print(middle(input));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
