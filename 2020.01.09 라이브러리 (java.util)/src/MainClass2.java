import java.util.StringTokenizer;
//지능형 웹  => 데이터 분석
/*
 * 챗봇(AI)
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Java Oracle HTML CSS JavaScript JSP Spring Kotlin";
		StringTokenizer st = new StringTokenizer(data);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
