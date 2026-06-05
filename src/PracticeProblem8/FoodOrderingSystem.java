package PracticeProblem8;

class Restaurant {
    void estimateDeliveryTime() {
        System.out.println("40 mins");
    }

    void calculateTotalBill(double foodPrice) {
        double tax = foodPrice * 0.10;
        System.out.println(foodPrice + tax);
    }
}

class FastFoodRestaurant extends Restaurant {
    @Override
    void estimateDeliveryTime() {
        System.out.println("20 mins");
    }

    @Override
    void calculateTotalBill(double foodPrice) {
        double tax = foodPrice * 0.15;
        System.out.println(foodPrice + tax);
    }
}

class FineDiningRestaurant extends Restaurant {
    @Override
    void estimateDeliveryTime() {
        System.out.println("60 mins");
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Restaurant res = new Restaurant();
        res.estimateDeliveryTime();
        res.calculateTotalBill(100);

        FastFoodRestaurant fast = new FastFoodRestaurant();
        fast.estimateDeliveryTime();
        fast.calculateTotalBill(100);

        FineDiningRestaurant fine = new FineDiningRestaurant();
        fine.estimateDeliveryTime();
        fine.calculateTotalBill(100);
    }
}