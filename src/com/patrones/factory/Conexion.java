/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.patrones.factory;

/**
 *
 * @author Hugo
 */
//se encrgara de realizar las conexiones a las  BD
public abstract class Conexion {
    
    public Conexion(){
        
    }
    
    public String descripcion(){
        return "Conexion generica";
    }
    
}
