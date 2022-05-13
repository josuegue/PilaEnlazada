/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pilas;

import com.mycompany.pilas.PilaArrayList.PilaEnlazada;
import com.mycompany.pilas.PilaVector.PilaVector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Josue_Guevara
 */
public class Main {
    static Scanner sn = new Scanner(System.in);
    
    
    
    //////en la parte del main
static void vectores(){
PilaVector pila = new PilaVector();
int x;
BufferedReader entrada = new BufferedReader(
new InputStreamReader(System.in));
System.out.println("Teclea número de elementos: ");
try {
x = Integer.parseInt(entrada.readLine());
for (int j = 1; j <= x; j++)
{
Double d;
d = Double.valueOf(entrada.readLine());
pila.insertar(d);
}
// vaciado de la pila
System.out.println("Elementos de la Pila: ");
while (!pila.pilaVacia())
{
Double d;
d = (Double)pila.quitar();
if (d.doubleValue() > 0.0)
System.out.print(d + " ");
}
}
catch (Exception er)
{
System.err.println("Excepcion: " + er);
}

}

    public static void ejemplo(){
        // Creating an empty Stack
Stack<Integer> MiPila = new Stack<Integer>();

// Use add() method agrega elementos
MiPila.push(10);
MiPila.push(15);
MiPila.push(30);
MiPila.push(20);
MiPila.push(5);

// Desplegando el stack
System.out.println("Pila Inicial: " + MiPila);

// Quitando elements using pop() method
System.out.println("Elemendo desapilado: "
+ MiPila.pop());
System.out.println("Elemendo desapilado: "
+ MiPila.pop());

// Desplegando la pila despues de la operacion POP
System.out.println("Stack after pop operation "
+ MiPila);
    }
    /**
     * @param args the command line arguments
     */
    private static void ListaEnlazada (){
        
        PilaEnlazada pilaE = new PilaEnlazada ();
        int op = 0;
        do{
            System.out.println("\n1. - Agregar datos a pila"
                    + "\n2. - Ver datos de pila"
                    + "\n3. - Sacar el elemento de la cima"
                    + "\n4. - Ver la cima de la pila"
                    + "\n5. - Limpiar Pila Enlazada"
                    + "\nIngresa tu opcion");
            op = Integer.parseInt(sn.nextLine());
            
            switch(op){
                case 0:
                    System.out.println("Gracias por usarme para practicar ;)");
                    break;
                case 1:
                    pilaE.addPila();
                    System.out.println("Insercion de datos en pila, con exito");
                    break;
                case 2:
                    pilaE.viewPila();
                    System.out.println("------- Fin --------");
                    break;
                case 3:
                    pilaE.deleteFIFO();
                    System.out.println("--------- Fin ---------");
                    break;
                case 4:
                    pilaE.cimaPilaEnlazada();
                    System.out.println("---------- Fin -----------");
                    break;
                case 5:
                    pilaE.limpiarPilaEnlazada();
                    System.out.println("Lista limpiada");
                    break;
                default:
                    System.out.println("Numero invalido");
                    break;
            }
        }while(op!=0);
        
    }
    public static void main(String args[])
{
    ListaEnlazada();

}
    
}
