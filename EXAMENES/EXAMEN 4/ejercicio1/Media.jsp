<%-- 
    Document   : Media
    Created on : 05-feb-2019, 10:40:01
    Author     : rosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            int[] numero = new int [3];
            
            for(int i = 0; i<3;i++){
              numero[i] = Integer.parseInt(request.getParameter("Numero" + (i+1)));
            }
            int suma = 0; 
            
            for(int n : numero){
                suma += n;
            }
        %>
     
        La media es <%= suma/3 %>
    </body>
</html>
