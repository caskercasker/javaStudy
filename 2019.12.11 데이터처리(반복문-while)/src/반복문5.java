// ====> ���� ===> charAt(0)
// String s="abcddifejfoijgoeijoef" 'a'�� 'A'�� ���� ���
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdAef";
		int i = 0;
		int counter = 0;
		while(i<s.length()) {
			System.out.println("��");
			if( 'a'==s.charAt(i)|| 'A'==s.charAt(i)){
				counter++;
			}
			i++;
		}
		System.out.println(s.length());
		System.out.println(counter); //a�� ���� ���
	}

}
