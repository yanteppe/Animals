package junit.animal;

import base.environment.Cell;
import base.interfaces.Animal;
import org.junit.Assert;
import org.junit.Test;
import realization.Triton;
import realization.Varan;

/**
 * Тест для класса Cell (Клетка) {@link base.environment.Cell}
 *
 * @author Yan Teppe
 * @version 1.0
 */
public class CellTest {
   private Cell cell;

   @Test
   public void souldBeEmptyIfDefoultConstructor(){
      cell = new Cell();
      Assert.assertTrue(cell.isEmpty());
   }

   @Test
   public void shouldBeNonEmptyIfAnimalConstructor(){
      cell = new Cell(new Varan());
      Assert.assertFalse(cell.isEmpty());
   }

   @Test
   public void shouldBeAnimalInCellAfterPutIn(){
      cell = new Cell();
      cell.putAnimal(new Varan());
      Assert.assertFalse(cell.isEmpty());
   }

   @Test
   public void shouldReturnRightAnimal(){
      cell = new Cell();
      cell.putAnimal(new Varan());
      Animal animal = cell.getAnimal();
      Assert.assertTrue(animal instanceof Varan);
   }

   @Test
   public void shouldReturnNullIfNoAnimal(){
      cell = new Cell();
      Assert.assertTrue(cell.getAnimal() == null);
   }

   @Test (expected = IllegalArgumentException.class)
   public void shouldBeExceptionIfPutInNonEmptyCell(){
      cell = new Cell(new Varan());
      cell.putAnimal(new Varan());
   }

   @Test
   public void shouldBeRightTextInEmptyCell(){
      cell = new Cell();
      Assert.assertEquals(cell.whoIsInCell(), "Клетка пустая");
   }

   @Test
   public void shouldBeRightTextNonEmptyCell(){
      cell = new Cell(new Varan());
      Assert.assertEquals(cell.whoIsInCell(), "Варан");
   }


}