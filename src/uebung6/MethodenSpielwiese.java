package uebung6;

public class MethodenSpielwiese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arrayy = {1, 2, 3, 5};
		int []arrayyy = {2, -2, 3};
		int []arrayyyy = {3, 2, -2, -3};
		int []arrayyyyy = {1};
		int []arrayyyyyy = {5, -5, 5, -5, 5, 0};

		System.out.println(methode(arrayy));
		System.out.println(methode(arrayyy));
		System.out.println(methode(arrayyyy));
		System.out.println(methode(arrayyyyy));
		System.out.println(methode(arrayyyyyy));
	}
	
	public static int methode(int[] a) {
		int max = a[0];
		int max2 = 0;
		int k = a.length;
		
		for (int i = 0; i < k; i++) {
			if (Math.abs(max) < Math.abs(a[i])) {
				max = a[i];
			}
			for (int j = 0; j < k; j++) {
				if (max2 < Math.abs(a[j]) && max > max2) {
					max2 = Math.abs(a[j]);
				}
			}
		} if (max2 != 0) {
			return max2;
		} return -1;
	}

}
