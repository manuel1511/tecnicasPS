/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Conexion_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Admin
 */
public class Database {
    
   public static  Connection conexion(){ 
          try {
                Class.forName("oracle.jdbc.OracleDriver");
                String myDB= "jdbc:oracle:thin:@localhost:1521:XE";
                String usuario="TECNICAS";
                String password="proyecto12";
                
             Connection cnx =DriverManager.getConnection(myDB, usuario, password);
             return cnx;
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            } catch (ClassNotFoundException ex){
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
      return null;
        
    } 
}
