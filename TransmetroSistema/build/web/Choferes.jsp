<%-- 
    Document   : Choferes
    Created on : 18/09/2015, 02:49:02 PM
    Author     : Jose Antonio
--%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Choferes</title>
    </head>
    <body>
        <h1>Choferes</h1>
        <br />
        <form action="Choferes.jsp" method="POST">
        Agregar un nuevo chofer
        <br />
        Nombre:  <input type="text" name="txtNombre"><br />
        Apellido:  <input type="text" name="txtApellido"><br />
        Clave:  <input type="text" name="txtClave"><br />
        Correo: <input type="text" name="txtCorreo"><br />
        Contraseña:  <input type="text" name="txtPass"><br />
        <input type="submit" name="btn_guardar" value="Guardar">
        <br />
        <br />
        Editar información de un chofer
        <br />
        <br />
        Ingrese su correo para editar su información
        <br />
        ID: <input type="text" name="ID"><br />
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
        Eliminar un chofer 
        <br />
        Clave: <input type="text" name="txtClave3"><br />
        <input type="submit" name="btn_eliminar" value="Eliminar">
        <br />
        <br />
        Asignar Buses
        <br />
        <input type="file" name="archivo">
        <input type="submit" name="btn_asignar" value="Asignar">
        </form>
        <br />
        <br />
        <input type="button" name="salir" value="Regresar al menu" onclick="location='menuAdmin.jsp'">
        
        
            <%-- start web service invocation --%><hr/>
    <%
        String guardar = request.getParameter("btn_guardar");
        String actualizar = request.getParameter("btn_actualizar");
        String eliminar = request.getParameter("btn_eliminar");
        String asignar = request.getParameter("btn_asignar");
        
        String fichero = request.getParameter("archivo");
        
	com.jagt.referencia.NewWebService service = new com.jagt.referencia.NewWebService();
	com.jagt.referencia.ServicioWebTransmetro port = service.getServicioWebTransmetroPort();
	 // TODO initialize WS operation arguments here
        
        if(guardar!=null){
            int idc = Integer.parseInt(request.getParameter("txtClave"));
	    java.lang.String correoc = request.getParameter("txtCorreo");
	    java.lang.String contrac = request.getParameter("txtPass");
	    java.lang.String nombrec = request.getParameter("txtNombre");
	    java.lang.String apellidoc = request.getParameter("txtApellido");
	    boolean booleanC = false;
	// TODO process result here
	    boolean result = port.guardarChofer(idc, correoc, contrac, nombrec, apellidoc, booleanC);
	    if(result){
                String mensaje="<script language='javascript'>alert('Se han guardado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron guardar los datos');</script>"; 
                out.println(mensaje);
            }
        }
        
        if(actualizar!=null){

	   int correoa = Integer.parseInt(request.getParameter("ID"));
	   java.lang.String datoa = request.getParameter("Campo");
	   java.lang.String tipoa = request.getParameter("seleccion");;
	// TODO process result here
	   boolean result = port.actualizarChofer(correoa, datoa, tipoa);
	   if(result){
                String mensaje="<script language='javascript'>alert('Se han actualizado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron actualizar los datos');</script>"; 
                out.println(mensaje);
            }
        
        }
        
        if(eliminar!=null){

	    int idc = Integer.parseInt(request.getParameter("txtClave3"));
	// TODO process result here
	    boolean result = port.eliminarChofer(idc);
	    if(result){
                String mensaje="<script language='javascript'>alert('Se han eliminado correctamente los datos');</script>"; 
                out.println(mensaje);
            }else{
                String mensaje="<script language='javascript'>alert('No se pudieron eliminar los datos');</script>"; 
                out.println(mensaje);
            }

        }
        
        if(asignar!=null){
            
            try {
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
 
                String linea;
                while((linea = br.readLine()) != null){
                    port.guardarDatosArchivo(linea);
                }
                fr.close();
            }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
            }

        }

    %>
    <%-- end web service invocation --%><hr/>

        
        
    </body>
</html>
