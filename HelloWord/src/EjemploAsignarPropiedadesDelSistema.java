import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema{
    public static void main(String[] args) {
        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");//Procesa los bytes
            Properties p = new Properties(System.getProperties()); //Cargamos la configuracion de sistema
            p.load(archivo);//Cargamos las propiedades que creamos
            p.setProperty("mi.propiedad.perosonalizada","Mi valor guardado en un obeto properties");
            System.setProperties(p);
            System.getProperties().list(System.out);

        }catch (Exception e){
            System.out.println("e = " + e);
        }
    }
}