public class ConversionTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numero = Integer.parseInt(numeroStr);
        System.out.println("numero = " + numero);
        //Todos los wrappers permiten hacer un parseo
        
        String realStr = "98656.47e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
        
        

    }
}
