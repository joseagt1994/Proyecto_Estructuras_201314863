<%-- 
    Document   : validacion
    Created on : 19/09/2015, 11:28:32 AM
    Author     : Jose Antonio
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
        
        <title>Validando...</title>
        <%!
        
        
        String usuario;
        String contra;
        String rol;
        
        %>
    
        <body>
        <h1>Validando sus datos...</h1>
        <%
            
            usuario = request.getParameter("txtUsuario");
            contra = request.getParameter("txtContra");
            
            com.jagt.referencia.NewWebService service = new com.jagt.referencia.NewWebService();
	    com.jagt.referencia.ServicioWebTransmetro port = service.getServicioWebTransmetroPort();

            
            if(port.logAdmin(usuario, contra)){
                response.sendRedirect("menuAdmin.jsp");
            }else if(port.logChofer(Integer.parseInt(usuario), contra)){
                response.sendRedirect("Chofer.jsp");
            }else if(port.logEE(Integer.parseInt(usuario), contra)){
                response.sendRedirect("EstacionClave.jsp");
            }else if(port.logEG(Integer.parseInt(usuario), contra)){
                response.sendRedirect("EstacionGeneral.jsp");
            }else{
                String mensaje="<script language='javascript'>alert('Usuario o Contraseña incorrecta');</script>"; 
                out.println(mensaje);
            }
        
        %>

</body>
    
</html>
