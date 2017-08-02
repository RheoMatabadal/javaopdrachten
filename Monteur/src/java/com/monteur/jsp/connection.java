/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monteur.jsp;
import java.sql.*;

/**
 *
 * @author shayantsital
 */
public class connection {
    
    public Connection conn() throws SQLException{
        
             String URL = "jdbc:mysql://localhost:3306/monteur";
             String USERNAME = "root";
             String PASSWORD = "root";

             connection connection = null;
             PreparedStatement selectMonteur = null;
             ResultSet resultSet = null;
             
             connection = (connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
        
             return (Connection) connection;

}
   
}

