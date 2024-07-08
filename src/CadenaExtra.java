import java.util.Scanner;

public class CadenaExtra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Ejecicio 1
        reemplazoCaracter(sc);


        sc.close();

    }

    public static void reemplazoCaracter(Scanner sc){
        System.out.println("ingrese una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("ingrese el caracter que desea reemplazar: ");
        char caracter = sc.next().charAt(0);
        System.out.println("ingrese el caracter por el que desea reemplazarlo: ");
        char reemplazo = sc.next().charAt(0);
        System.out.println(cadena.replace(caracter, reemplazo));
    }
}
