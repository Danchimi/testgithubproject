package studiengaenge;
import java.util.Random;
public class Studiengaenge {

	 private Studentin[] fiw;
	    private Studentin[] ai;

	    public Studiengaenge(int fiwAnzahl, int aiAnzahl)
	    {
	        this.fiw = new Studentin[fiwAnzahl];
	        this.ai = new Studentin[aiAnzahl];
	    }

	    public void immatrikulieren(int anzahl)
	    {
	        Random r = new Random();
	        int indexFIW = 0;
	        int indexAI = 0;
	        for(int i=1; i<=anzahl; i++)
	        {
	            int sg = r.nextInt(3);
	            if(sg==0)
	            {
	                if(indexFIW<this.fiw.length)
	                {
	                    this.fiw[indexFIW++] = new Studentin("S"+i, 20+i, "FIW");
	                }
	                else
	                {
	                    System.out.println("FIW ist bereits voll.");
	                }
	            }
	            else
	            {
	                if(indexAI<this.ai.length)
	                {
	                    this.ai[indexAI++] = new Studentin("S"+i, 20+i, "AI");
	                }
	                else
	                {
	                    System.out.println("AI ist bereits voll.");
	                }
	            }
	        }
	    }

	    public void printFIW()
	    {
	        System.out.print("FIW : [");
	        for (int index = 0; index < this.fiw.length; index++)
	        {
	            if(this.fiw[index]!=null)
	            {
	                System.out.print(this.fiw[index].toString() + " ");
	            }
	        }
	        System.out.println("]");
	    }

	    public void printAI()
	    {
	        System.out.print("AI  : [");
	        for (int index = 0; index < this.ai.length; index++)
	        {
	            if(this.ai[index]!=null)
	            {
	                System.out.print(this.ai[index].toString() + " ");
	            }
	        }
	        System.out.println("]");
	    }

	    public double durchschnittsalterFIW()
	    {
	        double summe = 0.0;
	        int anzahl = 0;
	        for (int index = 0; index < this.fiw.length; index++)
	        {
	            if(this.fiw[index]!=null)
	            {
	                summe += this.fiw[index].getAlter();
	                anzahl++;
	            }
	        }
	        return summe / anzahl;
	    }

	    public double durchschnittsalterAI()
	    {
	        double summe = 0.0;
	        int anzahl = 0;
	        for (int index = 0; index < this.ai.length; index++)
	        {
	            if(this.ai[index]!=null)
	            {
	                summe += this.ai[index].getAlter();
	                anzahl++;
	            }
	        }
	        return summe / anzahl;
	    }

	    public void printDurchschnittsalter()
	    {
	        System.out.println("Durchschnittsalter FIW : " + this.durchschnittsalterFIW());
	        System.out.println("Durchschnittsalter AI  : " + this.durchschnittsalterAI());
	        if(this.durchschnittsalterAI() < this.durchschnittsalterFIW())
	        {
	            System.out.println("AI ist im Durchschnitt jünger.");
	        }
	        else if(this.durchschnittsalterFIW() < this.durchschnittsalterAI())
	        {
	            System.out.println("FIW ist im Durchschnitt jünger.");
	        }
	        else
	        {
	            System.out.println("FIW- und AI-Studierende sind im Duchschnitt gleich alt.");
	        }

	    }
}
