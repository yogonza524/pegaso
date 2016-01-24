/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.business;

import com.core.enums.IMCLeyend;
import com.core.enums.Sexo;
import java.lang.reflect.Method;

/**
 *
 * @author Gonza
 */
public class Peso {
    
    /*
    Peso básico para el cálculo de Hamwi para hombres
    */
    private static final Double PESO_BASICO_HOMBRE = 47.7;
    /*
    Peso básico para el cálculo de Hamwi para mujeres
    */
    private static final Double PESO_BASICO_MUJER = 45.5;

    /**
     * La ecuación de Hamwi se utiliza para obtener el peso ideal de una persona
       en función del sexo y la altura
     * @param altura Altura de la persona en centimetros
     * @param sexo Masculino o Femenino
     * @return
     */

    public static Double hamwi(Double altura, Sexo sexo){
        if (altura != null && altura > 0.0 && sexo != null) {
            Double pesoBasico = PESO_BASICO_HOMBRE;
            if (sexo.equals(Sexo.FEMENINO)) {
                pesoBasico = PESO_BASICO_MUJER;
            }
            return ((altura - 150.0) * 272/250 + pesoBasico);
        }
        return null;
    }
    
    /**
     * Ecuación para calcular el peso ideal de una persona en función
     * de su altura
     * @param altura Altura de la persona en centimetros
     * @return El peso ideal según Brocca
     */
    public static Double brocca(Double altura){
        if (altura != null && altura > 0.0) {
            Double peso = (altura - 100);
            if (peso > 0.0) {
                return peso;
            }
        }
        return null;
    }
    
    /**
     * Ecuación de Lorentz para calcular el peso ideal
     * @param altura Altura en centimetros
     * @param sexo Sexo Masculino o Femenino
     * @return Cálculo del peso ideal segun Lorentz
     */
    public static Double lorentz(Double altura, Sexo sexo){
        if (altura != null && altura > 0.0 && sexo != null) {
            Integer k = 4;
            if (sexo.equals(Sexo.FEMENINO)) {
                k = 2;
            }
            return ((altura - 100) - (altura -150)/k);
        }
        return null;
    }
    
    /**
     * Indice de Masa Corporal: Es una medida cuantitativa que sirve para
     * clasificar la relación de peso y altura de una persona
     * @param altura Altura en centimetros
     * @param peso Peso en Kilogramos
     * @return Double Retorna un valor mayor a cero
     */
    public static Double IMC(Double altura, Double peso){
        if (altura != null && peso != null && altura > 0.0 && peso > 0.0) {
            System.out.println("\nMétodo: IMC");
            System.out.println("Peso: " + peso);
            System.out.println("Altura: " + altura);
            System.out.println("Altura al cuadrado: " + Math.pow((altura/100.0), 2));
            System.out.println("ICM: " + peso / (Math.pow((altura/100.0), 2)));
            return (peso / (Math.pow((altura/100.0), 2)));
        }
        return null;
    }
    
    /**
     * Obtiene una leyenda en función del IMC (Delgadez, Peso normal, etc)
     * @param peso Peso de la persona en Kilogramos
     * @param altura Altura de la persona en Centimetros
     * @return null | Delgadez Severa | Delgadez moderada | Delgadez aceptable |
     * Peso normal | Sobrepeso | Obesidad Tipo I | Obesidad Tipo II | 
     * Obesidad Tipo III
     */
    public static String IMCResult(Double peso, Double altura){
        String imcLeyend = null;
        System.out.println("Método: IMCResult");
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        if (peso != null && altura != null) {
            Double imc = IMC(altura, peso);
            if (imc != null) {
                if (imc < 16.0) {
                    imcLeyend = IMCLeyend.DELGADEZ_SEVERA.toString();
                }
                else{
                    if (imc >= 16.0 && imc < 16.99) {
                        imcLeyend = IMCLeyend.DELGADEZ_MODERADA.toString();
                    }
                    else{
                        if (imc >= 17.0 && imc < 18.49)  {
                            imcLeyend = IMCLeyend.DELGADEZ_ACEPTABLE.toString();
                        }
                        else{
                            if (imc >= 18.5 && imc < 24.99) {
                                imcLeyend = IMCLeyend.PESO_NORMAL.toString();
                            }
                            else{
                                if (imc > 25.0 && imc < 29.99) {
                                    imcLeyend = IMCLeyend.SOBREPESO.toString();
                                }
                                else{
                                    if (imc > 30.0 && imc < 34.99) {
                                        imcLeyend = IMCLeyend.OBESIDAD_TIPO_I.toString();
                                    }
                                    else{
                                        if (imc > 35.0 && imc < 39.99) {
                                            imcLeyend = IMCLeyend.OBESIDAD_TIPO_II.toString();
                                        }
                                        else{
                                            imcLeyend = IMCLeyend.OBESIDAD_TIPO_III.toString();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return imcLeyend;
    }
}
