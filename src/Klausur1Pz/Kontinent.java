package Klausur1Pz;

public class Kontinent {

	 private Land[] laender;
	    private char kontinent;

	    public Kontinent(char kontinent, int anzahlLaender)
	    {
	        this.kontinent = kontinent;
	        this.laender = new Land[anzahlLaender];
	        for (int index = 0; index < this.laender.length; index++)
	        {
	            this.laender[index] = new Land();
	        }
	    }

	    
	    
	    
	    public int getAnzLaender()
	    {
	        return this.laender.length;
	    }

	    public Land[] getLaender()
	    {
	        return this.laender;
	    }

	    public Land getLandAtIndex(int index)
	    {
	        if(index>=0 && index<this.getAnzLaender())
	        {
	            return this.laender[index];
	        }
	        else
	        {
	            return null;
	        }
	    }

	    /*
	    public char getKontinent()
	    {
	        return this.kontinent;
	    }
	    */

	    public int[] getSummen()
	    {
	        int summeEw = 0;
	        int summeQm = 0;
	        for (int index = 0; index < this.laender.length; index++)
	        {
	            summeEw += this.laender[index].getEinwohner();
	            summeQm += this.laender[index].getGroesse();
	        }
	        int[] summen = {summeQm, summeEw};
	        return summen;
	    }

	    @Override
	    public String toString()
	    {
	        String s = String.format("Kontinent %c %n", this.kontinent);
	        s += String.format("--------------------------%n");
	        for (int index = 0; index < this.laender.length; index++)
	        {
	            s += String.format("%24s %n", this.laender[index]);
	        }
	        return s;
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }

	    public void sortiere(int nach)
	    {
	        for(int bubble=1; bubble<this.laender.length; bubble++)
	        {
	            for(int index=0; index<this.laender.length-bubble; index++)
	            {
	                if(nach==0 && this.laender[index].istGroesser(this.laender[index+1]) ||
	                   nach==1 && this.laender[index].hatMehrEinwohner(this.laender[index+1]) ||
	                   nach==2 && this.laender[index].ewDichte() > this.laender[index+1].ewDichte() ||
	                   nach!=0 && nach!=1 && nach!=2 && this.laender[index].nameIstGroesser(this.laender[index+1]))
	                {
	                    Land tmp = this.laender[index];
	                    this.laender[index] = this.laender[index+1];
	                    this.laender[index+1] = tmp;
	                }
	            }
	        }
	    }
}
