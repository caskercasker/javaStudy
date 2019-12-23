public class 메소드5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기";
		// 문자 갯수  ==> 공백도 포함
		System.out.println("문자의 갯수: "+data.length());
		//System.out.println("버섯단어의 갯수:");
		int count =0;

		//버섯 단어 contains로 해결이 안되서 패턴을 이용하고 매치를 시켜서 골라냄
//		Pattern p = Pattern.compile("버섯");
//		Matcher m = p.matcher(data);
//		while(m.find()) {
//			count++;
//		}
//		System.out.println("버섯단어의 갯수 : "+count);


		//Sub String 활용
		String fData = data.substring(0,data.indexOf("!"));
		System.out.println(fData);
		String lData = data.substring(data.indexOf("!")+1); //끝까지 실행함 허나 시작점은 포함 하기 때문에 시작 index를 조절한다.
		System.out.println(lData.trim());

		int a = 10;
		int b = 20;
		double d=10.5;
		//102010.5	==> 번호  ==> 20191231, 20191232
		String sss = a+""+b+""+d; //문자열 붙이기  + 연산자 활용
		System.out.println(sss);
		String ssd= String.valueOf(a)+String.valueOf(b)+String.valueOf(d);// valueOf 모든 내용을 문자열로 변환.. static 메소드..
		//valueOf ==> 모든 데이터 형을 문자로 변환


		System.out.println(ssd);
	}

}
