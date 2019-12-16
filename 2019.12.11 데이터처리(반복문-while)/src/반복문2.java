// A~Z =>
public class ¹Ýº¹¹®2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = 'A';  //'65' A 90 Z  97 a 122 z
		System.out.println((int)c);
		int i = 1;
		int j = 0;
		while(i<=26) {
			System.out.print(c++ +"\t");
			if(i%5==0) {
				if(j%2==0) {
					c += 32;
				}else {
					c -= 32;
				}
				System.out.println();
				j++;
			}
			//System.out.print(c+"\t");
			i++;
		}
	}
}
