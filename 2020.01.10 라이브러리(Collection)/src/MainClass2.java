//add,remove,set 	index��ȣ�� �����϶�
import java.util.ArrayList;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		//�̸� ���
		list.add("KYS"); //0
		list.add("LSJ"); //1
		/*
		 * ======
		 * add()//2
		 */
		list.add("Can");//3
		list.add("KKK");//4
		list.add("YUQ");//5

		//���� ���� Ȯ��
		System.out.println("����� �ο���"+list.size())	; //size(ũ�⸦ Ȯ��)
		//���
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}

		//������ ���� ���ϵǸ� �����ϱ� ���ϴ�.

		System.out.println("=====================");
		//���
		list.add(2,"������"); //2���ڸ��� ������ �ϰ� �߰�

		//���
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("==================");
		list.remove(3);
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		//����
		list.set(3, "����");
		//���

		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}

		list.add(100);
		for(int i=0;i<list.size();i++) {
			//String name=(String)list.get(i);
			String name = String.valueOf(list.get(i));
			System.out.println(name);
		}
	}

}
