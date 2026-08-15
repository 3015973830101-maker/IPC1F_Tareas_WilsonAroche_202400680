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

        mostrarFin();

        scanner.close();
    }

    // Muestra el mensaje inicial del programa
    static void mostrarInicio() {
        System.out.println("===== TAREA 2 =====");
        System.out.println("Tipos de datos y validaciones");
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

    static void mostrarDatos(int edad, double promedio, char seccion, boolean activo) {

        System.out.println();
        System.out.println("===== DATOS =====");
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Seccion: " + seccion);
        System.out.println("Activo: " + activo);
    }

    static void mostrarFin() {

        System.out.println();
        System.out.println("Programa finalizado.");
    }
}
