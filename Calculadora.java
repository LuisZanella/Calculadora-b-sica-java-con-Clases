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
public class Calculadora {
    double num1;
    double num2;
    double res;
    String operador;
    public double sumar(){
        res=num1+num2;
        return res;
    };
    public double potencia(){
        res=1;
    for (int contador=0;contador<num2;contador++){
        res*=num1;
    }
    return res;
    };
}
