package zadaca_16_11_2017;
import java.util.Scanner;

public class Z01 {

	//Napisati metodu sa sljedecim headerom: 
	//public static String format(int number, int width) 
	//koja vraca string broja sa prefiksom od jedne ili vise nula. 
	//Velicina stringa je width argument. Na primjer, 
	//ukoliko pozovemo metodu format(34, 4) metoda vraca 0034, 
	//ukoliko pozovemo format(34, 5) metoda vraca 00034. Ukoliko je uneseni 
	//broj veci nego width argument, metoda vraca samo string broja. 
	//Npr. ukoliko pozovemo format(34, 1) metoda vraca 34.
	
	public static String format(int number, int width) {
		
		String broj = "" ;
		String nule = "" ;
		broj+=number;
		if (broj.length()<width) {
			for (int i=0; i<width-broj.length(); i++)
				
				nule = nule+0;
		}
		broj = nule + broj;
		return broj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		
		int broj = unos.nextInt();
		
		System.out.println("Unesite u kojoj duzini zelite da se ispise broj");
		
		int duzina = unos.nextInt();
		
		System.out.println(format(broj,duzina));
		
		unos.close();
		
	}

}
