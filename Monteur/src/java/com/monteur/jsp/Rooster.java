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
            public class Rooster{
             String URL = "jdbc:mysql://localhost:3306/monteur";
             String USERNAME = "root";
             String PASSWORD = "root";

             Connection connection = null;
             PreparedStatement selectRooster = null;
             ResultSet resultSet = null;

             public Rooster(){
             try {
                     connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

                     selectRooster = connection.prepareStatement(
                        "SELECT * FROM rooster JOIN monteur ON rooster.monteur = monteur.id JOIN filiaal ON rooster.filiaal = filiaal.id");
                 } catch (SQLException e) {
                 }
            }

            public ResultSet getRoosters(){
                try {
                        resultSet = selectRooster.executeQuery();
                    } catch (SQLException e) {
                    }
                    return resultSet;
            }
}
