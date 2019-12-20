
public class 배열7 {
	/*
	 * static void aaa(){ int a=101; } static void bbb() { int b=102; } static void
	 * ccc() { int c=10; }
	 */
	static void getData2(String a) {
		a ="Hello";
	}
	static void getData(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "Java";
		getData2(a);
		System.out.println(a); // call by reference String만 예외적으로 class/배열과 같이 적용 되지 않는다......

		int[] arr = new int[5];
		for(int i:arr) {
			System.out.println(i);
		}

		getData(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
