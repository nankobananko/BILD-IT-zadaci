package Zadaca_15_11_2017;

public class Z02 {

	//Napisati metodu sa sljedecim headerom: public static boolean isPrime(int n) 
	//koja provjerava da li je broj prost/prime. 
	//Napsati test program koji poziva ovu metodu i 
	//ispisuje sve proste brojeve u rasponu od 0 do 100000.
	
	public static boolean isPrime (int n) {
		
		if ( n==0 || n ==1) {
			return false;
		}
		for (int i=2; i < n; i++) {
			if (n % i ==0 ) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for ( int i = 0; i < 100000; i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
			}
		}
	}

}
