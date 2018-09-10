package realization;

import base.animal_classes.Amphibians;

/**
 * Реализация земноводного - объект Тритон.
 */
public class Triton extends Amphibians {
   Mosquito mosquito = new Mosquito();

   public Triton() {
      name = "Тритон";
   }

   public void eat() {
      System.out.println("Тритон ест насекомых");
   }

}
