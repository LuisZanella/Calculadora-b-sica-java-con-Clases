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
    double res=0;
    char operador;
        public Calculadora(double _n1, double _n2, char _operador){
        this.num1=_n1;
        this.num2=_n2;
        this.operador=_operador;
        }
        public void imprimirResultado()
        {
          System.out.println(
                  this.num1+" "+this.operador+" "+this.num2+" = "+this.res
                            );
        };
        };

