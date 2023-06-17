/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;



/**
 *
 * @author Sneha Umachagi
 */
public class ConnectionProvider {
  
     
    public static Connection getCon(){
     
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","kimnamjoon");
            Statement st = con.createStatement();
            return con;
        }
        catch(Exception e){
            return null;
        }
        
        
            
    }

  // Statement createStatement() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    
    
}



