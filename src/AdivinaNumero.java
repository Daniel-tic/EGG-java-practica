import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {


        public static void main(String[] args) {
            Random random = new Random(); //objeto Random para números aleatorios
            int numeroAleatorio = random.nextInt(20) + 1;
            Scanner data = new Scanner(System.in);
            int intento;
            System.out.println("Hoy adivinaremos un número!!!");
            System.out.println("He generado un número aleatorio entre 1 y 20. Intenta adivinarlo!!!");

            do {
                System.out.print("Ingresa tu adivinanza: ");
                intento = data.nextInt();

                if (intento < numeroAleatorio) {
                    System.out.println("El número es mayor. ¡Inténtalo de nuevo!");
                } else if (intento > numeroAleatorio) {
                    System.out.println("El número es menor. ¡Inténtalo de nuevo!");
                } else {
                    System.out.println("¡Felicidades! ¡Has adivinado el número!");
                }
            } while (intento != numeroAleatorio);

            data.close();
        }

}
