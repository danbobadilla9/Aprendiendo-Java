public class OperadorInstanceOf {
    // Permite saber si un objeto es una referencia de una clase o instancia ,interfaces y etc
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase string";
        Integer num = 10; //AutoBoxing
        
        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String  = " + b1);
        b1 = texto instanceof Object; // Toda clase hereda de Object
        System.out.println("texto es del tipo Object  = " + b1);
        b1 = num instanceof Integer;
        System.out.println("texto es del tipo Integer  = " + b1);
        b1 = num instanceof Number; //El generico es Number
        System.out.println("texto es del tipo Number  = " + b1);
        b1 = num instanceof Object; //El generico es Number
        System.out.println("texto es del tipo Object  = " + b1);
    }
}
