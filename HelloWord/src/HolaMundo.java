public class HolaMundo {
    public static void main(String[] args) {
        String name = "Hola Mundo desde java ";
        System.out.println(name);
        System.out.println("name.toUpperCase() = " + name.toUpperCase());

        int numero = 10;
        Integer numero2 = 10;
        //Datos primitivos no tienen metodos
        numero2.byteValue();
        System.out.println("numero = " + numero);
        //En JDK10 ya se pueden crear variables dinamicas
        var numero3 = 15;
        System.out.println("numero3 = " + numero3);
        System.out.println(((Object)numero3).getClass().getSimpleName());
    }
}
