// String : นฎภฺฟญภป มฆพ๎
/*
 *
 * java.lang => importธฆ ปýทซวาผ๖ภึดู.
 *  นฎภฺฟญภป ภ๚ภๅวฯดย นๆนý
 *  	1) String บฏผ๖ธํ = "Hello Java ";
 *  	2) String บฏผ๖ธํ = new String("Hello Java"); //ฐฐภบ นฎภฺฟญ => บฐตตทฮ ภ๚ภๅ
 *  					====
 * 	 					ป๕ทฮฟ๎ ธÞธ๐ธฎฟก ภ๚ภๅ.
 * 	String ฟกผญ มฆฐ๘วฯดย ฑโดษ
 * 	1) equals : ภ๚ภๅตศ นฎภฺฟญ ฐฐภบม๖ ฟฉบฮ ศฎภฮ (true/false)
 * 		ID, PWD ==> ทฮฑืภฮ(ด๋ผานฎภฺ ฑธบะ)
 * 		นฎภฺฟญภบ (==)ภป ป็ฟ๋วฯธ้ พสตศดู.(X)
 *
 * 		String s = "Hello";
 * 		String s1 = "Hello";
 * 		String s1 = new String ("Hello")
 * 		if(s==s1)	true; //นฎภฺฟญ มึผาฐก ฐฐดู.. ฐชภฬ ฐฐภฝภป บ๑ฑณวัฐอภฬ พฦดฯถ๓ ยüมถวั มึผาฐชภฬ ฐฐดู. "ฐฐภบ นฎภฺฟญภฬ ภ๚ภๅ ตวพ๚ฑโ ถงนฎฟก"
 		if(s.equals(s1))// valueธฆ บ๑ฑณวา ป็ฟ๋.
 *
 *		=> ฟ๘วü
			boolean eaquals (String data)

 * 	2) substring : นฎภฺฟญภป ภฺธฆ ถง							-- ภฅ ฦไภฬม๖ฟกผญ ณัฤกดย ฑÛภฺธฆ ฐกมฎฟภฐลณช, ฐกมฎฟภบz ตฅภฬลอภว วüลยฐก ภฯมควฯม๖ พสภป ถง นฎภฺฟญภป ภฺธฅดู.
 * 			String s = "0123456789";
 * 			substring(3) => "3456789"
 * 			String s = "112บะ, 15ผผ ภฬป๓ ฐüถ๗ฐก"
 * 			substring(0,3) => "112"
 * 						===
 * 						end-1 ==> 0,1,2 ภฺธง
 * 			substring(int start)
 * 			substring(int start, int end)
 *
 *  3) length : นฎภฺฟญ ฐนผ๖
 *   	String s = "Hello ศซฑๆตฟ"; //cพ๐พ๎ดย วัฑÛภฺด็  2byte พฟ ภะฑโ ถงนฎฟก นฎภฺฟญภว ฐนผ๖ดย 9
 *
 *  4) trim : มยฟ์ภว ฐ๘น้นฎภฺ มฆฐล									-- ฝวผ๖ทฮ ภิทยตศ นฎภฺฟญภว ฐ๘น้ภป มฆฐลวัดู.
 *
		String s = "Hello Java";
				=> s.length
 *  5) startWith,endWith //ฝรภÛ นฎภฺฟญภฬ ฐฐภบฐๆฟ์/ ธถม๖ธท นฎภฺฟญภฬ ฐฐภบ ฐๆฟ์  // ฐหป๖ฑโ??
 *  	startsWith("ภฺนู")
 *
 *
 *  6) indexOf, lastIndexOf  				//ฐๆทฮธํ ภฬ '/'ทฮ ฑธบะตวผญ ธนภฬ พดดู.
 *  	นฎภฺภว ภงฤก (indexOf:พีฟกผญ lastIndexOf:ตฺฟกผญ)
 *  	String s = "Hello Java";
 *  				0123456789
 *  	s.indexOf('a') ==>  7
 *  	s.lastIndexOf('a') ==>  9
 *
 *  7) split
 *	   String s = "ภฬบดวๅ, วฯมคฟ์, ธถตฟผฎ, ภüวýม๘, ผ๖ม๖";
 *	   String[] names = s.split(",")
 *		มคฑิฝฤ
 *		====
 *		211.238.132.181
 *		211.238.142.180
 *		211.238.142.1
 *		211.238.1.1
 *		211.238.142.0
 *
 *		[0-9]{1,3}\\.[0-9]{1,3}
*
 *
 *
 *  8) toUpperCase, toLowerCase
 *  	ด๋นฎภฺ บฏศฏ, 	ผานฎภฺ บฏศฏ
 *  	String s= "Hello";
 *  	s.toUpperCase(s) ==> HELLO
 *  	s.toLowerCase(s) ==> hello
 *  9) replace , replaceAll ==> มคฑิฝฤ
 *  			String s="113บะ"
 *  			s.replaceAll("[^0-9]"," ")==>113 //ผýภฺธฆ มฆฟÜวฯฐํ ธ๐ตฮ ฐ๘น้ภธทฮ นูฒใถ๓  ,, ฐýศฃณปบฮฟกผญ บฮมค $ ณกณชดย..
 *  			s.replaceAll("^[0-9]"," ")  //ผýภฺทฮ ฝรภÛวั. '^' ฐýศฃ นÛ ฝรภÛ ภวนฬ
 *				s.replaceAll("[^ฐก-ฦR]"," ")  = วัฑÛภป มฆฟÜวฯฐํ ธ๐ตฮ ฐ๘น้ภธทฮ นูฒใถ๓
 *				s.replaceAll("[^A-Za-z]"," ") = ฟตนฎภป มฆฟÜวฯฐํ ธ๐ตฮ ฐ๘น้ภธทฮ นูฒใถ๓.
 *
 * 10) contains() : ฦ๗วิตศ นฎภฺธฆ รฃดย ฐๆฟ์
 *
 *  	======
 *  		บฏฐๆ ==>  String s="Hello Java"
 *  				s.replace('a','b') ==> "Hello Jbvb"
 *
 *
 *
 *  กุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุกุ
 *  String ภบ  char[] วüลยฐก ภ๚ภๅตศ ลฌทกฝบภฬดู.
 *
 *
 */
