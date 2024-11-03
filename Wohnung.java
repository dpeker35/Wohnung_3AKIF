public class Wohnung
{
    private String ort;
    private String strasse;
    private boolean balkon;
    private boolean gefordert;
    private int preis;
    private int anzZimmer;
    

    public Wohnung(String ort, String strasse, boolean balkon, boolean gefordert, int preis, int anzZimmer)
    {
        setOrt(ort);
        setStrasse(strasse);
        setBalkon(balkon);
        setGefordert(gefordert);
        setPreis(preis);
        setAnzZimmer(anzZimmer);
    }
    
    
    public Wohnung(String ort, boolean balkon, boolean gefordert, int preis, int anzZimmer)
    {
        setOrt(ort);
        setStrasse("Spengergasse 10/5/3A");
        setBalkon(balkon);
        setGefordert(gefordert);
        setPreis(preis);
        setAnzZimmer(anzZimmer);
    }
    
    
      public Wohnung(String ort, boolean balkon, int preis)
    {
        setOrt(ort);
        setStrasse("Spengergasse 10/5/3A");
        setBalkon(balkon);
        setGefordert(false);
        setPreis(preis);
        setAnzZimmer(4);
        
    }
    
    public Wohnung(String ort, boolean balkon)
    {
        setOrt(ort);
        setStrasse("Spengergasse 10/5/3A");
        setBalkon(balkon);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
        
    }
    
    
    public Wohnung(String ort, int preis, boolean gefordert)
    {
        setOrt(ort);
        setStrasse("Spengergasse 10/5/3A");
        setBalkon(true);
        setGefordert(gefordert);
        setPreis(preis);
        setAnzZimmer(4);
        
    }
    
    public Wohnung(String ort)
    {
        setOrt(ort);
        setStrasse("Spengergasse 10/5/3A");
        setBalkon(true);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
        
    }

    
    public Wohnung()
    {
        setOrt("Wien");
        setStrasse("Spengergasse 10/5/3A");
        setBalkon(true);
        setGefordert(false);
        setPreis(200000);
        setAnzZimmer(4);
        
    }

  
    public void setOrt(String ort)
    {
        this.ort = ort;
    }
    
    public void setStrasse(String strasse)
    {
        this.strasse = strasse;
    }
    
     public void setBalkon(boolean balkon)
    {
        this.balkon = balkon;
    }

    public void setGefordert(boolean gefordert)
    {
        this.gefordert = gefordert;
    }


    public void setPreis(int preis)
    {
        this.preis = preis;
    }

    public void setAnzZimmer(int anzZimmer)
    {
        if((anzZimmer >=1) && (anzZimmer <= 7))
        {
        this.anzZimmer = anzZimmer;
        }
        else
         {
            System.out.println("Error: Der Wert muss zwischen 1 und 7 liegen");
            this.anzZimmer = 4;
        }
    }
   
    public String getOrt()
    {
        return ort;
    }
    
    public String getStrasse()
    {
        return strasse;
    }
    
    public boolean getBalkon()
    {
        return balkon;
    }
    
    public boolean getGefordert()
    {
        return gefordert;
    }

    public int getPreis()
    {
        return preis;
    }

    public int getAnzZimmer()
    {
        return anzZimmer;
    }
    
    
    public String getHausnummer()
    {
        int pos1;
        int pos2;
        String hausnummer;
        
        pos1 = strasse.indexOf(" ")+1;
        pos2 = strasse.indexOf("/", pos1);
        hausnummer = strasse.substring(pos1,pos2);
        
        
        
        
        return hausnummer;
        
        
    }
    
    
    public String getStockWohnung()
    {
        
        int pos3;
        int pos4;
        String stockWohnung;
        
        pos3 = strasse.indexOf("/")+1;
        pos4 = strasse.indexOf("/",pos3);
        stockWohnung = strasse.substring(pos3,pos4);
        
        return stockWohnung;
    }

    public void printWohnung()
    {
        System.out.println("Wohnung:\t" + ort + "\t" + preis + "\t" + anzZimmer + "\t" + balkon);
    }
}
