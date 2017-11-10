package zadaca_08_11_2017;
import java.util.Scanner;
public class Z04 {

	//Napisati program koji pita korisnika da unese cijeli broj, 
	//a zatim ispisuje taj cijeli broj naopako. 
	//Program treba da radi za sve pozitivne cijele brojeve koji se mogu smjestiti u promjenljivu int tipa. 
	 
	//Sample run programa:  
	//Unesite cijeli broj: 123456789 
	//Obrnut broj je: 987654321 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj: ");
		int broj = unos.nextInt();
		
		System.out.print("Broj ispisan naopako: ");
		while( broj != 0) {
			int cifra = broj % 10;
			System.out.print(cifra);
			broj /= 10;
		}
		
		unos.close();
	}

}
