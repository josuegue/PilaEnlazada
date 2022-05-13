/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas.PilaArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue_Guevara
 */
public class PilaArrayList {

    private int cima;
    private List listaPila;

    public PilaArrayList() {
        cima = -1;
        listaPila = new ArrayList();

    }

    public void insertar(Object elemento) throws Exception {
        cima++;
        listaPila.add(elemento);
    }

    public Object quitar() throws Exception {
        Object aux = null;
        if (pilaVacia()) {
            throw new Exception("pila vacia");
        }
        for (int i = 0; i <= listaPila.size(); i++) {
            if (i == listaPila.size()) {
                aux = listaPila.get(i);
            }

        }
        listaPila.remove(aux);
        cima--;
        return this;
    }

// metodo para acceso a la cima de la pila
    public void cimaPila() throws Exception {
        Object cima = null;
        if (!pilaVacia()) {
            throw new Exception("pila Vacia, no se puede");
        }

        for (int i = 0; i <= listaPila.size(); i++) {
            if (i == listaPila.size()) {
                cima = listaPila.get(i);
            }
        }
        System.out.println("La cima es = " + cima);
    }

//verifica estado de la pila
    public boolean pilaVacia() {
        return listaPila != null;
    }

    public void quitarCima() throws Exception {
        while (pilaVacia()) {
            quitar();
        }
    }
    
    public Object limpiarPila(){
        listaPila = null;
        cima = -1;
        return this;
    }

}
