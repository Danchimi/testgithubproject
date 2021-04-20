package Klausur1Pz;

import java.util.Random;
public class Land {

	 private String name;
	    private int groesse;
	    private int einwohner;

	    public String getName()
	    {
	        return this.name;
	    }

	    public int getGroesse()
	    {
	        return this.groesse;
	    }

	    public int getEinwohner()
	    {
	        return this.einwohner;
	    }

	    public String erzeugeName()
	    {
	        Random r = new Random();
	        int ascii = r.nextInt(26) + 65;
	        char c = (char)ascii;
	        String s = "" + c;

	        int nr = r.nextInt(10);
	        s += nr;
	        return s;
	    }

	    public Land()
	    {
	        this.name = this.erzeugeName();
	        Random r = new Random();
	        this.groesse = r.nextInt(100) + 1;
	        this.einwohner = r.nextInt(1000) + 1;
	    }

	    public double ewDichte()
	    {
	        double ewDichte = (double)this.einwohner / (double)this.groesse;
	        return ewDichte;
	    }

	    @Override
	    public String toString()
	    {
	        String s = String.format("%s : %3d km2 : %4d ew : %8.4f", this.name, this.groesse, this.einwohner, this.ewDichte());
	        return s;
	    }

	    public void print()
	    {
	        System.out.println(this.toString());
	    }

	    public boolean istGroesser(Land l)
	    {
	        return this.groesse > l.groesse;
	    }

	    public boolean hatMehrEinwohner(Land l)
	    {
	        return this.einwohner > l.einwohner;
	    }

	    public boolean nameIstGroesser(Land l)
	    {
	        return this.name.compareTo(l.name) > 0;
	    }

	    @Override
	    public boolean equals(Object o)
	    {
	        if(o == null) return false;
	        if(this == o) return true;
	        if(this.getClass() != o.getClass()) return false;

	        Land lo = (Land)o;
	        return this.name.equals(lo.name);
	    }
	
}
