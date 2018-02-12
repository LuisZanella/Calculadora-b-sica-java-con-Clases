/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zcle_01;
import java.util.Scanner;
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
        Scanner console = new Scanner(System.in);
        String sTexto;
        String[] split;
        String delimitador = "((?<=%1$s)|(?=%1$s))";
            sTexto = console.next();
            split = sTexto.split(String.format(delimitador,"\\-|\\*|\\^|\\/|\\+"));
            for(int i=0;i<split.length;i=i+3){
                if((split[i+1])!=null)
                {
                    switch (split[i+1]){
                        case "-":
                            Resta res= new Resta(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));
                            res.imprimirResultado();
                            break;
                        case "+":
                            Suma sum= new Suma(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));                            
                            sum.imprimirResultado();
                            break;
                        case "*":
                            Multiplicacion mul= new Multiplicacion(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));                  
                            mul.imprimirResultado();
                            break;
                        case "/":
                            Division div= new Division(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));                            
                            div.imprimirResultado();
                            break;
                        case "^":
                            Potencia pot= new Potencia(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));
                            pot.imprimirResultado();
                            break;
                    }
                } 
            }
    }
    
}
