package base.animal_classes;

import base.interfaces.Animal;

/**
 * Абстрактный класс птиц.
 *
 * @author Yan Teppe
 */
public abstract class Birds implements Animal {
   protected String name = "Птица";

   public boolean canFly() {
      return true;
   }

   public void move() {
      if (canFly()) {
         System.out.println(name + "летает");
      }
   }

   public void breathe() {
      System.out.println(name + "дышит лёгкими");
   }

   public void makeSound() {
      System.out.println(name + "издаёт звук");
   }

   @Override
   public String toString() {
      return name;
   }

   public String getName(){
      return name;
   }
}
