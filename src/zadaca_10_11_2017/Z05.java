package zadaca_10_11_2017;
import java.util.Scanner;

public class Z05 {

	//Napisati program koji pita korisnika da unese string i ispisuje prvi 
	//karakter koji se ne pojavljuje u ostatku stringa. 
	//Sample run programa:
	//Unesite neki string: yellow
	//Prvi karakter koji se ne pojavljuje u ostatku stringa je: y
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner(System.in);
		
		 System.out.print("Unesite neki string: ");
		 
	        String s= unos.nextLine().toLowerCase();

	        System.out.print("Prvi karakter koji se ne ponavlja u stringu je: ");  
	        
	        for (int i = 0; i < s.length(); i++) {
	            boolean slovo = true;
	            
	            for (int j = 0; j < s.length(); j++) {

	                if (i == j)
	                    continue;

	                if (s.charAt(i) == s.charAt(j)) {
	                    slovo = false;
	                    break;
	                }
	                 
	            }
	            if (slovo) {
	                System.out.print(s.charAt(i));
	                break;
	            }

	        }
	unos.close();
	}

}
