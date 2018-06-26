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
public class Nodo_Mantenimiento1 {
    
    int c_Servicios;
    
    Nodo_Mantenimiento1 siguiente_M;

    public Nodo_Mantenimiento1(int c_Servicios) {
        this.c_Servicios = c_Servicios;
        this.siguiente_M = null;
    }

    public int getC_Servicios() {
        return c_Servicios;
    }

    public void setC_Servicios(int c_Servicios) {
        this.c_Servicios = c_Servicios;
    }
    
    
    
    
    
}
