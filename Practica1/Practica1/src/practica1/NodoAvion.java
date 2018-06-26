
package practica1;

public class NodoAvion {
    
    int num_Avion,num_Pasajeros,num_Desabordaje,num_Mantenimiento;
    
    NodoAvion siguiente_A, anterior_A;

    public NodoAvion(int num_Avion, int num_Pasajeros, int num_Desabordaje, int num_Mantenimiento) {
        this.num_Avion = num_Avion;
        this.num_Pasajeros = num_Pasajeros;
        this.num_Desabordaje = num_Desabordaje;
        this.num_Mantenimiento = num_Mantenimiento;
        this.siguiente_A = null;
        this.anterior_A = null;
    }

    public int getNum_Avion() {
        return num_Avion;
    }

    public void setNum_Avion(int num_Avion) {
        this.num_Avion = num_Avion;
    }

    public int getNum_Pasajeros() {
        return num_Pasajeros;
    }

    public void setNum_Pasajeros(int num_Pasajeros) {
        this.num_Pasajeros = num_Pasajeros;
    }

    public int getNum_Desabordaje() {
        return num_Desabordaje;
    }

    public void setNum_Desabordaje(int num_Desabordaje) {
        this.num_Desabordaje = num_Desabordaje;
    }

    public int getNum_Mantenimiento() {
        return num_Mantenimiento;
    }

    public void setNum_Mantenimiento(int num_Mantenimiento) {
        this.num_Mantenimiento = num_Mantenimiento;
    }
    
    
   

    
}
