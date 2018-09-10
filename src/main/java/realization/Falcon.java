package realization;

import base.animal_classes.Birds;

/**
 * Реализация птиц - объект Сокол
 */
public class Falcon extends Birds {

   public Falcon() {
      name = "Сокол";
   }

   public void eat() {
      System.out.println("Сокол ест живность");
   }

}
