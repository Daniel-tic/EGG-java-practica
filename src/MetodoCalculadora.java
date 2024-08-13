import java.util.Scanner;

public class MetodoCalculadora {

    public static void main(String[] args) {
        // TODO code application logic here
        menu();

    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor elija una operacion: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        int op = sc.nextInt();
        switch(op){
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Por favor ingrese una opcion valida");
                menu();
                break;
        }
    }

    public static void suma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Por favor ingrese un segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La suma es: " + (num1 + num2));
        menu();
    }

    public static void resta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Por favor ingrese un segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La resta es: " + (num1 - num2));
        menu();
    }

    public static void multiplicacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Por favor ingrese un segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La multiplicacion es: " + (num1 * num2));
        menu();
    }

    public static void division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Por favor ingrese un segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La division es: " + (num1 / num2));
        menu();
    }

}
