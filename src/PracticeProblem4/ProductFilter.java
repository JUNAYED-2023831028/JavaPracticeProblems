package PracticeProblem4;

public class ProductFilter {

    void filter(String category) {
        System.out.println("Searching by category: " + category);
    }

    void filter(int min, int max) {
        System.out.println("Searching by price: " + min + " to " + max);
    }

    void filter(String brand, boolean isBrand) {
        System.out.println("Searching by brand: " + brand);
    }

    void filter(String category, int min, int max) {
        System.out.println("Searching by category: " + category + " and price: " + min + " to " + max);
    }

    void filter(String category, int min, int max, String brand) {
        System.out.println("Searching by category: " + category + ", price: " + min + " to " + max + ", brand: " + brand);
    }

    public static void main(String[] args) {
        ProductFilter pf = new ProductFilter();

        pf.filter("Electronics");
        pf.filter(100, 500);
        pf.filter("Apple", true);
        pf.filter("Fashion", 200, 800);
        pf.filter("Electronics", 500, 1500, "Sony");
    }
}