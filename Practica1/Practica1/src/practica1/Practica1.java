/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Alan David
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*ListaAvion la=new ListaAvion();
        
        for (int i = 1; i <= 10; i++) {
            la.insertarFinal(new NodoAvion(i, i));
            
        }
        
        la.recorrer();
        la.eliminar(5);
        System.out.println("===========================");
        la.recorrer();
        
        /*ColaPasajero cp=new ColaPasajero();
        for (int i = 1; i <= 10; i++) {
            
            cp.insertarFinal(new NodoPasajero(i, i, i));
            
        }
        cp.recorrer();*/
        
        Ventana v=new Ventana();
        v.setVisible(true);
        
    }
    
}
