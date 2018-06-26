/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

public class ColaPasajero {
   
    NodoPasajero primero_P;

    public ColaPasajero() {
        primero_P=null;
    }
    
    
    
    
    public void insertarFinal(NodoPasajero nuevo){
        if(primero_P==null){
            primero_P=nuevo;
            
        }else{
            NodoPasajero aux=primero_P;
            
            while (aux.siguiente_P!=null) {                
                aux=aux.siguiente_P;
                
            }
            aux.siguiente_P=nuevo;
            
            
        }
    
    }
    
    public void recorrer(){
        if(primero_P==null){
            System.out.println("Lista Vacia");
        }else{
            NodoPasajero aux=primero_P;
            System.out.println("inicio");
            while (aux!=null) {
                Ventana.area.append("PASAJERO");
                Ventana.area.append("\n");
                Ventana.area.append("Indentificacion : "+aux.getN_Identidicacion());
                Ventana.area.append("\n");
                Ventana.area.append("Maletas : "+aux.getN_Maletas());
                Ventana.area.append("\n");
                Ventana.area.append("Documentos : "+aux.getN_Documentos());
                Ventana.area.append("\n");
                aux=aux.siguiente_P;
                Ventana.area.append("\n");
            }
        }
        System.out.println();
    }
    
    public void eliminar(Integer pasajero){
         if(primero_P!=null){
                   NodoPasajero aux=primero_P;
                   NodoPasajero ant=null;
                   //ubicamos a aux en el nodo que vamos a eliminar
                   while((aux!=null)&&(aux.getN_Identidicacion()!=pasajero)){
                            ant=aux;
                            aux=aux.siguiente_P;
                   } if(aux==null){
                            System.out.println("No existe el elemento");   
                   }
                   if(ant==null){
                            primero_P=primero_P.siguiente_P;
                            aux.siguiente_P=null;
                            aux=null;
                   }else{
                            ant.siguiente_P=aux.siguiente_P;
                            aux.siguiente_P=null;
                            aux=null;
                   }
         }else{
             System.out.println("Lista Vacia");
         }
       }
    
    
    
}
