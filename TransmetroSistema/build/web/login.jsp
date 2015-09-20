<%-- 
    Document   : login
    Created on : 17/09/2015, 02:14:41 PM
    Author     : Jose Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn</title>
    </head>
    <body>
        <br>
        <div align = center>Bienvenido al sistema de Transmetro!</div>
        <br />
        <br />
        
        <form action="validacion.jsp" method="POST">
            
            <div align = center>
            Usuario: <input type="text" name="txtUsuario"><br /> 
            <br />
            Contraseña: <input type="password" name="txtContra"><br />
            <br />
            <select name="seleccion" form="carform">
                <option value="nada"> </option>
                <option value="admin">Administrador</option>
                <option value="chofer">Chofer</option>
                <option value="estg">Estacion General</option>
                <option value="este">Estacion Especifica</option>
            </select> 
            <br/> <br/>
            <input type="submit" name="btnLogin" value="Ingresar">
            </div>
        </form>
    </body>
</html>
