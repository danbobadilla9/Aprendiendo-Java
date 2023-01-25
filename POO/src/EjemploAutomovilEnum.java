public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(45));

        TipoAutomovil tipoSubaru = subaru.getTipo();
        switch (tipoSubaru) {
            case CONVERTIBLE -> System.out.println("El auto es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utlitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("Es un automovil median compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano ");
            case STATION_WAGON -> System.out.println("Es un automovil mas grande, con maleta grande ");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for( TipoAutomovil tipo: tipos){
            System.out.println(tipo);
        }

    }











}
