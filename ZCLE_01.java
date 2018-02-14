/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zcle_01;
import java.util.Scanner;
/**
 *Universidad De La Salle Bajio
 * Ingenieria en Sistemas y Software Computacionales
 * Alumno:Luis Edgar Zanella Contreras
 * Matricula:65402
 * Descripción:Calculadora
 * @author Luis
 */
public class ZCLE_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //ATENCION NO ESTA VALIDADO
        Scanner console = new Scanner(System.in);
        String sTexto;
        String[] split;
        String delimitador = "((?<=%1$s)|(?=%1$s))";
        double resultado;
        //Imprimir texto
            System.out.println("Introduzca una operación: ejemplo(2+3)o(2*2*2*5*6) y presione ENTER");
        //Recepcion de datos
            sTexto = console.next();
            split = sTexto.split(String.format(delimitador,"\\-|\\*|\\^|\\/|\\+"));
        //Llamar funcion y enviar el arreglo
            resultado=calculo(split);
        //Imprimir resultado de la funcion
            System.out.println(resultado);
    }
    public static double calculo(String []split){
                double resultado=0;
                    for(int i=0;i<split.length;i++){
                if(i-1>=0){
                    switch (split[i-1]){
                        case "-":
                            Resta res= new Resta(Double.parseDouble(split[i]),resultado);
                            resultado= res.res;
                            break;
                        case "+":
                            Suma sum= new Suma(Double.parseDouble(split[i]),resultado);                            
                            resultado= sum.res;
                            break;
                        case "*":
                            Multiplicacion mul= new Multiplicacion(Double.parseDouble(split[i]),resultado);                  
                            resultado=mul.res;
                            break;
                        case "/":
                            Division div= new Division(Double.parseDouble(split[i]),resultado);                            
                            resultado=div.res;
                            break;
                        case "^":
                            Potencia pot= new Potencia(Double.parseDouble(split[i]),resultado);
                            resultado=pot.res;
                            break;
                        default:
                            break;
                     
                    }
                }
                else{
                     switch (split[i+1]){
                        case "-":
                            Resta res= new Resta(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));
                            resultado= res.res;
                            break;
                        case "+":
                            Suma sum= new Suma(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));                            
                            resultado= sum.res;
                            break;
                        case "*":
                            Multiplicacion mul= new Multiplicacion(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));                  
                            resultado=mul.res;
                            break;
                        case "/":                         
                            Division div= new Division(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));                            
                            resultado=div.res;
                            break;
                        case "^":                         
                            Potencia pot= new Potencia(Double.parseDouble(split[i]),Double.parseDouble(split[i+2]));
                            resultado=pot.res;
                            break;
                        default:
                            break;
                    }
                     i=i+2;
                }
              }
    return resultado;
    };
    
}
