public class �޼ҵ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "�������� ���� ���� ���� ���! �����̹���������ͱ��� �����";
		// ���� ����  ==> ���鵵 ����
		System.out.println("������ ����: "+data.length());
		//System.out.println("�����ܾ��� ����:");
		int count =0;

		//���� �ܾ� contains�� �ذ��� �ȵǼ� ������ �̿��ϰ� ��ġ�� ���Ѽ� ���
//		Pattern p = Pattern.compile("����");
//		Matcher m = p.matcher(data);
//		while(m.find()) {
//			count++;
//		}
//		System.out.println("�����ܾ��� ���� : "+count);


		//Sub String Ȱ��
		String fData = data.substring(0,data.indexOf("!"));
		System.out.println(fData);
		String lData = data.substring(data.indexOf("!")+1); //������ ������ �㳪 �������� ���� �ϱ� ������ ���� index�� �����Ѵ�.
		System.out.println(lData.trim());

		int a = 10;
		int b = 20;
		double d=10.5;
		//102010.5	==> ��ȣ  ==> 20191231, 20191232
		String sss = a+""+b+""+d; //���ڿ� ���̱�  + ������ Ȱ��
		System.out.println(sss);
		String ssd= String.valueOf(a)+String.valueOf(b)+String.valueOf(d);// valueOf ��� ������ ���ڿ��� ��ȯ.. static �޼ҵ�..
		//valueOf ==> ��� ������ ���� ���ڷ� ��ȯ


		System.out.println(ssd);
	}

}
