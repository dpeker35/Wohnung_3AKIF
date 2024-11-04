

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WohnungJUnit
{
    @Test
    public void testanzZimmerOk()
   {
       Wohnung anzZimmer1;
       anzZimmer1 = new Wohnung("Wien", true, true, 200000,3);
       
       assertEquals(anzZimmer1.getAnzZimmer(), 3);
       
       
   }
   
   @Test
   public void testanzZimmerZuWenig()
   {
       Wohnung anzZimmer2;
       anzZimmer2 = new Wohnung("Berlin", true, false,400000, 0);
       
       assertEquals(anzZimmer2.getAnzZimmer(), 4);
       
       
   }
   
   @Test
   public void testanzZimmerZuViel()
   {
       Wohnung anzZimmer3;
       anzZimmer3 = new Wohnung("Lin", true, false,150000, 10);
       
       assertEquals(anzZimmer3.getAnzZimmer(), 4);
   }
   
}
