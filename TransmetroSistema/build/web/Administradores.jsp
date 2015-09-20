<%-- 
    Document   : Administradores
    Created on : 18/09/2015, 02:40:59 PM
    Author     : Jose Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Administradores</h1>
        <br />
        <form action="Administradores.jsp" method="POST">
        Agregar un nuevo administrador
        <br />
        Nombre:  <input type="text" name="txtNombre"><br />
        Apellido:  <input type="text" name="txtApellido"><br />
        Correo:  <input type="text" name="txtCorreo"><br />
        Contraseña:  <input type="text" name="txtPass"><br />
        <input type="submit" name="btn_guardar" value="Guardar">
        <br />
        <br />
        Editar información de un administrador
        <br />
        Ingrese su correo para editar su información
        <br />
        Correo: <input type="text" name="ID"><br />
          Dato: <input type="text" name="Campo"><br />
            <select name="seleccion">
                <option value="nada"> </option>
                <option value="correo">Administrador</option>
                <option value="nombre">Chofer</option>
                <option value="apellido">Estacion General</option>
                <option value="contra">Estacion Especifica</option>
            </select>
        <input type="submit" name="btn_actualizar" value="Actualizar">
        <br />
        <br />
        Eliminar un administrador 
        <br />
        Correo: <input type="text" name="txtCorreo2"><br />
        <input type="submit" name="btn_eliminar" value="Eliminar">
        </form>
        <br />
        <br />
        <input type="button" name="salir" value="Regresar al menu" onclick="location='menuAdmin.jsp'">
        
            <%-- start web service invocation --%><hr/>
    <%
	String agregar = request.getParameter("btn_guardar");
        String actualizar = request.getParameter("btn_actualizar");
        String eliminar = request.getParameter("btn_eliminar");
        
        com.jagt.referencia.NewWebService service = new com.jagt.referencia.NewWebService();
	com.jagt.referencia.ServicioWebTransmetro port = service.getServicioWebTransmetroPort();
	 // TODO initialize WS operation arguments here
        if(agregar!=null){
            java.lang.String correoa = request.getParameter("txtCorreo");
	    java.lang.String contraa = request.getParameter("txtPass");
	    java.lang.String nombrea = request.getParameter("txtNombre");
	    java.lang.String apellidoa = request.getParameter("txtApellido");
	// TODO process result here
	    boolean result = port.guardarAdmin(correoa, contraa, nombrea, apellidoa);
            if(result){
                String mensaje="<script language='javascript'>alert('Se han guardado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron guardar los datos');</script>"; 
                out.println(mensaje);
            }
        }
        
        if(actualizar!=null){
	    java.lang.String correoa = request.getParameter("ID");
	    java.lang.String datoa = request.getParameter("Campo");
	    java.lang.String tipoa = request.getParameter("seleccion");
	// TODO process result here
	    boolean result = port.actualizarAdmin(correoa, datoa, tipoa);
            if(result){
                String mensaje="<script language='javascript'>alert('Se han actualizado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron actualizar los datos');</script>"; 
                out.println(mensaje);
            }

        }
        
        if(eliminar!=null){
	java.lang.String correoa = request.getParameter("txtCorreo2");
	// TODO process result here
	boolean result = port.eliminarAdmin(correoa);
	if(result){
                String mensaje="<script language='javascript'>alert('Se han eliminado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron eliminar los datos');</script>"; 
                out.println(mensaje);
            }
        }
	
    %>
    <%-- end web service invocation --%><hr/>

        
        
    </body>
</html>
