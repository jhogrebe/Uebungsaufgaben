package testprogram;

public class Uebung2 {

	public static void main(String[] args) {
		
	int i=5, j=6;	//p1
	
	if (j < 6 && i > 4) {
		i = 6;
	}
	System.out.println(i);
	
	for (int a = 0; a < 3; a++) {
	
	int wuerfel = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 7); // 1–6 inkl.
		System.out.print("wuerfeln...und..");
	if (wuerfel == 1 || wuerfel == 4) {
		System.out.println("Gewonnen!");
	} else if (wuerfel == 2) { 
		System.out.println("Verloren!");
	} else if (wuerfel == 5) {
		System.out.println("Unentschieden");
	}
	else {
		System.out.println("unklar");
	}
	}
	
	long max = 2;
	for(int k = 0; k < 62; k++) {
		max = max*2;
	}
	max =max-1;
	System.out.println(max);
	System.out.println(Long.MAX_VALUE);
	long min = -2;
	for(int l = 0; l<62; l++) {
		min*=2;
	}
	min+=1;
	System.out.println(min);
	System.out.println(Long.MIN_VALUE);
	System.out.println(Long.BYTES);
	System.out.println(Long.bitCount(Long.BYTES));
	System.out.println(Long.bitCount(Long.MAX_VALUE));
	System.out.println(Long.bitCount(Long.MIN_VALUE));
	
	int start = 65;
	int rund = 7;

	
	if (start%10 == 0) {
		rund = start;
	} else if (start < 0) {
		rund = start - start%10;
	} else {
		rund = start - start%10 + 10;
	}
		System.out.println(start);
		System.out.println(rund); //way easier method: rund = start + ((10 - start % 10) % 10); works for +&-
		
		int jahr = 2025;
		boolean schalt;
		
		if (jahr%400 == 0 || (jahr%4 == 0 && jahr%100 != 0)) {
			schalt = true;
		} else {
			schalt = false;
		}
		
		System.out.println("Ist das Jahr " + jahr + " ein Schaltjahr? " + schalt + ".");
		
		
		
	}
	
	}
		


