import java.text.SimpleDateFormat;
import java.util.Date;

public class clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Date date = new Date();
			SimpleDateFormat sdf = new	SimpleDateFormat("hh:mm:ss");
			System.out.println(sdf.format(date));
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {} }
	}

}
