/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ConexionMySQL {
    private static Connection con=null;
    private static final String URL="jdbc:mysql://localhost/catalogo?useSSL=false";
    private static final String USER="root";
    private static final String PASS="12345";
    
    public static Connection Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
           
        } catch (Exception e) {
            System.out.println("Error"+e);
           
        }
        return con;
    }
    
    public void Close()throws Exception{
        if(this.con!=null){
            try {
                this.con.close();
            } catch (SQLException esql) {
                JOptionPane.showMessageDialog(null, esql.getMessage());
            }
        }
    }
      
}
