/*
 * 	�ڹٿ��� �����ϴ� ���̺귯��
 *  => �ڹ�
 *  	1) ����� ����
 *  	2) ���̺귯��
 *  	========== 1)+2) ==> ����
 *  	�ڹ� ����
 *  	=====
 *  	java.lang : import�� ���� �ʰ� ���
 *  		= String : ���ڿ��� ���õ� Ŭ����
 *  			1) equals : ���ڿ� ��
 *  			2) trim() : �¿��� ���� ����
 *  			3) indexOf(), lastIndexOf(),
 *  			4) length(),
 *  			5) startsWith, endsWith
 *  			6) subString()
 *  			7) split()
 *  			8) valueOf()
 *  		= System : ����,�Է�,���,GC
 *  			1) gc
 *  			2) exit
 *    		= Object : ��� Ŭ������ ���� Ŭ����
 *    			1) clone() : ����
 *    			2) finalize() :�Ҹ���
 *  		= Math : ����
 *  			1) random()
 *  			2) ceil()
 *  		= StringBuffer :
 *  			1) toString()
 *  			2) append() : ���ڿ� ����
 *  		= Thread
 *  	java.util : �����ϰ� ����� �� �ִ� Ŭ������ ����
 *  		= Scanner(x)
 *  		= StringTokenizer
 *  		= Collection (�迭 ��ü)
 *  		= ArrayList, Vector, LinkedList, Map : �ڷᱸ��
 *  			======= 					 ===			�ݵ�� ���!!@!@!@!@!
 *  			�ڷᱸ�� : �޸� ���� ����
 *  	java.io
 *  		= Reader, Writer  (2byte �� �а� ��)
 *  		= InputStream, OutputStream (1byte��, ex> �ѱ��� ���� ����)
 *   		= File
 *   		= ObjectInputStream, ObjectOutputStream
 *  	java.net
 *  		= Socket
 *  		= URL
 */
class My{
	public My() {
		System.out.println("My ������ �Լ� ȣ�� (��ü ����)");
	}
	public void display() {
		System.out.println("My:display() call...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("��ü �Ҹ�");
	}
}
public class MainClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		My m = new My();// ����
		//Ȱ��
		m.display();
		//�Ҹ�
		//m=null;
		m.finalize();
		//System.gc(); //�޸� �Ҹ�
	}

}
