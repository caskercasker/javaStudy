package ����������;
import java.text.NumberFormat;

public class ��������4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank = 1;
		String title = "Blueming";
		String singer = "������";
		String album = "Love Poem";
		int like = 1342472;
		
		String commaNum = NumberFormat.getInstance().format(like);
		
		System.out.println("��" + " " + commaNum);
	}

}
