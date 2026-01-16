package uebung3;

public class H1 {
	
	public static void main(String[] args) {
		
double guthaben = -100;
double monEingang = 200;

int rating = -2;

boolean warnhinweis = true;
boolean negativ = true;

negativ = (guthaben < 0);
System.out.println("Ist das Konto im Minus? " + negativ);

if (guthaben > 0) { //erster Fall, postives Guthaben -> rating +3
	rating +=3;
} else if (guthaben == 0) { //zweiter Fall, Guthaben bei 0 -> rating +2
	rating +=2;
} else if (guthaben < 0 && Math.abs(monEingang) >= Math.abs(guthaben)) { //dritter Fall, negatives Guthaben und Betrag(Math.abs) Einkommen >= Betrag Guthaben
	rating +=1;                                                          // rating + 1  
} else if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben)) { //vierter Fall, negatives Guthaben und Betrag(Math.abs) Einkommen < Betrag Guthaben
	rating -=1;                                                         // rating -1
}

warnhinweis = (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0); //fünfter Fall, Fall 4 und rating negativ -> Warnhinweis

	 



		System.out.println("Der Status Warnhinweis sagt: " + warnhinweis + ". Und das Rating liegt aktuell bei " + rating);
		
	}

}
