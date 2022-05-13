/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas.PilaArrayList;

import java.util.Scanner;

/**
 *
 * @author Josue_Guevara
 */
public class PilaEnlazada {
    private static final Scanner sn = new Scanner(System.in);
    
    public Nodo firstNodo;
    
    public PilaEnlazada(){
        firstNodo = null;
    }
    
    public void addPila() {
        int opcion = 1;
        while (opcion != 0) {
            addPilaNodo();
            System.out.println("\n------------------------------------------------");
            System.out.println("Para salir preciona 0 y par aseguir preciona cualquier numero: ");
            opcion = Integer.parseInt(sn.nextLine());

        }
    }

    public void addPilaNodo() {
        System.out.println("\nIngresa un numero: ");
        int numero = Integer.parseInt(sn.nextLine());
        firstNodo = new Nodo(numero, firstNodo);
    }
    
    public PilaEnlazada deleteFIFO(){
        Nodo nodoActual = firstNodo;
        Nodo actualizado = null;
        
        actualizado = nodoActual.enlace;
        firstNodo = actualizado;
        System.out.println("Elemento sacado de pila - "+nodoActual.raiz);
        return this;
    }
    
    public void viewPila(){
        Nodo nodo = firstNodo;
        while(nodo !=null){
            System.out.println("Dato de pila "+nodo.raiz);
            nodo = nodo.enlace;
        }
        if(nodo == null){
            System.out.println("Pila vacia");
        }
    }
    
    public void cimaPilaEnlazada(){
        Nodo nodoCima = firstNodo;
        System.out.println("Nodo cima = "+nodoCima.raiz);
    }
    
    public PilaEnlazada limpiarPilaEnlazada(){
        firstNodo = null;
        return this;
    }
    
}

