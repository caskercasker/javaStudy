import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class �ݺ���7 {

	public static void main(String[] args) throws Exception { //����ó��
		// TODO Auto-generated method stub

	}
	public static void music() throws Exception{ //����ó�� //�޼ҵ�� ���� �ȿ����� �ۿ��� ȣ���� �ȵ�.
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.println("�˻��� �Է�");
		String fd = scan.next();
		int k=1;
		while(k<=4)
		{
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k).get(); //parser ���� �ܾ���� Jsoup ���
		//System.out.println(doc);
		Elements title = doc.select("td.info a.title"); //element "HTML tag" ��������
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
