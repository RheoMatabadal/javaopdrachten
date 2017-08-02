
<%@page import="com.monteur.jsp.*"%>
<%@page import="java.sql.*" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Page</title>
    </head>
    <body>
        <h1>Data added</h1>
        
        
        
        <%!
                        public class Monteur{
                         String URL = "jdbc:mysql://localhost:3306/db_monteur";
             String USERNAME = "root";
             String PASSWORD = "root";

             Connection connection = null;
             PreparedStatement insertMonteur = null;
             ResultSet resultSet = null;


             public Monteur(){
             try {
                     connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

                     insertMonteur = connection.prepareStatement(
                        "INSERT INTO monteur (naam,familienaam) VALUES (?,?)");
                    
                 } catch (SQLException e) {
                 }
            }
            
            public int setMonteur (String naam, String fam_naam){
                int result  = 0;
                
                try {
                        insertMonteur.setString(1, naam); // Eerste value prep statement
                        insertMonteur.setString(2, fam_naam); // Tweede value prep statement
                        result = insertMonteur.executeUpdate(); //Query execute
                    } catch (Exception e) {
                    }
                    return result;
            }
}
   
        %>
       
        <%
            int result = 0;
            

            String naam = new String();
            String fam_naam = new String();
            
            if(request.getParameter("naam") != null){
                naam = request.getParameter("naam");
            }
            if(request.getParameter("fam_naam") != null){
                fam_naam = request.getParameter("fam_naam");
            }
            
            Monteur monteur = new Monteur();
            result = monteur.setMonteur(naam, fam_naam);
            response.sendRedirect("monteur.jsp");
        %>
                
    </body>
</html>
