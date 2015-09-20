/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jagt.data.Transmetro;

/**
 *
 * @author Jose Antonio
 */
public class ListaDobleEnlazadaH {
    public NodoDE inicio;
    public int tamaño;
    public NodoDE fin;
    
    public ListaDobleEnlazadaH(){
        
    }
    
    public boolean Nuevo(String hora,String estacion){
        if(inicio==null){
            inicio = new NodoDE(null,hora,estacion,null);
            inicio.setID(tamaño);
            fin = inicio;
            tamaño++;
            return true;
        }else{
            NodoDE temp = inicio;
            while(temp.TieneSiguiente()){
                temp = temp.getSiguiente();
                
            }
            temp.setSiguiente(new NodoDE(temp,hora,estacion,null));
            temp.getSiguiente().setID(tamaño);
            tamaño++;
            fin = temp.getSiguiente();
            return true;
        }
    }
    
    public NodoDE buscarNodoBus(String id,String ruta,String hi,String hf){
        NodoDE nodo = new NodoDE();
        NodoDE aux = inicio;
        while(aux.TieneSiguiente()){
            if(aux.getIdBus().equals(id) && aux.estaciones.equals(ruta) && aux.hora_inicio.equals(hi) && aux.hora_final.equals(hf)){
                nodo = aux;
            }
            aux = aux.getSiguiente();
        }
        if(fin.getIdBus().equals(id) && fin.estaciones.equals(ruta) && fin.hora_inicio.equals(hi) && fin.hora_final.equals(hf)){
            nodo = aux;
        }
        return nodo;
    }
}
