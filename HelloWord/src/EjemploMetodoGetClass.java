import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";
        Class strClass = texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName()); //Todo el package
        System.out.println("strClass.getName() = " + strClass.getSimpleName());//Solo el nombre
        System.out.println("strClass.getName() = " + strClass.getPackageName()); // Regresa solo el nombre de package
        System.out.println("strClass.getName() = " + strClass); //Regresa el nombre de la instancia
        for(Method method: strClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }
    }
}
