import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduceti un numar!");
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();

        if(number>=0)
            System.out.printf("Numarul introdus este pozitiv");
        else
            System.out.printf("Numarul introdus este negativ");
    }
}