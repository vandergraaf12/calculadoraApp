import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true) {
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                // Revisar que esté entre las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) { // Salir
                    System.out.println("Hasta pronto");
                    break;
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                // Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } // Fin Try
            catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }// Fin while
    }

    private static void mostrarMenu(){
        System.out.println("**** Aplicación Calculadora ****");
        // Mostramos el menu
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.println("Operación a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado Multiplicación: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado División: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }
}
