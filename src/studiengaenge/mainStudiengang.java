package studiengaenge;

public class mainStudiengang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.printf("%n%n--------------------- Test Mensch --------------------%n%n");
	        Mensch m1 = new Mensch("A", 20);
	        m1.print();
	        m1.geburtstag();
	        m1.print();

	        Mensch m2 = new Mensch("B", 25);
	        m1.print();

	        System.out.printf("%n%n------------------- Test Studentin -------------------%n%n");
	        Studentin s1 = new Studentin("C", 22, "FIW");
	        s1.print();

	        Studentin s2 = new Studentin("D", 23, "FIW");
	        s1.print();

	        System.out.printf("%n%n----------------- Test Studiengaenge -----------------%n%n");
	        Studiengaenge sg = new Studiengaenge(10,10);
	        sg.immatrikulieren(20);
	        sg.printFIW();
	        sg.printAI();
	        sg.printDurchschnittsalter();
	}

}
