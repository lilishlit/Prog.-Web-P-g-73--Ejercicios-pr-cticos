//Hecho por: Brashly Cast. (2024-0014)
import java.util.Scanner;

public class Pág73Ej5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        double escalar;

        // Lectura de Datos
        System.out.println("--- Ingreso de datos para la matriz A ---");
        llenarMatriz(teclado, matrizA);
        
        System.out.println("\n--- Ingreso de datos para la matriz B ---");
        llenarMatriz(teclado, matrizB);

        System.out.print("\nIngrese el número escalar para multiplicar las matrices: ");
        escalar = teclado.nextDouble();

        // Procesamiento y muestra de resultados
        System.out.println("\n                                       ");
        System.out.println("              RESULTADOS                ");
        System.out.println("                                         ");

        // A) Producto por Escalar
        System.out.println("\n-> Matriz A multiplicada por " + escalar + ":");
        mostrarMatriz(productoEscalar(matrizA, escalar));
        
        System.out.println("\n-> Matriz B multiplicada por " + escalar + ":");
        mostrarMatriz(productoEscalar(matrizB, escalar));

        // B) Suma de Matrices
        System.out.println("\n-> Suma de las matrices (A + B):");
        mostrarMatriz(sumarMatrices(matrizA, matrizB));

        // C) Producto de dos Matrices
        System.out.println("\n-> Producto matricial (A x B):");
        mostrarMatriz(multiplicarMatrices(matrizA, matrizB));

        teclado.close();
    }

    // Método para llenar una matriz
    public static void llenarMatriz(Scanner teclado, double[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextDouble();
            }
        }
    }

    // Método para imprimir la matriz con la estructura ideal
    public static void mostrarMatriz(double[][] matriz) {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%6.2f ", matriz[i][j]);
            }
            System.out.println("|");
        }
    }

    // Operación 1: Producto por escalar
    public static double[][] productoEscalar(double[][] matriz, double escalar) {
        double[][] resultado = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }

    // Operación 2: suma de las matrices
    public static double[][] sumarMatrices(double[][] m1, double[][] m2) {
        double[][] resultado = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultado;
    }

    // Operación 3: Multiplicación de las matrices (A x B)
    public static double[][] multiplicarMatrices(double[][] m1, double[][] m2) {
        double[][] resultado = new double[3][3];
        // i recorre filas de m1, j recorre columnas de m2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = 0; // Inicializar la celda
                // k recorre los elementos para el producto punto
                for (int k = 0; k < 3; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return resultado;
    }
}
