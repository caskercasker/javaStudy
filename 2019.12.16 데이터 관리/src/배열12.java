public class �迭12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ����
		int[] arr = new int[5];
		// �ʱⰪ
		int buf = 0;
		//System.out.println(b.length);
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			//System.out.println(arr[i]);
		}
		System.out.println("���� �� ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//Arrays.sort(arr);
		/*
		 * System.out.println("���� ��"); for(int i:arr) { System.out.print(i+" "); }
		 */

		  for (int i=0; i<arr.length-1; i++) {
			  for( int j = 0 ; j<(arr.length-1)-i; j++) {
		  		if(arr[j] < arr[j+1]) {
		  			buf = arr[j+1];
		  			arr[j+1] = arr[j];
		  			arr[j] = buf;

		  		}
			  }
		  }

		  System.out.println("���� ��");
			for(int i:arr) {
				System.out.print(i+" ");
			}

	}

}
