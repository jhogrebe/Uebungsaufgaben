package uebung4;
import java.util.concurrent.ThreadLocalRandom;

public class B4H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float celsiusFloat = ThreadLocalRandom.current().nextFloat(1, 35);;
		float fahrenheitFloat = 2;
		float celsiusDouble = 20;
		double fahrenheitDouble = 10;
		
		celsiusDouble = celsiusFloat;
		fahrenheitFloat = celsiusFloat*9/5+32 ;
		fahrenheitDouble = (9.0/5)*celsiusDouble + 32;
		
		
		
		System.out.println("Fuer double sind es:" + celsiusDouble + " Grad Celsius, und umgerechnet " + fahrenheitDouble + " Grad Fahrenheit.");
		System.out.println("Fuer float sind es:" + celsiusFloat + " Grad Celsius, und umgerechnet " + fahrenheitFloat + " Grad Fahrenheit.");
	}

}
