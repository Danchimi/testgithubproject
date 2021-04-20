package uebungen.uebung5;

import java.util.Random;

public class uebung5 {

	
	 public static int throwDice()
	    {
	        Random r = new Random();
	        int wurf = r.nextInt(6) + 1;        
	        return wurf;
	    }

	    public static void printThrow(int cast)
	    {
	        System.out.println("Es wurde eine " + cast + " gewuerfelt");
	    }

	    public static int[] insertIntoStatistics(int[] statistics, int cast)
	    {
	        if(cast>=1 && cast<=6)
	        {
	            statistics[cast-1]++;
	        }
	        return statistics;
	    }

	    public static void printStatistics(int[] statistics)
	    {
	        System.out.print("[ ");
	        for (int index = 0; index < statistics.length; index++)     // index = index + 1
	        {
	            if(index < statistics.length-1)
	            {
	                System.out.print("(" + statistics[index] + " x " + (index+1) + "), ");
	            }
	            else    // index == statistics.length-1
	            {
	                System.out.print("(" + statistics[index] + " x " + (index+1) + ")");
	            }
	        }
	        System.out.println(" ]");
	    }

	    public static int sumOfStatistics(int[] statistics)
	    {
	        int sum = 0;

	        for (int index = 0; index < statistics.length; index++)
	        {
	            sum = sum + (statistics[index] * (index+1));
	        }

	        return sum;
	    }

	    public static int throwDiceUntilTarget(int target, int[] statistics)
	    {
	        int tries = 0;
	        int cast = throwDice();
	        printThrow(cast);           // Nebeneffekt - nicht so gut!
	        tries++;
	        insertIntoStatistics(statistics, cast);
	        int sum = sumOfStatistics(statistics);
	        while(sum < target)
	        {
	            cast = throwDice();
	            printThrow(cast);       // Nebeneffekt - nicht so gut!
	            tries++;
	            insertIntoStatistics(statistics, cast);
	            sum = sumOfStatistics(statistics);
	        }
	        return tries;
	    }

	    public static void main(String[] args)
	    {
	        int[] statistics = new int[6];

	        System.out.printf("%n%n------------------- Test throwDice and printThrow -------------------%n%n");
	        for(int index=0; index<10; index++)
	        {
	            int cast = throwDice();
	            printThrow(cast);
	        }

	        System.out.printf("%n%n------------------ Test insert- and printStatistics -----------------%n%n");
	        for(int index=0; index<100; index++)
	        {
	            int cast = throwDice();
	            statistics = insertIntoStatistics(statistics, cast);
	        }
	        printStatistics(statistics);    

	        System.out.printf("%n%n--------------------- Test sumOfStatistics --------------------------%n%n");
	        printStatistics(statistics);
	        int sumTest = sumOfStatistics(statistics);
	        System.out.println("Summe = " + sumTest);

	        System.out.printf("%n%n------------------- Test throwDiceUntilTarget -----------------------%n%n");
	        statistics = new int[6];    // altes Array war schon befuellt 
	        final int TARGET = 100;
	        int tries = throwDiceUntilTarget(TARGET, statistics);
	        printStatistics(statistics);
	        int sum = sumOfStatistics(statistics);
	        System.out.println("Es wurden " + tries + " Versuche benötigt, um " + sum + " Punkte zu erzielen.");
	    }
	}


