/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeroscomplejos;

/**
 *
 * @author Dell
 */
public class NumerosComplejos {

    public static void main(String[] args) {
        NumeroComplejo num1 = new NumeroComplejo();
        NumeroComplejo num2 = new NumeroComplejo();
        num1.cargar("-6+4i");
        System.out.println("Numero complejo: " + num1.mostrar());
        num2.cargar("-11-1i");
        System.out.println("Numero complejo: " + num2.mostrar());
        String resultadoSuma = num1.suma(num2);
        System.out.println("El resultado es: " + resultadoSuma);
    }
}
