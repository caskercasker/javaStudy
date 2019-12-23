import java.util.Scanner;
public class 메소드6 {
	// 난수발생
	static int[] getRand() {
		int[] com = new int[3];
		int su = 0;
		boolean bCheck = false;
		for(int i=0; i<3; i++) {
			bCheck=true;
			while(bCheck) {
				su=(int)(Math.random()*9)+1;
				bCheck = false;
				for(int j=0; j<i; j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}//중복제거
			com[i]=su;
		}
		return com;
	}
	// 사용자 입력
	static int[] input() {
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("3자리 정수 입력");
			int input = scan.nextInt();
			if(input<100 || input>999) {
				System.out.println("잘못된 입력");
				continue;
			}
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;

			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 없습니다!!");
				continue;
			}
			break;
		}
		return user;
	}
	// 비교
	static int compare(int[] com, int[] user) {
		int s=0, b=0;
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				if(com[i]==user[j]) { //배열안에 같은 수가 존재 여부
					if(i==j) //같은 자리
						s++;
					else
						b++;
				}
			}
		}
		hint (user,s,b); //결과값만 출력
		return s;
	}
	// 힌트
	static void hint(int[] user,int s, int b) {
		System.out.printf("input Number: %d%d%d, Result:%ds-%db\n",
				user[0],user[1],user[2],s,b);
	}
	// 종료여부
	static boolean isEnd(int s) {
		boolean bCheck = false;
		if(s==3)
			bCheck = true;
		return bCheck;
	}
	static void process() {
		int[] com = getRand();
		Scanner scan = new Scanner(System.in);

		while(true) {
			int[] user = input();
			int s = compare(com,user);
			if(isEnd(s)) {
				System.out.print("종료할까요(y/n)?");
				String data = scan.next();
				if(data.equals("y")) {
					System.out.println("GameOver!!");
					System.exit(0);
				}else {
					System.out.println("새 게입이 시작 되었습니다.");
					process();
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
