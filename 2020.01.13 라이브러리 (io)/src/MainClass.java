/*
 * 	IO : CheckException (반드시 예외처리)
 *  === Input/ Output (입출력)
 *  = 메모리 입출력
 *    ================ 표준 System.in.read(), System.out.println()
 *  = 파일 입출력
 *  = 네트워크 입출력
 *
 * 	라이브러리에서 제공하는 IO => 단점 (단방향) 한번에 가고 오고 한번씩만 할수 있음.
 * 							(양방향 통신 ) 2개의 통로가 필요해서 Thread 가 필요함
 * 									하나는 계속 값을 받아오고, 하나는 받은 값을 계속해서 보내줌
 * 	================== stream(데이터가 이통하는 공간)	메모리에 저장해두고, 저장된걸 읽어서 출력 tcp(네트워크 스트림)
 * 		바이트스트림 					문자스트림
 * 		========					=======
 * 		1byte씩	 					2byte씩
 * 			|							|
 * ================				=================
 * InputStream OutputStream 	Reader 		Writer
 *
 * FileInputStream				FileReader
 * FileOutputStream 			FileWriter
 *
 * 보조장치 (임시 저장, 입력하나하나 마다 값을 보내기엔 지연시간 때문에 문제가 생김, 따라서 Buffered을 넣어두고 한번에 읽는다)
 * BufferedInputStream			BufferedReader
 * BufferedOutputStream			BufferedWriter
 *
 * File
 *
 * ==객체단위로 저장 ==> 직렬화/역직렬화
 * ObjectInputStream
 * ObjectOutputStream
 *
 *  응용프로그램  ---- 메모리 (사이에 스트림이라는 통로가 만들어짐)
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
