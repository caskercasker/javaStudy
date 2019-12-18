/*
 * 	중복없는 난수
 *  => 배열
 *  ===========
 *  =====
 *  난수 발생
 *  =====
 */
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com = new int[9];

		System.out.println(com[2]);
		int c = 0;
		int r = 0;
		System.out.println(com.length);
		for(int i=0; i<com.length; i++) {
			com[i] = i+1;
		}

		while(c<com.length) {
			r = (int)(Math.random()*9);
			System.out.println(r);
			if(c!=r) {
				int temp = 0;
				temp = com[c];
				com[c] = com[r];
				com[r] = temp;
			}
			c++;
		}

		for(int j:com) {
		System.out.print(j+" ");
		}
	}

}
