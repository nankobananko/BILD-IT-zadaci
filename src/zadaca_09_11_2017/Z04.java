package zadaca_09_11_2017;
import java.util.Scanner;

public class Z04 {

	//Napisati program koji pita korisnika da unese neki string te 
	//ispisuje koliko je velikih slova (uppercase slova) u datom stringu.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos=new Scanner(System.in);
		
		int brojac=0;
		
		System.out.println("Unesite neki string: ");
		
		String korisnikovUnos=unos.nextLine();
		
		for(int i = 0; i < korisnikovUnos.length(); i++){
			
			if(korisnikovUnos.charAt(i)>='A' && korisnikovUnos.charAt(i)<='Z')
				brojac++;
		}
	System.out.printf("Broj velikih slova u unesenom stringu je: " + brojac);
	
	unos.close();
		}
	
	}
