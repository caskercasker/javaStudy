// ����


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		StudentSystem ss = new StudentSystem();

		s1.setName("ȫ�浿");
		s1.setKor(80);
		s1.setEng(65);
		s1.setMath(75);

		s2.setName("�̴ܾ�");
		s2.setKor(90);
		s2.setEng(85);
		s2.setMath(45);

		s3.setName("�˵���");
		s3.setKor(60);
		s3.setEng(25);
		s3.setMath(55);


		//ss.hakjumData(s1);

		s1.setTotal(ss.totalData(s1.getKor(), s1.getEng(), s1.getMath()));
		s1.setAvg(ss.avgData(s1.getTotal()));
		s1.setScore(ss.scoreData(s1.getAvg()));

		System.out.println("===================");
		System.out.println("�̸�:"+s1.getName());
		System.out.println("����:"+s1.getKor());
		System.out.println("����:"+s1.getEng());
		System.out.println("����:"+s1.getMath());
		System.out.println("����:"+s1.getTotal());
		System.out.println("���:"+s1.getAvg());
		System.out.println("����:"+s1.getScore());

		s2.setTotal(ss.totalData(s2.getKor(), s2.getEng(), s2.getMath()));
		s2.setAvg(ss.avgData(s2.getTotal()));
		s2.setScore(ss.scoreData(s2.getAvg()));

		System.out.println("===================");
		System.out.println("�̸�:"+s2.getName());
		System.out.println("����:"+s2.getKor());
		System.out.println("����:"+s2.getEng());
		System.out.println("����:"+s2.getMath());
		System.out.println("����:"+s2.getTotal());
		System.out.println("���:"+s2.getAvg());
		System.out.println("����:"+s2.getScore());

		s3.setTotal(ss.totalData(s3.getKor(), s3.getEng(), s3.getMath()));
		s3.setAvg(ss.avgData(s3.getTotal()));
		s3.setScore(ss.scoreData(s3.getAvg()));

		System.out.println("===================");
		System.out.println("�̸�:"+s3.getName());
		System.out.println("����:"+s3.getKor());
		System.out.println("����:"+s3.getEng());
		System.out.println("����:"+s3.getMath());
		System.out.println("����:"+s3.getTotal());
		System.out.println("���:"+s3.getAvg());
		System.out.println("����:"+s3.getScore());


	}

}
