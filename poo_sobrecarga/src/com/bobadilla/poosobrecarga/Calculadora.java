package com.bobadilla.poosobrecarga;

public class Calculadora {

    public int sumar(int... argumentos){//Es un arreglo
//        int a = argumentos[0];
        int total = 0;
        for(int numero: argumentos){
            total+=numero;
        }
        return total;
    }
    public float sumar(float a,int... argumentos){//Es un arreglo
        float total = a;
        for(int numero: argumentos){
            total+=numero;
        }
        return total;
    }

    public int sumar(int a,int b){
        return a+b;
    }

    public float sumar(float a, float b){
        return a+b;
    }

    public float sumar(int a, float b){
        return a+b;
    }

    public float sumar(float a, int b){
        return a+b;
    }

    public double sumar(double a,double b){
        return a+b;
    }

    public int sumar(String a, String b ){
        int resultado;
        try{
            resultado =  Integer.valueOf(a)+Integer.valueOf(b);
        }catch(NumberFormatException e){
            resultado = 0;
        }
        return  resultado;
    }

    public int sumar(int a,int b,int c){
        return a+b+c;
    }











}
