package zadaca_08_11_2017;
import java.util.Scanner;
public class Z02 {

	//Napisati program koji ucitava neodredjen broj cijelih brojeva odredjuje koliko
	//je pozitivnih brojeva korisnik unio, koliko negativnih te izracunava ukupnu 
	//sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako sto unese nulu). 
	//Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispise da je 
	//broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite nekoliko brojeva (0 prekida unos): ");
		int korisnikovUnos;
        
		int suma = 0;
		        
		int brojUnesenih = 0;
		        
		int pozitivni = 0;
		        
		int negativni = 0;

		        
		while ((korisnikovUnos = unos.nextInt()) != 0) {

		            
		if (korisnikovUnos < 0)
		                
		negativni++;
		            
		else
		                
		pozitivni++;

		            
		suma += korisnikovUnos;
		            
		brojUnesenih++;

		        
		}

		        
		System.out.println("Ukupno unesenih brojeva: " + brojUnesenih + ", ukupno " +
		                
		"pozitivnih: " + pozitivni + ", ukupno negativnih: " + negativni + "\n a njihov prosjek je: " + 
		(double) (suma) / brojUnesenih);

		unos.close();
		    }





		}



