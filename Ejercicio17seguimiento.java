package com.mycompany.actividadespoo.acv;
import java.util.Scanner; // Importamos para pedir datos

public class Ejercicio17seguimiento {
    
    public static double calcular_Area(double Radio){
        double Area = Math.PI*Math.pow(Radio, 2);
        return Area;
    }
    
    public static double calcular_Circunferencia(double Radio){
        double Circunferencia = Radio*2*Math.PI;
        return Circunferencia;
    }

    public static void main(String[] args) {
        double Radio, Area, Circunferencia;
        
    Scanner entrada_teclado = new Scanner(System.in); //para recibir cosas del teclado
    System.out.println("Ingrese el Radio del circulo:"); // pedimos al usuario la edad juan
    Radio = entrada_teclado.nextDouble(); // espera a que escribas el número y des Enter
    
    Area = calcular_Area(Radio);
    Circunferencia = calcular_Circunferencia(Radio);
    
    System.out.println("El Area del circulo es: " + Area);
    System.out.println("La Circunferencia del circulo es: " + Circunferencia);
    }
}
