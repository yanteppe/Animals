package base.animal_classes;

import base.interfaces.Animal;

/**
 * Абстрактный класс подводных.
 *
 * @author Yan Teppe
 */
public abstract class Underwater implements Animal {
   protected String name = "Подводное";

   public void move() {
      System.out.println(name + "плавает");
   }

   public void breathe() {
      System.out.println(name + "дышит жабрами");
   }

   public void makeSound() {
      System.out.println(name + "...");
   }

   @Override
   public String toString() {
      return name;
   }

   public String getName(){
      return name;
   }
}
