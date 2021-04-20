package studiengaenge;

public class Mensch {

	  private String name;
	    private int alter;

	    public Mensch(String name, int alter)
	    {
	        this.name = name;
	        this.alter = alter;
	    }

	    public String getName()
	    {
	        return this.name;
	    }

	    public int getAlter()
	    {
	        return this.alter;
	    }

	    public void geburtstag()
	    {
	        this.alter++;
	    }

	    @Override
	    public String toString()
	    {
	        return this.name + " ist " + this.alter + " Jahre alt.";
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }    
}
