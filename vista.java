import java.io.IOException;

public class vista extends controlador {
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        String rutaArchivo = "/home/cristian/Descargas/data.txt";
        int[] array = procesarArchivo(rutaArchivo);
        String result = obtenerPrimos(array);
        int numeroPrimos = result.split(",").length;
        System.out.println(result);
        System.out.println("El numero de numeros primos es: " + numeroPrimos);
        long endTime = System.nanoTime();
        mostrarTiempoEjecucion(startTime, endTime);
    }    
}

