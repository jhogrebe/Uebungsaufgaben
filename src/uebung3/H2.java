package uebung3;

public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int jahr = 2026;
boolean schalt = true;

schalt = ((jahr%4 == 0 && !(jahr%100 == 0)) || jahr%400 == 0); //Teilbar durch (4 aber nicht 100) oder durch 400
		
	System.out.println("Ist das Jahr " + jahr + " ein Schaltjahr? "+ schalt);	
	}

}
