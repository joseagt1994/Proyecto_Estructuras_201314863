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
public class ListaDobleEnlazadaBC {
    
    public NodoDE inicio;
    public int tamaño;
    public NodoDE fin;
    
    public ListaDobleEnlazadaBC(){
        
    }
    
    public boolean Nuevo(String id,String ruta,String hi,String hf){
        if(inicio==null){
            inicio = new NodoDE(null,id,ruta,hi,hf,null);
            fin = inicio;
            tamaño++;
            return true;
        }else{
            NodoDE temp = inicio;
            while(temp.TieneSiguiente()){
                temp = temp.getSiguiente();
                
            }
            temp.setSiguiente(new NodoDE(temp,id,ruta,hi,hf,null));
            tamaño++;
            fin = temp.getSiguiente();
            return true;
        }
    }
    
    public NodoDE buscarNodoBus(String id){
        NodoDE nodo = new NodoDE();
        NodoDE aux = inicio;
        while(aux.TieneSiguiente()){
            if(aux.getIdBus().equals(id)){
                nodo = aux;
            }
            aux = aux.getSiguiente();
        }
        if(fin.getIdBus().equals(id)){
            nodo = aux;
        }
        return nodo;
    }
    
    public String[][] HorasBuses(){
        int contador = 0;
        int contador2 =0;
        String[][] temporal = new String[tamaño][3];
        NodoDE temp = inicio;
        while(temp.TieneSiguiente()){
            
            NodoDE temp2 = temp.horas.inicio;
            while(temp2.TieneSiguiente()){
                temporal[contador][contador2]=temp.getIdBus();
                temporal[contador][contador2+1]=temp2.getHorapasada();
                temporal[contador][contador2+2]=temp2.estacion;
                temp2 = temp2.getSiguiente();
                contador2=0;
            }
            temporal[contador][contador2]=temp.getIdBus();
            temporal[contador][contador2+1]=temp2.getHorapasada();
            temporal[contador][contador2+2]=temp2.estacion;
            temp = temp.getSiguiente();
            contador++;
        }
        
        NodoDE temp2 = fin.horas.inicio;
        while(temp2.TieneSiguiente()){
            temporal[contador][contador2]=fin.getIdBus();
            temporal[contador][contador2+1]=temp2.getHorapasada();
            temporal[contador][contador2+2]=temp2.estacion;
            temp2 = temp2.getSiguiente();
            contador2=0;
        }
        temporal[contador][contador2]=fin.getIdBus();
        temporal[contador][contador2+1]=fin.horas.fin.getHorapasada();
        temporal[contador][contador2+2]=fin.horas.fin.estacion;
        return temporal;
    }
    
//    public boolean Eliminar(int numero){
//        int contador=0;
//        NodoDE temp = inicio;
//        while(temp.TieneSiguiente()){
//            
//            
//            if(temp.getID()==numero){
//                
//                
//                
//                if(temp.getAnterior()!=null){
//                temp.getAnterior().setSiguiente(temp.getSiguiente());
//            }
//                if(temp.getSiguiente()!=null){
//                temp.getSiguiente().setAnterior(temp.getAnterior());
//            }
//                
//                if(contador==0){
//                    inicio = temp.getSiguiente();
//                }
//            }
//            
//            temp = temp.getSiguiente();
//            contador++;
//        }
//        
//        if(temp.getID()==numero){
//            if(temp.getAnterior()!=null){
//                temp.getAnterior().setSiguiente(temp.getSiguiente());
//            }
//                if(temp.getSiguiente()!=null){
//                temp.getSiguiente().setAnterior(temp.getAnterior());
//            }
//        }
//        
//        
////        temp.setAnterior(null);
////        temp.setSiguiente(null);
//        tamaño--;
//        return true;
//    }
//    
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
    
//    public String[] getCodigo(){
//        String[] cadenas = new String[2];
//        String codigo="";
//        String valores="";
//        NodoDE temp = inicio;
//        while(temp.TieneSiguiente()){
//            
//            valores+= "nodo" + temp.getID() + "[label=" +'"'+temp.getObjeto().toString()+'"'+ "];"+"\n";
//            if(temp.TieneAnterior()){
//                codigo+= "nodo"+temp.getID()+" -- " + "nodo"+temp.getAnterior().getID()+"\n";
//            }
//            if(temp.TieneSiguiente()){
//                codigo+= "nodo"+temp.getID()+" -- " + "nodo"+temp.getSiguiente().getID()+"\n";
//            }
//            temp = temp.getSiguiente();
//            
//        }
//        valores+= "nodo" + temp.getID() + "[label=" + '"'+temp.getObjeto().toString()+'"'+ "]"+"\n";
//            if(temp.TieneAnterior()){
//                codigo+= "nodo"+temp.getID()+" -- " + "nodo"+temp.getAnterior().getID()+"\n";
//            }
//            if(temp.TieneSiguiente()){
//                codigo+= "nodo"+temp.getID()+" -- " + "nodo"+temp.getSiguiente().getID()+"\n";
//            }
//            
//            cadenas[0]=valores;
//            cadenas[1]=codigo;
//            
//        return cadenas;
//    }
    
}
