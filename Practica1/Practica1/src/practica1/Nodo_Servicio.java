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
public class Nodo_Servicio {
    
    int s_Avion;
    
    Nodo_Servicio siguiente_A;

    public Nodo_Servicio(int s_Avion) {
        this.s_Avion = s_Avion;
        this.siguiente_A = null;
        
        
    }

    public int getS_Avion() {
        return s_Avion;
    }

    public void setS_Avion(int s_Avion) {
        this.s_Avion = s_Avion;
    }
    
    
    
    
}
