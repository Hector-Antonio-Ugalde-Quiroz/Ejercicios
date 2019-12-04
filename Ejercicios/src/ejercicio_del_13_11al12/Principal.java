/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_del_13_11al12;

/**
 *
 * @author heuga
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] a=new int[10];
       for(int i=0;i<=9;i++)
           a[i]=(int)(Math.random()*50);
       Arbol x = new Arbol();
       for(int i=0;i<10;i++)
           x.alta(a[i]);
       System.out.println("Los datos son: ");
       x.imprimir();
       System.out.println("\nEl numero mayor es: ");
       x.mayor();
       
       //EJERCICIO 13.11
       
       System.out.println("La suma de los numeros de la Izquierda es: ");
       x.sumaizquierda();
       System.out.println("La suma de los numeros de la Derecha es: ");
       x.sumaderecha();
   
       //EJERCICIO 13.12
          System.out.println("Cantidad de nodos hoja: "+x.cantidadNodosHoja());
    }    
}
