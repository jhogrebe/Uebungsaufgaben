package testprogram;

public class Uebung2h3 {

	static int max = 999; //max. Fixplatz-Anzahl an Personen
	static int fix = 550; //Anzahl vergebener Fixplätze
	static int wartend = 2000; //Anzahl an Personen auf Warteliste
	static boolean istVoll; //true falls keine Plätze mehr da sind
	
	public static void main(String[] args) {
		// Anzahl von Teilnehmern einer Veranstaltung verwalten.
		
		System.out.println("Die maximale Anzahl an Plätzen beträgt " + max + ".");
		System.out.println(fix + " Plätze wurden bereits zugewiesen und " + wartend + " warten noch auf einen Platz.");
		
		if (wartend >= (max - fix)) {
		wartend = wartend - (max - fix);
		fix = max;
		} else {
			fix = fix + wartend;
			wartend = 0;
		}
		istVoll = (fix == max);
		
		System.out.println("Nach Verwalten der Warteliste beträgt die Anzahl zugewiesener Fixplätze " + fix + " und " + wartend + " warten noch.");
		System.out.println("Sind alle Plätze vergeben? " + istVoll + ".");
		
		//Noch kürzerer Weg:
		//fix = Math.min(max, fix + wartend);
		//wartend = Math.max(0, wartend - (max - fix));
	}

}
