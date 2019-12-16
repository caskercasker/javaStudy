/*
 * 	break
 *  continue
 *  ========= 본인의 반복문만 제어=====
 *  			break => for,while,do-while,switch-case
 *  			continue => for,while,do~while
 * 				return => 어떤 제어문이든 사용이 가능하다?
 *
 */
public class 반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.printf

		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				//if(j==2)
					//continue;
					//return;
					//break;
				System.out.println("i="+i+"j="+j);
			}
			//break;
			continue;
		}
	}

}
