<%-- 
    Document   : Rutas
    Created on : 20/09/2015, 11:17:18 AM
    Author     : Jose Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rutas</title>
    </head>
    <body>
        <h1>Rutas</h1>
        <br />
        <form action="Rutas.jsp" method="POST">
        Agregar una nueva Ruta
        <br />
        Nombre:  <input type="text" name="txtNombre"><br />
        Estaciones: <input type="text" name="txtEstaciones"><br />
        <input type="submit" name="btn_guardar" value="Guardar">
        <br />
        </form>
        <input type ="button" name="btn_salir" value="Regresar al Menu" onclick="location='menuAdmin.jsp'">
            <%-- start web service invocation --%><hr/>
    <%
        String guardar = request.getParameter("btn_guardar");
        
	com.jagt.referencia.NewWebService service = new com.jagt.referencia.NewWebService();
	com.jagt.referencia.ServicioWebTransmetro port = service.getServicioWebTransmetroPort();
	
        if(guardar!=null){

	    java.lang.String nombreRuta = request.getParameter("txtNombre");
	    java.lang.String ruta = request.getParameter("txtEstaciones");
	// TODO process result here
	    boolean result = port.agregarRuta(nombreRuta, ruta);

	    if(result){
                String mensaje="<script language='javascript'>alert('Se ha creado la ruta correctamente');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudo crear la ruta');</script>"; 
                out.println(mensaje);
            }
        }

    %>
    <%-- end web service invocation --%><hr/>

        
    </body>
</html>
