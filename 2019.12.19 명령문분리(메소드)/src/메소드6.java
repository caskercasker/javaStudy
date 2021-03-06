import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 메소드6 {
	static void siteData(String url) throws Exception {
		Document doc = Jsoup.connect(url).get();
		Elements link = doc.select("div.info_tit a.name_movie");

		int k=1;

		for(int i=0; i<link.size(); i++) {

		try {

			//System.out.println(link.get(i).attr("href"));
			String link_data="https://movie.daum.net"+link.get(i).attr("href"); //데이터를 가져오기 위해서 서버 주소 연결
			//https 생략이 가능... /1개일때는 서버 붙여줘야함.
			System.out.println(link_data);

			Document doc2 = Jsoup.connect(link_data).get();
			/*
			 *
			 * <div class="subject_movie">
								<strong class="tit_movie">겨울왕국 2 (2019)</strong>         //겨울왕국2는 텍스트, moviedb/grade.... (Attr
								<span class="txt_origin">Frozen II</span><!-- 2016-04-12 추가 -->
			<a href="/moviedb/grade?movieId=93004" class="raking_grade">
			<span class="bg_star star_grade"><span class="bg_star inner_star" style="width:74.15000081062317%">평점</span></span> <!-- 116px이 100%, % 계산에서 width값에 적용-->
			<em class="emph_grade">7.4


			 *
			 */
			//Element poster = doc.selectFirst("span.thumb_summary
			Element title_kr = doc2.selectFirst("div.subject_movie strong.tit_movie");
			Element title_en = doc2.selectFirst("div.subject_movie span.txt_origin");
			Element score = doc2.selectFirst("a.raking_grade em.emph_grade");
			Element genre = doc2.select("dl.list_movie dd.txt_main").get(0);
			Element regdate= doc2.select("dl.list_movie dd.txt_main").get(1);
			Element grade = doc2.select("dl.list_movie dd").get(3);
			Element director = doc2.select("dl.list_movie dd").get(4);
			Element actor = doc2.select("dl.list_movie dd").get(5);




				  System.out.println(title_kr.text()); System.out.println(title_en.text());
				  System.out.println(score.text()); System.out.println(genre.text());
				  System.out.println(regdate.text()); System.out.println(grade.text());
				  System.out.println(director.text()); System.out.println(actor.text());
				  System.out.println("=======================================");


		}catch(Exception ex) {}
		}

	}

	static void process () throws Exception{
		Scanner scan = new Scanner(System.in);
		String[] url = {
				"https://movie.daum.net/premovie/released",
				"https://movie.daum.net/premovie/scheduled",
				"https://movie.daum.net/boxoffice/weekly",
				"https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/boxoffice/yearly"
		};
		while(true) {
			System.out.println("===============");
			System.out.println("1.현재상영 영화");
			System.out.println("2.개봉 예정 영화");
			System.out.println("3.박스오피스(주간)");
			System.out.println("4.박스오피스(월간)");
			System.out.println("5.박스오피스(연간)");
			System.out.println("6.종료");
			System.out.println("===============");
			System.out.print("선택>");
			int no = scan.nextInt();
			if(no==6) {
				System.out.println("프로그램 종료");
				break;
			}
			siteData(url[no-1]);
		}

	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		process();
	}

}
