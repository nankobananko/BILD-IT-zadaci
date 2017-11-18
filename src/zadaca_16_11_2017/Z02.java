package zadaca_16_11_2017;
import java.util.Scanner;

public class Z02 {

	//Napisati metodu koja ima sledeci header: 
	//public static String ukloniKarakter(String str, char ch) 
	//Metoda prima string i karakter i vraca novi string koji 
	//predstavlja originalni string sa izuzetkom proslijedjenog karaktera.  
	//Napisati program koji pita korisnika da unese string i karakter, 
	//a zatim ispisuje string iz koga je obrisan uneseni karakter. 
	//Sample run
	//Unesi string:  stepenice Medicinske skole 
	//Unesi karakter:  s 
	//Rezultat: tepenice Medicinke kole
	
	public static String ukloniKarakter (String str, char ch) {
		
		return str.replace(ch + "", "");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite neki string: ");
		
		String recenica = unos.nextLine();
		
		System.out.println("Unesite koje slovo zelite ukloniti iz vaseg stringa: ");
		
		String slovo = unos.nextLine();
		
		char slovo1 = slovo.charAt(0);
		
		System.out.println("Rezultat: " + ukloniKarakter(recenica,slovo1));
		
		unos.close();
	}

}
