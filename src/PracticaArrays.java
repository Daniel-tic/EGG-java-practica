import java.util.Scanner;

public class PracticaArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //ejercicio 1
        //sumarNumeros(sc);

        //ejercicio 2
        //promedio(sc);

        //ejercicio 3
        //numMax(sc);

        //ejercicio 4
        //busquedaElemento(sc);

        //ejercicio 5
        numAleatorio(sc);
    }

    public static void sumarNumeros(Scanner sc){

        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio]; //tamanio de la matriz
        for (int i = 0; i < tamanio; i++) {
            System.out.println("ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < tamanio; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("la suma de los numeros es: " + suma);

    }

    public static void promedio(Scanner sc){
        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio]; //tamanio de la matriz
        for (int i = 0; i < tamanio; i++) {
            System.out.println("ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < tamanio; i++) {
            suma = suma + numeros[i];
        }
        double promedio = (double) suma / tamanio;
        System.out.println("el promedio es: " + promedio);
    }

    public static void numMax(Scanner sc){
        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio]; //tamanio de la matriz
        for (int i = 0; i < tamanio; i++) {
            System.out.println("ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < tamanio; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("el numero maximo es: " + max);
    }

    public static void busquedaElemento(Scanner sc){
        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio]; //tamanio de la matriz
        for (int i = 0; i < tamanio; i++) {
            System.out.println("ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("ingrese el elemento a buscar: ");
        int num = sc.nextInt();
        int indice = 0;
        for (int i = 0; i < tamanio; i++) {
            if (numeros[i] == num) {
                indice = i;
            }
        }
        System.out.println("el indice del elemento es: " + indice);
    }

    public static void numAleatorio(Scanner sc){
        System.out.println("ingrese el tamanio del arreglo: ");
        int tamanio = sc.nextInt();
        int[] numeros = new int[tamanio]; //tamanio de la matriz
        for (int i = 0; i < tamanio; i++) {
            System.out.println("ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        int contadorPares = 0;
        for (int i = 0; i < tamanio; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("la cantidad de pares es: " + contadorPares);
    }
}
