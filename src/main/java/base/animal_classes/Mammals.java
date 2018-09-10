package base.animal_classes;

import base.interfaces.Animal;

/**
 * Абстрактный класс млекопитающих.
 *
 * @author Yan Teppe
 */
public abstract class Mammals implements Animal {
   protected String name = "Млекопитающее";

   public void move() {
      System.out.println(name + " двигается");
   }

   public void breathe() {
      System.out.println(name + " дышит");
   }

   public void makeSound() {
      System.out.println(name + " издаёт звуки");
   }

   @Override
   public String toString() {
      return name;
   }

   public String getName() {
      return name;
   }

}
