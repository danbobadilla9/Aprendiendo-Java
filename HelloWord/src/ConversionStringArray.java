public class ConversionStringArray {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";//Todos los arreglos son una instancia(Objeto) de referencia
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());//Al imprimir esto imprime el has(identificador del objeto)
        char[] arregloChar = trabalenguas.toCharArray();
        for(int i = 0; i< arregloChar.length ; i++){
            System.out.println(arregloChar[i]);
        }
        System.out.println("trabalenguas = " + trabalenguas.split("a"));


    }
}
