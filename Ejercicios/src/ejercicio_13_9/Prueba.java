/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13_9;


/**
 *
 * @author heuga
 */
public class Prueba {
 private void addNodo( Nodo Nodo, Nodo raiz ) {
   
    if ( raiz == null ) {
    
        this.setRaiz(Nodo);
    }
    else {
        
        if ( Nodo.getValor() <= raiz.getValor() ) {
         
            if (raiz.getHojaIzquierda() == null) {
                raiz.setHojaIzquierda(Nodo);
            }
            else {
                addNodo( Nodo , raiz.getHojaIzquierda() );
            }
        }
        else {
          
            if (raiz.getHojaDerecha() == null) {
                raiz.setHojaDerecha(Nodo);
            }
            else {
                addNodo( Nodo, raiz.getHojaDerecha() );
            }
        }
    }
   }   

    private void setRaiz(Nodo Nodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
