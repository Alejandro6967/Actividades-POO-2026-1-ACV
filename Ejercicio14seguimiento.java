package com.mycompany.actividadespoo.acv;
import java.util.Scanner; // Importamos para pedir datos
public class Ejercicio14seguimiento {

        //inician los metodos
    public static double calcular_Cuadrado(double Numero){
        double Cuadrado = Math.pow(Numero, 2);
        return Cuadrado;
    }
    public static double calcular_Cubo(double Numero){
        double Cubo = Math.pow(Numero, 3);
        return Cubo;
    }
    
    public static void main(String[] args) {
    double Numero, Cubo, Cuadrado;
    
    Scanner entrada_teclado = new Scanner(System.in); //para recibir cosas del teclado
    System.out.println("Ingrese el numero:"); // pedimos al usuario la edad juan
    Numero = entrada_teclado.nextDouble(); // espera a que escribas el número y des Enter
    
    Cubo = calcular_Cubo(Numero);
    Cuadrado = calcular_Cuadrado(Numero);
            
    System.out.println("El Cuadrado del numero es: " + Cuadrado);
    System.out.println("El Cubo del numero es: " + Cubo);
    }
}
