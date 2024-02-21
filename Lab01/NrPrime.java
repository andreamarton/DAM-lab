import java.util.Scanner;

public class NrPrime {
    public static void main(String[] args) {
        System.out.println("Perechile de numere prime pana la 100 vor fi: ");
        for(int i=3;i<100;i++)
        {
            if (estePrime(i) && estePrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    public static boolean estePrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
