/*
 * 
 *        조건     &&   조건  범위 포함
 *        조건     || 	조건 외부
 *      =================================
 *         				&& 		||
 *      =================================
 *      true true		true	false
 *      =================================
 *      true false		false	true	
 *      =================================
 *      false true		false	true
 *      =================================
 *      false false		false	false
 *      =================================
 *      
 *         *** 효율적인 연산
 *         && => 왼쪽 => false =>오른쪽은 연산에서 제외
 *         || => 왼쪽 => true => 오른쪽은 연산에서 제외
 *          
 *   
 * 
 * 
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//알파벳을 저장후에 소문자냐, 대문자
		char c='T';
		String result =(c>='A' && c<= 'Z')? "대문자" : "소문자";
		System.out.println(c+"는(은)"+result);
	}

}
