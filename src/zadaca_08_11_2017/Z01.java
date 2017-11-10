package zadaca_08_11_2017;
import java.util.Scanner;

public class Z01 {

	// Pretpostavimo da uplatimo $100 svaki mjesec na stedni racun koji 
	//ima godisnju kamatnu stopu od 5%. Mjesecna kamatna stopa je stoga 
	//0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na racunu postaje 
	//100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na racunu 
	//postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treceg mjeseca, 
	//vrijednost na racunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje.  
	//Napisati program koji pita korisnika da unese mjesecni iznos stednje te broj 
	//mjeseci nakon kojeg bi zelio znati stanje racuna i ispisuje stanje na 
	//racunu nakon tog broja mjeseci. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite iznos koji zelite uplatiti na stedni racun: ");
		double iznosUplate = unos.nextDouble();
		
		System.out.println("Unesite iznos interesne stope po kojoj ce se obracunavati vasa stednja: ");
		double iznosStope = unos.nextDouble();
		
		System.out.println("Unesite broj mjeseci nakon koliko zelite znati stanje na vasem racunu: ");
		double iznosMjeseci = unos.nextDouble();
		
		double vrijednost = 0;
		
		double stopa = (iznosStope/100)/12;
		
		for(double i = 0; i < iznosMjeseci; i++) {
			vrijednost = (vrijednost + iznosUplate) * (1 + stopa);
		}
		System.out.println("Ukoliko svaki mjesec budete uplacivali " + iznosUplate + " KM. Po " + iznosStope 
				+ " % mjesecnoj interesnoj stopi. "
				+ "Kroz " + iznosMjeseci + " mjeseci imat cete " + vrijednost + " KM na racunu.");
		
		unos.close();
	}

}
