package aufgabe6;

public class Teilaufgabe1Test {

	public static void main(String[] args) {
		long a = 1000;
		Integer b = 1000;       
		Integer c = 1000;       
		System.out.println(a == b);
		// wenn zwei Objekte miteinander verglichen werden wird geguckt ob es 
		//wirklich das gleiche Objekt ist, der Wert wird nicht verglichen
		System.out.println(b.equals(c));
	}

}
