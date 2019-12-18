import java.util.Scanner;
public class 배열10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int[] buf = new int[5];
		Scanner scan = new Scanner(System.in);

		/*
		 * int[] rank = {0,0,0,0,0}; for(int i=0; i<a.length; i++) {
		 * System.out.println((i+1)+"번쨰 정수 입력 "); a[i] = scan.nextInt(); }
		 *
		 * for (int i=0; i<a.length; i++) { rank[i]=1; for (int j=0; j<a.length; j++) {
		 * if(a[i]<a[j]) rank[i]++; } }
		 *
		 * for(int i=0; i<rank.length; i++) { System.out.print((rank[i])+" "); }
		 *
		 */

		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				if(a[i]<a[j]) {
					buf[i] = a[i];
					buf[j] = a[j];
				}
			}
		}
		for(int i:buf)
		System.out.println("buf[i]"+" ");
	}


}
