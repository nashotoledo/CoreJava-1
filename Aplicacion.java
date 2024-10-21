import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {
        // Método esPar
        System.out.println("5 es par: " + Algoritmos.esPar(5)); // false
        System.out.println("4 es par: " + Algoritmos.esPar(4)); // true

        // Método esPrimo
        System.out.println("5 es primo: " + Algoritmos.esPrimo(5)); // true
        System.out.println("4 es primo: " + Algoritmos.esPrimo(4)); // false

        // Método stringEnReversa
        System.out.println("Reversa de 'hola': " + Algoritmos.stringEnReversa("hola")); // "aloh"

        // Método esPalindromo
        System.out.println("'ana' es palindromo: " + Algoritmos.esPalindromo("ana")); // true
        System.out.println("'hola' es palindromo: " + Algoritmos.esPalindromo("hola")); // false

        // Método secuenciaFizzBuzz
        System.out.println("Secuencia FizzBuzz hasta 15:");
        Algoritmos.secuenciaFizzBuzz(15);
        
    }
}