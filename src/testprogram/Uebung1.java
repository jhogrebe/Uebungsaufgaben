package testprogram;

public class Uebung1 {
	static int z = 15; //h1
	static int i = 9; //h2
	static int j = 2; //h2
	static int k = 5; //h2
	static int min = 10; //h2
	static int max = 3; //h2
	static boolean Ausdruck1;
	static boolean Ausdruck2;
	static boolean Ausdruck3;

	public static void main(String[] args) {
		// h1 start:
if (z > 10) {
	z = z - 10;
}

System.out.println("Z ist gleich " + z);
//h1 done.

//h2 start:
if (i<j && i<k) {
	min = i;
} else if (j<i && j<k) {
		min = j;
}	else if (k<i && k<j) {
			min = k;
		}
System.out.println("Die kleinste Zahl aus den Elementen i, j und k ist " + min);

if (i>j && i>k) {
	max = i;
} else if (j>i && j>k) {
		max = j;
}	else if (k>i && k>j) {
			max = k;
		}
System.out.println("Die groesste Zahl aus den Elementen i, j und k ist " + max);
//h2 done. Way easier would be:
min = Math.min(i, Math.min(j,  k));
max = Math.max(i,  Math.max(j,  k));
//but both works well. h3 start:
i = 102;
j = 101;
k = 200;

Ausdruck1 = (i > j);
Ausdruck2 = (i > 200);
Ausdruck3 = (j > 100);
k = -10;

if (Ausdruck1 && !Ausdruck2 && !Ausdruck3) { //1 und nicht 2 und nicht 3 dann k=1
	k = 1;
} else if (Ausdruck1 && Ausdruck2 && !Ausdruck3) { // 1 und 2 und nicht 3 k=2
	k = 2;
} else if (Ausdruck1 && Ausdruck2 && Ausdruck3) { // 1, 2 und 3 dann k=3
	k = 3;
} else if (!Ausdruck1 && !Ausdruck2 && !Ausdruck3) { // keiner wahr dann k=4, ansonsten bleibt k gleich.
	k = 4;
}

System.out.println("k ist gleich " + k);
//h3 done.




	}
	
}

	


