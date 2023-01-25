public class OperadorInstanceOfAbstractos {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase string";
        Number num = 10; //AutoBoxing

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String  = " + b1);
        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer  = " + b1);
        b1 = texto instanceof Object; // Toda clase hereda de Object
        System.out.println("texto es del tipo Object  = " + b1);
        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer  = " + b1);
        b1 = num instanceof Number; //El generico es Number
        System.out.println("num es del tipo Number  = " + b1);
        b1 = num instanceof Long; //El generico es Number
        System.out.println("num es del tipo Long  = " + b1);
        b1 = num instanceof Object; //El generico es Number
        System.out.println("num es del tipo Object  = " + b1);
    }
}
