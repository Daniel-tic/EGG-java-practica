import java.util.Scanner;

public class CadenaEntero {

    public static void main(String[] args) {
        System.out.println("escribe un numero: ");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
       try {
           int num = Integer.parseInt(cadena);
           System.out.println("el numero es: " + num);
       } catch (NumberFormatException e) {
           System.out.println("la cadena no es un numero");
       }
    }
}
