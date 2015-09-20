<%-- 
    Document   : Chofer
    Created on : 17/09/2015, 02:22:31 PM
    Author     : Jose Antonio
--%>

<%@page import="java.util.List"%>
<%@page import="com.jagt.referencia.StringArray"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido Chofer</title>
    </head>
    <body>
        <h2>Bienvenido!</h2>
        <h1>En esta pagina puede visualizar sus datos y sus asignaciones y horarios.</h1>
        
        <TABLE WIDTH=600 HEIGHT=900>

        <TD width=75 BGCOLOR="black">
        </TD>

        <TD WIDTH=325 BGCOLOR="green">
        
            <TABLE BORDER=1 WIDTH=400>

          <TR>
          <TD WIDTH=100>
              Fecha
          </TD>

          <TD WIDTH=100>
              Bus
          </TD>

          <TD WIDTH=100>
              Hora Inicio
          </TD>
          
          <TD WIDTH=100>
              Hora Final
          </TD>
          </TR>
          

    <%
        
	com.jagt.referencia.NewWebService service = new com.jagt.referencia.NewWebService();
	com.jagt.referencia.ServicioWebTransmetro port = service.getServicioWebTransmetroPort();
	 // TODO initialize WS operation arguments here
	int idh = Integer.parseInt(request.getParameter("txtUsuario"));
	// TODO process result here
	java.util.List<com.jagt.referencia.StringArray> result = port.horariosChofer(idh);
	out.println("Result = "+result);
        
        String cadena="";
        
        for(int i=0;i<result.size();i++){
            StringArray array = result.get(i);
            List<String> lista = array.getItem();
            for(int j = 0;j<lista.size();j++){
                if(j==lista.size()-1){
                    cadena+=lista.get(j);
                }else{
                    cadena+=lista.get(j)+",";
                }
            }
            
            String[] listado = cadena.split(",");
            %>
  
    
            <TR>
          <TD WIDTH=100>
              <% out.println(listado[0]); %>
          </TD>

          <TD WIDTH=100>
              <% out.println(listado[1]); %>
          </TD>

          <TD WIDTH=100>
              <% out.println(listado[2]); %>
          </TD>
          
          <TD WIDTH=100>
              <% out.println(listado[3]); %>
          </TD>
          </TR>
    
          <%
        }
        
        
    %>

          
</TABLE>
        </TD>

        <TD WIDTH=200 BGCOLOR="gray">
            <h1>Datos Personales</h1>
            <br />
            Nombre: 

    <%

	
	 // TODO initialize WS operation arguments here
	int idchof = Integer.parseInt(request.getParameter("txtUsuario"));
	// TODO process result here
	java.lang.String result2 = port.infoChofer(idchof);
	
        String[] datos = result2.split(",");
        

    %>
    
            Nombre: <% out.println(datos[2]); %>
            <br />
            Apellido: <% out.println(datos[3]); %>
            <br />
            Clave: <% request.getParameter("txtUsuario"); %>
            <br />
            Correo: <% out.println(datos[1]); %>
            <br />
        </TD>

        </TABLE>
            
            <input type="button" name="btn_salir" value="Salir" onclick="location='index.html'">

    </body>
</html>
