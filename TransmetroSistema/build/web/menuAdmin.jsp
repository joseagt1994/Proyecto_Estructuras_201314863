<%-- 
    Document   : menuAdmin
    Created on : 17/09/2015, 02:20:28 PM
    Author     : Jose Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Administrador</title>
    </head>
    <body>
        <h1>¿Que desea editar?</h1>
        <input type ="button" name="btn_admin" value="Administradores" onclick="location='Administradores.jsp'">
        <input type ="button" name="btn_chofer" value="Choferes" onclick="location='Choferes.jsp'">
        <input type ="button" name="btn_eg" value="Estaciones Generales" onclick="location='EstacionesG.jsp'">
        <input type ="button" name="btn_ee" value="Estaciones Especificas" onclick="location='EstacionesE.jsp'">
        <input type ="button" name="btn_bus" value="Buses" onclick="location='Buses.jsp'">
        <input type ="button" name="btn_ruta" value="Rutas" onclick="location='Rutas.jsp'">
        <input type ="button" name="btn_reportes" value="Reportes" onclick="location='Reportes.jsp'">
        <input type ="button" name="btn_resumen" value="Resumen" onclick="location='Resumenes.jsp'">
        <input type ="button" name="btn_salir" value="Salir" onclick="location='index.html'">
    </body>
</html>
