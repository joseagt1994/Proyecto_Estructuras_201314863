<%-- 
    Document   : EstacionesE
    Created on : 20/09/2015, 11:02:11 AM
    Author     : Jose Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estaciones Clave</title>
    </head>
    <body>
        <h1>Estaciones Clave</h1>
        <br />
        <form action="EstacionesE.jsp" method="POST">
        Agregar una nueva estación clave
        <br />
        Clave: <input type="text" name="txtID"><br />
        Nombre:  <input type="text" name="txtNombre"><br />
        Contraseña:  <input type="text" name="txtPass"><br />
        <input type="submit" name="btn_guardar" value="Guardar">
        <br />
        <br />
        Editar información de una estación clave
        <br />
        Ingrese su codigo para editar su información
        <br />
            ID: <input type="text" name="ID"><br />
          Dato: <input type="text" name="Campo"><br />
            <select name="seleccion">
                <option value="nada"> </option>
                <option value="correo">Clave</option>
                <option value="nombre">Nombre</option>
                <option value="contra">Contraseña</option>
            </select>
        <input type="submit" name="btn_actualizar" value="Actualizar">
        <br />
        <br />
        Eliminar una estacion clave
        <br />
        ID: <input type="text" name="txtID2"><br />
        <input type="submit" name="btn_eliminar" value="Eliminar">
        </form>
        <br />
        <br />
        <input type="button" name="salir" value="Regresar al menu" onclick="location='menuAdmin.jsp'">
        
            <%-- start web service invocation --%><hr/>
    <%
        String guardar = request.getParameter("btn_guardar");
        String actualizar = request.getParameter("btn_actualizar");
        String eliminar = request.getParameter("btn_eliminar");
        
        com.jagt.referencia.NewWebService service = new com.jagt.referencia.NewWebService();
	com.jagt.referencia.ServicioWebTransmetro port = service.getServicioWebTransmetroPort();
        
        if(guardar!=null){

	int ideg = Integer.parseInt(request.getParameter("txtID"));
	java.lang.String contraEE = request.getParameter("txtPass");
	java.lang.String nombreEE = request.getParameter("txtNombre");
	int cantEE = 0;
	// TODO process result here
	boolean result = port.guardarEE(ideg, contraEE, nombreEE, cantEE);
	    if(result){
                String mensaje="<script language='javascript'>alert('Se han guardado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron guardar los datos');</script>"; 
                out.println(mensaje);
            }

        }
        
        if(actualizar!=null){

	int correoee = Integer.parseInt(request.getParameter("ID"));
	java.lang.String datoee = request.getParameter("Campo");
	java.lang.String tipoee = request.getParameter("seleccion");
	// TODO process result here
	boolean result = port.actualizarEE(correoee, datoee, tipoee);
	if(result){
                String mensaje="<script language='javascript'>alert('Se han actualizado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron actualizar los datos');</script>"; 
                out.println(mensaje);
            }
        }
        
        if(eliminar!=null){

	int ideE = Integer.parseInt(request.getParameter("txtID2"));
	// TODO process result here
	boolean result = port.eliminarEE(ideE);
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
