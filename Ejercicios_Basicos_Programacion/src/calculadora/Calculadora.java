package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Declara las variables para los números y el resultado
        double num1, num2, resultado;

        // Declara la variable para la opción de la operación
        int op;

        // Muestra el menú de opciones al usuario
        System.out.println(" ¿Que operación desea hacer?\r\n" +
                "1. Sumar\r\n" +
                "2. Restar\r\n" +
                "3. Multiplicar\r\n" +
                "4. Dividir\r\n");

        // Lee la opción ingresada por el usuario
        op = sc.nextInt();

        // Pide al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();

        // Pide al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();

        // Realiza la operación según la opción ingresada
        switch (op) {
            case 1: // Suma
                resultado = num1 + num2;
                System.out.println("la Suma es " + resultado);
                break;
            case 2: // Resta
                resultado = num1 - num2;
                System.out.println("La resta es " + resultado);
                break;
            case 3: // Multiplicación
                resultado = num1 * num2;
                System.out.println("La multiplicación es " + resultado);
                break;
            case 4: // División
                // Verifica si el segundo número es cero para evitar la división por cero
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La división es " + resultado);
                } else
                    System.out.println("No se puede dividir por 0");
                break;
            default: // Opción no válida
                System.out.println("No es una opción valida");
        }

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
