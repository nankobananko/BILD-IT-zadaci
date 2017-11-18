package zadaca_16_11_2017;
import java.util.Scanner;
public class Z05 {
	
	//Napisati metode koje izracunavaju obim i povrsinu kvadrata. 
	//Metode trebaju imati sledece headere: 
	//public static double obim(double stranica) 
	//public static double povrsina(double stranica)
	//Napisati test program koji pita korisnika da unese 
	//duzinu stranice kvadrata i ispisuje mu obim i povrsinu tog kvadrata.
	//Formule
	//obim kvadrata - O = 4 x a - gdje je a stranica kvadrata
	//površina kvadrata - P = a x a - gdje je a stranica kvadrata

	public static double obim(double stranica) {
		
		return 4 * stranica;
	}
	
	public static double povrsina(double stranica) {
		
		return Math.pow(stranica, 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite stranicu kvadrata: ");
		
		double a = unos.nextDouble();
		
		System.out.println("Obim kvadrata stranice " + a + " cm iznosi: " + obim(a) + " cm.");

		System.out.println("Povrsina kvadrata stranice " + a + " cm iznosi: " + povrsina(a) + " cm2.");
	
	unos.close();
	}

}
