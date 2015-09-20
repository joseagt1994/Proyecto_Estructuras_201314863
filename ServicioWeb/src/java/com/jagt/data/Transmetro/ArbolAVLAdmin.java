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
public class ArbolAVLAdmin extends ArbolAVL{
    
    public NodoAVL raiz;

    public ArbolAVLAdmin(){
        this.raiz = null;
        insertarAdministrador("josegiron10100@hotmail.com","Jose","Giron","jose24g10t94");
    }
    
    //Buscar Administrador
    public NodoAVL buscarCorreo(String correo,NodoAVL r){
        if(r == null){
            return null;
        }else if(r.correo.equals(correo)){
            return r;
        }else if(correo.compareTo(r.correo)<0){
            return buscarCorreo(correo,r.hijoIzquierdo);
        }else{
            return buscarCorreo(correo,r.hijoDerecho);
        }
    }
    
    //Insertar en AVL Administrador
    public NodoAVL insertarAVLCorreo(NodoAVL n, NodoAVL ar){
        NodoAVL padre = ar;
        if(n.correo.compareTo(ar.correo)<0){
            if(ar.correo==null){
                ar.hijoIzquierdo=n;
            }else{
                ar.hijoIzquierdo = insertarAVLCorreo(n,ar.hijoIzquierdo);
                if(getFE(ar.hijoIzquierdo) - getFE(ar.hijoDerecho) == 2){
                    if(n.correo.compareTo(ar.hijoIzquierdo.correo)<0){
                        padre = rotacionIzq(ar);
                    }else{
                        padre = rotacionDobleIzq(ar);
                    }
                }
            }
        }else if(n.correo.compareTo(ar.correo)>0){
            if(ar.hijoDerecho==null){
                ar.hijoDerecho = n;
            }else{
                ar.hijoDerecho = insertarAVLCorreo(n,ar.hijoDerecho);
                if(getFE(ar.hijoDerecho) - getFE(ar.hijoIzquierdo) == 2){
                    if(n.correo.compareTo(ar.hijoDerecho.correo)>0){
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
    
    public void insertarAdministrador(String correo,String nombre,String apellido,String contra){
        NodoAVL n = new NodoAVL(correo, contra, nombre, apellido);
        if(raiz==null){
            raiz=n;
        }else{
            raiz = insertarAVLCorreo(n,raiz);
        }
    }
    
    public int agregarID(NodoAVL n,int c){
        int contar = c;
        if(n!=null){
            n.setID(contar);
            contar++;
            contar+=agregarID(n.hijoIzquierdo,contar);
            contar+=agregarID(n.hijoDerecho,contar);
        }
        return contar;
    }
    
    public String Valores(NodoAVL n){
        String val = "";
        if(n!=null){
            val+= "nodo" + n.getID() + "[label=" +'"'+n.getCorreo()+'"'+ "];"+"\n";
            val+=Valores(n.hijoIzquierdo);
            val+=Valores(n.hijoDerecho);
        }
        return val;
    }
    
    public String Codigos(NodoAVL n){
        String val = "";
        if(n!=null){
            if(n.hijoIzquierdo!=null){
                val+= "nodo"+n.getID()+" -- " + "nodo"+n.hijoIzquierdo.getID()+"\n";
                val+= Codigos(n.hijoIzquierdo);
            }
            if(n.hijoDerecho!=null){
                val+= "nodo"+n.getID()+" -- " + "nodo"+n.hijoDerecho.getID()+"\n";
                val+= Codigos(n.hijoDerecho);
            }
        }
        return val;
    }
    
    public void preOrden(NodoAVL n){
        if(n!=null){
            System.out.print(n.correo + ", ");
            preOrden(n.hijoIzquierdo);
            preOrden(n.hijoDerecho);
        }
    }
    
    //Actualizar Administrador
    public boolean ActualizarNodoAdmin(String correo,String dato,String tipo,NodoAVL n){
        
        boolean aux = false;
        NodoAVL actualizar = buscarCorreo(correo,n);
        if(actualizar!=null){
            switch(tipo){
                case "correo":
                    actualizar.correo = dato;
                    break;
                case "nombre":
                    actualizar.nombre = dato;
                    break;
                case "apellido":
                    actualizar.apellido = dato;
                    break;
                case "contra":
                    actualizar.contraseña = dato;
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
    
    public ArbolAVLAdmin ActualizarAdmin(NodoAVL n, ArbolAVLAdmin arbol){
        if(n!=null){
            arbol.insertarAdministrador(n.correo, n.nombre, n.apellido, n.contraseña);
            ActualizarAdmin(n.hijoIzquierdo, arbol);
            ActualizarAdmin(n.hijoDerecho, arbol);
        }
        return arbol;
    }
    
    //Eliminar Administrador
    public ArbolAVLAdmin EliminarAdmin(String correo, NodoAVL n, ArbolAVLAdmin arbol){
        
        if(n!=null){
            if(n.correo.equals(correo)){
                EliminarAdmin(correo, n.hijoIzquierdo, arbol);
                EliminarAdmin(correo,n.hijoDerecho, arbol);
            }else{
                arbol.insertarAdministrador(n.correo, n.nombre, n.apellido, n.contraseña);
                EliminarAdmin(correo, n.hijoIzquierdo, arbol);
                EliminarAdmin(correo,n.hijoDerecho, arbol);
            }
            
        }
        return arbol;
    }
    
}
