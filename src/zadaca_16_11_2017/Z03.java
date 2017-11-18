package zadaca_16_11_2017;
import java.util.Scanner;

public class Z03 {
	
	//Napisati metodu koja prima jedan argument, broj pitanja, 
	//te generise toliko nasumicnih, jednostavnih pitanja oduzimanja tipa:
	//„Koliko je 5 - 2 ?“. Metoda treba da broji broj tacnih i netacnih 
	//odgovora te ih ispise korisniku. 

	public static void pitanja (int brojPitanja) {
		
		Scanner unos = new Scanner(System.in);
		
		int tacni = 0;
		int netacni = 0;
		
		for (int i = 0; i<brojPitanja; i++) {
			
			int a = (int) (Math.random()*10);
			
			int b = (int) (Math.random()*10);
			
			if (b>a) {
				int c=a; a=b; b=c;
			}
			System.out.println("Koliko je: " + a + " - " + b);
			
			int rezultat = unos.nextInt();
			if (rezultat==(a-b))
				tacni++;
			else 
				netacni++;
		}
		System.out.println("Broj tacnih odgovora iznosi: " + tacni + " a netacnih je: " + netacni);
	unos.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Koliko zelite pitanja da vam program postavi? ");
		
		int brojPitanja = unos.nextInt();
		pitanja(brojPitanja);
		
		unos.close();
	}

}
