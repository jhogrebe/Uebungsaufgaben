package uebung6;

public class B6H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {1,2,3,4};
		int [] b = {4,3,2,1};
		int [] c = {1,3,2,4};
		System.out.println(isMirrorArray(a, b));
		System.out.println(isMirrorArray(a, c));
	}
	
	public static boolean isMirrorArray(int[]a, int[]b) {
		
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[a.length-1-i] || a.length != b.length) {
					return false;
				} 
			} 
			return true;
		
	}

}
