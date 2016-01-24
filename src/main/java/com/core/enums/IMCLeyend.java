/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.enums;

/**
 *
 * @author Gonza
 */
public enum IMCLeyend {
    DELGADEZ_SEVERA{
        
        @Override
        public String toString(){
            return "Delgadez Severa";
        }
    },
    DELGADEZ_MODERADA{
        
        @Override
        public String toString(){
            return "Delgadez Moderada";
        }
    },
    DELGADEZ_ACEPTABLE{
        
        @Override
        public String toString(){
            return "Delgadez aceptable";
        }
    },
    PESO_NORMAL{
        
        @Override
        public String toString(){
            return "Peso normal";
        }
    },
    SOBREPESO{
        
        @Override
        public String toString(){
            return "Sobrepeso";
        }
    },
    OBESIDAD_TIPO_I{
        
        @Override
        public String toString(){
            return "Obesidad Tipo I";
        }
    },
    OBESIDAD_TIPO_II{
        
        @Override
        public String toString(){
            return "Obesidad Tipo II";
        }
    },
    OBESIDAD_TIPO_III{
        
        @Override
        public String toString(){
            return "Obesidad Tipo III";
        }
    }
}
