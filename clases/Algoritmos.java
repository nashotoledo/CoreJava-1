package clases;

public class Algoritmos {
    // Método que verifica si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método que verifica si un número es primo
    public static boolean esPrimo(int numero){
        if(numero <=1) return false;
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que invierte un String
    public static String stringEnReversa(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    // Método que verifica si un String es un palíndromo
    public static boolean esPalindromo(String texto) {
        String textoInvertido = stringEnReversa(texto);
        return texto.equalsIgnoreCase(textoInvertido);
    }

    // Método que imprime la secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }
}
