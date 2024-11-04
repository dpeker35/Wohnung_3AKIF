
public class TestWohnungSemi
{
   public void testanzZimmerOk()
   {
       Wohnung anzZimmer1;
       anzZimmer1 = new Wohnung("Wien", true, true, 200000,3);
       
       System.out.println(anzZimmer1.getAnzZimmer());
       
       
   }
   
   public void testanzZimmerZuWenig()
   {
       Wohnung anzZimmer2;
       anzZimmer2 = new Wohnung("Berlin", true, false,400000, 0);
       
       System.out.println(anzZimmer2.getAnzZimmer());
       
       
   }
   
   public void testanzZimmerZuViel()
   {
       Wohnung anzZimmer3;
       anzZimmer3 = new Wohnung("Lin", true, false,150000, 10);
       
       System.out.println(anzZimmer3.getAnzZimmer());
   }
   
   
}
