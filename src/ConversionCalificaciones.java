import java.util.Scanner;

public class ConversionCalificaciones {

    public static void main(String[] args) {
        System.out.println("ingresa una calificacion del 1 al 5 : ");
        Scanner sc = new Scanner(System.in);
        int cal = sc.nextInt();
        switch (cal) {
            case 1:
                System.out.println("muy deficiente");
                break;
            case 2:
                System.out.println("deficiente");
                break;
            case 3:
                System.out.println("suficiente");
                break;
            case 4:
                System.out.println("notable");
                break;
            case 5:
                System.out.println("sobresaliente");
                break;
            default:
                System.out.println("la calificacion no es valida");
        }
        sc.close();
    }
}
