import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class Category{
	int cateno; //cno
	String poster;
	String title;
	String subTitle;
	String link;
}
class Food{
	int cateno;
	int no;

	String[] poster = new String[4];
	String title;
	double score;
	String addr;
	String tel;
	String type;
	String price;
	String packing;
	String time;
	String menu;

	int good;
	int soso;
	int bad;
}

/*
 *
 * <li>
              <img class="center-croping" alt="2020 제주 인기 맛집 TOP 60 사진"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/7zsdxmpu4kauzpk7.jpg?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>
		//이미지 파일 읽어오기 attr("data-lazy")
              <a href="/top_lists/2264_jeju2020"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;믿고 보는 맛집 리스트&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;PQQTL_E&quot;});">
                <figure class="ls-item">		//attr("class")
                  <figcaption class="info">
                    <div class="info_inner_wrap">
                   	   <span class="title">2020 제주 인기 맛집 TOP 60</span>
                      <p class="desc">"제주의 인기 맛집만 쏙쏙 골라 모았다!"</p>

 					<div>
 						<span></span>
 						<p></p>
 					</div>
 						<span></span>
 *
 *
 */
public class FoodMain {
	Category[] foodCategoryData() throws Exception{
		Category[] cate=new Category[12];
		Document doc = Jsoup.connect("https://www.mangoplate.com/").get();
		Elements title = doc.select("div.info_inner_wrap span.title");  //class는 도트연산자, id는 #
		Elements poster = doc.select("ul.list-toplist-slider img");
		Elements sub = doc.select("div.info_inner_wrap p.desc");//태그명의 클래스  공백 값의 위치 // 항상 하나 위의 구분될수 있는 최소값     //손가락 표시  a tag
		Elements link = doc.select("ul.list-toplist-slider a");

		for(int i=0; i< 12; i++) {
			Category g = new Category();
			g.cateno=i+1;
			g.title = title.get(i).text(); //텍스트만 가져오기 <tag>  </tag> 사이의 값을 가져오기.
			g.subTitle = sub.get(i).text(); //p tag 줄 내리기.
			g.poster = poster.get(i).attr("data-lazy");
			g.link = link.get(i).attr("href");
			cate[i]=g;
			//tag 안에 있는 값 attribute 속성
			//tag 값

		}


		return cate;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// get methods, set methods 메소드를 통해서 값은 접근, 캡슐화
		FoodMain f = new FoodMain();

		for(int i=0; i<12; i++) {
			System.out.println(f.foodCategoryData()[i].cateno);
			System.out.println(f.foodCategoryData()[i].title);
			System.out.println(f.foodCategoryData()[i].subTitle);
			System.out.println(f.foodCategoryData()[i].poster);
			System.out.println(f.foodCategoryData()[i].link);
		}

	}

}
