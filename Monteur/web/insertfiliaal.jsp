
<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            body{
                x-overflow: false;
            }
        </style>
    </head>
    <body>
        <%!
                        public class Filiaal{
             String URL = "jdbc:mysql://localhost:3306/db_monteur";
             String USERNAME = "root";
             String PASSWORD = "root";

             Connection connection = null;
             PreparedStatement insertFiliaal = null;
             PreparedStatement filiaalCount = null;
             ResultSet resultSet = null;

             public Filiaal(){
             try {
                     connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

                     insertFiliaal = connection.prepareStatement(
                        "INSERT INTO filiaal (locatie,monteur) VALUES (?,?)");
                 } catch (SQLException e) {
                 }
            }
            
            public int setFilial (String locatie, String monteur){
                int result  = 0;
                
                try {
                        insertFiliaal.setString(1, locatie); // Eerste value prep statement
                        insertFiliaal.setString(2, monteur); // Tweede value prep statement
                        result = insertFiliaal.executeUpdate(); //Query execute
                    } catch (SQLException e) {
                    }
                    return result;
            }
}
   
        %>
       
        <%
            
            int result = 0;
            
            
            String locatie = new String();
            String monteur = new String();
            
            if(request.getParameter("locatie") != null){
                locatie = request.getParameter("locatie");
            }
            if(request.getParameter("monteur") != null){
                monteur = request.getParameter("monteur");
            }
            
            Filiaal filiaal = new Filiaal();
            result = filiaal.setFilial(locatie, monteur);
            response.sendRedirect("filiaal.jsp");
            
        %>
    </body>
</html>
