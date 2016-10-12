/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p2;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double b,c,d;
        int a = pedirMetros();
        b = calcularYardas(a);
        c = calcularPies(a);
        d = calcularMillas(a);
        mostrarResultados(b,c,d,a);
    }
    public static int pedirMetros(){
        int metros;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el año:");
        metros = entrada.nextInt();
        return metros;
    }
    public static double calcularYardas (double m){
        double yardas = m * 1.09361;
        return yardas;
    }
    public static double calcularPies (double m){
        double pies = m / 3.28;
        return pies;
    }
    public static double calcularMillas (double m){
        double millas = m * 0.000621371;
        return millas;
    }
    public static void mostarResultados (double y, double p, double mi, int a){
        System.out.println("Los metros que introdujo son equivalentes a " +y +" yardas, a " +p +" pies y a " +mi +" millas.");
    }
}
