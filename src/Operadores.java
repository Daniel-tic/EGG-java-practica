import java.util.Scanner;
public class Operadores {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero entero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("El numero es: " + num);
        System.out.println("Ingresa otro numero entero: ");
        int num2 = sc.nextInt();
        System.out.println("El segundo numero es: " + num2);
        System.out.println("El numero "+ num +"es mayor a "+ num2 +"?" + (num > num2));
        System.out.println("El numero "+ num +"es menor a "+ num2 +"?" + (num < num2));
        System.out.println("El numero "+ num +"es igual a "+ num2 +"?" + (num == num2));
        System.out.println("El numero "+ num +"es diferente de "+ num2 +"?" + (num != num2));
        System.out.println("El numero "+ num +"es mayor o igual a "+ num2 +"?" + (num >= num2));
        System.out.println("El numero "+ num +"es menor o igual a "+ num2 +"?" + (num <= num2));
    }
}
