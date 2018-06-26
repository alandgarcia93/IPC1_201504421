
package practica1;

public class ListaAvion {
    
    NodoAvion primero;

    public ListaAvion() {
        
        primero=null;
        
    }
    
    public void insertarInicio(NodoAvion nuevo){
        if(primero==null){
            primero=nuevo;
        }else{
            nuevo.siguiente_A=primero;
            primero.anterior_A=nuevo;
            primero=nuevo;
            
        }
    }
    
    public void insertarFinal(NodoAvion nuevo){
        if(primero==null){
            primero=nuevo;
            
        }else{
            NodoAvion aux=primero;
            
            while (aux.siguiente_A!=null) {                
                aux=aux.siguiente_A;
                
            }
            aux.siguiente_A=nuevo;
            nuevo.anterior_A=aux;
            
        }
    
    }
    
    public void eliminar(int num_Avion){
        if(primero!=null){
            NodoAvion aux=primero;
            NodoAvion antaux=null;
            
            while (aux!=null) {  
                //linea a modificar: pasar el getDato al while
                if(aux.getNum_Avion()==num_Avion){
                    if(antaux==null){
                        primero=primero.siguiente_A;
                        aux.siguiente_A=null;
                        aux=primero;
                        
                    }else{
                        antaux.siguiente_A=aux.siguiente_A;
                        aux.siguiente_A=null;
                        aux=antaux.siguiente_A;
                        aux.anterior_A=antaux;
                    }
                }else{
                    antaux=aux;
                    aux=aux.siguiente_A;
                    
                    
                }
            }
        }
    }
    
    public void recorrer(){
        if(primero==null){
            System.out.println("Lista Vacia");
        }else{
            NodoAvion aux=primero;
            System.out.println("inicio");
            while (aux!=null) {    
                Ventana.area.append("Avion : "+String.valueOf(aux.getNum_Avion()));
                Ventana.area.append("\n");
                Ventana.area.append("Pasajeros :    "+String.valueOf(aux.getNum_Pasajeros()));
                Ventana.area.append("\n");
                Ventana.area.append("Desabordaje :  "+String.valueOf(aux.getNum_Desabordaje()));
                Ventana.area.append("\n");
                Ventana.area.append("Mantenimiento :    "+String.valueOf(aux.getNum_Mantenimiento()));
                Ventana.area.append("\n");
                Ventana.area.append("\n");
                
                //System.out.println("Avion : "+aux.getNum_Avion()+"Tipo : "+aux.getNum_Tipo());
                aux=aux.siguiente_A;
            }
        }
        System.out.println();
    }
    
    
    
    
    
}
