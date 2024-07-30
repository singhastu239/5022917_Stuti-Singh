import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products = new HashMap();

    public Inventory() {
    }

    public void addProduct(Product var1) {
        this.products.put(var1.getProductId(), var1);
    }

    public void updateProduct(String var1, Product var2) {
        this.products.put(var1, var2);
    }

    public void deleteProduct(String var1) {
        this.products.remove(var1);
    }

    public Product getProduct(String var1) {
        return (Product)this.products.get(var1);
    }

    public String toString() {
        return "Inventory [products=" + this.products + "]";
    }
}
