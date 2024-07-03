import java.util.Scanner;

public class AreaFiguras {

    public static void main(String[] args) {

        var opcion = -1;
        Scanner sc = new Scanner(System.in);
        while (opcion != 0) {
            System.out.println("Area de figuras");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Circulo");
            System.out.println("0. Salir");
            System.out.println("ingrese una opcion: ");


            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el lado del cuadrado: ");
                    int lado = sc.nextInt();
                    System.out.println("Area del cuadrado: " + (lado * lado));
                    break;
                case 2:
                    System.out.println("ingrese la base del triangulo: ");
                    int base = sc.nextInt();
                    System.out.println("ingrese la altura del triangulo: ");
                    int altura = sc.nextInt();
                    float area = (base * altura) / 2;
                    System.out.println("Area del triangulo: " + area);
                    break;
                case 3:
                    System.out.println("ingrese el radio del circulo: ");
                    int radio = sc.nextInt();
                    System.out.println("Area del circulo: " + (3.14 * radio * radio));
                    break;
                case 0:
                    System.out.println("Gracias por usar el area de figuras");
                    break;
                default:
                    System.out.println("La opcion no es valida");
            }


        }
        sc.close();
    }
}
