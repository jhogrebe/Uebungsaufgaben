package uebung4;
import java.util.Random;

public class B4H2 {

	public static void main(String[] args) {
				
		boolean x = true;
		boolean y = true;
		boolean a = true;
		boolean b = true;
		boolean c = true;
		Random koko = new Random();
		
		int [] inputpool = {0,1,10,11};//nur folgende Werte: 0,1,10,11
		int input = inputpool[koko.nextInt(inputpool.length)];
		
		System.out.println("Die zufaellige Zahl für input ist " + input +
				". Und daher lauten die Antworten auf die Fragen: ");
		
		
		x = (input == 10 || input == 11);
		y = (input == 1 || input == 11);
		a = x && y;
		b = x || (x!=y);
		c = !y;
		
		
		System.out.println("Trifft x zu? "+ x + " und y? " + y + " und a? " + a + " und b? " + b + " und c? " + c);
		
		
	}
}
