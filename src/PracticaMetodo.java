import java.util.Scanner;

public class PracticaMetodo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un nombre:");
        String nombre =  sc.nextLine();
        System.out.println("Por favor ingrese una edad:");
        int edad = sc.nextInt();
        imprimirNombreYEdad(nombre, edad);

    }

    public static void imprimirNombreYEdad(String nombre, int edad){
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " anios");
    }
}
