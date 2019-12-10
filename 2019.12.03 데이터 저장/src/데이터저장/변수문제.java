package 데이터저장;

public class 변수문제 {
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 80;
		int eng = 60;
		int math =50;
		
		System.out.println("국어"+kor);
		System.out.print(eng+"\n");
		System.out.print(math);
		System.out.println(kor+eng+math);
		System.out.println((kor+eng+math)/3.0);
		System.out.println((double)(kor+eng+math)/3);
		
		System.out.printf("평균:%.2f",(kor+eng+math)/3.0);
	}
}
