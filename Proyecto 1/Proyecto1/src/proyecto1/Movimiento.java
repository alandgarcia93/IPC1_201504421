
package proyecto1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Movimiento extends Thread{
    public int cantidad=0;
    public int cantidad2=0;
    public int cantidad3=0;
    public int cantidad4=0;
    public Tablero tab=null;
    public int direccion;
    public int temp=0;
    
    public Movimiento(int cantidad,Tablero tablero,int direccion) {
        this.cantidad=cantidad;
        this.tab=tablero;
        this.cantidad2=cantidad;
        this.direccion=direccion;
        this.cantidad3=cantidad;
        this.cantidad4=cantidad;
    }
    
    public boolean comprobar(){
        if(tab.per.posper>=tab.tam-1){
            return true;
        }
        return false;
    }
    
     /*public boolean comprobar2(){
        if(tab.per.posper>=tab.tam+1){
            return true;
        }
        return false;
    }*/
    
    
    public void moverDer(int cantidad){
        if(cantidad<=0){
        return;
        }
        if(comprobar()){
            cantidad=0;
            //lineas movidas
            tab.vecL[tab.tam-1][0]=0;
            tab.vecG[tab.tam-1][0].setIcon(null);
            //-------------------
            tab.per.posper=0;
            tab.vecL[0][0]=1;
            tab.repintar();
            return;
        }else{
            try {
                //------------------------
        tab.vecL[tab.per.posper][0]=0;
        tab.vecG[tab.per.posper][0].setIcon(null);
        tab.repintar();
        tab.per.posper=tab.per.posper+1;
        tab.vecL[tab.per.posper][0]=1;
        
        tab.per.posper=temp;
                System.out.println("tab.per.posper: "+tab.per.posper+"temp ; "+temp);
        
        
        tab.repintar();
        //----------------------------------
        cantidad--;
        
            
                Thread.sleep(500);
                moverDer(cantidad);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
    public void moverIzq(int cantidad2){
        if(cantidad2<=0){
        return;
        }
        if(comprobar()){
            cantidad2=0;
            //lineas movidas
            tab.vecL[tab.tam-1][0]=0;
            tab.vecG[tab.tam-1][0].setIcon(null);
            //-------------------
            tab.per.posper=0;
            tab.vecL[0][0]=1;
            tab.repintar();
            return;
        }else{
            try {
                //------------------------
        tab.vecL[tab.per.posper][0]=0;
        tab.vecG[tab.per.posper][0].setIcon(null);
        tab.repintar();
        tab.per.posper=tab.per.posper-1;
        tab.vecL[tab.per.posper][0]=1;
        
        
        tab.repintar();
        //----------------------------------
        cantidad2--;
        
            
                Thread.sleep(500);
                moverIzq(cantidad2);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
    
    public void moverAbajo(int cantidad3){
        if(cantidad3<=0){
        return;
        }
        if(comprobar()){
            cantidad3=0;
            //lineas movidas
            tab.vecL[0][tab.tam-1]=0;
            tab.vecG[0][tab.tam-1].setIcon(null);
            //-------------------
            tab.per.posper=0;
            tab.vecL[0][0]=1;
            tab.repintar();
            return;
        }else{
            try {
                //------------------------
        tab.vecL[0][tab.per.posper]=0;
        tab.vecG[0][tab.per.posper].setIcon(null);
        tab.repintar();
        tab.per.posper=tab.per.posper+1;
        tab.vecL[0][tab.per.posper]=1;
        tab.repintar();
        //----------------------------------
        cantidad3--;
            
                Thread.sleep(1000);
                moverAbajo(cantidad3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void moverArriba(int cantidad4){
        if(cantidad4<=0){
        return;
        }
        if(comprobar()){
            cantidad4=0;
            //lineas movidas
            tab.vecL[0][tab.tam-1]=0;
            tab.vecG[0][tab.tam-1].setIcon(null);
            //-------------------
            tab.per.posper=0;
            tab.vecL[0][0]=1;
            tab.repintar();
            return;
        }else{
            try {
                //------------------------
        tab.vecL[0][tab.per.posper]=0;
        tab.vecG[0][tab.per.posper].setIcon(null);
        tab.repintar();
        tab.per.posper=tab.per.posper-1;
        tab.vecL[0][tab.per.posper]=1;
        
        
        tab.repintar();
        //----------------------------------
        cantidad4--;
        
            
                Thread.sleep(500);
                moverArriba(cantidad4);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }
    
    
    
    
    public void run(){
        
        switch(direccion){
            case 0:
                moverDer(cantidad);
            break;
            case 1:
                moverIzq(cantidad2);
                break;
            case 2:
                moverAbajo(cantidad3);
                break;
            case 3:
                moverArriba(cantidad4);
                break;
        }
    }
    
    
    
    
    
}
