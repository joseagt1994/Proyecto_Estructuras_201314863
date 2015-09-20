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
public class ArbolAVL {
    
    public NodoAVL raiz;
    
    public ArbolAVL(){
        raiz = null;
    }
    
    //Obtener factor de equilibrio
    public int getFE(NodoAVL n){
        if(n == null){
            return -1;
        }else{
            return n.fe;
        }
    }
    
    //Rotaciones simples
    
    //Izquierda
    public NodoAVL rotacionIzq(NodoAVL n){
        NodoAVL aux = n.hijoIzquierdo;
        n.hijoIzquierdo=aux.hijoDerecho;
        aux.hijoDerecho=n;
        n.fe = Math.max(getFE(n.hijoIzquierdo), getFE(n.hijoDerecho))+1;
        aux.fe = Math.max(getFE(aux.hijoIzquierdo), getFE(aux.hijoDerecho))+1;
        return aux;
    }
    
    //Derecha
    public NodoAVL rotacionDer(NodoAVL n){
        NodoAVL aux = n.hijoDerecho;
        n.hijoDerecho=aux.hijoIzquierdo;
        aux.hijoIzquierdo=n;
        n.fe = Math.max(getFE(n.hijoIzquierdo), getFE(n.hijoDerecho))+1;
        aux.fe = Math.max(getFE(aux.hijoIzquierdo), getFE(aux.hijoDerecho))+1;
        return aux;
    }
    
    //Rotaciones Dobles
    
    //Izquierda
    public NodoAVL rotacionDobleIzq(NodoAVL n){
        NodoAVL temp;
        n.hijoIzquierdo = rotacionDer(n.hijoIzquierdo);
        temp = rotacionIzq(n);
        return temp;
    }
    
    //Derecha
    public NodoAVL rotacionDobleDer(NodoAVL n){
        NodoAVL temp;
        n.hijoDerecho = rotacionIzq(n.hijoDerecho);
        temp = rotacionDer(n);
        return temp;
    }
    
    
    
}


