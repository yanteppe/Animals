package base.environment;

import base.interfaces.Animal;
import realization.Falcon;
import realization.Varan;

/**
 * Реализация объекта Клетка.
 * - Статус клетки можно узнать запросив метод whoIsInCell.
 *
 * @author Yan Teppe.
 */
public class Cell {
   private Animal animal;

   public Cell() {
      this.animal = null;
   }

   public Cell(Animal animal) {
      this.animal = animal;
   }

   public boolean isEmpty() {
     return animal == null;
   }

   public void putAnimal(Animal animal) {
      if (isEmpty() == true) {
         this.animal = animal;
      } else {
         throw new IllegalArgumentException("Клетка занята");
      }
   }

   public Animal getAnimal() {
      if (!isEmpty()) {
         Animal result = animal;
         animal = null;
         return result;
      }
      return animal;
   }

   public String whoIsInCell() {
      if (!isEmpty()) {
         return animal.getName();
      }
      return "Клетка пустая";
   }
}
