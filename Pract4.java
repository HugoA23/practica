/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pract4;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class Pract4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Pesos = new Scanner(System.in);
        System.out.println("Dame la cantidad en pesos: ");
        int pesos = Pesos.nextInt();
        Pesos.close();
        double Dolar = pesos/17;
        double Euro = pesos/18;
        System.out.println("Tu cantidad en dolares es: "+ Dolar);
        System.out.println("Tu cantidad en Dolares es: "+ Dolar);
        // TODO code application logic here
    }
    
}
