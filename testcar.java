package lab6;

public class testcar {
    public static void main(String[] args) {
        car c1 = new car("BMW", "X6", "M50d", 7500000, 2019);
        car c2 = new car("Volkswagen", "Passat", "cc", 1750000, 2016);
        car c3 = new car("Audi", "A8", "Q7", 8500000, 2018);
        c1.println();
        c2.println();
        c3.println();
    }
}