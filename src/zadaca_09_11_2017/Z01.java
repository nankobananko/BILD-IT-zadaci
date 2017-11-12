package zadaca_09_11_2017;
import java.util.Scanner;

public class Z01 {

	//Napisati program koji izracunava procenat pojavljivanja velikih 
	//i malih slova u nekom stringu koji unese korisnik. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite neki string :");
		
		String korisnikovUnos = unos.next();
		
		int velikaslova = 0;
		int malaslova = 0;
		for(int i = 0; i < korisnikovUnos.length(); i++) {
			char slovo = korisnikovUnos.charAt(i);
			
			if((Character.isUpperCase(slovo))) {
					velikaslova++;
					}
			
			else if((Character.isLowerCase(slovo)))
			
			malaslova++;
			}
		
			 int ukupnoslova=korisnikovUnos.length();  
			 
		double procenatvelikaslova=(velikaslova*100.0)/ukupnoslova;
		double procenatmalaslova=(malaslova*100.0)/ukupnoslova;
		
		System.out.println("Procenat velikih slova u stringu je: "+ procenatvelikaslova +" % , a procenat malih slova "
				+ "je " + procenatmalaslova + " % .");
		
		unos.close();
			
	}

}
