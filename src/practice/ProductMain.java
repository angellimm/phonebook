package practice;

import practice.impl.BottleOfWater;
import practice.impl.EPackage;
import practice.impl.HotDrinkTemp;
import practice.impl.HotDrinkVm;
import practice.impl.WaterVendingMachine;
import practice.VmHotDrink;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        HotDrink drink1 = new HotDrinkTemp("coffee", 1, 100);
        HotDrink drink2 = new HotDrinkTemp("tea", 2, 90);
        VmHotDrink vmhot = new HotDrinkVm();

        HotDrink item1 = HotDrinkVm.addHotDrink("coffee", 1, 100);
        HotDrink item2 = HotDrinkVm.addHotDrink("tea", 2, 90);
        System.out.println(item1);
        System.out.println(item2);



    }
}