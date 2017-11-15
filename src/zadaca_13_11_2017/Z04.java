package zadaca_13_11_2017;

public class Z04 {

	//Napisati metodu koja pronalazi broj ponavljanja odredjenog karaktera u stringu. 
	//Metoda treba da koristi sljedeci header: public static int brojacKaraktera(String str, char ch). 
	//Na primjer, ukoliko pozovemo metodu na sljedeci nacin: 
	//brojacKaraktera("Dobrodosli", o) metoda treba da vrati 3.
	
	public static int brojacKaraktera(String str, char ch) {
		int brojac = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				brojac++;
			}
		}
		return brojac;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Dobrodosli";
		char ch = 'o';
		
		System.out.println("U stringu " + str + " karakter " + ch 
				+ " se ponavlja " + brojacKaraktera(str,ch) + " puta.");
	}

}
