/*
 * 	1. 데이터의 초기화
 * 		= 생성자
 * 		= setter
 *
 */
class Music{
	private int mno;
	private String title;
	private String singer;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Music(int mno, String title, String singer) {
		this.mno = mno;
		this.title = title;
		this.singer =singer;
	}
}
// Movie 클래스는 같은 폴더에 있기 때문에 만들어 줄수 없다.
// 또한 한 클래스 파일에  public 은 하나만 존재해야 한다.
// getter setter		===> source 에서 읽기 쓰기 만들어주는 기능이 있다.
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music music = new Music(100,"Square","백예린");
//		music.setMno(100);
//		music.setTitle("Square");
//		music.setSinger("백예린");

		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());

		music = new Music(101,"나의 오랜 연인에게", "다비치");
	}

}
