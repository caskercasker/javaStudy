
public class 배열난수발생 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com = new int[9];
		int su= 0;
		boolean bCheck = false;
		int overhead = 0;

		for(int i=0; i<com.length; i++) {

			bCheck = true;
			while(bCheck) {
			//난수발생
			su =(int)(Math.random()*9)+1;
			bCheck = false;

			for (int j=0; j<i; j++) {
				if(com[j]==su) {
					overhead ++;
					bCheck = true;
					break;
				}
			}
			}
			com[i] = su;
		}
		for(int k:com)
			System.out.print(k+" ");
		System.out.println();

		System.out.println(overhead);
	}
}
