//import java.io.IOException;

public class 메소드4 {
	static String[] recipeData() {
		String[] data = {
				"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
				"완전맛있는 차돌박이찜! 미소된장마요소스도 함께~",
				"고기처럼 쫄깃한 밥도둑 반찬 '새송이버섯 간장버터구이'레시피",
				"새우요리 갈릭마요새우~ 요거 완전 맛있지~",
				"해물찜처럼 맛있는 백종원 소시지콩나물찜",
				"초간단 머그컵 퐁당 오 쇼콜라*.*",
				"단짠단짠의 대패덮밥",
				"부타동 : 일본식 돼지고기 덮밥 간단한 점심 메뉴로 굿!",
				"담백한 새우연두부달걀탕",
				"치킨너겟으로 간편하게 간장치킨 만들기"};
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
		System.out.println("======== 가장 긴 레시피명 출력....");
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
