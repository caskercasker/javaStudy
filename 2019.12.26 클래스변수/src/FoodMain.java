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
              <img class="center-croping" alt="2020 ���� �α� ���� TOP 60 ����"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/7zsdxmpu4kauzpk7.jpg?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>
		//�̹��� ���� �о���� attr("data-lazy")
              <a href="/top_lists/2264_jeju2020"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;�ϰ� ���� ���� ����Ʈ&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;PQQTL_E&quot;});">
                <figure class="ls-item">		//attr("class")
                  <figcaption class="info">
                    <div class="info_inner_wrap">
                   	   <span class="title">2020 ���� �α� ���� TOP 60</span>
                      <p class="desc">"������ �α� ������ ��� ��� ��Ҵ�!"</p>

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
		Elements title = doc.select("div.info_inner_wrap span.title");  //class�� ��Ʈ������, id�� #
		Elements poster = doc.select("ul.list-toplist-slider img");
		Elements sub = doc.select("div.info_inner_wrap p.desc");//�±׸��� Ŭ����  ���� ���� ��ġ // �׻� �ϳ� ���� ���еɼ� �ִ� �ּҰ�     //�հ��� ǥ��  a tag
		Elements link = doc.select("ul.list-toplist-slider a");

		for(int i=0; i< 12; i++) {
			Category g = new Category();
			g.cateno=i+1;
			g.title = title.get(i).text(); //�ؽ�Ʈ�� �������� <tag>  </tag> ������ ���� ��������.
			g.subTitle = sub.get(i).text(); //p tag �� ������.
			g.poster = poster.get(i).attr("data-lazy");
			g.link = link.get(i).attr("href");
			cate[i]=g;
			//tag �ȿ� �ִ� �� attribute �Ӽ�
			//tag ��

		}


		return cate;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// get methods, set methods �޼ҵ带 ���ؼ� ���� ����, ĸ��ȭ
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
