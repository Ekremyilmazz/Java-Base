import java.text.SimpleDateFormat;
import java.util.Date;

public class Standart {

	public static void main(String[] args) {
		Date today=new Date();
		SimpleDateFormat sdf1,sdf2;
		sdf1=new SimpleDateFormat("MM/dd/yy");
		sdf2=new SimpleDateFormat("MMMM dd, yyyy");
		
		
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));

	}

}
