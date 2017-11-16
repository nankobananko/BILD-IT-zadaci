package zadaca_14_11_2017;
import java.util.Scanner;
public class Z05 {

	//Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. 
	//Metoda treba da koristi sljedeci header: 
	//public static String pretvoriMilisekunde(long millis). 
	//Metoda treba da vraca vrijeme kao string u formatu sati:minute:sekunde.  
	//Na primjer pretvoriMilisekunde(100000) treba da vrati 0:1:40.
	
	public static String pretvoriMilisekunde (long millis) {
		String vrijeme=""; {
			long sekunde=(millis/1000)%60;
			long minute=(millis/(1000*60))%60;
			long sati=(millis/(1000*60*60))%24;
			vrijeme = sati + ":" + minute + ":" + sekunde;	
		}
		return vrijeme;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite milisekunde: ");
		long millis = unos.nextLong();
		
		System.out.println(pretvoriMilisekunde(millis));
		
		unos.close();
	}

}
