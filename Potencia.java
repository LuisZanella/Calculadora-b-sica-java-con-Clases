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
public class Potencia extends Calculadora{
     public Potencia(double n1,double n2)
        {
            super(n1,n2,'^');
            this.res=1;
                for (int contador=0;contador<num2;contador++)
                {
                    this.res*=num1;
                }
        };
}
