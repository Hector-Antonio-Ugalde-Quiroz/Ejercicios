/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13_13;

/**
 *
 * @author heuga
 */
public class Principal {
     public static void main(String[] args) {
        // TODO code application logic here
    Arbol ar=new Arbol((int) Math.random());
    Nodo nuevo=new Nodo((int) Math.random());
    ar.agregar(nuevo,ar.getRaiz());
    ar.recorrerPreorden(ar.getRaiz());
    }
}
