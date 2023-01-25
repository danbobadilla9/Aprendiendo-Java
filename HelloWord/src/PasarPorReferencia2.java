class Persona{
        private String nombre = "Antes";

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return this.nombre;
        }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("Persona antes de modificar ->" + persona.getNombre());
        modificar(persona);
        System.out.println("Persona despues de modificar ->" + persona.getNombre());
    }
    public static void modificar(Persona persona){
        persona.setNombre("Dan");
    }
}
