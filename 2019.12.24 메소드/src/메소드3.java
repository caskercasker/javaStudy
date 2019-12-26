// year 입력을 받아서 => 윤년여부 확인
// int 0,1 => boolean
/*
 *
 * 	네트워크 //문자열(속도가 느림) 숫자 값을 상수를 정해서 이용.
 * 	프로토콜
 *
 *  	Login|id|pwd => 로그인
 *
 */
// void

public class 메소드3 {
	static void isYear(int year) {
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
	}
	static boolean isYear2(int year) {
		if((year%4==0 && year%100!=0)||(year%400==0))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2020;

		//isYear(year);
		boolean bCheck = isYear2(year);
		if(bCheck) {
			System.out.println(bCheck);
			isYear(year);
		}else {
			System.out.println(bCheck);
			isYear(year);
		}
	}

}
