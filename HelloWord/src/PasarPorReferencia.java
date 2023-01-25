public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10,11,12};
        System.out.println("edad = " + edad);
        for(int i = 0; i< edad.length; i ++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println(" Antes de llamar al metodo modificador");
        modificador(edad);
        System.out.println("Despues de llamar al metodo modificador");
        for(int i = 0; i< edad.length; i ++){
            System.out.println("edad[i] = " + edad[i]);
        }
    }
    public static void modificador(int[] edad){
        System.out.println("Iniciamos el metodo modificador");
        for(int i = 0; i< edad.length; i ++){
            edad[i] = edad[i] +20;
        }
        System.out.println("Termina el metodo modificador");

    }
}
