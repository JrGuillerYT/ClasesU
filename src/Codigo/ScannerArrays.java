package Codigo;
import java.util.Scanner;
public class ScannerArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String usuario = "GAY";
        String clave = "555";

        System.out.println("Ingrese su usuario");

        if (input.nextLine().equals(usuario)) {

            System.out.println("Ingrese su contraseña");

            if (input.nextLine().equals(clave)) {
                System.out.println("Bienvenido");
            } else {
                System.out.println("Clave incorrecta");
            }
        } else {
            System.out.println("No existe el usuario");
        }
    }
}
