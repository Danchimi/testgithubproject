package aufgaben.aufgabe2;

public class MyIntergerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInteger 	mi1=null, mi2=null, mi3=null, mi4=null, 
				mi5=null, mi6=null, mi7=null, mi8=null,
				mi9=null, mi10=null;
	try {
		mi1 = new MyInteger("2147483750");
		System.out.println("mi1: " +mi1.intValue());
		System.out.println(mi1.toString());
		
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("mi1: " +e.getMessage());
	}
	try {
		mi2 = new MyInteger("-0021");
		System.out.println("mi2: " +mi2.intValue());
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("mi2: " +e.getMessage());
	}
	try {
		mi3 = new MyInteger("hallo");
		System.out.println("mi3: " +mi3.intValue());
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("mi3: " +e.getMessage());
	}
	mi4 = new MyInteger(-2147483648);
	System.out.println("mi4: " +mi4.intValue());
	
	try {
		mi5 = MyInteger.valueOf("-2147483648");
		System.out.println("mi5: " + mi5.intValue());
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("mi5: " +e.getMessage());
	}
	try {
		mi6 = MyInteger.valueOf("-00002147483648");
		System.out.println("mi6: " +mi6.intValue());
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("mi6: " +e.getMessage());
	}
	try {
		mi7 = MyInteger.valueOf("hallo");
		System.out.println("mi7: " +mi7.intValue());
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("mi7: " +e.getMessage());
	}
	mi8 = MyInteger.valueOf(-2147483648);
	System.out.println("mi8: " +mi8.intValue());
	try {
		mi9 = MyInteger.valueOf("");
		System.out.println("mi9: " +mi9.intValue());
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("mi9: " +e.getMessage());
	}
	try {
		mi10 = MyInteger.valueOf("+");
		System.out.println("mi10: " +mi10.intValue());
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("mi10: " +e.getMessage());
	}
	System.out.println("mi1 equals mi2 ? : " + mi1.equals(mi2));
	System.out.println("mi1 equals mi3 ? : " + mi1.equals(mi3));
	System.out.println("mi1 equals mi4 ? : " + mi1.equals(mi4));
	System.out.println("mi1 equals mi5 ? : " + mi1.equals(mi5));
	System.out.println("mi1 equals mi6 ? : " + mi1.equals(mi6));
	System.out.println("mi1 equals mi7 ? : " + mi1.equals(mi7));
	System.out.println("mi1 equals mi8 ? : " + mi1.equals(mi8));
	System.out.println("mi1 equals mi9 ? : " + mi1.equals(mi9));
	System.out.println("mi1 equals mi10 ? : " + mi1.equals(mi10));
	
	System.out.println("hashCode mi1 : " + mi1.hashCode());
	System.out.println("hashCode mi2 : " + mi2.hashCode());
	try {
		System.out.println("hashCode mi3 : " + mi3.hashCode());
	}
	catch(NullPointerException e)
	{
		System.out.println("Objekt existiert nicht!");
	}
	System.out.println("hashCode mi4 : " + mi4.hashCode());
	
	System.out.println("intValue mi1 : " + mi1.intValue());
	System.out.println("intValue mi2 : " + mi2.intValue());
	try {
		System.out.println("intValue mi3 : " + mi3.intValue());
	}
	catch(NullPointerException e)
	{
		System.out.println("Objekt existiert nicht!");
	}
	System.out.println("intValue mi4 : " + mi4.intValue());
	
	System.out.println("doubleValue mi1 : " + mi1.doubleValue());
	System.out.println("doubleValue mi2 : " + mi2.doubleValue());
	try {
		System.out.println("doubleValue mi3 : " + mi3.doubleValue());
	}
	catch(NullPointerException e)
	{
		System.out.println("Objekt existiert nicht!");
	}
	System.out.println("doubleValue mi4 : " + mi4.doubleValue());
	
}


	

}
