import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String,String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);
        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);
        String path = System.getenv("PATH");
        System.out.println("path = " + path);
        String path2 = varEnv.get("java_home");
        System.out.println("path2 = " + path2);
    }
}
