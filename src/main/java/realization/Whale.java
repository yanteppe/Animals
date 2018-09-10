package realization;

import base.animal_classes.Underwater;

/**
 * Реализация подводного животного - объект Кит.
 * @author Yan Teppe.
 */
public class Whale extends Underwater{

   public Whale(){
      name = "Кит";
   }

   public void eat() {
      System.out.println("Кит ест планктон");
   }
}
