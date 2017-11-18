package Zadaca_15_11_2017;
import java.util.Scanner;

public class Z01 {

	//Napisati metodu sa sljedecim headerom koja ispisuje tri broja u rastucem redosljedu: 
	//public static void ispisiSortiraneBrojeve(double num1, double num2, double num3). 
	//Napisati program koji pita korisnika da unese tri broja te 
	//ispise ta tri broja u rastucem redosljedu. 
	
	public static void ispisiSortiraneBrojeve(double num1, double num2, double num3) {
		
		if (num1>num2 && num2>num3) {
			System.out.println(num3 + " " + num2 + " " + num1);
		}
		else if (num1>num3 && num3>num2) {
			System.out.println(num2 + " " + num3 + " " + num1);
		}
		else if (num2>num1 && num1>num3) {
			System.out.println(num3 + " " + num1 + " " + num2);
		}
		else if (num2>num3 && num3>num1) {
			System.out.println(num1 + " " + num3 + " " + num2);
		}
		else if (num3>num1 && num1>num2) {
			System.out.println(num2 + " " + num1 + " " + num3);
		}
		else if (num3>num2&& num2>num1) {
			System.out.println(num1 + " " + num2 + " " + num3);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite tri broja: ");
		
		double num1 = unos.nextDouble();
		double num2 = unos.nextDouble();
		double num3 = unos.nextDouble();
		
		unos.close();
		
		System.out.println("Brojevi u rastucem redoslijedu su: ");
		
		ispisiSortiraneBrojeve(num1,num2,num3);
	}

}
