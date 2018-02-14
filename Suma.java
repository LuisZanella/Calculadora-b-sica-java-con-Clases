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
public class Suma extends Calculadora{
       public Suma(double n1,double n2)
        {
            super(n1,n2,'+');
          this.res=n1+n2;
        }
}
