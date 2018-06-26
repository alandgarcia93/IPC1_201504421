
package practica1;

public class Nodo_Equipaje {
    
    int c_Maletas,fin_Maletas;
    
    Nodo_Equipaje ant_E,sig_E;
    

    public Nodo_Equipaje(int c_Maletas,int fin_Maletas) {
        this.c_Maletas = c_Maletas;
        this.fin_Maletas=fin_Maletas;
        this.sig_E=null;
    }

    public int getC_Maletas() {
        return c_Maletas;
    }

    public void setC_Maletas(int c_Maletas) {
        this.c_Maletas = c_Maletas;
    }

    public int getFin_Maletas() {
        return fin_Maletas;
    }

    public void setFin_Maletas(int fin_Maletas) {
        this.fin_Maletas = fin_Maletas;
    }

    
    
    
    
    
    
}
