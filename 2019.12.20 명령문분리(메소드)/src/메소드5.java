public class 메소드5 {
	/*
	 * static int size(int a) { Scanner scan = new Scanner(System.in);
	 * System.out.println("배열 크기 입력 : "); int size = scan.nextInt();
	 *
	 * return size; }
	 *
	 * static int[] random (int a) { // 사이즈 받고 배열 생성
	 *
	 *
	 * }
	 *
	 *
	 *
	 *
	 * static void print(int[] a) { //생성된 배열 출력. }
	 */

	static int[] getRand() {
		int[] com = new int[6];
		// 난수 =>
		int su = 0;
		// 비교=> 중복
		boolean bCheck = false;

		for(int i=0; i<6; i++) {
			//com[i] = (int)(Math.random()*45)+1;
			bCheck=true;
			while(bCheck){
				su = (int)(Math.random()*45)+1;
				bCheck = false;
				for(int j=0; j<i; j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}

			com[i] = su;
			//Math.random();
			//0.0 ~ 0.99 * 45
			// (int)로 형변환.
			// => +1 ===> 1~45
		}
		return com;
	}

	static void print (int[] com) {
		for(int i:com) { //저장된 데이터 한개씩 읽어온다.
		System.out.print(i+" ");
		}
	}

	static void process(){
		//int[] com = getRand();
		print(getRand());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(getRand());

		// getRand가 생성한 com 이라는 배열은 print 에서 사용하는 배열과 동일한 배열
		// 배열이 생성된 이후 값을 활용할 때 부르면 주소값을 통해서 값을 접근 하기 때문에
		//process();


	}

}
