package uebung6;

public class B6P3 {

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
		int max = -1;
		int k = a.length - 1;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				if (a[j] > a[i]) {
					max = a[j];
		        }
		    }  
		}
		return max;
	}

}
