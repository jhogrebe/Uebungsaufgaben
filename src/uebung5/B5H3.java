package uebung5;

public class B5H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int einheiten[][] = {{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1}, 
	             {    0,     0,     0,    0,    0,    0,   0,   0,   0,  0,  0,  0, 0, 0, 0}};
int input = 1499900; //Geldbetrag in Cent
int temp = input; // um input nicht zu verändern

for (int i = 0; i < 15; i++) {
while (einheiten[0][i] <= temp) { //sobald das Geldstück in den Geldbetrag passt
	temp -= einheiten[0][i]; //diesen Betrag abziehen
	einheiten[1][i] +=1; // das Geldstück dieses Betrags um 1 erhöhen -> Schleife erneut laufen lassen 
}
}
System.out.println("Die beste Aufteilung in möglichst wenig Geldstücke für den Betrag " + input + "ct, lautet:");
for (int i = 0; i<7; i++) { //Schleife zur Ausgabe aller Geldscheine
	if (einheiten[1][i] > 0) { //nur ausgeben wenn auch wirklich benutzt
		System.out.print(einheiten[1][i] + "x " + einheiten[0][i] + "; ");
	}
	
} 
if (input >= 500) { // unter 5 euro braucht man keine Scheine, kosmetische if-Bedingung
	System.out.print(" (Scheine).");
} else {
	System.out.print("Keine Scheine benötigt.");
}
System.out.println();
for (int i = 7; i<15; i++) { //Schleife zur Ausgabe aller Münzen
	if (einheiten[1][i] > 0) { //nur ausgeben wenn benutzt
		System.out.print(einheiten[1][i] + "x " + einheiten[0][i] + "; ");
	}
	
}
if (input%500 != 0) { //selbe wie bei scheinen, jetzt bei münzen
	System.out.print(" (Münzen).");
} else {
	System.out.println("Keine Münzen benötigt.");
}

	}

}
