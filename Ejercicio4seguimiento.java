package com.mycompany.actividadespoo.acv; //encontrar el archivo
import java.util.Scanner; // Importamos para pedir datos

public class Ejercicio4seguimiento { //este es el programa general
    
    //inician los metodos, //trae a juan y opera y usa la caja vacía para guardar el resultado
    public static int calcular_edadalberto(int edadjuan) {
        int edadalberto = 2 * edadjuan / 3;
        return edadalberto;//Se guarda en la caja de edadalberto.
    }
    public static int calcular_edadana(int edadjuan) {
        int edadana = 4 * edadjuan / 3;
        return edadana;
    }   
    public static int calcular_edmama(int edadjuan, int edadalberto, int edadana) {
        int edadmama = edadjuan + edadalberto + edadana;
        return edadmama;
    }
    
    public static void main (String[] args) {
        
        //inicio
        int edadjuan, edadalberto, edadana, edadmama; //Crea cajas para #con deci, vacías para agregarles datos
        
        Scanner entrada_teclado = new Scanner(System.in); //para recibir cosas del teclado
        System.out.println("Ingrese la edad de Juan:"); // pedimos al usuario la edad juan
        edadjuan = entrada_teclado.nextInt(); // espera a que escribas el número y des Enter
        
        edadalberto = calcular_edadalberto(edadjuan);
        edadana = calcular_edadana(edadjuan);
        edadmama = calcular_edmama(edadjuan, edadalberto, edadana);
        
        System.out.println("La edad de Juan es: " + edadjuan); //El signo de (+) aquí no está está pegando (concatenandolos)
        System.out.println("La edad de Alberto es: " + edadalberto);
        System.out.println("La edad de Ana es: " + edadana);
        System.out.println("La edad de la Mama es: " + edadmama);
    }
}
//cierra