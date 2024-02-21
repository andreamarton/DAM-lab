import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        System.out.println("Introduceti cate numere sa contina vectorul");
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println("Introduceti numerele din vector");
        int sum=0;
        for(int i=0;i<number;i++)
        {
            int next=sc.nextInt();
            sum=sum+next;
        }
        int av=sum/number;
        System.out.println("Media aritmetica a numerelor este");
        System.out.println(av);
    }
}
