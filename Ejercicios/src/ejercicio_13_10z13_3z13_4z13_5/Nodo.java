/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13_10z13_3z13_4z13_5;

/**
 *
 * @author heuga
 */
public class Nodo {
     Nodo nodoizquierdo;
    int datos;
    Nodo nododerecho;
    Nodo altura;
    
    //iniciar dato y hacer de este nodo un nodo hoja
    public Nodo(int datosNodo)
    {
        datos = datosNodo;
        nodoizquierdo = nododerecho = null; //el nodo no tiene hijos
    }

   
    
    //buscar punto de insercion e inserter nodo nuevo
    public synchronized void insertar(int valorInsertar)
    {
        //insertar en subarbol izquierdo
        if(valorInsertar < datos)
        {
            //insertar en subarbol izquierdo
            if(nodoizquierdo == null)
                nodoizquierdo = new Nodo(valorInsertar);
            else    //continua recorriendo subarbol izquierdo
                nodoizquierdo.insertar(valorInsertar);
        }
        
        //insertar nodo derecho
        else if(valorInsertar > datos)
        {
            //insertar nuevo nodoArbol
            if(nododerecho == null)
                nododerecho = new Nodo(valorInsertar);
            else
                nododerecho.insertar(valorInsertar);
        }
    }
}
