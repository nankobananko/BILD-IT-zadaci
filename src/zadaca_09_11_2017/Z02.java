package zadaca_09_11_2017;

public class Z02 {

	//  Napisati program koji pronalazi i ispisuje najveci prosti palindrom manji od 1000. 
	
	public static void main(String[] args) {
		
for(int i=1000;i>0;i--)
			
			if(i/100==i%10){
		
	
				System.out.println("Najveci prosti palindrom manji od 1000 je: " + i);
				break;}
	}
}
