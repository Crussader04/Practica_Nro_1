import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class controlador {

    public static String[] Contenido(String nombreArchivo) throws IOException {
        FileReader fr = new FileReader(nombreArchivo);
        BufferedReader br = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();
        String linea;
        while ((linea = br.readLine()) != null) {
            sb.append(linea).append("\n");
        }
        br.close();
        return sb.toString().split("\n");
    }

    public static int[] procesarArchivo(String rutaArchivo) throws IOException {
        String[] datos = Contenido(rutaArchivo);
        int[] array = new int[datos.length];
        for (int i = 0; i < datos.length; i++) {
            if (!datos[i].isEmpty()) {
                array[i] = Integer.parseInt(datos[i]);
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    public static String obtenerPrimos(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            boolean esPrimo = true;
            if (array[i] <= 1) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                    if (array[i] % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                result += array[i] + ",";
            }
        }
        return result;
    }

    public static void mostrarTiempoEjecucion(long startTime, long endTime) {
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }

}
