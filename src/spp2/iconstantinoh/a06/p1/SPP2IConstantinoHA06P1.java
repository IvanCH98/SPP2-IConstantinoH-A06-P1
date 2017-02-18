/* //Iván Constantino Hernández A01411529 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstantinoh.a06.p1;
import java.util.Scanner;
/**
 *
 * @author ivana
 */
public class SPP2IConstantinoHA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num=0, suma = 0;
     
        while(num>=0){
            try{
                 num=solicitardatos(); 
            suma= calcularsuma(num,suma);
           
        }
            catch (Exception e){
                System.out.println("No ingresaste un valor válido");
                
            }
        }
        System.out.println("La suma de los números positivos es: "+suma);
          
}
    static double solicitardatos(){
        Scanner key = new Scanner (System.in);
        double numero;
        System.out.println("Teclea un número positivo: ");
        numero=key.nextDouble();
        return numero;
    }

    static double calcularsuma(double num, double suma){
        suma=suma+num;
        return suma;
    }

}
