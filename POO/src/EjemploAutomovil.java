import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Date fecha = new Date();
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO,new Motor(3.0,TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        Automovil nissan = new Automovil("Nissan","Navara",Color.GRIS,new Motor(4.0,TipoMotor.DIESEL),new Estanque(50));

        Automovil nissan2 = new Automovil("Nissan","Navara",Color.GRIS,new Motor(3.5,TipoMotor.BENCINA),new Estanque(50));
        System.out.println("Son iguales? "+(nissan == nissan2));
        System.out.println("Son iguales con equals sobreescrito? "+(nissan.equals(nissan2) ));
        Automovil auto = new Automovil();
        System.out.println("Validando errores en auto"+(auto.equals(nissan2)));
        System.out.println("Validando Distintos Objetos "+(auto.equals(fecha)));
        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(mazda.getFabricante());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro "+subaru.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro "+subaru.calcularConsumo(300,75));
        System.out.println();
        System.out.println(nissan);
    }











}
