package ProbeklausurUhrzeit;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%n%n---------------------- Test Uhrzeit --------------------------%n%n");
        Uhrzeit z1 = new Uhrzeit(83);
        Uhrzeit z2 = new Uhrzeit(3662);
        Uhrzeit z3 = new Uhrzeit(86399);
        Uhrzeit z4 = new Uhrzeit(172799);

        System.out.print("z1 : "); 
        z1.print();
        System.out.print("z2 : "); 
        z2.print();
        System.out.print("z3 : "); 
        z3.print();
        System.out.print("z4 : "); 
        z4.print();

        System.out.println("z1 frueher als z2 ? " + z1.frueher(z2));
        System.out.println("z3 frueher als z4 ? " + z3.frueher(z4));

        System.out.println("z1 plus   40 Sekunden : " 
        + z1.jetztPlusXSekunden(40));
        System.out.println("z2 plus 3598 Sekunden : " 
        + z2.jetztPlusXSekunden(3598));

        System.out.println("z3-z2 in Sekunden : " 
        + z3.differenzInSekunden(z2));

        System.out.printf("%n%n------------------- Test UhrzeitArray ------------------------%n%n");
        UhrzeitArray ua = new UhrzeitArray(10);
        ua.fill();
        ua.print();
        System.out.println("frueheste : " + ua.frueheste());

        Uhrzeit frueh = new Uhrzeit(36000);
        Uhrzeit spaet = new Uhrzeit(72000);
        UhrzeitArray zwischen = ua.zwischen(frueh, spaet);

        System.out.print("frueh    : "); frueh.print();
        System.out.print("spaet    : "); spaet.print();
        System.out.print("zwischen : "); zwischen.print();

        ua.sortieren();
        ua.print();

        UhrzeitArray kleinsterAbstand = ua.kleinsterAbstand();
        System.out.print("kleinster Abstand : ");
        kleinsterAbstand.print();   
	}

}
