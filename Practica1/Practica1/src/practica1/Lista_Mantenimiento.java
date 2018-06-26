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
public class Lista_Mantenimiento {
    
    Nodo_Mantenimiento1 primero_M;
    
    
    public void insertarInicio(Nodo_Mantenimiento1 nuevo){
         if(primero_M==null){
             primero_M=nuevo;
         }else{
            nuevo.siguiente_M=primero_M;
            primero_M=nuevo;
         }
       }
     
      public void insertarFinal(Nodo_Mantenimiento1 nuevo){
           
         Nodo_Mantenimiento1 aux=primero_M;
         if(primero_M==null){
             primero_M=nuevo;
         }else{
                   while(aux.siguiente_M!=null){
                            aux=aux.siguiente_M;
                   }
                   aux.siguiente_M=nuevo;
         }
      
       }
    
      public void eliminar(Integer c_Servicios){
         if(primero_M!=null){
                   Nodo_Mantenimiento1 aux_M=primero_M;
                   Nodo_Mantenimiento1 ant_M=null;
                   //ubicamos a aux en el nodo que vamos a eliminar
                   while((aux_M!=null)&&(aux_M.getC_Servicios()!=c_Servicios)){
                            ant_M=aux_M;
                            aux_M=aux_M.siguiente_M;
                   } if(aux_M==null){
                            System.out.println("No existe el elemento");   
                   }
                   if(ant_M==null){
                            primero_M=primero_M.siguiente_M;
                            aux_M.siguiente_M=null;
                            aux_M=null;
                   }else{
                            ant_M.siguiente_M=aux_M.siguiente_M;
                            aux_M.siguiente_M=null;
                            aux_M=null;
                   }
         }else{
             System.out.println("Lista Vacia");
         }
       }
      
      public void recorrer(){
        if(primero_M==null){
            System.out.println("LISTA VACIA");
        }else{
            Nodo_Mantenimiento1 aux_M=primero_M;
            while (aux_M!=null){
                Ventana.area.append("Estacion Servicio No. "+String.valueOf(aux_M.getC_Servicios()));
                Ventana.area.append("\n");
                System.out.print("Estacion Servicio No. "+aux_M.getC_Servicios());
                aux_M=aux_M.siguiente_M;
            }
            System.out.println(" NULL");
        }
    
       }
    
    
}
