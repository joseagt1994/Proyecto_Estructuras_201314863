<%-- 
    Document   : Reportes
    Created on : 20/09/2015, 11:33:35 AM
    Author     : Jose Antonio
--%>

<%@page import="com.jagt.herramienta.Transmetro.Archivo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%!
        
        
        String AVL;
        String rol;
        String RB;
        String RCB;
        
        Archivo documento = new Archivo();
        
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>¿Que reporte desea ver?</h1>
        <form action="Reportes.jsp" method="POST">
        <select name="seleccionRol">
                <option value="nada"> </option>
                <option value="admin">Administrador</option>
                <option value="chofer">Chofer</option>
                <option value="estacionG">Estacion General</option>
                <option value="estacionC">Estacion Clave</option>
        </select>
        <input type ="submit" name="ArbolAVL" value="Generar Reporte Arbol AVL">
        <input type ="button" name="Imagen" value="Visualizar" onclick="location='ImagenAVL.jsp'">
        <br />
        <input type ="submit" name="ReporteBuses" value="Generar Reporte de buses asignados">
        <input type ="button" name="ImagenB" value="Visualizar" onclick="location='ImagenRB.jsp'">
        <br />
        <input type ="submit" name="ReporteChoferBus" value="Generar Reporte de Horario de Chofer y Bus">
        <input type ="button" name="ImagenCB" value="Visualizar" onclick="location='ImagenRCB.jsp'">
        <br />
        </form>
        <br />
        <input type ="button" name="btn_salir" value="Regresar al Menu" onclick="location='menuAdmin.jsp'">
        

    <%
        AVL = request.getParameter("ArbolAVL");
        rol = request.getParameter("seleccionRol");
        RB = request.getParameter("ReporteBuses");
        RCB = request.getParameter("ReporteChoferBus");
        
        

	com.jagt.referencia.NewWebService service = new com.jagt.referencia.NewWebService();
	com.jagt.referencia.ServicioWebTransmetro port = service.getServicioWebTransmetroPort();
	
	if(AVL!=null){

	java.util.List<java.lang.String> result = port.codigoArbolAVL(rol);
        String codigo = "graph grafica{\n"+result.get(0)+"\n"+result.get(1)+"}";
        
        documento.crearTxt(codigo,"ArbolAVL"+".txt");
        
        try {
      
      //CAMBIAR LA DIRECCION DEL DOT.EXE PARA QUE SE PUEDA EJECUTAR
      String dotPath = "C:\\Users\\Jose Antonio\\Desktop\\Graphviz\\bin\\dot.exe";
      
      String fileInputPath = "C:\\Users\\Jose Antonio\\Desktop\\ArbolAVL.txt";
      String fileOutputPath = "C:\\Users\\Jose Antonio\\Desktop\\ArbolAVL.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
    String mensaje="<script language='javascript'>alert('Se ha generado el reporte');</script>"; 
      out.println(mensaje);
      
    } catch (Exception ex) {
      String mensaje="<script language='javascript'>alert('No se ha generado el reporte');</script>"; 
      out.println(mensaje);
    }
        
        }
        
        if(RB!=null){
	int idchof = 0;
	// TODO process result here
	java.util.List<java.lang.String> result = port.reporteBusesChofer(idchof);
	String codigo = "graph grafica{\n"+result.get(0)+"\n"+result.get(1)+"}";
        
        documento.crearTxt(codigo,"ReporteBuses"+".txt");
        
        try {
      
      //CAMBIAR LA DIRECCION DEL DOT.EXE PARA QUE SE PUEDA EJECUTAR
      String dotPath = "C:\\Users\\Jose Antonio\\Desktop\\Graphviz\\bin\\dot.exe";
      
      String fileInputPath = "ArbolAVL"+".txt";
      String fileOutputPath = "ArbolAVL"+".jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
    String mensaje="<script language='javascript'>alert('Se ha generado el reporte');</script>"; 
      out.println(mensaje);
      
    } catch (Exception ex) {
      String mensaje="<script language='javascript'>alert('No se ha generado el reporte');</script>"; 
      out.println(mensaje);
    }
        
        }
        
        if(RCB!=null){
	java.lang.String idCh = "";
	java.lang.String idBus = "";
	// TODO process result here
	java.util.List<java.lang.String> result = port.reporteHorasBuses(idCh, idBus);
	String codigo = "graph grafica{\n"+result.get(0)+"\n"+result.get(1)+"}";
        
        documento.crearTxt(codigo,"ReporteChoferBus"+".txt");
        
        try {
      
      //CAMBIAR LA DIRECCION DEL DOT.EXE PARA QUE SE PUEDA EJECUTAR
      String dotPath = "C:\\Users\\Jose Antonio\\Desktop\\Graphviz\\bin\\dot.exe";
      
      String fileInputPath = "ReporteChoferBus"+".txt";
      String fileOutputPath = "ReporteChoferBus"+".jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      
      rt.exec( cmd );
      
      String mensaje="<script language='javascript'>alert('Se ha generado el reporte');</script>"; 
      out.println(mensaje);
      
    } catch (Exception ex) {
      String mensaje="<script language='javascript'>alert('No se ha generado el reporte');</script>"; 
      out.println(mensaje);
    }
    
            
            

        }

    %>

        
    </body>
</html>
