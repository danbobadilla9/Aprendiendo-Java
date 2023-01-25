import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        String hombe = System.getProperty("user.home");
        System.out.println("hombe = " + hombe);
        String worksapece = System.getProperty("user.dir");
        System.out.println("worksapece = " + worksapece);
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
