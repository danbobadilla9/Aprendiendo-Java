import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] ="Kingston Pendrive 64GB";
        productos[1] = "Samsung galaxy";
        productos[2] = "Disco Duro SSD samsung externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta genreacion";
        productos[6] = "Bicicleta Oxford";
        int[] numeros = new int[4];
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        System.out.println("i = " + i);
        for (String producto :
                productos) {
            System.out.println(producto);
        }
        // Ordenar los elementos del arreglo
        System.out.println("\n ORDENADOS \n");
        Arrays.sort(productos); // Ordenando acepta cualquier tipo de datos
        for (String producto :
                productos) {
            System.out.println(producto);
        }










    }
}
