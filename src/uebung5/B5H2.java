package uebung5;

public class B5H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10345;
		int digits = 0; //Anzahl der Ziffern aus n
		int temp = n;

		if (temp == 0) {
			digits = 1;
		} else {
		while (temp > 0) {
			temp/=10;
			digits++;
		}
		}
		temp = n;
		System.out.println("Die Zahl n:" + n + " hat " + digits + " Ziffer(n).");

		int a[] = {0,0,0,0,0,0,0,0,0};

		for (int i = 0; i<a.length; i++) {
			a[a.length-i-1] = temp%10;
			temp/=10;
		}
		for (int value : a) {
			System.out.print(value + " ");
		}
		
	}

}
