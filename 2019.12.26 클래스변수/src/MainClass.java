/*
 * ���� => ���� ����	==> Ŭ����(����,����+�޼ҵ�,�޼ҵ�)
 * 					========
 * 					Ŭ������ ����
 * 					~VO(valueOf), ~DTO(dataTransferOF)
 * 					~Manager, ~Service, ~DAO(dataAccessOf)
 * ============
 * 	���� ===>	�迭 ===> ����ü ===> Ŭ���� ===>  ���� ===> RDBMS(����Ŭ)
 * 					(X)
 * 	======================================================= DB
 * �ڹ� Ŭ���� ����(������� : ���� + �޼ҵ� + ������)
 							=====
 	������ ����� ������ ��:���Ϻ��� => int year, month,....
 					Ŭ���� =>  String name ....
 					 		JButton b1,b2....
 * 					�迭 =>
 *
 * ��Ʈ ������ = �޸� ���� ���� ������.
 *
 * = ������Ʈ ���̽�
 * 		��) ��ǻ�� ����
 * 			CPU, �޸�, �ϵ��ũ, ����ī�� 	(������Ʈ)
 *
 *
 *
 * ������ ���� ���� public�� default�� ���� ����
 * package.
 * private
 * JVM�� �ٸ� Ŭ����....
 * static ���������� �θ��� ���� ����...
 *
 *
 *
 * class ClassName
 * {
 * 		======Ŭ������ ������ �ִ� ���� ========= ��������(�ٸ� Ŭ�������� ����� ����)
 *		=> �޸𸮿� ���� ����Ǵ� ����(instance ����)
 *		=> �����ϴ� ���� (static ����)		=> �޸� ������ �Ѱ�.
 * 		============================================================
 *			������ �Լ� : ���������� �ʱ�ȭ ==> �ѹ��� ȣ��, ��ü������ �� ó������ ȣ��
 *			������, ��Ʈ��ũ, �����ͺ��̽�
 *			Ŭ������� ����...... �������� ����.....
 *
 *			�Ϲ������� Ŭ���� ���ο� �޼ҵ�ó�� �����ϴµ� Ŭ������� �����ϰ� �ؼ� �����Ѵ�.
 *
 * 			==> ���࿡ �����ڰ� ���� ��쿡�� JVM �� �ڵ����� ����� �ش�.....(default ������)
 * 			�ڵ�����(java.lang, return�� ���� ��� return ����, �����ڴ� �ڵ����� ����)
 * 		============================================================
 *			�޼ҵ� : ��� ����,
 * 		============================================================
 *
 *		Ŭ������ ==> MovieVO => Ŭ����(String, �迭,
 *				  MusicVO
 *			 	  RecipeVO
 *				  FoodHouseVO
 *				  =========== ���� ����
 *				  class FoodHouseVO{
 *					String[] poster;
 *					String addr;
 *					String phone;
 *					String[] menu;
 *					String[] reply; //�迭�� ���� ���� �������� �Ҵ��ϱ�  ���ؼ��� Array<List> �ؼ� append �� ���ؼ� ���������� ����.
 *
	��λ� (2019)
	����6.9/10
	���/�׼�
 	�ѱ�
	2019.12.19 ����
	128��, 12���̻������
	(����) ������, �躴��
	(�ֿ�) �̺���, ������, ������, ������, ����

	class MovieVO
	=> ����ڰ� ���� ��������
		-> int  a
		   double d
		   =========== ��ǻ�Ͱ� �޸� ũ�� �ν�
		   MOvieVO vo malloc(sizeOf(MovieVO))
		   =========== �޸� ũ�⸦ �� �� ����.
		   		�޸� ũ�� Ȯ�� => �޸𸮸� ����
				new
  */
class MovieVO{
	// instacne ���� ==> �޸𸮿� ����Ǵ� ����  => new (���ο� �޸𸮸� ���鶧) =>  ���� �޸� ����)
	String title;
	double score;
	String genre;
	String regdate;
	int time;
	String grade;
	String director;
	String actor;
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޸𸮿� ���� => ȣ�⿬��;
		MovieVO m1 = new MovieVO();
		MovieVO m2 = new MovieVO();
		MovieVO m3 = new MovieVO();
		m3.title = "��λ�(2019)";
		// . (�޸� �ּ� ���� ������)
		m2.title = "õ��: �ϴÿ� �´�;";
		m1.title = "Ĺ�� (2019)";

		System.out.println(m1.title);
		System.out.println(m2.title);
		System.out.println(m3.title);

		System.out.println(m2);	//MovieVO@15db9742
		System.out.println("23232");
		System.out.println(m1);	//MovieVO@6d06d69c
		System.out.println(m3); //MovieVO@7852e922

		System.out.println("����� ��ȭ ����");

		MovieVO[] vo = {m1,m2,m3};
		//MovieVO[] vo = new MovieVO[3];
		for(int i=0; i<vo.length; i++) {
			System.out.println(vo[i].title);
		}

	}

}
