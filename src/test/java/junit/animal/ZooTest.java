package junit.animal;

import base.environment.Cell;
import org.junit.Assert;
import org.junit.Test;
import realization.*;

import java.util.ArrayList;

/**
 * Тест для класса Zoo (Реализация зоопарка) {@link Zoo}
 *
 * @author Yan Teppe
 * @version 1.0
 */
public class ZooTest {
   private Zoo zoo;
   private Cell cell;
   private ArrayList<Cell> arrayCells;

   @Test
   public void shouldBeCellAddsToCollectionOfCells(){
      zoo = new Zoo(5);
   }
}

