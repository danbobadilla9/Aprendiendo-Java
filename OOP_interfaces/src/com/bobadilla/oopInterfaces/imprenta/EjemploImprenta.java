package com.bobadilla.oopInterfaces.imprenta;

import com.bobadilla.oopInterfaces.imprenta.modelo.*;
import static com.bobadilla.oopInterfaces.imprenta.modelo.Genero.*;
public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Resumen laboral ...",new Persona("dan","segundo"),"Ingeniero en sistemas");
        cv.addExperiencia("Java")
                .addExperiencia("CSS")
                .addExperiencia("Oracle DBA")
                .addExperiencia("React")
                .addExperiencia("Spring");

        Libro libro = new Libro(new Persona("Erich","Gamma"),"Patrones de diseños: Elem. Reusables OOP", PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe("Estudio sobre microservicios",new Persona("israel","bobadilla"),"israel");
        //ambos se pueden imprimir porque heredan de Hoja
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);//Obtendremos errores porque libro no extiende de la clase hoja, la interface soluciona este problema
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

}
