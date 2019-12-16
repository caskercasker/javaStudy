import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 반복문7 {

	public static void main(String[] args) throws Exception { //예외처리
		// TODO Auto-generated method stub

	}
	public static void music() throws Exception{ //예외처리 //메소드는 메인 안에서는 밖에서 호출이 안됨.
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.println("검색어 입력");
		String fd = scan.next();
		int k=1;
		while(k<=4)
		{
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k).get(); //parser 전부 긁어오기 Jsoup 기능
		//System.out.println(doc);
		Elements title = doc.select("td.info a.title"); //element "HTML tag" 가져오기
		Elements singer = doc.select("td.info a.artist");
		int i=0;
		//title.si
		while(i<title.size()) {
			String data = title.get(i).text();
			//if(data.contains(fd)) {
			System.out.println(data);
			System.out.println(singer.get(i).text());
			i++;
		}
		k++;
		}


	}
}
