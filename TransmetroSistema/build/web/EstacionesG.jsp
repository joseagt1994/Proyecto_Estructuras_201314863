<%-- 
    Document   : EstacionesG
    Created on : 20/09/2015, 10:46:26 AM
    Author     : Jose Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estaciones Generales</title>
    </head>
    <body>
        <h1>Estaciones Generales</h1>
        <br />
        <form action="EstacionesG.jsp" method="POST">
        Agregar una nueva estación general
        <br />
        Clave: <input type="text" name="txtID"><br />
        Nombre:  <input type="text" name="txtNombre"><br />
        Contraseña:  <input type="text" name="txtPass"><br />
        <input type="submit" name="btn_guardar" value="Guardar">
        <br />
        <br />
        Editar información de una estación general
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
        Eliminar una estacion general
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
	java.lang.String contraEG = request.getParameter("txtPass");
	java.lang.String nombreEG = request.getParameter("txtNombre");
	int cantEG = 0;
	// TODO process result here
	boolean result = port.guardarEG(ideg, contraEG, nombreEG, cantEG);
	    if(result){
                String mensaje="<script language='javascript'>alert('Se han guardado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron guardar los datos');</script>"; 
                out.println(mensaje);
            }

        }
        
        if(actualizar!=null){

	int correoeg = Integer.parseInt(request.getParameter("ID"));
	java.lang.String datoeg = request.getParameter("Campo");
	java.lang.String tipoeg = request.getParameter("seleccion");
	// TODO process result here
	boolean result = port.actualizarEG(correoeg, datoeg, tipoeg);
	if(result){
                String mensaje="<script language='javascript'>alert('Se han actualizado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron actualizar los datos');</script>"; 
                out.println(mensaje);
            }
        }
        
        if(eliminar!=null){

	int ideg = Integer.parseInt(request.getParameter("txtID2"));
	// TODO process result here
	boolean result = port.eliminarEG(ideg);
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
