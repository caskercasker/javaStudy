/* ���� �߻� �ߺ��� ������
 *
 *
 *
 *
 *
 *
 *
 */



public class �޼ҵ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//���
		for(int i:com) { //����� ������ �Ѱ��� �о�´�.
			System.out.print(i+" ");
		}
	}

}
