package ProbeklausurComputer;

public class Notebook extends Computer{

	protected int monitor;

    public Notebook(String hersteller, int ram, int platte, int monitor)
    {
        super(hersteller, ram, platte);
        this.monitor = monitor;
    }

    @Override
    public String toString()
    {
        return "(" + this.hersteller + ", " + this.ram + ", " + this.platte + ", " + this.monitor +")";
    }
}
