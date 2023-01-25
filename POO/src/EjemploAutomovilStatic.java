//import java.sql.SQLOutput;
//import java.util.Date;
//
//public class EjemploAutomovilStatic {
//    public static void main(String[] args) {
//        Automovil subaru = new Automovil("Subaru","Impreza");
//        subaru.setCilindrada(2.0);
//        subaru.setColor(Color.BLANCO);
//        subaru.setTipo(TipoAutomovil.HATCHBACK);
//        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,3.0d);
//        mazda.setTipo(TipoAutomovil.PICKUP);
//        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,3.5d,50);
//        nissan.setTipo(TipoAutomovil.PICKUP);
//        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,3.5d,50);
//        nissan.setTipo(TipoAutomovil.PICKUP);
//
//        Automovil auto = new Automovil();
//        //Las siguientes lineas hacen lo mismo , pero se cambia para todos porque es static
////        Automovil.colorPatente = "Verde";
////        nissan2.colorPatente = "Rerde";
//        //Como es private ahora no se puede modificar , solo con un set
//        Automovil.setColorPatente(Color.AZUL);
//        System.out.println("Auto.getColorPatente = "+Automovil.getColorPatente());
//        System.out.println(subaru.detalle());
//        System.out.println(mazda.detalle());
//        System.out.println(nissan.detalle());
//        System.out.println(nissan2.detalle());
//        System.out.println("Kilometros por liegros = "+Automovil.calcularConsumoStatic(300,60));//Todos los obj tendran el mismo valor
//
//        System.out.println("Velocidad Maxima Carretera "+Automovil.VELOCIDAD_MAX_CARRETERA);
//        System.out.println("Velocidad Maxima Ciudad" +Automovil.VELOCIDAD_MAX_CIUDAD);
//
//        TipoAutomovil tipoSubaru = subaru.getTipo();
//        System.out.println("tipo subaru "+tipoSubaru.getNombre());
//        System.out.println("tipo subaru "+tipoSubaru.getDescripcion());
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//}
