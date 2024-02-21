import java.util.Scanner;
class Car {
    int speed;
    double regularPrice;
    String color;
    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    double getSalePrice() {
        return regularPrice;
    }
}
class Truck extends Car {
    int weight;
    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    @Override
    double getSalePrice() {
        double discount;
        if (weight > 2000) {
            discount = 0.9;
        } else {
            discount = 0.8;
        }
        return super.getSalePrice() * discount;
    }
}
class Ford extends Car {
    int year;
    int manufacturerDiscount;
    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    @Override
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}
class Sedan extends Car {
    int length;
    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
    @Override
    double getSalePrice() {
        double discount;
        if (length > 20) {
            discount = 0.95;
        } else {
            discount = 0.9;
        }
        return super.getSalePrice() * discount;
    }
}



