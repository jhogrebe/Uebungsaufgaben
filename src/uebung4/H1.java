package uebung4;
import java.util.concurrent.ThreadLocalRandom;

public class H1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zone = ThreadLocalRandom.current().nextInt(1, 10);
		double price = 1;
		
		switch (zone) {
		case 1:
			price = 2;
			break;
		case 2:
			price = 2.35;
			break;
		case 3, 4:
			price = 2.85;
			break;
		case 5: 
			price = 3.55;
			break;
		default: price = 4; //ab zone 6
		}
		
		System.out.println("Wir befinden uns derzeit in Zone " + zone + " und daher kostet das Ticket " + price + " Euro.");
	}

}
