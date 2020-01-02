// ~VO (데이터형 클래스) => 캡슐화
/*
 *  변수 : 읽기,쓰기 => 메소드화 처리
 * 와일드라이프 포스터
확대하기
와일드라이프 (2018)
Wildlife
평점8.4/10
드라마
 미국
2019.12.25 개봉
105분, 15세이상관람가
(감독) 폴 다노
(주연) 캐리 멀리건, 제이크 질렌할
예매 23위누적관객9,197명
예매하기
“행복한 순간을 영원히 보고 싶어서 사진을 찍는단다. 그걸 평생 간직하는 거지”

1960년 미국 몬태나, 14살 소년 ‘조’(에드 옥슨볼드)가 부모와 이사를 온다. 아빠 ‘제리’(제이크 질렌할)는 산불 진화 작업 일을 하겠다며 위험한 곳으로 떠나고 ‘조’는 엄마 ‘자넷’(캐리 멀리건)과 단둘이 남는다. 갑작스러운 변화가 두렵고 낯선 ‘자넷’과 ‘조’. 첫 눈이 내리면 모든 게 제자리로 돌아올까?


	변수 초기화
		1) 생성자
		2) 초기화 블록
			구현부 밖에 블록을 하나줌.
		3) setter
			-파일을 읽었을 때
			클래스에서 구현이 가능한 부분에서 초기화가 가능하다.

스태틱 초기화 블록은 공유 자원이기 때문에 한번의 초기화만으로 충분하다.
생성자를 사용할 경우. 클래스가 생성될때마다 초기화 값을 지정해주기 때문에
반복되는 생성에서의 초기화가 의미가 있는지 학인해봐야 한다.

static 생성자에서 못쓴다? 생성자를 통해서 접근할 필요가 없다.
초기화를 위해서 초기화 블록을 사용한다.

		class A
		{
			int a = 10 ;
			{
				for(int i=0; i<10; i++){
				a=i;
				}
			}
		}
 */
public class MovieVO {
	private String title;
	private double score;
	private String genre;
	private String regdate;
	private int time;
	private String grade;
	private String director;
	private String actor;
	private int showUser;
	private String story;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getShowUser() {
		return showUser;
	}
	public void setShowUser(int showUser) {
		this.showUser = showUser;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}


}
