/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zcle_01;

/**
 *
 * @author Luis
 */
public class ZCLE_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora obj1= new Calculadora();
        double resultado=0;
        obj1.num1=5;
        obj1.num2=1;
        obj1.operador="+";
        
        resultado= obj1.sumar();
        System.out.println("El resultado es: :D: "+ resultado);
    }
    
}
