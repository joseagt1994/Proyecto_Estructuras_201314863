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
public class ArbolAVLChofer extends ArbolAVL{
    
    public NodoAVL raiz;
    boolean archivo;
    int contador;
    public int cantidad;

    public ArbolAVLChofer(){
        this.raiz = null;
    }

    //Buscar Chofer
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
    
    public void insertarChofer(int id,String correo,String nombre,String apellido,String contra, ListaDobleEnlazada dias, boolean archivo){
        NodoAVL n = new NodoAVL(id, correo, contra, nombre, apellido, dias, archivo);
        if(raiz==null){
            raiz=n;
        }else{
            raiz = insertarAVLID(n,raiz);
        }
        cantidad++;
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
    
//    public int ContarChoferes(NodoAVL n){
//        int con = 0;
//        if(n!=null){
//            if(n.archivo==true){
//                con+=1;
//            }
//            con+=ContarChoferes(n.hijoIzquierdo);
//            con+=ContarChoferes(n.hijoDerecho);
//        }
//        return con;
//    }
    
    public String ChoferesAgregados(NodoAVL n){
        String temp ="";
        if(n!=null){
            if(n.archivo==true){
                temp+= n.getId() + ",";
            }
            temp+=ChoferesAgregados(n.hijoIzquierdo);
            temp+=ChoferesAgregados(n.hijoDerecho);
        }
        return temp;
    }
    
    public void setListasNulas(NodoAVL n){
        if(n!=null){
            n.setDias(null);
            setListasNulas(n.hijoIzquierdo);
            setListasNulas(n.hijoDerecho);
        }
    }
    
    public String Choferes(NodoAVL n){
        String temp ="";
        if(n!=null){
            temp+=n.getId()+",";
            temp+=ChoferesAgregados(n.hijoIzquierdo);
            temp+=ChoferesAgregados(n.hijoDerecho);
        }
        return temp;
    }
    
    //Actualizar Chofer
    public boolean ActualizarNodoChofer(int id,String dato,String tipo,NodoAVL n){
        
        boolean aux = false;
        NodoAVL actualizar = buscarID(id,n);
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
    
    public ArbolAVLChofer ActualizarChofer(NodoAVL n, ArbolAVLChofer arbol){
        if(n!=null){
            arbol.insertarChofer(n.id, n.correo, n.nombre, n.apellido, n.contraseña, n.getDias(), n.archivo);
            ActualizarChofer(n.hijoIzquierdo, arbol);
            ActualizarChofer(n.hijoDerecho, arbol);
        }
        return arbol;
    }
    
    //Eliminar Chofer
    public ArbolAVLChofer EliminarChofer(int id, NodoAVL n, ArbolAVLChofer arbol){
        
        if(n!=null){
            if(n.id == id){
                EliminarChofer(id, n.hijoIzquierdo, arbol);
                EliminarChofer(id,n.hijoDerecho, arbol);
                cantidad--;
            }else{
                arbol.insertarChofer(n.id, n.correo, n.nombre, n.apellido, n.contraseña, n.getDias(), n.archivo);
                EliminarChofer(id, n.hijoIzquierdo, arbol);
                EliminarChofer(id,n.hijoDerecho, arbol);
            }
            
        }
        
        return arbol;
    }
    
}
