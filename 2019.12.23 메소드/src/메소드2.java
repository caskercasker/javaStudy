import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class �޼ҵ�2 {
	static String[] getMusicTitle() throws Exception {
		String[] list = new String[50];
		String url = "http://www.genie.co.kr/chart/top200";
		Document doc = Jsoup.connect(url).get();
		//String url = "https://www.genie.co.kr/chart/top200";
		//Jsoup.connect("https://www.genie.co.kr/chart/top200"); //url �� Jsoup�� ��ť��Ʈ Ÿ�Կ� ����..
		Elements title = doc.select("td.info a.title"); //css query css ������ ���� ���� �� ����...

		for(int i=0; i<50; i++) {
			list[i] = title.get(i).ownText();
		}
		return list;

	}
	//1|����|������|�ٹ�|100
	//��ü ������ ==>
	//

	/*
	 *  <a href="#" class="artist ellipsis" onclick="fnViewArtist('14936387');return false;">������</a>

                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('89741945');">��</button>
                                            <ul class="list" id="RelationArtist_89741945"></ul>
                                        </div>

                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('81337060');return false;">�ٽô� ������� �ʰ�, �̺��� �����ϱ� �Ⱦ�</a>
	 *
	 *
	 */
	static String getMusicInfo(int no) throws Exception{
		String res = "";
		//String[] list = new String[50];
		String url = "http://www.genie.co.kr/chart/top200";
		Document doc = Jsoup.connect(url).get();
		//String url = "https://www.genie.co.kr/chart/top200";
		//Jsoup.connect("https://www.genie.co.kr/chart/top200"); //url �� Jsoup�� ��ť��Ʈ Ÿ�Կ� ����..
		Elements singer = doc.select("td.info a.artist"); //css query css ������ ���� ���� �� ����...
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
		System.out.println("=============���� ���� rop 50============");
		for(String s:title) {
			System.out.println(s);
		}
		System.out.println("================================");
		Scanner scan = new Scanner(System.in);

		System.out.println("�󼼺��� ������ȣ �Է�(1~50):");
		int no = scan.nextInt();
		String detail = getMusicInfo(no);
		String[] value = detail.split("\\|"); // "|" ��� ���ڸ� �����ϴ� ������� �����ؾ���. Ȥ�� �̹� split ���� ������ �Ǿ� ����.
		//���� \\�� ���Խı��й��� �������. ex > $,.,.^,|,?

		// StringTokenizer
		System.out.println("������ : "+value[0]);
		System.out.println("�ٹ� : " + value[1]);

//		String name = scan.next();
//		for(String s:title) {
//			if(s.contains(name)) {
//				System.out.println(s);
//			}
//		}
		//contains ����

		long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		long secDiffTime = (afterTime - beforeTime)/1000; //�� �ð��� �� ���
		System.out.printf("�ð�����"+secDiffTime);

	}

}
