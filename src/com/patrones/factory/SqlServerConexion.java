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
public class SqlServerConexion extends Conexion {
    public SqlServerConexion(){}
    
    @Override
    public String descripcion(){
        return "Conexion a SqlServer";
    }
}
