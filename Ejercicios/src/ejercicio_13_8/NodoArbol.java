/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13_8;

/**
 *
 * @author heuga
 */
class NodoArbol {

    NodoArbol nodoizquierdo;
    int datos;
    NodoArbol nododerecho;

    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoizquierdo = nododerecho = null;
    }

    public synchronized void insertar(int valorInsertar) {

        if (valorInsertar < datos) {

            if (nodoizquierdo == null) {
                nodoizquierdo = new NodoArbol(valorInsertar);
            } else {
                nodoizquierdo.insertar(valorInsertar);
            }
        } else if (valorInsertar > datos) {

            if (nododerecho == null) {
                nododerecho = new NodoArbol(valorInsertar);
            } else {
                nododerecho.insertar(valorInsertar);
            }
        }
    }
}
