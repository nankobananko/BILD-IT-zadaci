package zadaca_08_11_2017;
import java.util.Scanner;
public class Z05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
				
		System.out.println("Unesite koliko redova paterna zelite?: ");
		
		int brojRedova;
		brojRedova = unos.nextInt();
		
		System.out.println("Pattern A:");
		for (int i = 1; i <= brojRedova; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("\nPattern B:");
		for (int i = 0; i <= brojRedova; i++) {
			for (int j = 1; j <= (brojRedova - i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("Pattern C:");
		for (int i = 1; i <= brojRedova; i++) {
			for (int j = 1; j <= (brojRedova - i); j++) {
				System.out.print("  ");
			}

			for (int z = i; z >= 1; z--) {
				System.out.print(z + " ");
			}
			System.out.println();
		}

		System.out.println("\nPattern D:");
		for (int i = 1; i <= brojRedova; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			for (int z = 1; z <= (brojRedova - i + 1); z++) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
		unos.close();
	}

}
