public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Iniciamos el método main con i = " + i);
        cambiarValor(i);
        System.out.println("El valor no se modifico dentro de main i = " + i);
    }

    public static void cambiarValor(int i ){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 20;
        System.out.println("Modificamos el valor con i = " + i);
    }

}
