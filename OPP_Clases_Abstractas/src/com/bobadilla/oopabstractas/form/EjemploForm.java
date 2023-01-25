package com.bobadilla.oopabstractas.form;

import com.bobadilla.oopabstractas.form.elementos.*;
import com.bobadilla.oopabstractas.form.elementos.select.Opcion;
import com.bobadilla.oopabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("userame");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave","password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));
        InputForm email = new InputForm("email","email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad","number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1","Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","Python"))
                .addOpcion(new Opcion("3","JavaScript").setSelected())
                .addOpcion(new Opcion("4","TypeScript"))
                .addOpcion(new Opcion("5","PHP"));
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\""+this.valor+"\"";
            }
        };
        saludar.setValor("Hola que tal este campo esta deshabilitado");
        username.setValor("");
        password.setValor("isra");
        email.setValor("danbobadilla9hotmail.com");
        edad.setValor("28l");
        experiencia.setValor(" djld kfsa X");
//        java.setSelected(true);

        List<ElementoForm> elementos = new ArrayList<>();
        //Otra manera de aggregar los elementos es utilizando Arrays ya que crea un ArrayList por debajo
//        List<ElementoForm> elementos2 =  Arrays.asList(username,password);

        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);
        for(ElementoForm e: elementos){
            System.out.println(e.dibujarHtml());
        };
        elementos.forEach( e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
//                e.getErrores().forEach(err -> System.out.println(e.getNombre()+" : "+err));
            }
        });

        //Otra manera de iterar
//        elementos.forEach( e -> {System.out.println(e.dibujarHtml());});












































    }
}
