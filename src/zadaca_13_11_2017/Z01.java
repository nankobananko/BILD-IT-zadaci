package zadaca_13_11_2017;

import java.util.Scanner;

public class Z01 {

	//Napisati metodu sa sljedecim headerom koja ispisuje tri 
	//broja u rastucem redosljedu: 
	//public static void ispisiSortiraneBrojeve(double broj1, 
	//double broj2, double broj3). 
	//Napisati program koji pita korisnika da unese tri broja te ispise 
	//ta tri broja u rastucem redosljedu. 
	
	public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3) {
		
		if (broj1>broj2 && broj2>broj3) {
			System.out.println(broj3 + " " + broj2 + " " + broj1);
		}
		else if (broj1>broj3 && broj3>broj2) {
			System.out.println(broj2 + " " + broj3 + " " + broj1);
		}
		else if (broj2>broj1 && broj1>broj3) {
			System.out.println(broj3 + " " + broj1 + " " + broj2);
		}
		else if (broj2>broj3 && broj3>broj1) {
			System.out.println(broj1 + " " + broj3 + " " + broj2);
		}
		else if (broj3>broj1 && broj1>broj2) {
			System.out.println(broj2 + " " + broj1 + " " + broj3);
		}
		else if (broj3>broj2 && broj2>broj1) {
			System.out.println(broj1 + " " + broj2 + " " + broj3);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite tri broja: ");
		
		double broj1 = unos.nextDouble();
		double broj2 = unos.nextDouble();
		double broj3 = unos.nextDouble();
		
		unos.close();
		
		System.out.println("Brojevi u rastucem redoslijedu su: ");
		
		ispisiSortiraneBrojeve(broj1,broj2,broj3);
		
	}

}
