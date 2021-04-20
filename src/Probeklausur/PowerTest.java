package Probeklausur;

import java.util.Arrays;
public class PowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Power p1 = new Power(3,4);
        Power p2 = new Power(-3,4);
        Power p3 = new Power(3,0);
        Power p4 = new Power(3,-4);
        Power p5 = new Power(-3,-4);

        System.out.printf("%n%n---------------------- Ausgaben fuer Power ---------------------------%n%n");
        p1.print();
        System.out.println(p1.toString() + " = " + p1.getValue());
        p2.print();
        System.out.println(p2.toString() + " = " + p2.getValue());
        p3.print();
        System.out.println(p3.toString() + " = " + p3.getValue());
        p4.print();
        System.out.println(p4.toString() + " = " + p4.getValue());
        p5.print();
        System.out.println(p5.toString() + " = " + p5.getValue());

        System.out.printf("%n%n-------------------- Ausgaben fuer PowerOfTwo -------------------------%n%n");
        PowerOfTwo p21 = new PowerOfTwo(4);
        p21.print();
        p21.printBinary();
        PowerOfTwo p22 = new PowerOfTwo(-4);
        p22.print();
        p22.printBinary();
        PowerOfTwo p23 = new PowerOfTwo(0);
        p23.print();
        p23.printBinary();

        System.out.printf("%n%n-------------------- Ausgaben fuer PowerArray -------------------------%n%n");
        PowerArray pa = new PowerArray(10);
        pa.fillArray();
        pa.print();
        pa.sort();
        pa.print();

        System.out.println("Index : " +pa.getIndexExponent(4));
        System.out.println("Index : " +pa.getIndexExponent(0));

        double[] values = pa.createArrayOfValues();
        System.out.println(Arrays.toString(values));
    }
	}

