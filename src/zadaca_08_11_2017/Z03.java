package zadaca_08_11_2017;

public class Z03 {

	// Napisati program koji ispisuje sve brojeve u rangu 
	//od 1 do 1000 koji su djeljivi sa 4, ali ne sa 5. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Brojevu u rangu od 1 do 1000 koji su djeljivi sa 4, ali ne sa 5 su: ");
		
		for (int i = 1; i < 1000; i++) {
			if (i % 4 == 0 && i % 5 !=0)
				System.out.println(i + " ");
		}
		
		
	}

}
