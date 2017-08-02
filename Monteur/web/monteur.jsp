<%-- 
    Document   : index
    Created on : Jul 10, 2017, 4:36:20 PM
    Author     : shayantsital
--%>

<%@page import="com.monteur.jsp.Monteur" %>
<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Data</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.min.css" rel="stylesheet">

        

    </head>
    <body>
        <ul class="nav nav-tabs">
            <li role="presentation" ><a href="index.jsp">Home</a></li>
            <li role="presentation"><a href="filiaal.jsp">Filiaal</a></li>
            <li role="presentation" class="active"><a href="monteur.jsp">Monteurs</a></li>
            <li role="presentation" ><a href="rooster.jsp">Rooster</a></li>

        </ul>
       
         
              
                

            


        <% 
        Monteur monteur = new Monteur();
        ResultSet monteurs = monteur.getMonteurs();
        
        %>
        <table class="table table-responsive">
        <thead>
            <tr>
            <th>Monteur ID</th>
            <th>Voornaam</th>
            <th>Familienaam</th>
            </tr>
        </thead>
        <tbody>
            <% 
                while (monteurs.next()) //start of loop
                {;
            %>
            <tr>                    
                <td>
                    <%= monteurs.getInt("id") %>
                </td>
                <td>
                    <%= monteurs.getString("naam") %>
                </td>
                <td>
                    <%= monteurs.getString("familienaam") %>
                </td>
                <% } // End of loop
                %>
            </tr>
        </tbody>
        </table>
              <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Small Modal</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
            <form name="monteurform" action="insertmonteur.jsp" method="POST">
            <div class="form-group">
              <label>Voornaam: </label> 
              <input type="text" name="naam" value="" size="50" class="form-control" placeholder="Voornaam"/>
            </div>
            <div class="form-group">
              <label>Familienaam: </label>
              <input type="text" name="fam_naam" value="" size="50" class="form-control" placeholder="Familienaam" />
              
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
            <input type="reset" value="Clear" name="clear" class="btn btn-default" />
          </form>
        </div>
      </div>
    </div>
  </div>
                
               
                
    </body>
    <script src="//code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap.min.js"></script>
    
    <script>
        $(document).ready(function() {
    $('.table').DataTable();
} );
</script>
</html>
