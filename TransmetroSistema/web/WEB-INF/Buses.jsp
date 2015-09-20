<%-- 
    Document   : Buses
    Created on : 20/09/2015, 11:12:22 AM
    Author     : Jose Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buses</title>
    </head>
    <body>
        <h1>Buses</h1>
        <br />
        <form action="Buses.jsp" method="POST">
        Agregar un nuevo Bus
        <br />
        ID Bus:  <input type="text" name="txtID"><br />
        
        <input type="submit" name="btn_guardar" value="Guardar">
        <br />
        </form>
        
            <%-- start web service invocation --%><hr/>
    <%
        String guardar = request.getParameter("btn_guardar");
        
	com.jagt.referencia.NewWebService service = new com.jagt.referencia.NewWebService();
	com.jagt.referencia.ServicioWebTransmetro port = service.getServicioWebTransmetroPort();
	
        if(guardar!=null){
            java.lang.String idBus = request.getParameter("txtID");
	    boolean booleanB = false;
	// TODO process result here
	    boolean result = port.agregarBus(idBus, booleanB);
	    if(result){
                String mensaje="<script language='javascript'>alert('Se ha creado el bus correctamente');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudo crear el bus');</script>"; 
                out.println(mensaje);
            }
        }

    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>
