import java.util.LinkedList;
import java.util.List;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>(); //���׸���
		//interface 		//������ Ŭ����
		//String[] list
		//String[] list
		//���� add()
		list.add("ȫ�浿");// 0
		list.add("��û��");// 2
		list.add("�ڹ���");// 3

		//�߰��� ����
		list.add(1,"������");// 1

		//��� ===> for each (�迭,�÷���) => Web
		int i=0;
		for(String name:list) {
			System.out.println(name+":"+i);
			i++;
		}
		//����
		list.set(2, "�̼���");
		System.out.println("============");
		i=0;
		for(String name:list) {
			System.out.println(name+":"+i);
			i++;
		}

		list.remove(1);
		System.out.println("============");
		i=0;
		for(String name:list) {
			System.out.println(name+":"+i);
			i++;
		}

		//�����Ͱ� ����� ����
		System.out.println("����� ����:" +list.size());

	}

}
