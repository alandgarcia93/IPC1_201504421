
package practica1;

public class Cola_Servicio {
    
    Nodo_Servicio primero_A;

    public Cola_Servicio() {
        primero_A=null;
    }
    
    
    
     public void insertarFinal(Nodo_Servicio nuevo_S){
        if(primero_A==null){
            primero_A=nuevo_S;
            
        }else{
            Nodo_Servicio aux_S=primero_A;
            
            while (aux_S.siguiente_A!=null) {                
                aux_S=aux_S.siguiente_A;
                
            }
            aux_S.siguiente_A=nuevo_S;
            
            
        }
    
    }
    
    public void recorrer(){
        if(primero_A==null){
            System.out.println("Lista Vacia");
        }else{
            Nodo_Servicio aux_S=primero_A;
            System.out.println("inicio");
            while (aux_S!=null) {
                Ventana.area.append("Avion :    "+String.valueOf(aux_S.getS_Avion()));
                Ventana.area.append("\n");
                System.out.println("Avion : "+aux_S.getS_Avion());
                aux_S=aux_S.siguiente_A;
            }
        }
        System.out.println();
    }
}
