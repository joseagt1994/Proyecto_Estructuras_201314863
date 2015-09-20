/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jagt.servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.jagt.data.Transmetro.*;

/**
 *
 * @author Jose Antonio
 */
@WebService(serviceName = "NewWebService")
public class ServicioWebTransmetro {

    /**
     * This is a sample web service operation
     */
    
    ArbolAVLAdmin administradores = new ArbolAVLAdmin();
    ArbolAVLChofer choferes = new ArbolAVLChofer();
    ArbolAVLEE estacionesE = new ArbolAVLEE();
    ArbolAVLEG estacionesG = new ArbolAVLEG();
    ListaDobleEnlazadaB buses = new ListaDobleEnlazadaB();
    ListaDobleEnlazadaR rutas = new ListaDobleEnlazadaR();
    
    @WebMethod(operationName = "primerAdmin")
    public boolean PrimerAdmin(@WebParam(name = "correoa") String correo, @WebParam(name = "contraa") String contra, @WebParam(name = "nombrea") String nombre, @WebParam(name = "apellidoa") String ape) {
        try{
            administradores.insertarAdministrador(correo, nombre, ape, contra);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    @WebMethod(operationName = "logAdmin")
    public boolean Administrador(@WebParam(name = "correoa") String correo, @WebParam(name = "contraa") String contra) {
        if(administradores!=null && administradores.raiz!=null){
            NodoAVL aux = administradores.buscarCorreo(correo, administradores.raiz);
            if(aux!=null){
                return aux.getContraseña().equals(contra);
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    @WebMethod(operationName = "guardarAdmin")
    public boolean InsertarAdministrador(@WebParam(name = "correoa") String correo, @WebParam(name = "contraa") String contra, @WebParam(name = "nombrea") String nombre, @WebParam(name = "apellidoa") String ape) {
        try{
            administradores.insertarAdministrador(correo, nombre, ape, contra);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    @WebMethod(operationName = "eliminarAdmin")
    public boolean EliminarAdministrador(@WebParam(name = "correoa") String correo) {
        
        try{
            ArbolAVLAdmin temp = new ArbolAVLAdmin();
            temp = administradores.EliminarAdmin(correo, administradores.raiz, temp);
            administradores = temp;
            temp = null;
            return true;
        }catch(Exception ex){
            return false;
        }
        
    }
    
    @WebMethod(operationName = "actualizarAdmin")
    public boolean ActualizarAdministrador(@WebParam(name = "correoa") String correo, @WebParam(name = "datoa") String dato, @WebParam(name = "tipoa") String tipo) {
        
        try{
            ArbolAVLAdmin temp = new ArbolAVLAdmin();
            if(administradores.ActualizarNodoAdmin(correo, dato, tipo, administradores.raiz)){
                temp = administradores.ActualizarAdmin(administradores.raiz, temp);
                administradores = temp;
                temp = null;
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            return false;
        }
        
    }
    
    @WebMethod(operationName = "logChofer")
    public boolean Chofer(@WebParam(name = "idc") int id, @WebParam(name = "contrac") String contra) {
        if(choferes!=null && choferes.raiz!=null){
            NodoAVL aux = choferes.buscarID(id, choferes.raiz);
            if(aux!=null){
                return aux.getContraseña().equals(contra);
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    @WebMethod(operationName = "guardarChofer")
    public boolean InsertarChofer(@WebParam(name = "idc") int id, @WebParam(name = "correoc") String correo, @WebParam(name = "contrac") String contra, @WebParam(name = "nombrec") String nombre, @WebParam(name = "apellidoc") String ape, @WebParam(name = "booleanC") boolean b) {
        try{
            choferes.insertarChofer(id, correo, nombre, ape, contra, new ListaDobleEnlazada(), b);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    @WebMethod(operationName = "eliminarChofer")
    public boolean EliminarChofer(@WebParam(name = "idc") int id) {
        
        try{
            ArbolAVLChofer temp = new ArbolAVLChofer();
            temp = choferes.EliminarChofer(id, choferes.raiz, temp);
            choferes = temp;
            temp = null;
            return true;
        }catch(Exception ex){
            return false;
        }
        
    }
    
    @WebMethod(operationName = "actualizarChofer")
    public boolean ActualizarChofer(@WebParam(name = "correoa") int id, @WebParam(name = "datoa") String dato, @WebParam(name = "tipoa") String tipo) {
        
        try{
            ArbolAVLChofer temp = new ArbolAVLChofer();
            if(choferes.ActualizarNodoChofer(id, dato, tipo, choferes.raiz)){
                temp = choferes.ActualizarChofer(choferes.raiz, temp);
                choferes = temp;
                temp = null;
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            return false;
        }
        
    }
    
    @WebMethod(operationName = "logEG")
    public boolean EstacionGeneral(@WebParam(name = "idc") int id, @WebParam(name = "contrac") String contra) {
        if(estacionesG!=null && estacionesG.raiz!=null){
            NodoAVL aux = estacionesG.buscarID(id, estacionesG.raiz);
            if(aux!=null){
                return aux.getContraseña().equals(contra);
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    @WebMethod(operationName = "guardarEG")
    public boolean InsertarEG(@WebParam(name = "ideg") int id, @WebParam(name = "contraEG") String contra, @WebParam(name = "nombreEG") String nombre, @WebParam(name = "cantEG") int cant) {
        try{
            estacionesG.insertarEstacion(id, nombre, contra, cant);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    @WebMethod(operationName = "eliminarEG")
    public boolean EliminarEG(@WebParam(name = "ideg") int id) {
        
        try{
            ArbolAVLEG temp = new ArbolAVLEG();
            temp = estacionesG.EliminarEG(id, estacionesG.raiz, temp);
            estacionesG = temp;
            temp = null;
            return true;
        }catch(Exception ex){
            return false;
        }
        
    }
    
    @WebMethod(operationName = "actualizarEG")
    public boolean ActualizarEG(@WebParam(name = "correoeg") int id, @WebParam(name = "datoeg") String dato, @WebParam(name = "tipoeg") String tipo) {
        
        try{
            ArbolAVLEG temp = new ArbolAVLEG();
            if(estacionesG.ActualizarNodoEG(id, dato, tipo, estacionesG.raiz)){
                temp = estacionesG.ActualizarEG(estacionesG.raiz, temp);
                estacionesG = temp;
                temp = null;
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            return false;
        }
        
    }
    
    @WebMethod(operationName = "logEE")
    public boolean EstacionClave(@WebParam(name = "idE") int id, @WebParam(name = "contraE") String contra) {
        if(estacionesE!=null && estacionesE.raiz!=null){
            NodoAVL aux = estacionesE.buscarID(id, estacionesE.raiz);
            if(aux!=null){
                return aux.getContraseña().equals(contra);
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    @WebMethod(operationName = "guardarEE")
    public boolean InsertarEC(@WebParam(name = "ideE") int id, @WebParam(name = "contraEE") String contra, @WebParam(name = "nombreEE") String nombre, @WebParam(name = "cantEE") int cant) {
        try{
            estacionesE.insertarEstacion(id, nombre, contra, cant);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    @WebMethod(operationName = "eliminarEE")
    public boolean EliminarEE(@WebParam(name = "ideE") int id) {
        
        try{
            ArbolAVLEE temp = new ArbolAVLEE();
            temp = estacionesE.EliminarEE(id, estacionesE.raiz, temp);
            estacionesE = temp;
            temp = null;
            return true;
        }catch(Exception ex){
            return false;
        }
        
    }
    
    @WebMethod(operationName = "actualizarEE")
    public boolean ActualizarEE(@WebParam(name = "correoeE") int id, @WebParam(name = "datoeE") String dato, @WebParam(name = "tipoeE") String tipo) {
        
        try{
            ArbolAVLEE temp = new ArbolAVLEE();
            if(estacionesE.ActualizarNodoEE(id, dato, tipo, estacionesE.raiz)){
                temp = estacionesE.ActualizarEE(estacionesE.raiz, temp);
                estacionesE = temp;
                temp = null;
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            return false;
        }
        
    }
    
    @WebMethod(operationName = "agregarBus")
    public boolean nuevoBus(@WebParam(name = "idBus") String id, @WebParam(name = "booleanB") boolean b) {
        try{
            buses.Nuevo(id, b);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    @WebMethod(operationName = "agregarRuta")
    public boolean nuevaRuta(@WebParam(name = "nombreRuta") String nombre,@WebParam(name = "Ruta") String estaciones) {
        try{
            rutas.Nuevo(nombre, estaciones);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    @WebMethod(operationName = "guardarDatosArchivo")
    public boolean almacenarLinea(@WebParam(name = "cadena") String cadena) {
        String[] valores = cadena.split(",");
        NodoAVL chofer = choferes.buscarID(Integer.parseInt(valores[2]), choferes.raiz);
        NodoDE bus = buses.buscarNodoBus(valores[0]);
        NodoDE ruta = rutas.buscarNodoRuta(valores[1]);
        
        if(ruta!=null){
            if(bus==null){
                nuevoBus(valores[0],true);
            }
            if(chofer!=null){
                ListaDobleEnlazada dias = chofer.getDias();
                dias.Nuevo(valores[5]);
                dias.IngresarBus(valores[5], valores[0], ruta.estaciones, valores[3], valores[4]);
            }else{
                //crear chofer
                InsertarChofer(Integer.parseInt(valores[2]),"chofer@chofer.com","chofer","Chofer","chofer",true);
                chofer = choferes.buscarID(Integer.parseInt(valores[2]), choferes.raiz);
                ListaDobleEnlazada dias = chofer.getDias();
                dias.Nuevo(valores[5]);
                dias.IngresarBus(valores[5], valores[0], ruta.estaciones, valores[3], valores[4]);
            }
            return true;
        }else{
            return false;
        }

    }
    
    @WebMethod(operationName = "BorrarDatosArchivo")
    public boolean borrarAsignaciones() {
        try{
        choferes.setListasNulas(choferes.raiz);
        String chofs = choferes.ChoferesAgregados(choferes.raiz);
        String[] valores = chofs.split(",");
        for(int i=0;i<valores.length;i++){
            EliminarChofer(Integer.parseInt(valores[i]));
        }
        String[] bus = buses.ListadoDeBusesAgregados();
            for (String bu : bus) {
                buses.Eliminar(bu);
            }
        return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    @WebMethod(operationName = "infoAdmin")
    public String InfoAdmin(@WebParam(name = "correoad") String correo) {
        String temp="";
        NodoAVL admin = administradores.buscarCorreo(correo, administradores.raiz);
        if(admin!=null){
            temp+=admin.getCorreo()+","+admin.getNombre()+","+admin.getApellido();
        }
        return temp;
    }
    
    @WebMethod(operationName = "infoChofer")
    public String InfoChofer(@WebParam(name = "idchof") int id) {
        String temp="";
        NodoAVL chofer = choferes.buscarID(id, choferes.raiz);
        if(chofer!=null){
            temp+=chofer.getId()+","+chofer.getCorreo()+","+chofer.getNombre()+","+chofer.getApellido();
        }
        return temp;
    }
    
    @WebMethod(operationName = "infoEG")
    public String InfoEG(@WebParam(name = "idEG") int id) {
        String temp="";
        NodoAVL estacion = estacionesG.buscarID(id, estacionesG.raiz);
        if(estacion!=null){
            temp+=estacion.getId()+","+estacion.getCorreo()+","+estacion.getNombre()+","+estacion.getApellido();
        }
        return temp;
    }
    
    @WebMethod(operationName = "infoEC")
    public String InfoEC(@WebParam(name = "idEC") int id) {
        String temp="";
        NodoAVL estacion = estacionesE.buscarID(id, estacionesE.raiz);
        if(estacion!=null){
            temp+=estacion.getId()+","+estacion.getCorreo()+","+estacion.getNombre()+","+estacion.getApellido();
        }
        return temp;
    }
    
    @WebMethod(operationName = "AgregarHora")
    public void AgregarHora(@WebParam(name = "hora") String hora,@WebParam(name = "chofer") String chofer,@WebParam(name = "bus") String bus,@WebParam(name = "fecha") String fecha, @WebParam(name = "estacion") String esta) {
        NodoAVL cho = choferes.buscarID(Integer.parseInt(chofer), choferes.raiz);
        if(cho!=null){
            NodoDE dia = cho.getDias().buscarNodoFecha(fecha);
            if(dia!=null){
                NodoDE b = dia.buses.buscarNodoBus(bus);
                if(b!=null){
                    b.horas.Nuevo(hora, esta);
                }
            }
        }
    }
    
    @WebMethod(operationName = "BusesEnEstaciones")
    public String[][] BusesEnEstaciones(@WebParam(name = "name") String dia) {
        
        String[][] BusesEstaciones = new String[choferes.cantidad-1][4];
        int contador=0;
        int con=0;
        String temp = choferes.Choferes(choferes.raiz);
        String[] id = temp.split(",");
        
        for(int i=0;i<id.length;i++){
            NodoAVL nodo = choferes.buscarID(Integer.parseInt(id[i]), choferes.raiz);
            if(nodo!=null){
                NodoDE fecha = nodo.getDias().buscarNodoFecha(dia);
                if(fecha!=null){
                    NodoDE bus = fecha.buses.inicio;
                    while(bus.TieneSiguiente()){
                        if(contador==0){
                            if(bus.TieneEstacionesPendientes()){
                                String estacion = bus.getNextEstacion();
                                BusesEstaciones[con][0]=Integer.toString(nodo.getId());
                                BusesEstaciones[con][1]=dia;
                                BusesEstaciones[con][0]=bus.getIdBus();
                                BusesEstaciones[con][0]=bus.getNextEstacion();
                                contador++;
                            }   
                        }
                        bus = bus.getSiguiente();
                        con++;
                    }
                    bus = fecha.buses.fin;
                    if(contador==0){
                        if(bus.TieneEstacionesPendientes()){
                            String estacion = bus.getNextEstacion();
                            BusesEstaciones[con][0]=Integer.toString(nodo.getId());
                            BusesEstaciones[con][1]=dia;
                            BusesEstaciones[con][0]=bus.getIdBus();
                            BusesEstaciones[con][0]=bus.getNextEstacion();
                            contador++;
                        }   
                    }
                }
            }
        }
        return BusesEstaciones;
    }
    
    @WebMethod(operationName = "horariosChofer")
    public String[][] horarioChofer(@WebParam(name = "idh") int id) {
        String[][] horario = null;
        NodoAVL chofer = choferes.buscarID(id, choferes.raiz);
        if(chofer!=null){
            horario = chofer.getDias().HorarioChofer();
        }
        return horario;
    }
    
    @WebMethod(operationName = "ReporteHorasBuses")
    public String[] ReporteHorasBuses(@WebParam(name = "idCh") String chofer, @WebParam(name = "idBus") String bus) {
        String[] cadenas = new String[2];
        String codigo="";
        String valores="";
        NodoAVL cho = choferes.buscarID(Integer.parseInt(chofer), choferes.raiz);
        if(cho!=null){
            NodoDE dia = cho.getDias().inicio;
            if(dia!=null){
                while(dia.TieneSiguiente()){
                NodoDE b = dia.buses.buscarNodoBus(bus);
                if(b!=null){
                    valores+= "nodo" + bus + "[label=" +'"'+dia.getFecha() + "," +b.getIdBus()+'"'+ "];"+"\n";
                    NodoDE horas = b.horas.inicio;
                    if(horas!=null){
                        valores+= "nodo" + horas.getID() + "[label=" +'"'+horas.getHorapasada()+'"'+ "];"+"\n";
                        codigo+= "nodo"+bus+" -- " + "nodo"+horas.getID()+"\n";
                        while(horas.TieneSiguiente()){
                            horas = horas.getSiguiente();
                            valores+= "nodo" + horas.getID() + "[label=" +'"'+horas.getHorapasada()+'"'+ "];"+"\n";
                            codigo+= "nodo"+horas.getAnterior().getID()+" -- " + "nodo"+horas.getID()+"\n";
                        }
                    }
                    
                }
                dia = dia.getSiguiente();
                }

            }
            dia = cho.getDias().fin;
            NodoDE b = dia.buses.buscarNodoBus(bus);
                if(b!=null){
                    NodoDE horas = b.horas.inicio;
                    if(horas!=null){
                        valores+= "nodo" + horas.getID() + "[label=" +'"'+horas.getHorapasada()+'"'+ "];"+"\n";
                        codigo+= "nodo"+bus+" -- " + "nodo"+horas.getID()+"\n";
                        while(horas.TieneSiguiente()){
                            horas = horas.getSiguiente();
                            valores+= "nodo" + horas.getID() + "[label=" +'"'+horas.getHorapasada()+'"'+ "];"+"\n";
                            codigo+= "nodo"+horas.getAnterior().getID()+" -- " + "nodo"+horas.getID()+"\n";
                        }
                    }
                    
                }
            
        }
        
        cadenas[0]=valores;
        cadenas[1]=codigo;
        
        return cadenas;
    }
    
    @WebMethod(operationName = "ReporteBusesChofer")
    public String[] ReporteBusesChofer(@WebParam(name = "idchof") int id) {
        String[] cadenas = new String[2];
        String codigo="";
        String valores="";
        NodoAVL chofer = choferes.buscarID(id, choferes.raiz);
        if(chofer!=null){
            NodoDE dia = chofer.getDias().inicio;
            if(dia!=null){
                valores+= "nodo" + dia.getID() + "[label=" +'"'+dia.getFecha()+'"'+ "];"+"\n";
                NodoDE bus = dia.buses.inicio;
                if(bus!=null){
                    valores+= "nodo" + bus.getIdBus() + "[label=" +'"'+bus.getIdBus()+'"'+ "];"+"\n";
                    codigo+= "nodo"+dia.getID()+" -- " + "nodo"+bus.getIdBus()+"\n";
                    while(bus.TieneSiguiente()){
                        bus = bus.getSiguiente();
                        valores+= "nodo" + bus.getIdBus() + "[label=" +'"'+bus.getIdBus()+'"'+ "];"+"\n";
                        codigo+= "nodo"+bus.getAnterior().getID()+" -- " + "nodo"+bus.getIdBus()+"\n";
                    }
                }
                
                while(dia.TieneSiguiente()){
                    dia = dia.getSiguiente();
                    if(bus!=null){
                    valores+= "nodo" + bus.getIdBus() + "[label=" +'"'+bus.getIdBus()+'"'+ "];"+"\n";
                    codigo+= "nodo"+dia.getID()+" -- " + "nodo"+bus.getIdBus()+"\n";
                    while(bus.TieneSiguiente()){
                        bus = bus.getSiguiente();
                        valores+= "nodo" + bus.getIdBus() + "[label=" +'"'+bus.getIdBus()+'"'+ "];"+"\n";
                        codigo+= "nodo"+bus.getAnterior().getID()+" -- " + "nodo"+bus.getIdBus()+"\n";
                    }
                }
                }  
                
            }
        }
        
        cadenas[0]=valores;
        cadenas[1]=codigo;
        
        return cadenas;
        
    }
    
    @WebMethod(operationName = "CodigoArbolAVL")
    public String[] ReporteArbolAVL(@WebParam(name = "tipo") String tipo) {
        String[] cadenas = new String[2];
        String codigo="";
        String valores="";
        switch(tipo){
            case "admin":
                administradores.agregarID(administradores.raiz, 0);
                valores=administradores.Valores(administradores.raiz);
                codigo=administradores.Codigos(administradores.raiz);
                break;
            case "chofer":
                valores = choferes.Valores(choferes.raiz);
                codigo = choferes.Codigos(choferes.raiz);
                break;
            case "estacionG":
                valores = estacionesG.Valores(estacionesG.raiz);
                codigo = estacionesG.Codigos(estacionesG.raiz);
                break;
            case "estacionC":
                valores = estacionesE.Valores(estacionesE.raiz);
                codigo = estacionesE.Codigos(estacionesE.raiz);
                break;
            default:
                break;
        }
        cadenas[0]=valores;
        cadenas[1]=codigo;
        
        return cadenas;
    }
    
    @WebMethod(operationName = "ResumenEstacion")
    public String[][] ResumenEstacion(@WebParam(name = "name") String estacion) {
        String[][] resumen = new String[500][2];
        int contador = 0;
        
        String temp = choferes.Choferes(choferes.raiz);
        String[] id = temp.split(",");
        
        for (String id1 : id) {
            NodoAVL chofer = choferes.buscarID(Integer.parseInt(id1), choferes.raiz);
            if(chofer!=null){
                NodoDE dia = chofer.getDias().inicio;
                if(dia!=null){
                    NodoDE bus = dia.buses.inicio;
                    if(bus!=null){
                        NodoDE hora = bus.horas.inicio;
                        if(hora!=null){
                            if(hora.estacion.equals(estacion)){
                                resumen[contador][0]=bus.getIdBus();
                                resumen[contador][1]=hora.estacion;
                                contador++;
                            }
                            while(hora.TieneSiguiente()){
                                hora = hora.getSiguiente();
                                if(hora.estacion.equals(estacion)){
                                    resumen[contador][0]=bus.getIdBus();
                                    resumen[contador][1]=hora.estacion;
                                    contador++;
                                }
                            }
                        }
                        while(bus.TieneSiguiente()){
                            bus = bus.getSiguiente();
                            hora = bus.horas.inicio;
                            if(hora!=null){
                                if(hora.estacion.equals(estacion)){
                                    resumen[contador][0]=bus.getIdBus();
                                    resumen[contador][1]=hora.estacion;
                                    contador++;
                                }
                                while(hora.TieneSiguiente()){
                                    hora = hora.getSiguiente();
                                    if(hora.estacion.equals(estacion)){
                                        resumen[contador][0]=bus.getIdBus();
                                        resumen[contador][1]=hora.estacion;
                                        contador++;
                                    }
                                }
                            }
                        }
                    }
                    
                    while(dia.TieneSiguiente()){
                        dia = dia.getSiguiente();
                        bus = dia.buses.inicio;
                        if(bus!=null){
                            NodoDE hora = bus.horas.inicio;
                            if(hora!=null){
                                if(hora.estacion.equals(estacion)){
                                    resumen[contador][0]=bus.getIdBus();
                                    resumen[contador][1]=hora.estacion;
                                    contador++;
                                }
                                while(hora.TieneSiguiente()){
                                    hora = hora.getSiguiente();
                                    if(hora.estacion.equals(estacion)){
                                        resumen[contador][0]=bus.getIdBus();
                                        resumen[contador][1]=hora.estacion;
                                        contador++;
                                    }
                                }
                            }
                            while(bus.TieneSiguiente()){
                                bus = bus.getSiguiente();
                                hora = bus.horas.inicio;
                                if(hora!=null){
                                    if(hora.estacion.equals(estacion)){
                                        resumen[contador][0]=bus.getIdBus();
                                        resumen[contador][1]=hora.estacion;
                                        contador++;
                                    }
                                    while(hora.TieneSiguiente()){
                                        hora = hora.getSiguiente();
                                        if(hora.estacion.equals(estacion)){
                                            resumen[contador][0]=bus.getIdBus();
                                            resumen[contador][1]=hora.estacion;
                                            contador++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                }
                
            }
        }
        
        return resumen;
        
    }
    
    @WebMethod(operationName = "ListaChoferes")
    public String[] ListaChoferes() {
        String temp = choferes.Choferes(choferes.raiz);
        String[] id = temp.split(",");
        return id;
    }
    
    @WebMethod(operationName = "ListaBuses")
    public String[] ListaBuses() {
        String[] bus = buses.ListadoDeBuses();
        return bus;
    }
    
    @WebMethod(operationName = "ListaEstacionesG")
    public String[] ListaEstacionesG() {
        String temp = estacionesG.EG(estacionesG.raiz);
        String[] id = temp.split(",");
        return id;
    }
    
    @WebMethod(operationName = "ListaEstacionesC")
    public String[] ListaEstacionesC() {
        String temp = estacionesE.EE(estacionesE.raiz);
        String[] id = temp.split(",");
        return id;
    }
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
