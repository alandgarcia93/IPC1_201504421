
package practica1;

public class Lista_Equipaje {
    
    Nodo_Equipaje primero;
    
    public void insertarInicio(Nodo_Equipaje nuevo){
         if(primero==null){
                   primero=nuevo;
                   primero.sig_E=nuevo;
                   primero.ant_E=primero;
         }else{
                   Nodo_Equipaje aux=primero;
                   while(aux.sig_E!=primero)
                            aux=aux.sig_E;
                            aux.sig_E=nuevo;
                            nuevo.ant_E=aux;
                            nuevo.sig_E=primero;
                            primero.ant_E=nuevo;
                            primero=nuevo;
                  
         }
       }
    
    public void insertarFinal(Nodo_Equipaje nuevo){
         if(primero==null){
                   primero=nuevo;
                   primero.sig_E=nuevo;
                   primero.ant_E=primero;
        } else{
                   Nodo_Equipaje aux=primero;
                   while(aux.sig_E!=primero)
                            aux=aux.sig_E;
                            aux.sig_E=nuevo;
                            nuevo.ant_E=aux;
                            nuevo.sig_E=primero;
                            primero.ant_E=nuevo;
         }
       }
    
    public void eliminar(Integer c_Maletas){
         if(primero!=null){
                   Nodo_Equipaje aux=primero;
                   Nodo_Equipaje ant_E=null;
                   while(aux.sig_E!=primero){
                            if(aux.getC_Maletas()==c_Maletas){
                                      if(ant_E==null){
                                               if(aux.sig_E==primero)
                                                        primero=null;
                                               else{
                                                        ant_E=aux.ant_E;
                                                        ant_E.sig_E=aux.sig_E;
                                                        aux=aux.sig_E;
                                                        aux.ant_E=ant_E;
                                                        primero=aux;
                                                        ant_E=null;
                                               }
                                      }else{
                                               aux.ant_E=null;
                                               ant_E.sig_E=aux.sig_E;
                                               aux=aux.sig_E;
                                               aux.ant_E=ant_E;
                                      }
                   }else{
                            ant_E=aux;
                            aux=aux.sig_E;
                   }
         }   
               if(aux.getC_Maletas()==c_Maletas){
                    ant_E.sig_E=primero;
                    primero.ant_E=ant_E;
                    aux=null;
            }
                   
         }else
                   System.out.println("LISTA VACIA");
       }
    
    public void recorrer(){
         if(primero==null)
                   System.out.println("<-->NULL<-->");
         else{
                   Nodo_Equipaje aux=primero;
                   //System.out.print("<--> Inicio");
                   do{
                            Ventana.area.append("Maleta : "+String.valueOf(aux.getC_Maletas()));
                            Ventana.area.append("\n");
                            //Ventana.area.append("Fin : "+String.valueOf(aux.getFin_Maletas()));
                            //Ventana.area.append("\n");
                            aux=aux.sig_E;
                            
                   }while(aux!=primero);
                   //System.out.println(" <-->NULL<-->");
         }
       }
    
}
