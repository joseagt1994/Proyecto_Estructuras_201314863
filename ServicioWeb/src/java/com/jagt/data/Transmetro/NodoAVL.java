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
public class NodoAVL {
    
    private int ID;
    NodoAVL hijoDerecho;
    NodoAVL hijoIzquierdo;
    String contraseña;
    //Administrador y Chofer
    String correo;
    String nombre;
    String apellido;
    private ListaDobleEnlazada dias;
    boolean archivo;
    //Estaciones Generales y Especificas
    int id,fe;
    int cantidad;
    
    //Admin
    public NodoAVL(String correo, String contra, String nom, String ape){
        this.correo = correo;
        this.nombre = nom;
        this.apellido = ape;
        this.contraseña = contra;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        this.fe=0;
    }
    
    //Chofer
    public NodoAVL(int id, String correo, String contra, String nom, String ape, ListaDobleEnlazada l, boolean b){
        this.id = id;
        this.correo = correo;
        this.nombre = nom;
        this.apellido = ape;
        this.contraseña = contra;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        this.dias = l;
        this.archivo = b;
        this.fe=0;
    }
    
    //Estaciones
    public NodoAVL(int id,String con, String nombre, int cantidad){
        this.id = id;
        this.contraseña = con;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public NodoAVL getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoAVL hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public NodoAVL getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoAVL hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ListaDobleEnlazada getDias() {
        return dias;
    }

    public void setDias(ListaDobleEnlazada dias) {
        this.dias = dias;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    
}
