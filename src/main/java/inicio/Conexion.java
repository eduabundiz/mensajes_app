/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Conexion {
    public Connection getConnection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC","root","");
            if(conection!=null){
                System.out.println("Conexion exitosa");
            }
        } catch(SQLException e){
            System.out.println(e);
        }
        return conection;
    }
}
