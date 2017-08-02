

<%@page import="java.sql.*"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
               <%!
                        public class Rooster{
                         String URL = "jdbc:mysql://localhost:3306/db_monteur";
                            String USERNAME = "root";
                            String PASSWORD = "root";

             Connection connection = null;
             PreparedStatement insertRooster = null;
             ResultSet resultSet = null;


             public Rooster(){
             try {
                     connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

                     insertRooster = connection.prepareStatement(
                        "INSERT INTO rooster (filiaal,monteur) VALUES (?,?)");
                    
                 } catch (SQLException e) {
                 }
            }
            
            public int setRooster (Integer filiaal, Integer monteur){
                int result  = 0;
                
                try {
                        insertRooster.setInt(1, filiaal); // Eerste value prep statement
                        insertRooster.setInt(2, monteur); // Tweede value prep statement
                        result = insertRooster.executeUpdate(); //Query execute
                    } catch (Exception e) {
                    }
                    return result;
            }
}
   
        %>
       
        <%
            int result = 0;
            

            String monteur = new String();
            String filiaal = new String();
            
            int mon = 0;
            int fil = 0;
            
            if(request.getParameter("monteur") != null){
                monteur = request.getParameter("monteur");
                mon = Integer.parseInt(monteur);
            }
            if(request.getParameter("filiaal") != null){
                
                filiaal =  request.getParameter("filiaal");
                fil = Integer.parseInt(filiaal);
                
            }
             mon = new Integer(mon);
            fil = new Integer(fil);
            
            Rooster rooster = new Rooster();
            result = rooster.setRooster(fil, mon);
            response.sendRedirect("rooster.jsp");
        %>
    </body>
</html>
