/*
 * �÷���
 * ====
 * �����͸� �޸𸮿� �����ϴ� ���, ǥ��ȭ�� �Ǵ� ����
 * 						---- �������̽�
 * ������ ������ ���� ����
 * ���� �迭 ==> ������ ������ Ŭ�������� ����
 * * ���� : ���δٸ� ������ Ÿ���� ������ �� ���� => ������ Ÿ�� ���� => ���׸��� Ÿ��
 * 									========
 * 									<������ Ÿ��>
 * 										====== Ŭ������ Object
 * 									<int> (X)
 * 									<Integer> (O)
 *  	* ���� => ���� ������������ �����ϴ°� ��� ����
 *
 *  	����
 *  		Collection
 *  		-----------
 *  				-----> Queue Stack
 *  	------------------
 * 		List	Set		Map  ==> Interface
 * 		|		|		|
 * 	=======	=======		======  -> Interfcae�� ������ Ŭ����
 *  ArrayList HashSet	HashTable
 *  Vector	  TreeSet	HashMap HashTable�� ����
	LinkedList			=> Key,Value-> ���� ����
	* ���� ��		���� ��		Key -> �ߺ� �Ұ�
	* �ߺ� ����		�ߺ� ����		value-> �ߺ� ����
	*
 * ===============================================
 * �ڷᱸ�� -> �޸𸮿� ����� ������ ����
 * 						-------
 * 						�б�, ����, �˻�,���� ����
 * 						--------
 * 						�޼ҵ� -> ���� ->
 * 								add(������)	******
 * 								add(index,������)
 * 								�б�->
 * 								get(int index)
 * 								����->				�ٲ�ġ��
 * 								set(index, ������)
 * 									����->
 * 								remove(index) - �ߺ��� ��� �Ǵϱ� �ε����� Ȯ����
 * 								remove(������) -> �ߺ��� �����Ͱ� �ѹ��� ����Ǵ� ����
 *
 *
 */

import java.util.ArrayList;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		//������ �߰�
		list.add("ȫȫȫȫ");
		list.add(39);
		list.add("Seoul");
		list.add("1111-1111");
		list.add(180.5);
		list.add('A');

		//������ ó��
		String name = (String)list.get(0); //Object�� String���� ����ȯ
		int age = (int)list.get(1);
		String addr = (String)list.get(2);
		String tel = (String)list.get(3);
		double height = (double)list.get(4);
		char bloodtype = (char)list.get(5);

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(tel);
		System.out.println(height);
		System.out.println(bloodtype);

		//���ϼ� ���� �������� = ��� ��� �Ұ� // �ǹ̾���
	}

}
