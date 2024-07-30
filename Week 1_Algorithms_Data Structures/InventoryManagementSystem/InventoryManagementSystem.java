import java.util.Scanner;

public class InventoryManagementSystem {
    private static Inventory inventory = new Inventory();
    private static Scanner scanner;

    public InventoryManagementSystem() {
    }

    public static void main(String[] var0) {
        boolean var1 = false;

        while(!var1) {
            showMenu();
            int var2 = scanner.nextInt();
            scanner.nextLine();
            switch (var2) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    getProduct();
                    break;
                case 5:
                    printInventory();
                    break;
                case 6:
                    var1 = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    private static void showMenu() {
        System.out.println("\nInventory Management System");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Delete Product");
        System.out.println("4. Get Product");
        System.out.println("5. Print Inventory");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        String var0 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String var1 = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int var2 = scanner.nextInt();
        System.out.print("Enter Price: ");
        double var3 = scanner.nextDouble();
        scanner.nextLine();
        Product var5 = new Product(var0, var1, var2, var3);
        inventory.addProduct(var5);
        System.out.println("Product added successfully.");
    }

    private static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        String var0 = scanner.nextLine();
        System.out.print("Enter New Product Name: ");
        String var1 = scanner.nextLine();
        System.out.print("Enter New Quantity: ");
        int var2 = scanner.nextInt();
        System.out.print("Enter New Price: ");
        double var3 = scanner.nextDouble();
        scanner.nextLine();
        Product var5 = new Product(var0, var1, var2, var3);
        inventory.updateProduct(var0, var5);
        System.out.println("Product updated successfully.");
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        String var0 = scanner.nextLine();
        inventory.deleteProduct(var0);
        System.out.println("Product deleted successfully.");
    }

    private static void getProduct() {
        System.out.print("Enter Product ID to retrieve: ");
        String var0 = scanner.nextLine();
        Product var1 = inventory.getProduct(var0);
        if (var1 != null) {
            System.out.println("Retrieved Product: " + var1);
        } else {
            System.out.println("Product not found.");
        }

    }

    private static void printInventory() {
        System.out.println(inventory);
    }

    static {
        scanner = new Scanner(System.in);
    }
}
