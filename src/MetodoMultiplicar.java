import java.util.Scanner;

public class MetodoMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = pedirNumero();
//        imprimirMultiplicacion(num);

        int[] num2 = pedirNumeros();
        imprimirTablaNumeros(num2);


    }

    public  static int pedirNumero(){
        int num =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero: ");
        num = sc.nextInt();
        return num;
    }

    public static void imprimirMultiplicacion(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static int[] pedirNumeros(){
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor ingrese un numero: ");
            num[i] = sc.nextInt();
        }
        return num;
    }

    public static void imprimirTablaNumeros(int[] num) {
        for (int i = 0; i < num.length; i++) {
           for (int j = 1; j <= 10; j++) {
               System.out.println(num[i] + " x " + j + " = " + (num[i] * j));
           }

            System.out.println("--------------------");
        }


    }

}
