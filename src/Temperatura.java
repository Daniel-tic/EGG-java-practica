import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //conversion de temperatura
        conversionTemp(sc);

        sc.close();



    }

    public static void conversionTemp(Scanner sc) {
        try {
            System.out.println("ingrese una temperatura:  ");
            double temp = sc.nextDouble();
            System.out.println("ingrese una unidad de medida de temperatura f para fahrenheit o c para celsius:  ");
            String medida = sc.next();
            if (medida.equals("f")) {
                double celsius = temp;
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("la temperatura en fahrenheit es: " + fahrenheit);
            } else if (medida.equals("c")) {
                double fahrenheit = temp;
                double celsius2 = (fahrenheit - 32) * 5 / 9;
                System.out.println("la temperatura en celsius es: " + celsius2);
            }
        } catch (InputMismatchException e) {
                System.out.println("la medida de temperatura no es valida");
        } catch (Exception e) {
                System.out.println("error desconocido");
        }
    }

}

//

//public static void password() {
//    try {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa La contraseña, tiene que tener 8 caracteres o más y debe tener al menos un número, una letra mayuscula y minuscula y un caracter especial: ");
//        sc.next(Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"));
//        System.out.println("Programa finalizado");
//    } catch (InputMismatchException e) {
//
//        System.out.println("Cantidad de caracteres incorrecta" + e);
//    }
//}

//public static void passwordSencillo() {
//    try {
//        boolean confirm = true;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa La contraseña, tiene que tener 8 caracteres o más y debe tener al menos un número, una letra mayuscula y minuscula y un caracter especial: ");
//        String pass = sc.next();
//        if (pass.length() < 8) {
//            System.out.println("La contraseña debe tener 8 caracteres o más");
//            confirm = false;
//        }
//        if (!pass.matches("^(?=.*[@$!%*?&])(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{0,}$")) {
//            System.out.println("La contraseña debe tener caracteres especiales");
//            confirm = false;
//        }
//        if (!pass.matches("^(?=.*[a-z])(?=.*[A-Z])[A-Za-z]{0,}$")) {
//            System.out.println("La contraseña debe tener al menos una letra mayuscula, minuscula");
//            confirm = false;
//        }
//        System.err.println(confirm ? "La contraseña es correcta" : "La contraseña es incorrecta");
//    } catch (InputMismatchException e) {
//
//        System.out.println("Cantidad de caracteres incorrecta" + e);
//    }
//}
//}
