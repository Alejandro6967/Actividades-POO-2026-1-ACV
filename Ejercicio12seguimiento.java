package com.mycompany.actividadespoo.acv;
public class Ejercicio12seguimiento {
    
    //inician los metodos
    public static double calcular_Completo(double Horas, double Salario){
        double Completo = Horas * Salario;
        return Completo;
    }
    
    public static double calcular_Retencion(double Completo, double Retencionporcentaje){
        double Retencion = Completo * Retencionporcentaje;
        return Retencion;
    }

    public static double calcular_Neto(double Completo, double Retencion){
        double Neto = Completo - Retencion;
        return Neto; //Se guarda 
    }
    
    public static void main(String[] args) {
       double Completo, Horas, Neto, Retencionporcentaje, Salario, Retencion;    
       Horas=48;
       Salario=5000;
       Retencionporcentaje=(12.5/100);
       
        Completo = calcular_Completo(Horas, Salario);
        Retencion = calcular_Retencion(Completo, Retencionporcentaje);
        Neto = calcular_Neto(Completo, Retencion);

        System.out.println("El salario completo es: " +(int) Completo);
        System.out.println("La Retencion es: " + (int)Retencion);
        System.out.println("El salario Neto es: " + (int)Neto); 
    }
}
