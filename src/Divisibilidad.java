import java.util.Scanner;

public class Divisibilidad {

    public static void main(String[] args) {
        System.out.println("ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println(num + " es divisible por 5 y 3");
        }else if (num % 5 == 0) {
            System.out.println(num + " es divisible por 5");
        } else if (num % 3 == 0) {
            System.out.println(num + " es divisible por 3");
        }
        else {
            System.out.println(num + " no es divisible por 5 y 3");
        }
        sc.close();
    }
}
