package testprogram;

public class Arrayspielwiese {
	
	public static void main (String[] args) {
		
		int [] wuerfel = {4,3,6,7,1,2};
		wuerfel[3] = 5;
		System.out.println(wuerfel[3]);
		
		wuerfel[0] = 1;
		wuerfel[1] = 2;
		wuerfel[2] = 3;
		wuerfel[3] = 4;
		wuerfel[4] = 5;
		wuerfel[5] = 6;
		
		//Random Array Try´s
int[] a, b, c, d;
a = new int[5];
b = new int[5];
c = new int[5];
d = new int[5];


int[][] x = {{1,2,3,4,5},{10,20,30,40,50}}; //rumgespiele mit Arrays
 
for (int i = 0; i<5; i++) { //i für die Spalten 0-4
	for (int j = 0; j<2; j++) { //j für die Zeilen 0-1
		x[j][i] *=x[j][i]; //alle Elemente der Spalten 0-5 und Zeilen 0-1 werden mit sich selbst multipliziert
	}
}
System.out.println(x[1][4]);
	}

}
