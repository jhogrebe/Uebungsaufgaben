package testprogram;

public class spielwiese {
	
	static int a = 10;
	static int b = 2;
	static int c = 9;
	static int zahlen [] = {a, b, c};
	static int laenge;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

while (a>5) { //check if a is bigger than 5
	a -= 2;//decrease a by 2
	System.out.println(a);
}

do {
	a++; // increase a by 1 without checking anything
	System.out.println(a);
}
while (a<10); // checking if a is smaller than 6, if yes: repeat.

for (int i = 1; i<a; i *= 2) { // if i<a: do the command, otherwise don't do it
	System.out.println("i wurde erhöht auf " + i);// Anweisung
}
System.out.println(zahlen[0]);//things to try out: switch-case-loops and arrays.
laenge = zahlen.length;
System.out.println("Die Länge des Arrays 'zahlen' beträgt " + laenge);
zahlen[b] = a; //b hat den Wert 2 und kann deshalb auch als Zahl/Nummer verwendet werden. Stelle 2(also c) wurde nun in den Wert a geändert.
System.out.println(zahlen[2]);
System.out.println(c);
boolean t = (a < b); // Test to see if declaration is needed before the main method
System.out.println(t);
int k = 7, l = 8; // second test, just to be sure
System.out.println(k + l);

String jahreszeit = "Winter";
switch (jahreszeit) {
case "Frühling" : System.out.println("Und es ist Frühling");
break;
case "Sommer" : System.out.println("Und es ist Sommer");
break;
case "Herbst" : System.out.println("Und es ist Herbst");
break;
case "Winter" : System.out.println("Und es ist Winter");
break;
default : System.out.println("Bist du ernsthaft grade?");
}

int h = 20;
System.out.println(h%8);

	}


}
