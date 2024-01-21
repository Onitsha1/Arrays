import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        /*
         * a. Declaración y creación de arrays:
         * 
         * Declara y crea un array unidimensional para almacenar los nombres de los
         * empleados.
         * Declara y crea un array bidimensional para almacenar las horas trabajadas por
         * los empleados en diferentes días de la semana.
         *
         * b. Inicialización y acceso a elementos:
         * 
         * Inicializa los arrays con datos de ejemplo.
         * Accede al tercer nombre de empleado y muestra su valor.
         * Accede al número de horas trabajadas por el segundo empleado el martes y
         * muestra su valor.
         * 
         * c. Recorridos y búsqueda:
         * 
         * Recorre el array de nombres de empleados y muestra cada nombre en una línea
         * separada.
         * Busca un nombre de empleado específico en el array y muestra si se encuentra
         * o no.
         * 
         * d. Ordenación:
         * 
         * Ordena el array de nombres de empleados en orden alfabético.
         * Ordena el array bidimensional de horas trabajadas por empleado en orden
         * ascendente según el total de horas.
         */

        // a.

        // Añadir comentarios
        String[] nombreEmpleados = new String[3];
        int[][] horasTrabajadas = new int[3][5];

        // b.
        nombreEmpleados[0] = "Gabriel";
        nombreEmpleados[1] = "Estela";
        nombreEmpleados[2] = "Alvaro";

        horasTrabajadas[0][0] = 7; // Lunes - Gabriel
        horasTrabajadas[1][0] = 8; // Lunes - Estela
        horasTrabajadas[2][0] = 8; // Lunes - Alvaro

        horasTrabajadas[0][1] = 8; // Martes - Gabriel
        horasTrabajadas[1][1] = 9; // Martes - Estela
        horasTrabajadas[2][1] = 9; // Martes - Alvaro

        horasTrabajadas[0][2] = 8; // Miercoles - Gabriel
        horasTrabajadas[1][2] = 9; // Miercoles - Estela
        horasTrabajadas[2][2] = 8; // Miercoles - Alvaro

        horasTrabajadas[0][3] = 8; // Jueves - Gabriel
        horasTrabajadas[1][3] = 8; // Jueves - Estela
        horasTrabajadas[2][3] = 8; // Jueves - Alvaro

        horasTrabajadas[0][4] = 6; // Viernes - Gabriel
        horasTrabajadas[1][4] = 7; // Viernes - Estela
        horasTrabajadas[2][4] = 7; // Viernes - Alvaro

        System.out.println(nombreEmpleados[2]);
        System.out.println(horasTrabajadas[1][1]);

        // c.
        String[] listaEmpleados = new String[3];

        for (int i = 0; i < nombreEmpleados.length; i++) {
            listaEmpleados[i] = nombreEmpleados[i];
        }

        System.out.println(Arrays.toString(listaEmpleados));

        System.out.println(Arrays.asList(nombreEmpleados).contains("Estela"));

        // d.
        Arrays.sort(nombreEmpleados);
        System.out.println(Arrays.toString(nombreEmpleados));

        int[] horasTrabajadasGabriel = { horasTrabajadas[0][0] + horasTrabajadas[0][1] + horasTrabajadas[0][2]
                + horasTrabajadas[0][3] + horasTrabajadas[0][4] };

        int[] horasTrabajadasEstela = { horasTrabajadas[1][0] + horasTrabajadas[1][1] + horasTrabajadas[1][2]
                + horasTrabajadas[1][3] + horasTrabajadas[1][4] };

        int[] horasTrabajadasAlvaro = { horasTrabajadas[2][0] + horasTrabajadas[2][1] + horasTrabajadas[2][2]
                + horasTrabajadas[2][3] + horasTrabajadas[2][4] };

        /* int[] horasTrabajadasTotal = { horasTrabajadasGabriel,
         horasTrabajadasEstela, horasTrabajadasAlvaro }; */

        for (int[] fila : arr) {

    }

}
