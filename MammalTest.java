import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MammalTest {
   @Test
   public void kennel_validator() {
       MammalBean mb = new MammalBean(3, "black", 10);
       assertEquals(mb.getcolor(), "black");
       assertEquals(mb.getHeight(), "black", 0.00001);
   }
}
