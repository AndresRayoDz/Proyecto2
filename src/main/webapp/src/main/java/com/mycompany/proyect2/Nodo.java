/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyect2;

/**
 *
 * @author Familia Rayo
 */
public class Nodo {
    private Nodo derecho;
    private Nodo izquierdo;
    private String dato;

    
    public Nodo(String dato){
        this.dato=dato;
        this.izquierdo=null;
        this.derecho=null;
        

        
        
        
        
    }
   
    public void set_izquierdo(Nodo nodo){
    
    
        this.izquierdo=nodo;
    
    }
    public Nodo get_izquirdo(Nodo nodo){
    
    
            return izquierdo;
    }
    public void set_derecho(Nodo nodo){
        this.derecho=nodo;
    
        
    
    
    }
    
    public Nodo get_derecho(){
    
        return derecho;
    
    
    
    }
    
    
    public String get_dato(){
    
        return dato;
    
    
  
        
        
        
        
    
    
    
    
    }
}