import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ý����� �ð� �б� : Date
		Date date = new Date();
		//2020/01/09
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //M���� ���� �ѱ�� �׳� ��, MM�� �տ� 0�� ���Ƿ� ����
		System.out.println(sdf.format(date));
		System.out.println("===========");
		//System.out.println(date.toString());

		StringTokenizer st = new StringTokenizer(sdf.format(date),"-");
		String year= st.nextToken();
		String month=st.nextToken();
		String day = st.nextToken();
		st = new StringTokenizer(sdf.format(date),":");
		System.out.println("dfdf");

		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
