import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine{

    List<HotDrink> hotDrinks;
    public HotDrinksVendingMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> getHotDrink() {
        return hotDrinks;
    }

    public void setHotDrink(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }
    @Override
    public Product getProduct(String name) {
       
        for (HotDrink item : hotDrinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    
    public Product getProduct(String name, double volume, int temperature) {
      
        for (HotDrink drink : hotDrinks) {
            if(drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature)
                return drink;
        }
        return null;
    }

   
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
    }

    @Override
    public Product getProduct(String name, double volume) {
    
        return null;
    }


    
    
}
