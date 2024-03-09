import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);
        HotDrink b6 = new HotDrink("25", 8, 0.2, 65);
        HotDrink b7 = new HotDrink("22", 10, 0.3, 50);
        HotDrink b8 = new HotDrink("30", 11, 0.5, 80);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
        HotDrinksVendingMachine vendingMachine2 = new HotDrinksVendingMachine(new ArrayList<>());
        vendingMachine2.addHotDrink(b6);
        vendingMachine2.addHotDrink(b7);
        vendingMachine2.addHotDrink(b8);
        System.out.println(vendingMachine.getProduct("20", 5));
        // System.out.println(vendingMachine.getProduct("15", 1));
        System.out.println(vendingMachine2.getProduct("30", 0.5, 80));
//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }
    }

}