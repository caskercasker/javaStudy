import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 메소드2 {
	static String[] getMusicTitle() throws Exception {
		String[] list = new String[50];
		String url = "http://www.genie.co.kr/chart/top200";
		Document doc = Jsoup.connect(url).get();
		//String url = "https://www.genie.co.kr/chart/top200";
		//Jsoup.connect("https://www.genie.co.kr/chart/top200"); //url 은 Jsoup의 다큐먼트 타입에 연결..
		Elements title = doc.select("td.info a.title"); //css query css 문법에 따른 쿼리 를 보냄...

		for(int i=0; i<50; i++) {
			list[i] = title.get(i).ownText();
		}
		return list;

	}
	//1|제목|가수면|앨범|100
	//전체 데이터 ==>
	//

	/*
	 *  <a href="#" class="artist ellipsis" onclick="fnViewArtist('14936387');return false;">백지영</a>

                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('89741945');">외</button>
                                            <ul class="list" id="RelationArtist_89741945"></ul>
                                        </div>

                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('81337060');return false;">다시는 사랑하지 않고, 이별에 아파하기 싫어</a>
	 *
	 *
	 */
	static String getMusicInfo(int no) throws Exception{
		String res = "";
		//String[] list = new String[50];
		String url = "http://www.genie.co.kr/chart/top200";
		Document doc = Jsoup.connect(url).get();
		//String url = "https://www.genie.co.kr/chart/top200";
		//Jsoup.connect("https://www.genie.co.kr/chart/top200"); //url 은 Jsoup의 다큐먼트 타입에 연결..
		Elements singer = doc.select("td.info a.artist"); //css query css 문법에 따른 쿼리 를 보냄...
		Elements album = doc.select("td.info a.albumtitle");
		for(int i=0; i<50; i++) {
			if(i==(no-1)) {
				res = singer.get(i).text()+"|"+album.get(i).text();
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		long beforeTime = System.currentTimeMillis();




		String[] title= getMusicTitle();
		System.out.println("=============지니 뮤직 rop 50============");
		for(String s:title) {
			System.out.println(s);
		}
		System.out.println("================================");
		Scanner scan = new Scanner(System.in);

		System.out.println("상세보기 뮤직번호 입력(1~50):");
		int no = scan.nextInt();
		String detail = getMusicInfo(no);
		String[] value = detail.split("\\|"); // "|" 라는 문자를 구분하는 방식으로 이해해야함. 혹은 이미 split 에는 구분이 되어 있음.
		//따라서 \\로 정규식구분법을 따라야함. ex > $,.,.^,|,?

		// StringTokenizer
		System.out.println("가수명 : "+value[0]);
		System.out.println("앨범 : " + value[1]);

//		String name = scan.next();
//		for(String s:title) {
//			if(s.contains(name)) {
//				System.out.println(s);
//			}
//		}
		//contains 구현

		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.printf("시간차이"+secDiffTime);

	}

}
