/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jagt.data.Transmetro;

import java.util.Date;

/**
 *
 * @author Jose Antonio
 */
public class NodoDE {
    
    //Se usa para los buses por dia
    String[] Estaciones;
    int contador;
    
    private int ID;
    private NodoDE anterior;
    private NodoDE siguiente;
    public String idBus;
    public boolean archivo;
    public String ruta;
    public String estaciones;
    public String hora_inicio;
    public String hora_final;
    public String fecha;
    public String horapasada;
    public String estacion;
    public ListaDobleEnlazadaBC buses;
    public ListaDobleEnlazadaH horas;
    
    
    public NodoDE(){
        
    }
    
    public boolean TieneEstacionesPendientes(){
        if(contador==Estaciones.length-1){
            return false;
        }else{
            return true;
        }
    }
    
    public String getNextEstacion(){
        String estac = Estaciones[contador];
        contador++;
        return estac;
    }
    
    //Nodo Buses 
    public NodoDE(NodoDE anterior, String id, boolean b, NodoDE siguiente){
        this.anterior = anterior;
        this.idBus = id; 
        this.archivo = b;
        this.siguiente = siguiente;
    }
    
    //Nodo Ruta
    public NodoDE(NodoDE anterior, String r, String e, int numero, NodoDE siguiente){
        this.anterior = anterior;
        this.ruta = r; 
        this.estaciones = e;
        this.ID = numero;
        this.siguiente = siguiente;
    }
    
    //Nodo Fechas
    public NodoDE(NodoDE anterior, String f, ListaDobleEnlazadaBC buses, NodoDE siguiente){
        this.anterior = anterior;
        this.fecha = f;
        this.buses = buses;
        this.siguiente = siguiente;
    }
    
    //Nodo Buses de Choferes
    public NodoDE(NodoDE anterior, String id, String est, String hi, String hf, NodoDE siguiente){
        this.anterior = anterior;
        this.estaciones = est;
        this.Estaciones = estaciones.split(",");
        this.hora_inicio = hi;
        this.hora_final = hf;
        this.siguiente = siguiente;
    }
    
    //Nodo Horas
    public NodoDE(NodoDE anterior, String hora, String estacion, NodoDE siguiente){
        this.anterior = anterior;
        this.horapasada = hora;
        this.estacion = estacion;
        this.siguiente = siguiente;
    }
    
    

    public NodoDE getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDE anterior) {
        this.anterior = anterior;
    }

    public NodoDE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDE siguiente) {
        this.siguiente = siguiente;
    }
    
    public boolean TieneSiguiente(){
        return siguiente!=null;
    }
    
    public boolean TieneAnterior(){
        return anterior!=null;
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorapasada() {
        return horapasada;
    }

    public void setHorapasada(String horapasada) {
        this.horapasada = horapasada;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
}
