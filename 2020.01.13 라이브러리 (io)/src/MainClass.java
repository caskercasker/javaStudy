/*
 * 	IO : CheckException (�ݵ�� ����ó��)
 *  === Input/ Output (�����)
 *  = �޸� �����
 *    ================ ǥ�� System.in.read(), System.out.println()
 *  = ���� �����
 *  = ��Ʈ��ũ �����
 *
 * 	���̺귯������ �����ϴ� IO => ���� (�ܹ���) �ѹ��� ���� ���� �ѹ����� �Ҽ� ����.
 * 							(����� ��� ) 2���� ��ΰ� �ʿ��ؼ� Thread �� �ʿ���
 * 									�ϳ��� ��� ���� �޾ƿ���, �ϳ��� ���� ���� ����ؼ� ������
 * 	================== stream(�����Ͱ� �����ϴ� ����)	�޸𸮿� �����صΰ�, ����Ȱ� �о ��� tcp(��Ʈ��ũ ��Ʈ��)
 * 		����Ʈ��Ʈ�� 					���ڽ�Ʈ��
 * 		========					=======
 * 		1byte��	 					2byte��
 * 			|							|
 * ================				=================
 * InputStream OutputStream 	Reader 		Writer
 *
 * FileInputStream				FileReader
 * FileOutputStream 			FileWriter
 *
 * ������ġ (�ӽ� ����, �Է��ϳ��ϳ� ���� ���� �����⿣ �����ð� ������ ������ ����, ���� Buffered�� �־�ΰ� �ѹ��� �д´�)
 * BufferedInputStream			BufferedReader
 * BufferedOutputStream			BufferedWriter
 *
 * File
 *
 * ==��ü������ ���� ==> ����ȭ/������ȭ
 * ObjectInputStream
 * ObjectOutputStream
 *
 *  �������α׷�  ---- �޸� (���̿� ��Ʈ���̶�� ��ΰ� �������)
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
