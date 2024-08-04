import java.util.Scanner;

import static java.lang.Character.*;

public class ValidarContrasenia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu contrasenia: ");
        String contrasenia = sc.nextLine();
        System.out.println(contrasenia);

        if (contrasenia.length() >= 8) {
            System.out.println("la contrasenia es tiene 8 caracteres o mas");
        } else {
            System.out.println("la contrasenia es menor a 8 caracteres");
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < contrasenia.length(); i++) {
            char c = contrasenia.charAt(i); // obtener el caracter actual de la cadena en el indice i
            if (isUpperCase(c)) {
                hasUpperCase = true;
                System.out.println( "la contrasenia tiene mayusculas :" + c);
            } else if (isLowerCase(c)) {
                hasLowerCase = true;
                System.out.println("la contrasenia tiene minusculas");
            } else if (isDigit(c)) {
                hasDigit = true;
                System.out.println("la contrasenia tiene digitos");
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialCharacter = true;
                System.out.println("la contrasenia tiene caracteres especiales");
            }
        }

        if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter) {
            System.out.println("la contrasenia es valida");


        } else {
            System.out.println("la contrasenia es invalida");
        }
    }
}
