package realization;

import base.animal_classes.Mammals;

/**
 * Реализация млекопитающего - объект Лошадь.
 */
public class Horse extends Mammals {

   public Horse() {
      name = "Лошадь";
   }

   public void eat() {
      System.out.println("Лошадь ест траву");
   }


}
