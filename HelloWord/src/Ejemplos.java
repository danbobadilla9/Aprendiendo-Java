import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("DISTANCIA ENTRE 2 PUNTOS A y B, en 2D.");
        System.out.println("-------------------------------------------------------");
        float AX,AY,BX,BY,D;
        System.out.println("Ingrese coordenadas del Punto A: ");
        AX = scanner.nextFloat();
        AY = scanner.nextFloat();
        System.out.println("Ingrese coordenadas del Punto B: ");
        BX = scanner.nextFloat();
        BY = scanner.nextFloat();
        D = (float)Math.pow(( Math.pow((AX-BX),2) + Math.pow((AY-BY),2) ),0.50);
        System.out.println("-------------------------------------------------------");
        System.out.println("Resultado:"+ D);
    }
    
}
