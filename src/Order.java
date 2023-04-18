import java.util.ArrayList;
import java.util.HashMap;


public class Order {

    private Restaurant restaurant;
    private HashMap<Menu, Integer> menus;
    private int jarak;

    public Order(Restaurant restaurant) {
        this.restaurant = restaurant;
        this.menus = new HashMap<>();
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }

    public HashMap<Menu, Integer> getMenus() {
        return this.menus;
    }

    public int getjarak() {
        return this.jarak;
    }

    public void setJarak(int distance) {
        this.jarak = distance;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Menu menu : this.menus.keySet()) {
            totalPrice += menu.getHarga() * this.menus.get(menu);
        }
        totalPrice += this.jarak * 1000;
        return totalPrice;
    }

    public void addMenu(Menu menu, int quantity) {
        if (this.menus.containsKey(menu)) {
            int currentQuantity = this.menus.get(menu);
            this.menus.put(menu, currentQuantity + quantity);
        } else {
            this.menus.put(menu, quantity);
        }
    }


}
