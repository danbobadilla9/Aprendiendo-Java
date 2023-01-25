import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = Integer.valueOf(JOptionPane.showInputDialog(null,"Ingrese un numero entero"));
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

        JOptionPane.showMessageDialog(null,"numero binario de  = " + numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal));
        



    }
}
