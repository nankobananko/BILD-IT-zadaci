package zadaca_09_11_2017;

import java.util.Scanner;

public class Z05 {
	
	//Neke web stranice forsiraju odredjena pravila za passworde. 
	//Napisati program koji provjerava da li je unijeti string validan password.  
	//Pravila da bi password bio validan su sljedeca:
	//1. Password mora biti sacinjen od najmanje 8 karaktera. 
	//2. Password smije da se sastoji samo od slova i brojeva.  
	//3. Password mora sadrzati najmanje 2 broja.  
	//Program pita korisnika da unese password te mu ispisuje 
	//"password je validan" ukoliko su sva pravila ispostovana 
	//ili "password nije validan" ukoliko pravila nisu ispostovana.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite password: ");
		
		String password1 = unos.nextLine();
		
		String password = password1.toUpperCase();
		
		boolean ispravan=true;
		
		String brojevi="0123456789";
		
		//Ako je duzina passworda 8 ili vise dalje ga provjervamo
		
		if(password.length()>=8){
			int brBrojeva=0;
			int brSlova=0;
			
			// Prebrojimo slova
			for(int i=0; i<password.length(); i++){
				if((password.charAt(i)>='A')&&(password.charAt(i)<='Z'))
					brSlova++;		
				}
			
			// Prebrojimo brojeve
			for(int i=0; i<password.length(); i++){
				for(int j=0; j<brojevi.length(); j++){
				if(password.charAt(i)==brojevi.charAt(j))
					brBrojeva++;		
				}
			}
			
		//Ako je broj slova+broj brojeva razlicit od duzine passworda on je neispravan
		//Ako je broj brojeva manji od 2 opet je password neispravan
			if((brBrojeva<2)||((brBrojeva+brSlova)!=password.length()))
					ispravan=false; 
		}
		//Ako je duzina manja od 8 odmah podesavamo da je neispravan
		else
			ispravan=false;
		if(ispravan==true)
			System.out.println("Password je ispravan!");
		else
			System.out.println("Password je neisprvan");
		
		unos.close();
			}

	}

