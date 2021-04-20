package uebungen.unbung6;


	public class Konto
	{
	    private double guthaben;
	    private int pin;
	    private double dispogrenze;

	    public Konto(int pPin)
	    {
	        guthaben = 0;
	        pin = pPin;
	        dispogrenze = -1000.0;
	    }

	    public void einzahlen(double betrag)
	    {
	        guthaben = guthaben + betrag;
	        System.out.printf("Es wurden %.2f Euro eingezahlt.%n", betrag);
	    }

	    public void auszahlen(int pPin, double betrag)
	    {
	        if(pin==pPin)
	        {
	            if(guthaben - dispogrenze >= betrag)
	            {
	                guthaben = guthaben - betrag;
	                System.out.printf("Es wurden %.2f Euro ausgezahlt.%n", betrag);
	            }
	            else
	            {
	                System.out.printf("Ihr Guthaben reicht nicht, um %.2f Euro auszuzahlen.%n", betrag);
	            }
	        }
	        else
	        {
	            System.out.println("Falsche PIN!");
	        }
	    }

	    public void kontoauszug(int pPin)
	    {
	        if(pin==pPin)
	        {
	            System.out.printf("Ihr aktuelles Guthaben betraegt %.2f Euro.%n", guthaben);
	        }
	        else
	        {
	            System.out.println("Falsche PIN!");
	        }
	    }

	    public void zinsenZahlen()
	    {
	        final double DISPOZINSEN = 12.0;
	        final double GUTHABENZINSEN = 0.5;
	        if(guthaben >0)
	        {
	            double zinsen = guthaben * GUTHABENZINSEN / 100.0;
	            guthaben = guthaben + zinsen;
	            System.out.printf("Ihnen wurden %.2f Euro Zinsen gutgeschrieben.%n", zinsen);
	        }
	        else
	        {
	            double zinsen = guthaben * DISPOZINSEN / 100.0;     // ist negativ!
	            guthaben = guthaben + zinsen;
	            System.out.printf("Ihnen wurden %.2f Euro Zinsen abgebucht.%n", -zinsen);
	        }
	    }
}
