package zadaca_10_11_2017;
import java.util.Scanner;
public class Z02 {

	//Napisati program koji pita korisnika da unese cijeli broj, 
	//a zatim ispisuje sve faktore tog broja. 
	//Ako broj m podijelimo brojem n pri cemu je ostatak dijeljenja 0, 
	//onda je broj n faktor broja m.
	//Sample run programa: Unesi cijeli broj: 12
	//Faktori broja 12 su: 1 2 3 4 6 12
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite neki broj: ");
		int korisnikovUnos = unos.nextInt();
		
		
		 for (int i = 1; i <= korisnikovUnos; i++) {

	            if (korisnikovUnos % i == 0)
	                System.out.print(i + " ");
	            
	        }
	        unos.close();
	}

}
