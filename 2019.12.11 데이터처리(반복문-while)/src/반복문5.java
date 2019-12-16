// ====> 문자 ===> charAt(0)
// String s="abcddifejfoijgoeijoef" 'a'나 'A'의 갯수 출력
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdAef";
		int i = 0;
		int counter = 0;
		while(i<s.length()) {
			System.out.println("셈");
			if( 'a'==s.charAt(i)|| 'A'==s.charAt(i)){
				counter++;
			}
			i++;
		}
		System.out.println(s.length());
		System.out.println(counter); //a의 갯수 출력
	}

}
