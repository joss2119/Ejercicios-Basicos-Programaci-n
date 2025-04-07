package contarPalabras;

import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer la entrada del usuario desde la consola.
        Scanner sc = new Scanner(System.in);

        // Pide al usuario que escriba una oración.
        System.out.println("Escriba la oración ");

        // Lee la oración ingresada por el usuario.
        String frase = sc.nextLine();

        // Divide la oración en palabras, usando espacios como separadores.
        String[] palabra = frase.split(" ");

        // Muestra el número de palabras en la oración.
        System.out.println("La frase tiene " + palabra.length + " palabras");

        // Cierra el objeto Scanner para liberar recursos.
        sc.close();
    }
}