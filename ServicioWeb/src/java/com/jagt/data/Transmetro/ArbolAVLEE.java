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
public class ArbolAVLEE extends ArbolAVL{
 
    public NodoAVL raiz;

    public ArbolAVLEE(){
        this.raiz = null;
    }
    
//    public static ArbolAVLEE getInstance(){
//        if(instance==null){
//            instance = new ArbolAVLEE();
//        }
//        return instance;
//    }
    
    //Buscar Estaciones y Chofer
    public NodoAVL buscarID(int d,NodoAVL r){
        if(raiz == null){
            return null;
        }else if(r.id == d){
            return r;
        }else if(r.id < d){
            return buscarID(d,r.hijoIzquierdo);
        }else{
            return buscarID(d,r.hijoDerecho);
        }
    }
    
    //Insertar en AVL con ID
    public NodoAVL insertarAVLID(NodoAVL n, NodoAVL ar){
        NodoAVL padre = ar;
        if(n.id<ar.id){
            if(ar.correo==null){
                ar.hijoIzquierdo=n;
            }else{
                ar.hijoIzquierdo = insertarAVLID(n,ar.hijoIzquierdo);
                if(getFE(ar.hijoIzquierdo) - getFE(ar.hijoDerecho) == 2){
                    if(n.id<ar.hijoIzquierdo.id){
                        padre = rotacionIzq(ar);
                    }else{
                        padre = rotacionDobleIzq(ar);
                    }
                }
            }
        }else if(n.id>ar.id){
            if(ar.hijoDerecho==null){
                ar.hijoDerecho = n;
            }else{
                ar.hijoDerecho = insertarAVLID(n,ar.hijoDerecho);
                if(getFE(ar.hijoDerecho) - getFE(ar.hijoIzquierdo) == 2){
                    if(n.id>ar.hijoDerecho.id){
                        padre = rotacionDer(ar);
                    }else{
                        padre = rotacionDobleDer(ar);
                    }
                }
            }
        }else{
            System.out.println("Nodo Duplicado");
        }
        //Actualizar altura
        if((ar.hijoIzquierdo==null)&&(ar.hijoDerecho!=null)){
            ar.fe = getFE(ar.hijoDerecho) +1;
        }else if((ar.hijoDerecho==null)&&(ar.hijoIzquierdo!=null)){
            ar.fe = getFE(ar.hijoIzquierdo) +1;
        }else{
            ar.fe = Math.max(getFE(ar.hijoIzquierdo), getFE(ar.hijoDerecho))+1;
        }
        return padre;
    }
    
    public void insertarEstacion(int id,String nombre,String contra, int cant){
        NodoAVL n = new NodoAVL(id, contra, nombre, cant);
        if(raiz==null){
            raiz=n;
        }else{
            raiz = insertarAVLID(n,raiz);
        }
    }
    
    public void preOrdenID(NodoAVL n){
        if(n!=null){
            System.out.print(n.id + ", ");
            preOrdenID(n.hijoIzquierdo);
            preOrdenID(n.hijoDerecho);
        }
    }
    
    public String Valores(NodoAVL n){
        String val = "";
        if(n!=null){
            val+= "nodo" + n.getId() + "[label=" +'"'+n.getId()+'"'+ "];"+"\n";
            val+=Valores(n.hijoIzquierdo);
            val+=Valores(n.hijoDerecho);
        }
        return val;
    }
    
    public String Codigos(NodoAVL n){
        String val = "";
        if(n!=null){
            if(n.hijoIzquierdo!=null){
                val+= "nodo"+n.getId()+" -- " + "nodo"+n.hijoIzquierdo.getId()+"\n";
                val+= Codigos(n.hijoIzquierdo);
            }else if(n.hijoDerecho!=null){
                val+= "nodo"+n.getId()+" -- " + "nodo"+n.hijoDerecho.getId()+"\n";
                val+= Codigos(n.hijoDerecho);
            }
        }
        return val;
    }
    
    public String EE(NodoAVL n){
        String temp ="";
        if(n!=null){
            temp+=n.nombre+",";
            temp+=EE(n.hijoIzquierdo);
            temp+=EE(n.hijoDerecho);
        }
        return temp;
    }
    
    //Actualizar EG
    public boolean ActualizarNodoEE(int id,String dato,String tipo,NodoAVL n){
        
        boolean aux = false;
        NodoAVL actualizar = buscarID(id,n);
        if(actualizar!=null){
            switch(tipo){
                case "nombre":
                    actualizar.nombre = dato;
                    break;
                case "cantidad":
                    actualizar.cantidad = Integer.parseInt(dato);
                    break;
                default:
                    aux = true;
                    break;
            }
            return aux != true;
        }else{
            return false;
        }
    }
    
    public ArbolAVLEE ActualizarEE(NodoAVL n, ArbolAVLEE arbol){
        if(n!=null){
            arbol.insertarEstacion(n.id, n.nombre, n.contraseña, n.cantidad);
            ActualizarEE(n.hijoIzquierdo, arbol);
            ActualizarEE(n.hijoDerecho, arbol);
        }
        return arbol;
    }
    
    //Eliminar EG
    public ArbolAVLEE EliminarEE(int id, NodoAVL n, ArbolAVLEE arbol){
        
        if(n!=null){
            if(n.id == id){
                EliminarEE(id, n.hijoIzquierdo, arbol);
                EliminarEE(id,n.hijoDerecho, arbol);
            }else{
                arbol.insertarEstacion(n.id, n.nombre, n.contraseña, n.cantidad);
                EliminarEE(id, n.hijoIzquierdo, arbol);
                EliminarEE(id,n.hijoDerecho, arbol);
            }
            
        }
        return arbol;
    }
}
