package zadaca_13_11_2017;
import java.util.Scanner;

public class Z03 {

	//Napisati metodu koja broji slova u stringu. 
	//Metoda treba koristiti sljedeci header: 
	//public static int prebrojiSlova(String s). 
	//Napisati program koji pita korisnika da unese 
	//neki string te mu vrati koliko taj string ima slova. 
	
	public static int prebrojiSlova (String s) {
		
		int brojac = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				brojac++;
			}
		}
		return brojac;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite neki string: ");
		
		String korisnikovUnos = unos.nextLine();
		
		unos.close();
		
		System.out.println("Uneseni string ima " + prebrojiSlova(korisnikovUnos) + " slova.");
		
	}

}
