//Hecho por: Brashly Cast. (2024-0014)
import java.util.Scanner;

public class Pág73Ej4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Declararamos el arreglo de 10 elementos y variables de control
        int[] numeros = new int[10];
        int numeroBuscado;
        boolean encontrado = false;
        int posicionEncontrada = -1;

        // Carga del arreglo
        System.out.println("Por favor, ingrese 10 números enteros para llenar el arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Posición [" + i + "]: ");
            numeros[i] = teclado.nextInt();
        }

        // Solicitar el número a buscar
        System.out.print("\nIngrese el número que desea buscar en el arreglo: ");
        numeroBuscado = teclado.nextInt();

        // Búsqueda por secuencia
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                posicionEncontrada = i; // Guardamos el índice actual
                break; // Rompemos el bucle porque ya lo encontramos
            }
        }

        // Reporte de resultados
        System.out.println("\n--- Reporte de la búsqueda ---");
        if (encontrado) {
            System.out.println("¡Bien, ingenier@! El número " + numeroBuscado + " fue encontrado.");
            System.out.println("Se encuentra la siguiente posición de memoria: " + posicionEncontrada);
            System.out.println("Para el usuario común, es el elemento número: " + (posicionEncontrada + 1));
        } else {
            System.out.println("Falla, el número " + numeroBuscado + " no existe en el arreglo.");
        }

        teclado.close();
    }
}
