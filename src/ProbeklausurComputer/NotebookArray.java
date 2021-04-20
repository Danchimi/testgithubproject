package ProbeklausurComputer;
import java.util.Random;

public class NotebookArray {

	private Notebook[] notebooks;

    public NotebookArray(int anzahl)
    {
        this.notebooks = new Notebook[anzahl];
    }

    public void konfigurieren()
    {
        Random r = new Random();
        for (int i = 0; i < this.notebooks.length; i++)
        {
            int auswahl = r.nextInt(5);
            // folgendes kann natuerlich auch mit if..else geloest werden
            this.notebooks[i] = switch(auswahl)
            {
                case 0 -> new Notebook("lenovo", 8, 256, 13); 
                case 1 ->  new Notebook("lenovo", 16, 512, 15); 
                case 2 ->  new Notebook("apple", 4, 256, 13); 
                case 3 ->  new Notebook("apple", 8, 512, 13); 
                case 4 ->  new Notebook("dell", 8, 512, 15); 
                default -> null;
            };
        }
    }

    @Override
    public String toString()
    {
        String s = "[ " + this.notebooks.length + " : ";
        for (int i = 0; i < this.notebooks.length; i++)
        {
            if(i<this.notebooks.length-1)
            {
                s += this.notebooks[i].toString() + ", ";
            }
            else
            {
                s += this.notebooks[i].toString();
            }
        }
        s += "]";
        return s;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    public NotebookArray getHersteller(String hersteller)
    {
        int anzahl = 0;
        for (int i = 0; i < this.notebooks.length; i++)
        {
            if(this.notebooks[i].gleicherHersteller(hersteller))
            {
                anzahl++;
            }
        }
        NotebookArray na = new NotebookArray(anzahl);
        int indexNA = 0;
        for (int i = 0; i < this.notebooks.length; i++)
        {
            if(this.notebooks[i].gleicherHersteller(hersteller))
            {
                na.notebooks[indexNA++] = this.notebooks[i];
            }
        }
        return na;
    }

    public void sortRamPlatte()
    {
        for(int bubble=0; bubble<this.notebooks.length-1; bubble++)
        {
            for(int i=0; i<this.notebooks.length-1-bubble; i++)
            {
                if((this.notebooks[i].getRam()>this.notebooks[i+1].getRam()) ||
                    (this.notebooks[i].getRam()==this.notebooks[i+1].getRam() && 
                    this.notebooks[i].getPlatte()>this.notebooks[i+1].getPlatte()))
                {
                    Notebook temp = this.notebooks[i];
                    this.notebooks[i] = this.notebooks[i+1];
                    this.notebooks[i+1] = temp;
                }
            }
        }
    }
}
