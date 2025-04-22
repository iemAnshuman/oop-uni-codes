import java.util.*;

public class InventoryMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();
        inventory.put(1, 100);
        inventory.put(2, 200);
        inventory.put(3, 150);

        inventory.put(2, 250); // Update quantity of product 2
        inventory.remove(1);   // Remove product 1

        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + " | Quantity: " + entry.getValue());
        }
    }
}
