import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 *<div class="wrap_movie">
	<div class="info_tit">
	<em class="ico_movie ico_allrating">전체관람가</em>
	<a href="/moviedb/main?movieId=93004" class="name_movie #title">겨울왕국 2</a>
	*/
public class 배열3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//배열
		Movie[] m = new Movie[16]; // 배열 선언...

		Document doc = Jsoup.connect("https://movie.daum.net/premovie/released").get();
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

			System.out.println("count"+(k));

				/*
				 * System.out.println(title_kr.text()); System.out.println(title_en.text());
				 * System.out.println(score.text()); System.out.println(genre.text());
				 * System.out.println(regdate.text()); System.out.println(grade.text());
				 * System.out.println(director.text()); System.out.println(actor.text());
				 * System.out.println("=======================================");
				 */
			m[i] = new Movie();// 클래스 생성자.


			m[i].title_kr = title_kr.text();
			m[i].title_en = title_en.text();
			m[i].score = Double.parseDouble(score.text());
			m[i].grade = grade.text();
			m[i].genre = genre.text();
			m[i].regdate = regdate.text();
			m[i].director = director.text();
			m[i].actor = actor.text();
			//m[i].poster = poster.attr("src");
			k++;
		}catch(Exception ex) {k--;}
	}

		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("영화번호 선택(0~15):");
		 * int index = scan.nextInt(); System.out.println("========== 결과값 ==========");
		 * System.out.println("영화명:"+m[index].title_kr);
		 * System.out.println("감독:"+m[index].director);
		 * System.out.println("출연:"+m[index].actor);
		 * System.out.println("개봉일:"+m[index].regdate);
		 * System.out.println("장르:"+m[index].genre);
		 */
		int index = 0;
		//System.out.println(m[index].score);
		double max = 0.0;
		System.out.println(m.length);  //16
		for(int i=0; i<m.length-1; i++) {
			if(m[i]!=null) {
				if(m[i].score>max) {
					max = m[i].score;
				//System.out.println(m[i].score);
				}
			}//System.out.println(m[i].score);
		}


		System.out.println(max);
		for(int i=0; i<m.length;i++) {
			if(m[i]!=null) {
				if(m[i].score==max) {
					System.out.println(m[i].title_kr);
				}
			}
		}
	}
}
//오라클,html구현,