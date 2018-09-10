package base.environment;

/**
 * Класс реализующий среду обетания.
 *
 * @author Yan Teppe
 */
public class Habitat {
   protected String air;
   protected String earth;
   protected String water;


   public String getAir(){
      return air;
   }

   public String getEarth() {
      return earth;
   }

   public String getWater() {
      return water;
   }


   public String setAir(){
      return air = "Среда обетания - воздух";
   }

   public String setEarth(){
      return earth = "Среда обетания - земля";
   }

   public String setWater(){
      return water = "Среда обетания - вода";
   }

}
