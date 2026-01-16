package uebung5;

public class B5H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myArray [] = {2,4,6,8,10};
		
		for (int i  = 0; i < myArray.length / 2; i++) {
			int temp = myArray[i];
			myArray[i] = myArray[myArray.length-i-1];
			myArray[myArray.length-i-1] = temp;
		}
		for (int k = 0; k<myArray.length; k++) {
			System.out.print(myArray[k] + " ");
		}
		System.out.println();
			for (int value : myArray) {
				System.out.print(value + " ");
			} System.out.println();
		
	}

}
