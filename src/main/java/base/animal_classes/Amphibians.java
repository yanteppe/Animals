package base.animal_classes;

import base.interfaces.Animal;

/**
 * Абстрактный класс земноводных
 *
 * @author Yan Teppe
 */
public abstract class Amphibians implements Animal {
   protected String name = "Земноводное";

   public void swim(){
      System.out.println("Земноводное плывёт");
   }

   public void move() {
      System.out.println("Земноводное двигается");
   }

   public void breathe() {
      System.out.println("Земноводное дышит лёгкими или жабрами");
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
