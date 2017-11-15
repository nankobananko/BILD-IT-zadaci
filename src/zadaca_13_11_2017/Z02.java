package zadaca_13_11_2017;

public class Z02 {
	
	//Napisati metodu sa sljedecim headerom: public static boolean isProstiBroj(int broj) 
	//koja provjerava da li je broj prost/prime. Napisati test program koji poziva 
	//ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100 000. 

	public static boolean isProstiBroj (int broj) {
		
		if ( broj==0 || broj ==1) {
			return false;
		}
		for (int i=2; i< broj; i++) {
			if (broj % i ==0 ) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for ( int i = 0; i < 100000; i++) {
			if(isProstiBroj(i)) {
				System.out.println(i + " ");
			}
		}
	}

}
