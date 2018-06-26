
package practica1;

/**
 *
 * @author Alan David
 */
public class NodoPasajero {
    
    int n_Identidicacion,n_Maletas,n_Documentos;
    NodoPasajero siguiente_P;

    public NodoPasajero(int n_Identidicacion, int n_Maletas, int n_Documentos) {
        this.n_Identidicacion = n_Identidicacion;
        this.n_Maletas = n_Maletas;
        this.n_Documentos = n_Documentos;
        this.siguiente_P = null;
    }

    public int getN_Identidicacion() {
        return n_Identidicacion;
    }

    public void setN_Identidicacion(int n_Identidicacion) {
        this.n_Identidicacion = n_Identidicacion;
    }

    public int getN_Maletas() {
        return n_Maletas;
    }

    public void setN_Maletas(int n_Maletas) {
        this.n_Maletas = n_Maletas;
    }

    public int getN_Documentos() {
        return n_Documentos;
    }

    public void setN_Documentos(int n_Documentos) {
        this.n_Documentos = n_Documentos;
    }
    
    
    
    
}
