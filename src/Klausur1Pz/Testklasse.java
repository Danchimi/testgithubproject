package Klausur1Pz;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.printf("%n%n------------------ Test Land ------------------%n%n");
	        for(int i=0; i<10; i++)
	        {
	            new Land().print();
	        }

	        System.out.printf("%n%n----------------- Land equals -----------------%n%n");
	        Land l1 = new Land();
	        Land l2 = new Land();
	        int anz = 0;
	        while(!l1.equals(l2))
	        {
	            l2 = new Land();
	            anz++;
	        }
	        l1.print();
	        l2.print();
	        System.out.println(anz + " andere Laender erzeugt");

	        System.out.printf("%n%n----------------- Land Vergleiche -----------------%n%n");
	        l1 = new Land();
	        l2 = new Land();
	        System.out.print("l1 : ");l1.print();
	        System.out.print("l2 : ");l2.print();
	        System.out.println();
	        System.out.println("l1 groesser als l2 ?                : " + l1.istGroesser(l2));
	        System.out.println("l1 mehr Einwohner als l2 ?          : " + l1.hatMehrEinwohner(l2));
	        System.out.println("l1 lexikografisch groesser als l2 ? : " + l1.nameIstGroesser(l2));

	        System.out.printf("%n%n----------------- Kontinent ------------------%n%n");
	        final int ANZAHL_KONTINENTE = 5;
	        final int ASCII_KLEIN_A = 97;

	        Kontinent[] ka = new Kontinent[ANZAHL_KONTINENTE];
	        for(int index=0; index < ANZAHL_KONTINENTE; index++)
	        {
	            char c = (char)(index+ASCII_KLEIN_A);
	            int anzahlLaender = index + 7;
	            ka[index] = new Kontinent(c, anzahlLaender);
	            ka[index].print();
	            int[] summen = ka[index].getSummen();
	            System.out.println("Summen : " + summen[0] + " : " + summen[1] );
	            System.out.println();
	        }

	        System.out.printf("%n%n----------------- sortieren ------------------%n%n");
	        ka[0].print();
	        ka[0].sortiere(0);
	        ka[0].print();
	        ka[0].sortiere(1);
	        ka[0].print();
	        ka[0].sortiere(2);
	        ka[0].print();
	        ka[0].sortiere(3);
	        ka[0].print();

	        System.out.printf("%n%n----------------- Welt ------------------%n%n");
	        Welt welt = new Welt(ka);
	        Land[] alleLaender = welt.getAlleLaender();
	        welt.printAlleLaender(alleLaender);
	        System.out.println();
	        System.out.println("Enthaelt Doppel? : " + welt.enthaeltDoppel());
	        Land groesstes = welt.groesstesLand();
	        System.out.println("groesstes Land   : " + groesstes.toString());
	        Land[] groesser = welt.alleLaenderGroesserAls(50);
	        System.out.println("Alle Laender groesser als 50 :");
	        welt.printAlleLaender(groesser);

	    }
	

}
