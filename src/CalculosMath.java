import java.util.Scanner;

public class CalculosMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //ejercicio 1
        //abs(sc);

        //ejercicio 2
        //redondeo(sc);

        //ejericcio 3
        //aleatorio(sc);

        //ejercicio 4
        //potencia(sc);

        //ejercicios complementarios
        raiz(sc);

        //aleatorio entre limites
        //aleatorioLimites(sc);


        sc.close();


    }
    private static void abs(Scanner sc) {
        System.out.println("ingrese un numero: ");
        int num = sc.nextInt();
        int absoluto = Math.abs(num);
        System.out.println("el valor absoluto es: " + absoluto);
    }

    private static void redondeo(Scanner sc) {
        System.out.println("ingrese un numero a redondear: ");
        double num = sc.nextDouble();
        long redondeoNum = Math.round(num);
        System.out.println("el valor redondeado es: " + redondeoNum);
    }

    private static void aleatorio(Scanner sc) {
        System.out.println("numero aleatorio entre 1 y 355: ");
        double num = 355;
        double aleatorio = Math.floor(Math.random() * num);
        System.out.println("el valor aleatorio es: " + aleatorio);

    }

    private static void potencia(Scanner sc) {
        System.out.println("ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("ingrese el exponente: ");
        int exp = sc.nextInt();
        int potencia = (int) Math.pow(num, exp);
        System.out.println("el valor de la potencia es: " + potencia);
    }

    private static void raiz(Scanner sc) {
        System.out.println("ingrese un numero: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("el numero no puede ser negativo");
            return;
        } else if (num == 0) {
            System.out.println("la raiz cuadrada es: 0");
            return;
        }
        double raiz = (int) Math.sqrt(num);
        System.out.println("la raiz cuadrada es: " + raiz);
    }

    private static void aleatorioLimites(Scanner sc) {
        System.out.println("ingrese el limite inferior: ");
        int num = sc.nextInt();
        System.out.println("ingrese el limite superior: ");
        int num2 = sc.nextInt();
        int aleatorio = (int) Math.floor(Math.random() * (num2 - num + 1) + num);
        System.out.println("el valor aleatorio es: " + aleatorio);
    }

}
