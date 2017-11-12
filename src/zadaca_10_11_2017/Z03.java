package zadaca_10_11_2017;
import java.util.Scanner;

public class Z03 {
	
	//Napisati program koji pita korisnika da unese neki string te ispisuje taj isti string naopako.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite neki string: ");
		
		System.out.println("String naopako je: " + new StringBuilder(unos.nextLine()).reverse());
		
		unos.close();
	}

}
