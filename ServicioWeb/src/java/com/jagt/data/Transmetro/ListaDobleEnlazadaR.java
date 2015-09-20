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
public class ListaDobleEnlazadaR{
    NodoDE inicio;
    int tamaño;
    NodoDE fin;
    
    public ListaDobleEnlazadaR(){
        
    }
    
    public boolean Nuevo(String nombre, String est){
        if(inicio==null){
            inicio = new NodoDE(null,nombre,est,tamaño,null);
            fin = inicio;
            tamaño++;
            return true;
        }else{
            NodoDE temp = inicio;
            while(temp.TieneSiguiente()){
                temp = temp.getSiguiente();
                
            }
            temp.setSiguiente(new NodoDE(temp,nombre,est,tamaño,null));
            tamaño++;
            fin = temp.getSiguiente();
            return true;
        }
    }
    
    public NodoDE buscarNodoRuta(String nom){
        NodoDE nodo = new NodoDE();
        NodoDE aux = inicio;
        while(aux.TieneSiguiente()){
            if(aux.getRuta().equals(nom)){
                nodo = aux;
            }
            aux = aux.getSiguiente();
        }
        if(fin.getRuta().equals(nom)){
            nodo = aux;
        }
        return nodo;
    }
    
    public Object[] ListadoDeRutas(){
        
        int contador = 0;
        String[] temporal = new String[tamaño];
        NodoDE temp = inicio;
        while(temp.TieneSiguiente()){
            temporal[contador]=temp.getRuta();
            temp = temp.getSiguiente();
            contador++;
        }
        temporal[contador]=fin.getRuta();
        return temporal;
        
    }
    
    public boolean Eliminar(String numero){
        int contador=0;
        NodoDE temp = inicio;
        while(temp.TieneSiguiente()){
            
            
            if(temp.getRuta()==numero){
                
                
                
                if(temp.getAnterior()!=null){
                temp.getAnterior().setSiguiente(temp.getSiguiente());
            }
                if(temp.getSiguiente()!=null){
                temp.getSiguiente().setAnterior(temp.getAnterior());
            }
                
                if(contador==0){
                    inicio = temp.getSiguiente();
                }
            }
            
            temp = temp.getSiguiente();
            contador++;
        }
        
        if(temp.getRuta()==numero){
            if(temp.getAnterior()!=null){
                temp.getAnterior().setSiguiente(temp.getSiguiente());
            }
                if(temp.getSiguiente()!=null){
                temp.getSiguiente().setAnterior(temp.getAnterior());
            }
        }
        
        
//        temp.setAnterior(null);
//        temp.setSiguiente(null);
        tamaño--;
        return true;
    }
    
//    public boolean Editar(int numero,Object obj){
//        
//        NodoDE temp = inicio;
//        
//        if(numero==0){
//            temp.setObjeto(obj);
//        }
//        
//        while(temp.TieneSiguiente()){
//            temp = temp.getSiguiente();
//            
//            if(temp.getID()==numero){
//                temp.setObjeto(obj);
//            }
//        }
//        
//        return true;
//    }
    
    public String[] getCodigoBuses(){
        String[] cadenas = new String[2];
        String codigo="";
        String valores="";
        NodoDE temp = inicio;
        while(temp.TieneSiguiente()){
            
            valores+= "nodo" + temp.getID() + "[label=" +'"'+temp.getRuta()+'"'+ "];"+"\n";
            if(temp.TieneAnterior()){
                codigo+= "nodo"+temp.getID()+" -- " + "nodo"+temp.getAnterior().getID()+"\n";
            }
            if(temp.TieneSiguiente()){
                codigo+= "nodo"+temp.getID()+" -- " + "nodo"+temp.getSiguiente().getID()+"\n";
            }
            temp = temp.getSiguiente();
            
        }
        valores+= "nodo" + temp.getID() + "[label=" + '"'+temp.getRuta()+'"'+ "]"+"\n";
            if(temp.TieneAnterior()){
                codigo+= "nodo"+temp.getID()+" -- " + "nodo"+temp.getAnterior().getID()+"\n";
            }
            if(temp.TieneSiguiente()){
                codigo+= "nodo"+temp.getID()+" -- " + "nodo"+temp.getSiguiente().getID()+"\n";
            }
            
            cadenas[0]=valores;
            cadenas[1]=codigo;
            
        return cadenas;
    }
}
