package com.mycompany.actividadespoo.acv;
public class Ejercicio5seguimiento {

    public static void main(String[] args) {
        double Suma, X, Y;
        Suma = 0;
        X = 20;
        Y = 40;
        
        Suma = Suma + X;
        X = X+Math.pow(Y,2);
        
        System.out.println("El valor de X es " + X);
        System.out.println("El valor de Y es " + Y);
        System.out.println("El valor de Suma es " + Suma);
    }  
}
