package primeNumber;
import java.util.Scanner;
public class timeTest {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			long start = System.currentTimeMillis();

			Scanner scan = new Scanner(System.in);
			System.out.println("100000개");
			int num = 10000000;
			int count = 0;
			int[] arr = new int[10000005];

			for(int i= 2; i<num; i++) {
				arr[i] = i;
			}


			for(int i=2; i<=Math.sqrt(num); i++) {
				if(arr[i]==0)
					continue;
				for(int j= i+i; j<=num; j+=i) {
					arr[j]=0;
					count++;
				}
			}
			///////////////////////////////////////////////

			for(int i= 2; i<num; i++) {
				arr[i] = i;
				//System.out.println("Dfdf");
				System.out.println(arr[i]);
			}

			for(int i= 2; i<num; i++) {
				for(int j=2; j<=num;j++) {
					if(arr[j]!=i && arr[j]%i==0) {
						arr[j]=0;
						System.out.println(arr[j]);
					}
				}
				//System.out.println(arr[i]);
			}




			///////////////////////////////////////////////////


			//에라토스테네스 개선

//			for(int i= 2; i<num; i++) {
//				arr[i] = i;
//			}
//			for(int i=2; i<=num; i++) {
//				  if(arr[i] == 0){
//					  continue;
//				  } for(int j= i+i; j<=num; j+=i) {
//					  arr[j]=0;
//				 }
//			}





			///////////////////////////////////////////////////////

			for(int i=2; i<num; i++) {
				if(arr[i]!=0)
					System.out.println(arr[i]);
			}

			//System.out.println("반복횟수 " + count);

			long end = System.currentTimeMillis();
			System.out.println((end - start)/1000.0);
		}


	}