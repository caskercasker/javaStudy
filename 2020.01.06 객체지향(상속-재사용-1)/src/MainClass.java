class ����{
	public void draw() {
		System.out.println("�����׸���");
	}
	// �߰�
}
class �� extends ����{
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
	//�߰� ����
}
class �ﰢ�� extends ����{
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}
class �׸� extends ����{
	@Override
	public void draw() {
		System.out.println("�׸� �׸���");
	}
}
//���̺귯���� ��� => �����ؼ� ���
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� m = new �׸�();
		m.draw();
		m = new �ﰢ��();
		m.draw();
		m = new ��();
		m.draw();
		m = new ����();
		m.draw();
	}
}
