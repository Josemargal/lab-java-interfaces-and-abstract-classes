import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // BigDecimal Operations Test
        System.out.println("=== BigDecimal Operations ===");
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Rounded to hundredth: " + BigDecimalUtils.roundToNearestHundredth(num1));

        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println("Reversed and rounded: " + BigDecimalUtils.reverseSignAndRoundToTenth(num2));

        // Car Inventory System Test
        System.out.println("\n=== Car Inventory System ===");
        Sedan sedan = new Sedan("123ABC", "Toyota", "Corolla", 50000);
        UtilityVehicle suv = new UtilityVehicle("456DEF", "Jeep", "Wrangler", 75000, true);
        Truck truck = new Truck("789GHI", "Ford", "F-150", 90000, 12000.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());

        // Video Streaming Service Test
        System.out.println("\n=== Video Streaming Service ===");
        TvSeries tvSeries = new TvSeries("Breaking Bad", 60, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());

        // IntList Implementation Test
        System.out.println("\n=== IntList Implementations ===");
        IntList arrayList = new IntArrayList();
        IntList vectorList = new IntVector();

        for (int i = 1; i <= 15; i++) {
            arrayList.add(i);
        }
        for (int i = 1; i <= 25; i++) {
            vectorList.add(i);
        }

        System.out.println("IntArrayList Element at Index 5: " + arrayList.get(5));
        System.out.println("IntVector Element at Index 10: " + vectorList.get(10));
    }
}

