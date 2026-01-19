package uebung6;

public class B6H3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] a = {1,2,3,4,0,2,3};
 int[] b = {1,4,2,2,0,3,3};
 int[] c = {1,2,3};
 int[] d = {1,2,2};
 System.out.println(compareArraysVal(d, c));
	}

	public static boolean compareArraysVal(int[] a, int[] b) {
		 int tempA = 0; //zur Zählung der Häufigkeit eines Elements in a
		 int tempB = 0;// selbe für b
		 if (a.length != b.length) {
			 return false; //ungleiche Anzahl an Elementen -> ungleiche Menge an selben Werten, also false
		 }
		 for (int i = 0; i < a.length; i++) {//Index i wird abgefragt
			tempA = 0; //reset für jeden index-Durchlauf von a
			tempB = 0; //""
			 for (int j = 0; j < a.length; j++) {//Alle Indizes j werden mit dem einen Index i verglichen
				 if (a[i] == a[j])	tempA++; //Wert ist gleich? Um 1 erhöhen
				 if (a[i] == b[j])  tempB++;//""
			 } if (tempA != tempB)	return false; //Nach Zählung: Anzahl an Wert aus Index i in beiden Arrays gleich? Wenn nicht: false
		 } return true; //Keine Bedingung für false erfüllt -> Alle Werte kommen gleich oft vor: true
	}
}
