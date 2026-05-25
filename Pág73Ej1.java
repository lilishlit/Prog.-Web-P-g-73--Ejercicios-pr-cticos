//Hecho por: Brashly Cast. (2024-0014)
import java.util.Scanner;
public class Pág73Ej1 {
    public static void main(String[] args) {
        // Scaner para los datos de entrada
        Scanner teclado = new Scanner(System.in);
        
        // Variables de almacenamiento
        double suma = 0;
        double numero;
        final int TOTAL_NUMEROS = 10; // Para definir la cantidad de números a ingresar

        System.out.println("Por favor, ingrese " + TOTAL_NUMEROS + " números:");

        // Bucle para los 10 números
        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.print("Número " + i + ": ");
            numero = teclado.nextDouble(); // Lee el número ingresado
            suma += numero; // Acumula el valor: suma = suma + número
        }

        // Calculamos el promedio
        double promedio = suma / TOTAL_NUMEROS;

        // Mostramos los resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio aritmético es: " + promedio);
        
        //Cierre del scanner
        teclado.close();
    }
}
