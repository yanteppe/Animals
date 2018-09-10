package junit.animal;

import base.environment.Cell;
import base.interfaces.Animal;
import org.junit.Test;
import realization.Falcon;
import realization.Triton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Тест для класса Falcon {@link realization.Falcon}
 *
 * @author Yan Teppe
 * @version 1.0
 */
public class FalconTest {
   Falcon falcon = new Falcon();

   @Test
   public void testFalconClassIsCreated(){
      assertNotNull(falcon);
   }

   @Test
   public void testFalconGetName() {
//    assertEquals(falcon.toString(),"Сокол");
      assertEquals("Сокол",falcon.toString());
   }
}
