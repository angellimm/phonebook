
package practice.impl;

import practice.VmHotDrink;


public class HotDrinkVm implements VmHotDrink {

   @Override
   public void addHotDrink(){

   }

public static HotDrinkTemp addHotDrink(String name, int volume, int temperature){
    return new HotDrinkTemp(name, volume, temperature);
}
}