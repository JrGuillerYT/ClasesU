package Codigo;
public class ClassArrays {
public static void main(String[] args) {

        //DECLARACION DE ARREGLO CON 3 ELEMENTOS
        String names[] = new String[3];
        int edades[] = {37, 50, 10};
        double estaturas[] = {1.02, 1.90, 1.50};

        //ASIGNE VALORES A LOS NOMBRES
        names[0] = "deku";
        names[1] = "bomberbing";
        names[2] = "arcangel";
        
        //BUCLE FOR PARA EVITAR SALIRSE DEL LIMITE
        for (int i = 0; i < names.length; i++) {
            System.out.println("Nombre: " + names[i]);
            System.out.println("Edad: " + edades[i]);
            System.out.println("Estatura: " + estaturas[i]);
            System.out.println(":::::::::::::::::::::::::::::::");
        }
    }
}
