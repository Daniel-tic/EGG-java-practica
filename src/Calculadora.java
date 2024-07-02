import java.util.Scanner;

public class Calculadora {  //Clase Calculadora
    public static void main(String[] args) {
        System.out.println("ingrese  un numero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("ingrese un segundo numero: ");
        int num2 = sc.nextInt();
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("ingrese una opcion: ");
            opcion = sc.nextInt();

            String resultado =  (opcion == 1) ? "La suma es: " + (num + num2) :
                                (opcion == 2) ? "La resta es: " + (num - num2) :
                                (opcion == 3) ? "La multiplicacion es: " + (num * num2) :
                                (opcion == 4) ? (num2 != 0 ? "La division es: " + (num / num2) : "Error: División por cero") :
                                (opcion == 5) ? "Gracias por usar la calculadora" :
                                                    "La opcion no es valida";

            System.out.println(resultado);

            if (opcion == 5) {
                break; // Salir del bucle si la opción es 5
            }

        }

    }
}
