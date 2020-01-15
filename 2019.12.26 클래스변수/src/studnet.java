import java.util.Scanner;

class StudentVO2{
		String name;
		int kor;
		int eng;
		int math;
}


public class studnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentVO2[] std = new StudentVO2[3];
		//studentVO2 vo = new StudentVO2();
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<3; i++) {
			StudentVO2 vo = new StudentVO2();
			System.out.println(vo);
			System.out.println("이름");
			vo.name = scan.next();
			System.out.println("국어");
			vo.kor = scan.nextInt();
			System.out.println("영어");
			vo.eng = scan.nextInt();
			System.out.println("수학");
			vo.math = scan.nextInt();

			std[i]=vo;

		}
		for(StudentVO2 s:std) {
			System.out.println(s.name+" "+s.kor+" "+s.eng+" "+s.math);
		}
	}

}
