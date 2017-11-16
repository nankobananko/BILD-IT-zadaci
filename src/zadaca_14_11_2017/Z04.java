package zadaca_14_11_2017;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Z04 {

	//Napisati metodu koja vraca datum i trenutacno vrijeme.

		public static Date vrijeme(){
			Date datum=new Date();
			return datum;
		}
		
	public static void main(String[] args) {
		
	SimpleDateFormat datumIvrijeme = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss"); 
	
	System.out.println(datumIvrijeme.format(vrijeme()));
		}
	}