import java.util.Scanner;

public class นฎภฺฟญลฌทกฝบ {
	static String[] autoComplete(String data) {
		String[] ss = {"ภฺนูฟอ JSP","ภฺนู วมทฮฑืทกนึ","ฝบวมธต 5","AJAX ฟอ JSP","ธฎด๖ฝบฟอ ธฎพืฦฎ",
						"ภฺนู ฟภถ๓ลฌ","mvc ฑธมถ","ฤฺฦฒธฐฐ๚ พศตๅทฮภฬตๅ","ฤฺฦฒธฐ วมทฮฑืทฅ","ฝบวมธต ตฅภฬลอ",
						"ศฅภฺน่ฟ์ดย ภฺนู","ม๖ดษวü ภฅ วมทฮฑืทฅ","ภฅ วมทฮฑืทฅ","ภฺนู ภฅวมทฮฑืทฅ","ฟภถ๓ลฌ ภฺนู"};
		String[] findData = new String[10];
		int j=0;
		for (int i=0; i<ss.length;i++) {
			/*
			 * if(ss[i].startsWith(data)) { findData[j] = ss[i]; j++; }
			 */
			if(ss[i].contains(data)) {
				findData[j] = ss[i];
				j++;

			}
		}
		return findData;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ฐหป๖พ๎ ภิทย:");
		String data = scan.next();
		String[] fd =autoComplete(data);
		for(int i=0; i<fd.length; i++) {
			if(fd[i]!=null) {
				System.out.println(fd[i]);
			}
		}
	}

}
