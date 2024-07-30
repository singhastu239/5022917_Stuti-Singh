import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Product[] var1 = new Product[]{new Product("1", "Laptop", "Electronics"), new Product("2", "Phone", "Electronics"), new Product("3", "Shirt", "Clothing"), new Product("4", "Shoes", "Footwear"), new Product("5", "Watch", "Accessories")};
        Scanner var2 = new Scanner(System.in);
        System.out.println("Enter product name to search:");
        String var3 = var2.nextLine();
        System.out.println("Choose search method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        int var4 = var2.nextInt();
        Product var5 = null;
        switch (var4) {
            case 1 -> var5 = LinearSearch.linearSearch(var1, var3);
            case 2 -> var5 = BinarySearch.binarySearch(var1, var3);
            default -> System.out.println("Invalid choice.");
        }

        if (var5 != null) {
            System.out.println("Product found: " + var5);
        } else {
            System.out.println("Product not found.");
        }

        var2.close();
    }
}
