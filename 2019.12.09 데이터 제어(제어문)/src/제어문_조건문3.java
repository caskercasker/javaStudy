// 알파벳 => 저장 => 대문자, 소문자
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha = '김';

		// 사이, 기간 ==> &&
		// 연산자 => char는 모든 연산이 되면 ==> 정수변환(자동형변환)
		if (alpha>='A' && alpha <='Z') {
				System.out.println(alpha+"는(은) 대문자입니다.");
		}
		else if (alpha>='a' && alpha <='z') {
			System.out.println(alpha+"는(은) 소문자 입니다.");
		}
		else
			System.out.println(alpha+"는(은) 알파벳이 아니다");

		char df = 'a';
		System.out.println((int)df);
	}

}
