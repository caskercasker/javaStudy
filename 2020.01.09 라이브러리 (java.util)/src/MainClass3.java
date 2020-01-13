import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시스템의 시간 읽기 : Date
		Date date = new Date();
		//2020/01/09
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //M으로 값을 넘기면 그냥 값, MM은 앞에 0을 임의로 붙임
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
