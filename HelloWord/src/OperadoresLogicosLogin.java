import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
//        String[] usernames = {"Dan","Israel"};
        String[] usernames = new String[2];
        usernames[0] = "Dan";
        usernames[0] = "Israel";
        String[] password = new String[2];
        password[0] = "12345";
        password[1] = "12345";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el username");
        String usuario = scanner.nextLine();
        System.out.println("Ingresa la contraseña");
        String contrasena = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(usuario) && password[i].equals(contrasena)){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            System.out.println("Bienvenido Usuario".concat(usuario).concat("!"));
        }else{
            System.out.println("Lo siento requiere autenticación");
        }



    }
}
