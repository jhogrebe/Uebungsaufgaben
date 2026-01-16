package uebung5;

public class B5P123 {
	public static void main (String[] args) {
		
		
		
		//---P2---
		int [] numbers = {12030,1202,11,4,600,1202,1205};
		int max; //biggest number in array
		int minIndex = 0; //smallest index of array with the number for "max"
		max = numbers[0];
		for (int k = 1; k<numbers.length; k++) { //ablaufen der schleife von elementen 1 bis zum ende des Arrays (numbers.length-1)
			if (numbers[k] > max ) { //wenn der nächste index größer ist als das aktuelle maximum,
				max = numbers[k];    // ist er das neue maximum
				minIndex = k;        //und der kleinste Index mit diesem Wert ist minIndex 
			}                        // (wird der wert nochmal gefunden wird er nicht überschrieben, da er die if-bedingung nicht erfüllt
		}
		System.out.println("Die groesste Zahl in numbers lautet: " + max);
		//for (int m = numbers.length -1; m>0; m--) {
			//if (numbers[m] == max) {
				//minIndex = m;
//			}
		//}
		System.out.println("Der kleinste Index mit dem Wert " + max + " ist an Stelle " + minIndex);
		
		//---P3---
		int matrix [][] = {{1,2,3},{4,5,6},{7,8,9}};
		int summe = 0;
		
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				summe += matrix[k][l];
			}
		}
		System.out.println(summe);
		
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				matrix[i][k] += 1;
			
			}
			System.out.println(matrix[i][0] + " " 
			+ matrix[i][1] + " " + matrix[i][2]);
		}
		
	}

}
