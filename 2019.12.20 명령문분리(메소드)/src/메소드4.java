/* 난수 발생 중복이 없도록
 *
 *
 *
 *
 *
 *
 *
 */



public class 메소드4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//출력
		for(int i:com) { //저장된 데이터 한개씩 읽어온다.
			System.out.print(i+" ");
		}
	}

}
