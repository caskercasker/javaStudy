public class 배열12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 저장
		int[] arr = new int[5];
		// 초기값
		int buf = 0;
		//System.out.println(b.length);
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			//System.out.println(arr[i]);
		}
		System.out.println("정렬 전 ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//Arrays.sort(arr);
		/*
		 * System.out.println("정렬 후"); for(int i:arr) { System.out.print(i+" "); }
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

		  System.out.println("정렬 후");
			for(int i:arr) {
				System.out.print(i+" ");
			}

	}

}
