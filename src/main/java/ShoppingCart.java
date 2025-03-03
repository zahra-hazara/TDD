import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<String, Double> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(String itemName, double price) {
        items.put(itemName, price);
    }

    public void removeItem(String itemName) {
        items.remove(itemName);
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateTotal() {
        return items.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}