import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ingrese un numero A: ");

            double num = sc.nextInt();
            System.out.println("ingrese un numero B: ");
            double num2 = sc.nextInt();
            double div = num / num2;
            System.out.println(num + " / " + num2 + " = " + String.format("%.2f", div));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division por cero");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ser un numero");
        }


        sc.close();
    }
}
