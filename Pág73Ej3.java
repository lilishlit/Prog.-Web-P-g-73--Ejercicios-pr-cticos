//Hecho por: Brashly Cast. (2024-0014)
import java.util.Scanner;

public class Pág73Ej3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int divisor;
        int numero;
        final int TOTAL_NUMEROS = 10;

        // Solicitar el divisor primero
        System.out.print("Ingrese el número divisor: ");
        divisor = teclado.nextInt();

        // Evitamos la división por cero
        if (divisor == 0) {
            System.out.println("¡Error! El divisor no puede ser cero, ingenier@ -_-");
        } else {
            System.out.println("\nAhora, ingrese los " + TOTAL_NUMEROS + " números a evaluar:");

            // 2. Bucle para los 10 números
            for (int i = 1; i <= TOTAL_NUMEROS; i++) {
                System.out.print("Número " + i + ": ");
                numero = teclado.nextInt();

                // 3. Evaluar si es múltiplo usando el operador módulo (%)
                if (numero % divisor == 0) {
                    System.out.println("   --> ¡Yes, el número " + numero + " es múltiplo de " + divisor + "!");
                }
            }
        }

        teclado.close();
    }
}
