import java.util.Scanner;

public class EstructuraControl {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero de 0 a 100");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (90 <= num && num <= 100) {
            System.out.println("El valor es A");
        } else if (80<= num && num <= 89) {
            System.out.println("El valor es B");
        } else if (70<= num && num <= 79) {
            System.out.println("El valor es C");
        } else if (60<= num && num <=69) {
            System.out.println("El valor es D");
        } else if (num < 60) {
            System.out.println("El valor es F");

        } else {
            System.out.println("El numero esta fuera del rango");
        }
        sc.close();
    }
}
