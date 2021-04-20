package Probeklausur;
import java.util.Random;

public class PowerArray {

	private Power[] p;

    public PowerArray(int length)
    {
        this.p = new Power[length];
    }

    public void fillArray()
    {
        Random r = new Random();

        for(int i=0; i<this.p.length; i++)
        {
            int nr1 = r.nextInt(5)+1;
            int nr2 = r.nextInt(5)+1;
            if(nr1>nr2)
            {
                this.p[i] = new Power(nr2, nr1);
            }
            else
            {
                this.p[i] = new Power(nr1, nr2);
            }
        }
    }

    public double[] createArrayOfValues()
    {
        double[] values = new double[this.p.length];
        for(int i=0; i<this.p.length; i++)
        {
            values[i] = this.p[i].getValue();
        }
        return values;
    }

    public int getIndexExponent(int exponent)
    {
        final int NOT_FOUND = -1;
        for(int i=0; i<this.p.length; i++)
        {
            if(this.p[i].getExp()==exponent)
            {
                return i;
            }
        }
        return NOT_FOUND;
    }

    @Override
    public String toString()
    {
        String s = "[ ";
        for(int i=0; i<this.p.length; i++)
        {
            if(i<this.p.length-1)
            {
                s += this.p[i].toString()+", ";
            }
            else
            {
                s += this.p[i].toString();
            }
        }
        s += " ]";
        return s;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    public void sort()
    {
        for(int bubble=0; bubble<this.p.length-1; bubble++)
        {
            for(int i=0; i<this.p.length-1-bubble; i++)
            {
                if((this.p[i].getValue()>this.p[i+1].getValue()) ||
                    ((this.p[i].getValue()==this.p[i+1].getValue() && 
                    this.p[i].getExp()>this.p[i+1].getExp())))
                    {
                        Power temp = this.p[i];
                        this.p[i] = this.p[i+1];
                        this.p[i+1] = temp;
                    }
            }
        }
    }
}
