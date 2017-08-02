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
            public class Monteur{
             String URL = "jdbc:mysql://localhost:8889/db_monteur";
             String USERNAME = "root";
             String PASSWORD = "root";

             Connection connection = null;
             PreparedStatement selectMonteur = null;
             ResultSet resultSet = null;

             public Monteur(){
             try {
                     connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

                     selectMonteur = connection.prepareStatement(
                        "SELECT * FROM monteur");
                 } catch (SQLException e) {
                 }
            }

            public ResultSet getMonteurs(){
                try {
                        resultSet = selectMonteur.executeQuery();
                    } catch (SQLException e) {
                    }
                    return resultSet;
            }
}
            
      
