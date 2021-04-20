package ProbeklausurComputer;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.printf("%n%n--------------------- Test Computer --------------------%n%n");
	        Computer c1 = new Computer("lenovo", 8, 256);
	        Computer c2 = new Computer("lenovo", 16, 512);
	        Computer c3 = new Computer("apple", 4, 256);
	        Computer c4 = new Computer("apple", 8, 512);
	        Computer c5 = new Computer("dell", 8, 256);

	        c1.print();
	        c2.print();
	        c3.print();
	        c4.print();
	        c5.print();

	        System.out.println("c1 und c2 gleicher Hersteller ? : " + c1.gleicherHersteller(c2));
	        System.out.println("c1 und c3 gleicher Hersteller ? : " + c1.gleicherHersteller(c3));

	        System.out.printf("%n%n--------------------- Test Notebook --------------------%n%n");
	        Notebook n1 = new Notebook("lenovo", 8, 256, 13);
	        Notebook n2 = new Notebook("lenovo", 16, 512, 15);

	        n1.print();
	        n2.print();

	        System.out.printf("%n%n------------------ Test NotebookArray ------------------%n%n");      
	        NotebookArray na = new NotebookArray(10);
	        na.konfigurieren();
	        na.print();
	        na.sortRamPlatte();
	        na.print();
	        NotebookArray lenovo = na.getHersteller("lenovo");
	        lenovo.print();
	        NotebookArray apple = na.getHersteller("apple");
	        apple.print();
	        NotebookArray dell = na.getHersteller("dell");
	        dell.print();

	    }

	

}
