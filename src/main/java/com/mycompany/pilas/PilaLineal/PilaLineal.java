/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas.PilaLineal;

/**
 *
 * @author Josue_Guevara
 */
public class PilaLineal {
    private static final int TAMPILA = 40;
    private int cima;
    private Object[] listaPila;
    
    public PilaLineal(){
        cima = -1;
        listaPila = new Object[TAMPILA];
    }
    
    //Operaciones que modifican la pila (push)
    public void insertar(Object elemento)throws Exception{
        if(pilaLlena()){
            throw new Exception("StackOverFlow se lleno");
            
        }
        cima++;
        listaPila[cima] = elemento;
    }
    
    //Desapilar, quitar, elemento (pop)
    public Object quitar() throws Exception{
        Integer aux;
        if(pilaVacia()){
            throw new Exception ("Pila vacia, no se puede sacar lo que no existe");
        }
        
        // guardar el elemento en de la cima
        aux = (Integer) listaPila[cima];
        
        //decrementar cima y retornar el elemento 
        cima--;
        return aux;
    }
    
    public void limpiarPila() throws Exception{
        cima = -1;
    }
    
    //metodo para acceso a la cima de la pila
    public Object cimaPila() throws Exception{
        if(pilaVacia()){
            throw new Exception("pila vacia, no se puede ");
        }
        return listaPila[cima];
    }
    
    
    //verifica el estado de la pila 
    public boolean pilaVacia(){
        return cima == -1;
    }
    
    //verificar si la cima esta llena
    public boolean pilaLlena(){
        return cima == TAMPILA -1;
    }
}
