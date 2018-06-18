/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alan David
 */
public class Tablero {
    
    public int tam=0;
    public JPanel fondo=null;
    public Personaje per;
    //public Personaje per2;
    
    public int [][] vecL;
    public JLabel [][] vecG;
    public int tamBloquex=0;
    public int tamBloquey=0;

    public Tablero(int tam,JPanel Fondo) {
        this.tam=tam;
        this.fondo=Fondo;
        llenar(tam);
    }
    
    public void llenar(int tam){
        tamBloquex=600/tam;
        tamBloquey=600/tam;
        vecL=new int[tam][tam];
        vecG=new JLabel[tam][tam];
        vecL[0][0]=1;
        this.per=new Personaje();
        this.per.posper=0;
        for (int i = 1; i < tam; i++) {
            vecL[i][i]=0;
            
        }
        repintar();
        
    }
    
    public void repintar(){
        for (int i = 0; i < tam; i++) {
            for(int j=0;j<tam;j++){
            JLabel tablero;
            if(vecL[i][j]==0){
                tablero=new JLabel();
                tablero.setOpaque(false);
                tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                tablero.setBounds(i*tamBloquex, j*tamBloquey, tamBloquex, tamBloquey);
                vecG[i][j]=tablero;
                fondo.add(vecG[i][j],BorderLayout.CENTER);
                fondo.repaint();
            }
            
            if(vecL[i][j]==1){
                tablero=new JLabel(this.per.obtenerImagen(tamBloquex,tamBloquey));
                //tablero(this.per2.obtenerImagen2(tamBloquex, tamBloquey));
                //tablero=new JLabel(this.per.obtenerImagen2(tamBloquex,tamBloquey));

                tablero.setOpaque(false);
                tablero.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
                tablero.setBounds(i*tamBloquex, j*tamBloquey, tamBloquex, tamBloquey);
                vecG[i][j]=tablero;
                fondo.add(vecG[i][j],BorderLayout.CENTER);
                fondo.repaint();
            }
            }
        }
    }
    
    
    
}
