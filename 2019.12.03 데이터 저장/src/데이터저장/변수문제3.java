package 데이터저장;

public class 변수문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타이틀 이미지
		//프로필 이미지
		String chef = "TravleHey";
		String menu = "잡내없이 삶기, 고기만 먹어도 맛있고 김치랑 먹어도 맛있는 수육";
		String submenu = "\1야들야들하고 잡냄새 없이 삶는 팁 \"";
		int quantity = 4;
		int time = 60;
		String target = "아무나";
		
		/*
		 * 1) "출력 => \" => 인용부호
		 * 2) 다음줄 출력  => \n => new line 
		 * 3) 일정 간격 => \t => tab
		 */
		
		
		System.out.println("쉐프는"+chef+"\n"+menu+"\n"+submenu+"\n"+quantity+"인분\t"+time+"이내에\t"+target);
	}

}