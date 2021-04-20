package Klausur1Pz;

public class Welt {
	private Kontinent[] kontinente;

    public Welt(Kontinent[] kontinente)
    {
        this.kontinente = kontinente;
    }

    public int anzahlLaender()
    {
        int anzahl = 0;
        for (int index = 0; index < this.kontinente.length; index++)
        {
            anzahl += this.kontinente[index].getAnzLaender();
        }
        return anzahl;
    }

    public Land[] getAlleLaender()
    {
        Land[] alleLaender = new Land[this.anzahlLaender()];
        int indexAlle = 0;

        for (int kontinent = 0; kontinent < this.kontinente.length; kontinent++)
        {
            for(int index = 0; index < this.kontinente[kontinent].getAnzLaender(); index++)
            {
                alleLaender[indexAlle++] = this.kontinente[kontinent].getLandAtIndex(index);
            }
        }
        return alleLaender;
    }

    /*
     * war nicht gefordert
     */
    public Land[] sortiereAlleLaenderNachName()
    {
        Land[] alleLaender = this.getAlleLaender();

        for(int bubble=1; bubble<alleLaender.length; bubble++)
        {
            for(int index=0; index<alleLaender.length-bubble; index++)
            {
                if(alleLaender[index].nameIstGroesser(alleLaender[index+1]))
                {
                    Land tmp = alleLaender[index];
                    alleLaender[index] = alleLaender[index+1];
                    alleLaender[index+1] = tmp;
                }
            }
        }
        return alleLaender;
    }

    public void printAlleLaender(Land[] alleLaender)
    {
        for(int index=0; index<alleLaender.length; index++)
        {
            System.out.println(alleLaender[index]);
        }
    }

    public boolean enthaeltDoppel()
    {
        Land[] alleLaender = this.getAlleLaender();
        for(int index1=0; index1<alleLaender.length-1; index1++)
        {
            for(int index2=index1+1; index2<alleLaender.length; index2++)
            {
                if(alleLaender[index1].equals(alleLaender[index2]))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public Land[] alleLaenderGroesserAls(int groesse)
    {
        Land[] alleLaender = this.getAlleLaender();
        int anzahl = 0;
        for(int index=0; index<alleLaender.length; index++)
        {
            if(alleLaender[index].getGroesse() > groesse)
            {
                anzahl++;
            }
        }

        Land[] laender = new Land[anzahl];
        int indexLaender = 0;
        for(int index=0; index<alleLaender.length; index++)
        {
            if(alleLaender[index].getGroesse() > groesse)
            {
                laender[indexLaender++] = alleLaender[index];
            }
        }
        return laender;
    }

    public Land groesstesLand()
    {
        Land[] alleLaender = this.getAlleLaender();
        int indexGroesstes = 0;
        for(int index=1; index<alleLaender.length; index++)
        {
            if(alleLaender[index].istGroesser(alleLaender[indexGroesstes]))
            {
                indexGroesstes = index;
            }
        }
        return alleLaender[indexGroesstes];
    }

}
