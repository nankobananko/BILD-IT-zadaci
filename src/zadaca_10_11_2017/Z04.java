package zadaca_10_11_2017;
import java.util.Scanner;

public class Z04 {

	//Napisati program koji pita korisnika da unese ASCII kod 
	//(cijeli broj od 0 do 127) i ispisuje karakter koji odgovara tom kodu.  
	//Sample run programa:
	//Unesite ASCII code: 69
	//Karakter za ASCII code 69 je: E
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
	
		System.out.println("Unesi cijeli broj 0 - 127");
		
		int broj = unos.nextInt();
		
		System.out.println("Karakter za ASCII code " + broj + " je " + (char)broj);
		
		unos.close();
	}

}
