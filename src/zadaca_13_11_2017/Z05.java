package zadaca_13_11_2017;
import java.util.Scanner;

public class Z05 {

		//Napisati metodu koja pretvara stope u metre. 
		//Metoda treba da ima sledeci header: public static double stopeUMetre(double stope). 
		//1 stopa = 0,305 m.
	
	public static double stopeUMetre (double stope) {
		
		return stope * 0.305;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite broj stopa: ");
		
		double stope = unos.nextDouble();
		
		System.out.println(stope + " stopa iznosi " + stopeUMetre(stope) 
		+ " metara");
		
		unos.close();
	}

}
