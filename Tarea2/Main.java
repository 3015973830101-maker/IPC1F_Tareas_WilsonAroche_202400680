import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        mostrarInicio();

        int edad = leerEnteroEnRango("Ingrese su edad (1-100): ", 1, 100);

        double promedio = 85.5;
        char seccion = 'F';
        boolean activo = true;

        mostrarDatos(edad, promedio, seccion, activo);

        int[] numeros = leerArreglo();

        mostrarResultadosArreglo(numeros);

        mostrarFin();

        scanner.close();
    }

    // Muestra el mensaje inicial del programa
    static void mostrarInicio() {
        System.out.println("===== TAREA 2 =====");
        System.out.println("Tipos de datos, arreglos y validaciones");
        System.out.println();
    }

    /*
     * Este metodo solicita un numero entero.
     * Tambien valida que el usuario escriba un numero
     * y que este dentro del rango indicado.
     */
    static int leerEnteroEnRango(String mensaje, int minimo, int maximo) {

        while (true) {

            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {

                int numero = Integer.parseInt(entrada);

                if (numero >= minimo && numero <= maximo) {
                    return numero;
                }

                System.out.println(
                    "El numero debe estar entre " + minimo + " y " + maximo + "."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                    "Entrada invalida. Debe ingresar un numero entero."
                );
            }
        }
    }

    static void mostrarDatos(
        int edad,
        double promedio,
        char seccion,
        boolean activo
    ) {

        System.out.println();
        System.out.println("===== DATOS =====");
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Seccion: " + seccion);
        System.out.println("Activo: " + activo);
    }

    static int[] leerArreglo() {

        System.out.println();
        System.out.println("===== ARREGLO DE UNA DIMENSION =====");

        int cantidad = leerEnteroEnRango(
            "Cuantos numeros desea ingresar (1-10): ",
            1,
            10
        );

        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = leerEnteroEnRango(
                "Ingrese el numero " + (i + 1) + " (1-100): ",
                1,
                100
            );
        }

        return numeros;
    }

    static void mostrarResultadosArreglo(int[] numeros) {

        int mayor = numeros[0];
        int menor = numeros[0];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            suma += numeros[i];
        }

        double promedioArreglo = (double) suma / numeros.length;

        System.out.println();
        System.out.println("===== RESULTADOS DEL ARREGLO =====");

        System.out.print("Valores: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);
        System.out.println("Promedio: " + promedioArreglo);
    }

    static void mostrarFin() {

        System.out.println();
        System.out.println("Programa finalizado.");
    }
}
