
<%@page import="com.monteur.jsp.*" %>
<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Data</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/css/select2.min.css" rel="stylesheet" />
        <link href="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.min.css" rel="stylesheet">
        
        <style>
            body{
                x-overflow: hidden;
            }
        </style>
    </head>
    <body>
        <ul class="nav nav-tabs">
            <li role="presentation" ><a href="index.jsp">Home</a></li>
            <li role="presentation" class="active"><a href="filiaal.jsp">Filiaal</a></li>
            <li role="presentation" ><a href="monteur.jsp">Monteurs</a></li>
            <li role="presentation" ><a href="rooster.jsp">Rooster</a></li>

        </ul>
        <% 
        Filiaal filiaal = new Filiaal();
        ResultSet filiaals = filiaal.getfiliaals();
        
        Monteur monteur = new Monteur();
        ResultSet monteurs = monteur.getMonteurs();
        
        %>
            
        
        <div class="col-md-8 col-md-offset-2">
        <div class="row">
        <table class="table table-responsive">
        <thead>
            <tr>
            <th>Filiaal ID</th>
            <th>Locatie</th>
            </tr>
        </thead>
        <tbody>
            <% 
                while (filiaals.next()) 
                {;
            %>
            <tr>                    
                <td>
                    <%= filiaals.getInt("id") %>
                </td>
                <td>
                    <%= filiaals.getString("locatie") %>
                   
                </td>  
                  <% } 
                %>
            </tr>
        </tbody>
        </table>
         </div>
         </div>
         <div class="col-md-6">  
            <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Small Modal</button>
        </div>
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
            <form name="filiaalform" action="insertfiliaal.jsp" method="POST">
            <div class="form-group">
              <label>Filiaal: </label> 
              <input type="text" name="locatie" value=""  class="form-control" placeholder="Filiaal"/>
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
</script>
</html>
