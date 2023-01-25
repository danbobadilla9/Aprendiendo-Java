public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 2833;
        //Integer intObjeto = new Integer(1292183); Esta forma esta deprecada
        Integer intObjeto = Integer.valueOf(intPrimitivo); //Esta forma es la correcta -- Forma explicita Boxing
        Integer intObjeto2 = 2833; //AutoBoxing implicita
        System.out.println("intObjeto2 = " + intObjeto2);
        intPrimitivo = intObjeto.intValue(); //Convertimos el Wrapper a int forma explicita
        int num = intObjeto2; //Forma implicita
        System.out.println("num = " + num);
        //AUTOBOXINGINTEGER
        //Trata de convertir un primitivo a wrapper de manera automatica
        Integer[] enteros = {1,2,3,4,5}; // Esto ya es autoboxing porque no utizamos Wrapper.valueOf(primitivo)
        int suma = 0; //Sumar los valors pares
        for(Integer i: enteros){
            /*if(i.intValue() % 2 == 0){
                suma+= i.intValue();
            }*/ //Forma explicita
            if(i % 2 == 0){ // Forma automatica se hace un autounboxing
                suma+= i;
            }
        }
        System.out.println("suma = " + suma);
        //Comparando objetos
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Son el mismo objeto"+(num1 == num2));
        num2 = 1000;
        System.out.println("Son el mismo objeto"+(num1 == num2));//Compara referencia
        System.out.println("Son el mismo objeto"+(num1.equals(num2)));//Compara valor
















    }
}
