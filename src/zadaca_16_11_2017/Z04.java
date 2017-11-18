package zadaca_16_11_2017;
import java.util.Scanner;
public class Z04 {

	//Napisati metodu koja prima jedan argument te simulira bacanje 
	//novcica toliko puta. Nakon sto se simulacija zavrsi, 
	//program ispisuje koliko puta je novcic pokazao glavu a koliko puta pismo.
	
	public static void bacanjeNovcica (int brojBacanja) {
		
		int glava = 0;
		int pismo = 0;
		int novcic = 0;
		
		for (int i = 0; i < brojBacanja; i++) { 
			
		novcic = (int) (Math.random()*2);
			
			if (novcic == 0) {
				glava++;
			} else 
				pismo++;
		}
		System.out.println("Novcic je pao na glavu: " + glava + " puta. A na pismo " + pismo + " puta.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Koliko zelite puta da se baci novcic: ");
		int brojBacanja = unos.nextInt();
		bacanjeNovcica(brojBacanja);
		
		unos.close();
		
	}

}
