// ~VO (�������� Ŭ����) => ĸ��ȭ
/*
 *  ���� : �б�,���� => �޼ҵ�ȭ ó��
 * ���ϵ������ ������
Ȯ���ϱ�
���ϵ������ (2018)
Wildlife
����8.4/10
���
 �̱�
2019.12.25 ����
105��, 15���̻������
(����) �� �ٳ�
(�ֿ�) ĳ�� �ָ���, ����ũ ������
���� 23����������9,197��
�����ϱ�
���ູ�� ������ ������ ���� �; ������ ��´ܴ�. �װ� ��� �����ϴ� ������

1960�� �̱� ���³�, 14�� �ҳ� ������(���� ��������)�� �θ�� �̻縦 �´�. �ƺ� ��������(����ũ ������)�� ��� ��ȭ �۾� ���� �ϰڴٸ� ������ ������ ������ �������� ���� ���ڳݡ�(ĳ�� �ָ���)�� �ܵ��� ���´�. ���۽����� ��ȭ�� �ηư� ���� ���ڳݡ��� ������. ù ���� ������ ��� �� ���ڸ��� ���ƿñ�?


	���� �ʱ�ȭ
		1) ������
		2) �ʱ�ȭ ���
			������ �ۿ� ����� �ϳ���.
		3) setter
			-������ �о��� ��
			Ŭ�������� ������ ������ �κп��� �ʱ�ȭ�� �����ϴ�.

����ƽ �ʱ�ȭ ����� ���� �ڿ��̱� ������ �ѹ��� �ʱ�ȭ������ ����ϴ�.
�����ڸ� ����� ���. Ŭ������ �����ɶ����� �ʱ�ȭ ���� �������ֱ� ������
�ݺ��Ǵ� ���������� �ʱ�ȭ�� �ǹ̰� �ִ��� �����غ��� �Ѵ�.

static �����ڿ��� ������? �����ڸ� ���ؼ� ������ �ʿ䰡 ����.
�ʱ�ȭ�� ���ؼ� �ʱ�ȭ ����� ����Ѵ�.

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
