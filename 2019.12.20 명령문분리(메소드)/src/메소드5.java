public class �޼ҵ�5 {
	/*
	 * static int size(int a) { Scanner scan = new Scanner(System.in);
	 * System.out.println("�迭 ũ�� �Է� : "); int size = scan.nextInt();
	 *
	 * return size; }
	 *
	 * static int[] random (int a) { // ������ �ް� �迭 ����
	 *
	 *
	 * }
	 *
	 *
	 *
	 *
	 * static void print(int[] a) { //������ �迭 ���. }
	 */

	static int[] getRand() {
		int[] com = new int[6];
		// ���� =>
		int su = 0;
		// ��=> �ߺ�
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
			// (int)�� ����ȯ.
			// => +1 ===> 1~45
		}
		return com;
	}

	static void print (int[] com) {
		for(int i:com) { //����� ������ �Ѱ��� �о�´�.
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

		// getRand�� ������ com �̶�� �迭�� print ���� ����ϴ� �迭�� ������ �迭
		// �迭�� ������ ���� ���� Ȱ���� �� �θ��� �ּҰ��� ���ؼ� ���� ���� �ϱ� ������
		//process();


	}

}
