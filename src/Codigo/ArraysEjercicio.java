package Codigo;
public class ArraysEjercicio {
    public static void main(String[] args) {
        int numbers[] = {50, 70}; //ARRAY DE NUMEROS ENTEROS
        int mayor = numbers[0]; //PRIMER VALOR DEL ARRAY
        int menor = numbers[0]; //PRIMER VALOR DELA ARRAY

        //RECORREMOS EL ARRAY DESDE EL SEGUNDO ELEMENTO
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > mayor) {
                mayor = numbers[i]; //ACTUALIZA SI SE ENCUENTRA UN NUMERO MAYOR
            }
            if (numbers[i] < menor) {
                menor = numbers[i]; //ACTUALIZA SI SE ENCUENTRA UN NUMERO MENOR
            }
        }

        //IMPRIMO EL RESULTADO
        System.out.println("El mayor fue: " + mayor);
        System.out.println("El menor fue: " + menor);
    }
}
