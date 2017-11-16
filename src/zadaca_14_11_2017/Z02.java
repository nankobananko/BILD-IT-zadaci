package zadaca_14_11_2017;
import java.util.Scanner;
public class Z02 {

	//Napisati metodu koja izracunava zbir svih brojeva u cijelom broju. 
	//Koristite sljedeci header: public static int saberiCifre(long n). 
	//Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 
	//(saberiCifre(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
	
	public static int saberiCifre(long n) {
		
		int suma = 0;
		do { suma += n%10;
		n/=10;
		}
		while (n > 0);
		return suma;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neki broj: ");
		long broj = unos.nextLong();
		System.out.printf("Suma svih cifara unesenog broja je: " + saberiCifre(broj));
		
		unos.close();
	}

}
