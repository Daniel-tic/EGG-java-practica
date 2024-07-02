import java.util.Scanner;

 public class ClasificarNumero {

    public static void main(String[] args) {

        System.out.println("ingrese un numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }
}
