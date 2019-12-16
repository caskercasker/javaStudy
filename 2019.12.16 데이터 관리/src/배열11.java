/*
 * 	5개의 난수 발생		==> 배열
 * 	30 20 40 50 10
 *  내림차순 정렬
 */
public class 배열11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = (int)(Math.random()*100)+1;
		//System.out.println(a);
		int[] b = new int[5];

		int buf = 0;
		//System.out.println(b.length);
		for (int i=0; i<b.length; i++) {
			b[i] = (int)(Math.random()*100)+1;
			System.out.println(b[i]);
		}

		for (int i=0; i<b.length-1; i++ ) {
			for (int j=i+1; j<b.length; j++) {
				if (b[i] < b[j]) {
					buf = b[i];
					b[i] = b[j];
					b[j] = buf;
				}
			}
		}
		for ( int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
