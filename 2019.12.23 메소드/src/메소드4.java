//import java.io.IOException;

public class �޼ҵ�4 {
	static String[] recipeData() {
		String[] data = {
				"�������� ���� ���� ���� ���! �����̹���������ͱ��� �����",
				"�������ִ� ����������! �̼ҵ��帶��ҽ��� �Բ�~",
				"���ó�� �̱��� �䵵�� ���� '�����̹��� ������ͱ���'������",
				"����丮 �����������~ ��� ���� ������~",
				"�ع���ó�� ���ִ� ������ �ҽ����ᳪ����",
				"�ʰ��� �ӱ��� ���� �� ���ݶ�*.*",
				"��§��§�� ���е���",
				"��Ÿ�� : �Ϻ��� ������� ���� ������ ���� �޴��� ��!",
				"����� ���쿬�κδް���",
				"ġŲ�ʰ����� �����ϰ� ����ġŲ �����"};
		return data;
	}
	static String maxLengthName() {
		String res = "";
		String[] data = recipeData();
		int max=0;
		for(int i=0; i<recipeData().length;i++)
			if(max < data[i].length()) {
				max = data[i].length();
			}
		for(String s:data) {
			if(s.length()==max)
				res = s;
				break;
		}

			return res;
	}
	static String minLengthName() {
		String res = "";
		int min = maxLengthName().length();
		for (int i=0; i<recipeData().length; i++) {
			if (min > recipeData()[i].length()) {
				min = recipeData()[i].length();
			}
		for(String s:recipeData()) {
			if(s.length() == min) {
				res = s;
				break;
			}
		}
	}
	return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		String[] data = recipeData();

		for(String s:data) {
			System.out.println(s);
		}
		System.out.println("======== ���� �� �����Ǹ� ���....");
		System.out.println(maxLengthName());
		System.out.println(minLengthName());
		//		byte[] Recive = new byte[128];
//
//		Read(Recive);
//
//
//		try {
//			System.in.read();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public static void Read(byte[] buffer) throws IOException{
//		System.in.read(buffer);
//	}
	}

}
