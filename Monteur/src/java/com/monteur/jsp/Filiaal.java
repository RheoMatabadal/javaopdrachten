package com.monteur.jsp;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shayantsital
 */
public class Filiaal {
             String URL = "jdbc:mysql://localhost:3306/monteur";
             String USERNAME = "root";
             String PASSWORD = "root";

             Connection connection = null;
             PreparedStatement selectFiliaal = null;
             ResultSet resultSet = null;

             public Filiaal(){
             try {
                     connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

                     selectFiliaal = connection.prepareStatement(
                        "SELECT * FROM filiaal");
                 } catch (SQLException e) {
                 }
            }

            public ResultSet getfiliaals(){
                try {
                        resultSet = selectFiliaal.executeQuery();
                    } catch (SQLException e) {
                    }
                    return resultSet;
            }
}

