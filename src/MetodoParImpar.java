import java.util.Scanner;

public class MetodoParImpar {

    public static void main(String[] args) {

        int num = pedirNumero();
        esPar(num);
    }

    public static int pedirNumero(){
        boolean correcto = false;
        int num =0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Por favor ingrese un numero: ");
                num = sc.nextInt();
                correcto = true;

            } catch (Exception e) {
                System.out.println("Solo se acpetan numeros: ");
            }

        } while (!correcto);
        return num;
    }
    public static void esPar(int num){
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }


    }


}
