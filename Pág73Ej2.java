//Hecho por: Brashly Cast. (2024-0014)
import java.util.Scanner;

public class Pág73Ej2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double mayor = 0;
        double menor = 0;
        double numero;
        final int TOTAL_NUMEROS = 10;

        System.out.println("Por favor, ingrese " + TOTAL_NUMEROS + " números:");

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.print("Número " + i + ": ");
            numero = teclado.nextDouble();

            // Si es el primer número, se asigna como mayor y menor por defecto
            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {
                // Evaluamos condiciones para los otros números
                if (numero > mayor) {
                    mayor = numero; // Actualizamos el máximo
                }
                if (numero < menor) {
                    menor = numero; // Actualizamos el mínimo
                }
            }
        }

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("El número mayor de los ingresados es: " + mayor);
        System.out.println("El menor de los números ingresados es: " + menor);

        teclado.close();
    }
}
