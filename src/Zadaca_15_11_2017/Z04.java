package Zadaca_15_11_2017;

public class Z04 {

	//Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
	//Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su 
	//takodjer twin primes. Napisati program koji ispisuje sve twin prime 
	//brojeve manje od 10000, 10 parova po liniji. Koristiti metode za rjesenja zadatka. 
	
	public static boolean isPrime (int n) {
		
		if (n ==2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int brojac = 0;
		for (int i = 2; i < 9998; i++) {
			if ( isPrime(i) && isPrime(i + 2)) {
				System.out.print(i + " " + (i + 2) + " ");
				
				brojac++;
				
				if (brojac == 10 ) {
					System.out.println();
					brojac = 0;
		
			}
		}
	}
	}
}
