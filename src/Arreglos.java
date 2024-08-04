import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Actividad 1
        //arreglosEnteros(sc);
        //

        //Actividad 2
        //arreglosDescensente(sc);

        //Actividad 3
        busquedaBinaria(sc);
    }

    public static void arreglosEnteros(Scanner sc){
        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            System.out.println("ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
//        for (int i = 0; i < tamanio; i++) {
//            System.out.println(numeros[i]);
//        }

        //ordenar
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
//        for (int i = 0; i < tamanio; i++) {
//            System.out.println(numeros[i]);
//        }


    }

     public static  void arreglosDescensente(Scanner sc){
        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio]; //tamanio de la matriz
        for (int i = 0; i < tamanio; i++) {

            numeros[i] = (int) (Math.random() * 100);
        }
//        for (int i = tamanio - 1; i >= 0; i--) {
//            System.out.println(numeros[i]);
//        }

         //ordenar
         for (int i = 0; i < tamanio; i++) {
             for (int j = 0; j < tamanio - 1; j++) {
                 if (numeros[j] > numeros[j + 1]) {
                     int aux = numeros[j];
                     numeros[j] = numeros[j + 1];
                     numeros[j + 1] = aux;
                 }
             }
         }
//         for (int i = 0; i < tamanio; i++) {
//             System.out.println(numeros[i]);
//         }

         //ordenarinverso
         for (int i = tamanio - 1; i >= 0; i--) {
             System.out.println(numeros[i]);
         }
    }

    public static void busquedaBinaria(Scanner sc){
        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {

            numeros[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(numeros); //metodo de ordenar
        for (int i = 0; i < tamanio; i++) {
            System.out.println(numeros[i]);
        }

        //busqueda binaria
        System.out.println("ingrese el numero a buscar: ");
        int num = sc.nextInt();
        int indice = Arrays.binarySearch(numeros, num);
        System.out.println("el indice del numero es: " + indice);
    }

    public static void compararArreglos(Scanner sc){
        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {}
    }
}
