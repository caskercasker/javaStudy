//100 999 7�ǹ�� ����, 4�� ����� �ƴ� ���� �?

public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int count = 0;
		int j = 0;

		while(a<=999){
			if(a%7==0)
				count++; //7�� �������� ���� 0�̸� �ϳ��� ����
			if(a%4!=0) //
				j++;
			a++;
		}
		// 675 + 225
		System.out.println(count);
		System.out.println(j);
	}

}
