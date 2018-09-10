package realization;

import base.animal_classes.Insects;

public class Mosquito extends Insects {

   public Mosquito(){
      name = "Комар";
   }

   public void eat() {
      System.out.println("Комар ест кровь");
   }
}
