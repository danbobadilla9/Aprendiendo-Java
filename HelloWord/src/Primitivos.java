public class Primitivos {
    public static void main(String[] args) {
       byte numeroByte = 127; // 8 bits entero mas pequeño de java
        System.out.println("numeroByte = " + numeroByte);
        //Como saber la maxima cantidad que soporta el primitivo byte
        System.out.println("Tipo byte corresponde a byte a "+ Byte.BYTES);
        System.out.println("Tipo byte corresponde a bits a "+ Byte.SIZE);
        System.out.println("Valor maximo de un byte "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte "+Byte.MIN_VALUE);

        short numeroShort = 30000; // 16 bits entero mas pequeño de java
        System.out.println("numeroShort = " + numeroShort);
        //Como saber la maxima cantidad que soporta el primitivo byte
        System.out.println("Tipo byte corresponde a byte a "+ Short.BYTES);
        System.out.println("Tipo byte corresponde a bits a "+ Short.SIZE);
        System.out.println("Valor maximo de un byte "+Short.MAX_VALUE);
        System.out.println("Valor minimo de un byte "+Short.MIN_VALUE);

        var numeroVar = 127;

    }
}
