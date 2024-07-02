import java.util.Scanner;
public class ParoImpar {
    public static void main(String[] args) {

        System.out.println("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String resultado = (num % 2 == 0) ? num + " es par" : num + " es impar";
        System.out.println(resultado);
//        if (num % 2 == 0) {
//            System.out.println(num + " es par");
//        } else {
//            System.out.println(num + " es impar");
//        }
    }
}
