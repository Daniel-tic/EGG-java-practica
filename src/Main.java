import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("ingresa tu nombre:");
        Scanner sc = new Scanner(System.in); // instancia de la clase escanner para luego usar sus metodos
        //system.in es la entrada estandar del sistema
        String name = sc.nextLine();


        System.out.println("enter your age:");
        int num = sc.nextInt();

        System.out.println("Hello " + name + " you are " + num + " years old");

    }


}
