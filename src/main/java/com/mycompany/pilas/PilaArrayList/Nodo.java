/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas.PilaArrayList;

/**
 *
 * @author Josue_Guevara
 */
public class Nodo {
    Object raiz;
    Nodo enlace;
    
    //Creacion del nodo inicial 
    public Nodo(Object objeto){
        this.raiz = objeto;
        this.enlace = null;
    }
    
    //Metodo para enlazar y crear la lista
    public Nodo(Object objeto, Nodo n){
        this.raiz = objeto;
        this.enlace = n;
    }
    
}
