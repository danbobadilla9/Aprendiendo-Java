import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;

        productos[0] ="Kingston Pendrive 64GB";
        productos[1] = "Samsung galaxy";
        productos[2] = "Disco Duro SSD samsung externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta genreacion";
        productos[6] = "Bicicleta Oxford";
        Arrays.sort(productos);
        for(int i = 0; i < total; i++){//El for es mas optimizado que el while
            System.out.println("para indice: "+i+" : "+productos[i]);
        }
        for(String producto: productos){
            System.out.println(producto);
        }
        int[] numeros = new int[10];

    }





























}
