package aufgabe5;

public class Main {

	public static void main(String[] args) {
		SetOperations nr1 = new SetOperations();
		nr1.fill();
		nr1.fillBothUnion();
		System.out.println("        A                           B                      A vereinigt B ");
		nr1.print();
		nr1.fillBothDifference();
		System.out.println("        A                           B                    Differenz der Mengen A und B ");
		nr1.print();
		nr1.fillBothIntersection();
		System.out.println("        A                           B                      A geschnitten B ");
		nr1.print();

	}

}
