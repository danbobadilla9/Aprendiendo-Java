import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero");
        //String mensaje = scanner.nextLine();
        //int numeroDecimal = Integer.valueOf(mensaje);
        int numeroDecimal = scanner.nextInt();
        //Convirtiendo 100 a diferente tipos
        System.out.println("numeroDecimal = " + numeroDecimal);
        //De esta manera se convierte a binario pero lo regresa en string
        System.out.println("numero binario de  = " + numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal));
        //Ahora en lugar de recibirlo como string sera de manera int, con 0b el compilador de java lo interpreta como un sistema binario
        int numeroBinario = 0b1100100;
        System.out.println("numeroBinario = " + numeroBinario);//Lo muestra como decimal pero es un binario

        //Sistema octal

        System.out.println("numero octal de  = " + numeroBinario+" = "+ Integer.toOctalString(numeroDecimal));

        //Ahora almacenamos un octal en un int anteponiendo el prefijo 0
        int numeroOctal = 0144;
        System.out.println("numeroOctal = " + numeroOctal);//Muestra 100

        //SISTEMA HEXADECIMAL
        System.out.println("numero hexadecimal de  = " + numeroDecimal+" = "+Integer.toHexString(numeroDecimal));
        
        //Almacenando el hexadecimal con el prefijo 0x
        
        int numeroHex = 0x64;
        System.out.println("numeroHex = " + numeroHex);
        System.out.println("numero binario de  = " + numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal));




    }
}
