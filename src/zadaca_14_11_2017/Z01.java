package zadaca_14_11_2017;

public class Z01 {

	// Napisati metodu koja printa 100 nasumicnih uppercase karaktera i 100 nasumicnih brojeva, 10 po liniji. 
	
	public static void nasumicnaSlovaiBrojevi() {
		int brojac = 0;
		for ( int i = 0; i <100; i++) {
			System.out.print((char) (65+(int) (Math.random()*26)) + " ");
			brojac++;
			if (brojac == 10) {
				System.out.println();
				brojac = 0;
			}
		}
		for (int j = 0; j < 100; j++) {
			System.out.print((int) (Math.random()*10) + " " );
			brojac++;
			if (brojac ==10) {
				System.out.println();
				brojac = 0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nasumicnaSlovaiBrojevi();
	}

}
