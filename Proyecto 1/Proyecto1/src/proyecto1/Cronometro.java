/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JLabel;

/**
 *
 * @author Alan David
 */
public class Cronometro extends Thread{
    
    JLabel eti;

    public Cronometro(JLabel lbtiempo) {
        this.eti=lbtiempo;
        
    }
    
    public void run(){
        
        try {
            
            int x=0;
            
            while (Ventana.iniciarCronometro) {
                
                Thread.sleep(1000);
                //System.out.println(x);
                ejecutarCronometro(x);
                x++;
            }
                    
            
        } catch (Exception e) {
            System.out.println("exception hilo: "+e.getMessage());
        }
    }

    public void ejecutarCronometro(int x) {
        //System.out.println(x+"-"+Thread.currentThread().getName());
        Ventana.segundo++;
        
        if(Ventana.segundo>ventanaConfiguracion.tiempo){
            
            Ventana.segundo=0;
            stop();
            


        }
        String txtseg="";
        if(Ventana.segundo<10){
            txtseg="0"+Ventana.segundo;
        }else{
            txtseg=""+Ventana.segundo;
        }
        
        eti.setText(txtseg);
    }
    
    
    
    
}
