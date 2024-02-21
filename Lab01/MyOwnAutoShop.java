import java.util.Scanner;

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan sedan = new Sedan(60, 25000, "Blue", 25);
        Ford ford1 = new Ford(70, 30000, "Red", 2020, 2000);
        Ford ford2 = new Ford(80, 35000, "Green", 2021, 2500);
        Car car = new Car(50, 20000, "Black");

        System.out.println("Sedan Sale Price: $" + sedan.getSalePrice());
        System.out.println("Ford 1 Sale Price: $" + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: $" + ford2.getSalePrice());
        System.out.println("Car Sale Price: $" + car.getSalePrice());
    }
}