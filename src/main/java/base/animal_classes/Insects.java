package base.animal_classes;

import base.interfaces.Animal;

/**
 * Абстрактный класс насекомых
 *
 * @author Yan Teppe
 */
public abstract class Insects implements Animal{
protected String name = "Насекомое";

   public void breathe() {
      System.out.println(name+"");
   }

   public void move() {
      System.out.println(name+"");
   }

   public void makeSound() {
      System.out.println(name+"");
   }

   @Override
   public String toString() {
      return name;
   }

   public String getName() {
      return name;
   }
}

