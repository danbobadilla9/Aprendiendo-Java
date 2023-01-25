package com.bobadilla.oopabstractas.form.elementos;

import com.bobadilla.oopabstractas.form.validador.LargoValidador;
import com.bobadilla.oopabstractas.form.validador.Validador;
import com.bobadilla.oopabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

//No se puede instanciar la clase
abstract public class ElementoForm { //Si un metodo es abstract la clase debe de ser abstract y puede tener metodos que no sean abstracts
    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor){
        this.valor=valor;
    }

    abstract public String dibujarHtml();

    public ElementoForm addValidador( Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public boolean esValido(){
        for(Validador v: validadores){
            if(!v.esValido(this.valor)){
//                if(v instanceof LargoValidador){
                if(v instanceof MensajeFormateable){
//                    this.errores.add(((LargoValidador) v).getMensajeFormateado(nombre));
                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(nombre));
                }else{
                this.errores.add(String.format(v.getMensaje(),nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    public String getNombre() {
        return nombre;
    }
}
