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
public class ListaDobleEnlazada {
    
    public NodoDE inicio;
    public int tamaño;
    public NodoDE fin;
    
    
    public ListaDobleEnlazada(){
       
    }
    
    public boolean Nuevo(String date){
        if(inicio==null){
            inicio = new NodoDE(null,date,new ListaDobleEnlazadaBC(),null);
            inicio.setID(tamaño);
            fin = inicio;
            tamaño++;
            return true;
        }else{
            NodoDE temp = inicio;
            while(temp.TieneSiguiente()){
                temp = temp.getSiguiente();
                
            }
            temp.setSiguiente(new NodoDE(temp,date,new ListaDobleEnlazadaBC(),null));
            temp.getSiguiente().setID(tamaño);
            tamaño++;
            fin = temp.getSiguiente();
            return true;
        }
    }
    
    public String[][] HorarioChofer(){
        int contador = 0;
        int contador2 =0;
        String[][] temporal = new String[tamaño][4];
        NodoDE temp = inicio;
        while(temp.TieneSiguiente()){
            
            NodoDE temp2 = temp.buses.inicio;
            while(temp2.TieneSiguiente()){
                temporal[contador][contador2]=temp.getFecha();
                temporal[contador][contador2+1]=temp2.getIdBus();
                temporal[contador][contador2+2]=temp2.hora_inicio;
                temporal[contador][contador2+3]=temp2.hora_final;
                temp2 = temp2.getSiguiente();
                contador2=0;
            }
            temporal[contador][contador2]=temp.getFecha();
            temporal[contador][contador2+1]=temp.buses.fin.getIdBus();
            temporal[contador][contador2+2]=temp.buses.fin.hora_inicio;
            temporal[contador][contador2+3]=temp.buses.fin.hora_final;
            temp = temp.getSiguiente();
            contador++;
        }
        
        NodoDE temp2 = fin.buses.inicio;
        while(temp2.TieneSiguiente()){
            temporal[contador][contador2]=fin.getFecha();
            temporal[contador][contador2+1]=temp2.getIdBus();
            temporal[contador][contador2+2]=temp2.hora_inicio;
            temporal[contador][contador2+3]=temp2.hora_final;
            temp2 = temp2.getSiguiente();
            contador2=0;
        }
        temporal[contador][contador2]=fin.getFecha();
        temporal[contador][contador2+1]=fin.buses.fin.getIdBus();
        temporal[contador][contador2+2]=fin.buses.fin.hora_inicio;
        temporal[contador][contador2+3]=fin.buses.fin.hora_final;
        return temporal;
    }
    
    public boolean Eliminar(String numero){
        int contador=0;
        NodoDE temp = inicio;
        while(temp.TieneSiguiente()){
            
            
            if(temp.getFecha()==numero){
                
                
                
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
        
        if(temp.getFecha()==numero){
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
    
    public boolean IngresarBus(String dia,String id,String ruta,String hi,String hf){
        NodoDE n = buscarNodoFecha(dia);
        if(n!=null){
           n.buses.Nuevo(id,ruta,hi,hf);
           return true;
        }else{
            return false;
        }
        
    }
    
    public NodoDE buscarNodoFecha(String dia){
        NodoDE nodo = new NodoDE();
        NodoDE aux = inicio;
        while(aux.TieneSiguiente()){
            if(aux.getFecha().equals(dia)){
                nodo = aux;
            }
            aux = aux.getSiguiente();
        }
        if(fin.getFecha().equals(dia)){
            nodo = aux;
        }
        return nodo;
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
