package com.sist.Exception;
/*
 * 예외처리
 * ======
 * 		예외처리 종류
 * 		예외복구 :  try~ catch(직접처리) ======== > 70%
 * 		=> 예외로 인해 발생하여 작동하지 않은 부분을 복구한다?
 * 			네트워크에서 연결이 끊겼을때 복구 문장에서 다시 대기 한다.
 * 		예외회피 : 	 throws (간접처리 => 시스템에 의해 처리) ===> 29%
 * 		예외발생 :  throws (사용자 정의 예외 처리) ====> 1%
 *		-----------------------------------------------
 *		try ~catch ~finally(생략해도 무방)
 *		형식> try{
 *				정상수행을 할 수 있는 문장
 *				1번문장
 * 				2번문장
 *  			3번문장	=>1 유형의 에러 발생 ==> catch를 수행
 *   			=====
 *   			4번문장
 *    			5번문장
 *    			===== 수행할 수 없는 문장
 *			}catch (예상되는 예외1){
 *				복구하는 문장
 *				6번문장
 *			}catch (예상되는 예외2){
 *				복구 문장
 *				7번문장
 *			}catch (예상되는 예외3){
 *				복구 문장
 *				8번문장
 *			}catch (예상되는 예외4){
 *				복구 문장
 *				9번문장
 *			}finally{
 *				정상수행 or 복구 문장을 수행하든 관계없이 무조건 수행하는 문장
 *				DB에서 사용
 *				서버를 계속 열어 놓을수 없기에 연결을 닫는걸 무조건 실행.
 *				9번 문장
 *			}
 *			10번문장
 *		==> try 로 묶인 부분에서 에러가 발생하면 catch 절로 빠지기 때문에 남은 try부분은 실행하지 않고 나머지가 진행된다.
 *
 *
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

		}catch(Exception ex) {

		}
	}

}
