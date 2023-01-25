public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
         Runtime rt = Runtime.getRuntime();
         Process process;
         try{
             if(System.getProperty("os.name").startsWith("Windows")){
                 process = rt.exec("notepad");
             }else if(System.getProperty("os.name").startsWith("Mac")){
                process = rt.exec("textedit");
             }else{
                 process = rt.exec("gedit");
             }
             process.waitFor();
         }catch(Exception e ){
             e.printStackTrace();
         }
        System.out.println("Se ah cerrado el editor");
    }
}
