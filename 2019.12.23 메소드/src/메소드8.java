import java.util.Scanner;

public class �޼ҵ�8 {
	static int Scan(int a) { //��ĳ��
		Scanner scan = new Scanner(System.in);
		int P = scan.nextInt();

		return P;
	}

	static int[] userInput() { //�� �� �� �Է°�

		int[] cal = new int[3];
		int a = 0;

		for(int i=0; i<=2; i++) {
			if(i==0) {
				System.out.println("�⵵ �Է�");
				cal[0] = Scan(a);
			}else if(i==1) {
				System.out.println("�� �Է�");
				cal[1] = Scan(a);
			}else {
				System.out.println("��¥ �Է�");
				cal[2] = Scan(a);
			}
		}
		//int[] cal = new int[3];
		return cal;
	}

	static int[] set(int[] cal){
		int[] toLo = new int[2];
		int total = (cal[0]-1)*365 + (cal[0]-1)/4 - (cal[0]-1)/100 + (cal[0]-1)/400;
		//����
		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};

		if((cal[0]%4==0 && cal[0]%100!=0)||(cal[0]%400==0)) {
			lastday[1] = 29;
		}else
			lastday[1] = 28;

		for(int i=0;i<cal[1]-1;i++) {
			total += lastday[i];
		}
		// +1 ====> %7 ====> ������ ���Ѵ�.
		total++;
		toLo[0] = total;
		toLo[1] = lastday[cal[1]-1];

		return toLo;
	}



	static int dayOfWeek(int total){
		int week = total%7;
		return week;
	}
	static void process() {
		//�Է� ���� ��ĳ�� ���
		//��ĳ�� ����� ��Ʈ �迭�� �� �� ���� �ѱ�
		//����� �迭�� ���� ����� �Ͽ�

		//last day �� week �� �ѱ�
		//���� ���� ���� �׸�.
		int[] date = userInput();
		int[] total = set(date);

		int week = dayOfWeek(total[0]);
		draw(week,date[1],total[1]);

	}

	static void draw (int week, int month, int total) {
		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
		for(int i=0; i<7; i++) {
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();

		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week =0;
				System.out.println();
			}
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}




////////////////////////////
/*
 * 1. ��� ��� (������)
 * 		�迭 ===>  Ŭ���� ===>  ��Ű�� ===> ���̺귯��(jar)
 * 		===
 *
 * 		���α׷�
 * 		������ + ��ɹ� (�޼ҵ�) => Ŭ����
 * 		========
 * 		Ŭ���� ������ =======> ����(�ڹ� CBD)
 *
 * 2. �ڹ�  ==== > ����Ŭ ===> HTML(CSS,Javasciprt) ==> JSP ===> MVC ===> Spring
 * 		==> kotlin(�����)
 * 		====================> ��,��
 *
 * 	�迭 ���� : ������ ===> ������ ===> ���� ���������� ��Ƽ� ���
 * 	=======
 * 		����� => �޸� ũ�⸦ ����
 * 		==================
 * 		1)����
 * 			int[] arr;
 * 			===   === �迭��( ���� ����� �������� �ּ�)
 * 			������ ��
 * 		2)�ʱ�ȭ
 			arr = {1,2,3,4,5}
			arr = new int[5] => �޸� ���� �Ҵ� ==> ���߿� �����͸� ����
		3) ���� �б�, ���� ==> �ε���

			int[] arr = {10,20,30,40,50|;
							�Ϲݺ����� ����.
							int a=10; a=11.....
			 arr			arr[0] arr[1] ...............������ ===>for
			 				arr[0]=10 arr[0]=20.......
			======  		==========================================
			100					10	20	30	40	50
			====== 			==========================================
 							100



 			*/

//�޷�

/*
 * 	�޷�
 * 	=====
 * 	1) �⵵�� �� �Է� �޴´�.
 * 	2) ����
 *  3) ������
 *  4) ���
 */
//import java.util.Calendar;
//import java.util.Scanner;
//public class �迭1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		/*
//		 * while(true) { Date date = new Date(); SimpleDateFormat sdf = new
//		 * SimpleDateFormat("hh:mm:ss");
//		 *
//		 * System.out.println(sdf.format(date)); try { Thread.sleep(100);
//		 * }catch(Exception ex) {} }
//		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�⵵ �Է�:");
//		int year = scan.nextInt();
//
//		System.out.println("�� �Է� : ");
//		int month = scan.nextInt();
//		System.out.println("�� �Է�: ");
//		int day = scan.nextInt();
//
//
//		System.out.println(year+"�⵵"+month+"��");
//		System.out.println("\n");
//		/*20
//		 * System.out.print("��\t"); System.out.print("��\t"); System.out.print("ȭ\t");
//		 * System.out.print("��\t"); System.out.print("��\t"); System.out.print("��\t");
//		 * System.out.print("��\t");
//		 */
//		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
//		Calendar cal = Calendar.getInstance();
//		int y = cal.get(cal.YEAR);
//		int m = cal.get(cal.MONTH)+1;
//		int d = cal.get(cal.DATE);
//		int w = cal.get(cal.DAY_OF_WEEK);
//		System.out.println("========"+y+"�⵵"+m+"��"+d+"��"+strWeek[w-1]+"����=======");
//		//System.out.print("\t");
//		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
//		for(int i=0; i<7; i++) {
//			System.out.print(strWeek[i]+"\t");
//		}
//		System.out.println();
//
//
//		//1������ ������ ���Ѵ�.
//		//���⵵ 12/31 => ����
//		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
//		//����
//		int[] lastday = {31,28,31,30,31,30,31,31,30,31,30,31};
//		if((year%4==0 && year%100!=0)||(year%400==0)) {
//			lastday[1] = 29;
//		}else
//			lastday[1] = 28;
//
//		for(int i=0;i<month-1;i++) {
//			total += lastday[i];
//		}
//		// +1 ====> %7 ====> ������ ���Ѵ�.
//		total++;
//
//		int week=total%7;
//		//int lastDay=31;
//
//		for(int i=1;i<=lastday[month-1];i++) {
//			if(i==1) {
//				for(int j=0;j<week;j++) {
//					System.out.print("\t");
//				}
//			}
//			System.out.printf("%2d\t",i);
//			week++;
//			if(week>6) {
//				week =0;
//				System.out.println();
//			}
//		}
//
//
//		System.out.println("������ "+strWeek[((total+day)%7-1)]);
//
//		System.out.println();
//		System.out.println(year+"�⵵"+month+"��"+day+"����"+strWeek[((total+day)%7-1)]+"���� �Դϴ�.");
//	}
//
//}


