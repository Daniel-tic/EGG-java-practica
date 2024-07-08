import java.util.Scanner;

public class CadenasLongitud {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Actividad 1
       // longitud(sc);

        //Actividad 2
        //concatenarCadenas(sc);

        //Actividad 3
        //compararCadenas(sc);

        //Actividad 4
        //extraerCadena(sc);

        //Actividad 5
        //busquedaCaracter(sc);

        //Actividad 6
        mayusculaMinuscula(sc);

    }

    private static void longitud(Scanner sc) {
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();//guardamos la cadena en la variable cadena
        System.out.println("La longitud de la cadena es: " + cadena.length());
    }

    private static void concatenarCadenas(Scanner sc) {
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Introduce una cadena: ");
        String cadena2 = sc.nextLine();
        System.out.println("La cadena concatenada es: " + cadena.concat(cadena2));
    }

    private static void compararCadenas(Scanner sc) {
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Introduce una cadena: ");
        String cadena2 = sc.nextLine();
        System.out.println(cadena.equals(cadena2)); //si es igual devuelve true
    }
    public static void extraerCadena(Scanner sc) {
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Ingresa indice inicial: ");
        int caracter = sc.nextInt();
        System.out.println("Ingresa indice final: ");
        int indice = sc.nextInt();
        System.out.println("La cadena extraida es: " + cadena.substring(caracter, indice));//substring devuelve una nueva cadena
    }

    public static void busquedaCaracter(Scanner sc) {
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Ingresa caracter a buscar: ");
        char caracter = sc.next().charAt(0);
        int indice = cadena.indexOf(caracter);
        if (indice >= 0) {
            System.out.println("La cadena extraida es: " + indice);
        } else {
            System.out.println("No se ha encontrado el caracter");
        }

    }

    public static void mayusculaMinuscula(Scanner sc) {
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("La cadena en mayúsculas es: " + cadena.toUpperCase());
        System.out.println("La cadena en minúsculas es: " + cadena.toLowerCase());
    }




}
