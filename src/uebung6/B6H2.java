package uebung6;

public class B6H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,2,3,4};
int[] b = {1,2,3,4};
int[] c = {1,3,2,4};
int[] d = {1,2,3};
System.out.println(compareArrays(a,b));
System.out.println(compareArrays(a,c));
System.out.println(compareArrays(a,d));

	}

	public static boolean compareArrays(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a.length != b.length || a[i] != b[i]) {
				return false;
			}
		} return true;
	}
}
