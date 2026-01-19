package uebung6;

public class B6P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []someNumbers = {1, 2, 3, 4, 4};
		System.out.println("Sind die Elemente des Arrays paarweise verschieden? " + pairwiseDifferent(someNumbers));
	}                                                                            //Sprung zur Methode "pairwiseDifferent" Z.11

	public static boolean pairwiseDifferent(int[] someNumbers) {
			for (int i = 0; i < someNumbers.length; i++) { //geht mit "i" alle Elemente des Arrays durch
				for (int j = 0; j < someNumbers.length; j++) { //geht nochmal alle Elemente durch aber mit "j"
					if (someNumbers[i] == someNumbers[j] && i != j) {//überprüft, ob es für zwei Elemente gleich sind, aber an verschiedenen Indizes
						return false; //wenn ja, return false -> Methode endet hiermit. Wenn nein: Methode geht weiter -> Z.18
					}
				}
			} return true; //return false wurde nicht "aktiviert" return true wird zurückgegeben an den Aufrufer.
	}
	
}
