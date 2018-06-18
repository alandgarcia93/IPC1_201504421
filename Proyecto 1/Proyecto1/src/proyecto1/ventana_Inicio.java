/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static proyecto1.Ventana.corriendo;
import static proyecto1.Ventana.dado;
import static proyecto1.Ventana.iniciarCronometro;

/**
 *
 * @author Alan David
 */
public class ventana_Inicio extends JFrame{
    JLabel lbtiempo,lbtirar;
    public static int segundo,minutos,dado;
    public static boolean iniciarCronometro=true;
    public static boolean corriendo=false;
    JButton btninicio,btntirar;

    public ventana_Inicio(){
        setSize(1100, 725);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btninicio=new JButton("Iniciar");
        
        btninicio.setBounds(400, 10, 75, 35);
        add(btninicio);
        btninicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarCronometro=true;
            corriendo=true;
            iniciaHiloCronometro();
            
                
            }
        });
        
        lbtiempo=new JLabel("00");
        lbtiempo.setFont(new Font("Tahoma", 0, 18));
        lbtiempo.setBounds(250, 10, 75, 35);
        add(lbtiempo);
        
        btntirar=new JButton("Tirar");
        btntirar.setBounds(650,10,75,35);
        add(btntirar);
        btntirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dado=(int) (Math.random()*6+1);
                lbtirar.setText(String.valueOf(dado));
            
            }
        });
        
        lbtirar=new JLabel("0");
        lbtirar.setFont(new Font("Tahoma", 0, 18));
        lbtirar.setBounds(775, 10, 75, 35);
        add(lbtirar);

        //player1
        JLabel jugador1=new JLabel("player 1");
        jugador1.setText(ventanaConfiguracion.nombrej1);
        jugador1.setFont(new Font("Tahoma", 0, 14));
        jugador1.setBounds(50, 75, 150, 35);
        add(jugador1);
        
        JLabel vidasj1=new JLabel("vidas");
        vidasj1.setFont(new Font("Tahoma", 0, 12));
        vidasj1.setBounds(50, 110, 150, 35);
        add(vidasj1);
        
        JLabel personajesj1=new JLabel("Personajes");
        personajesj1.setFont(new Font("Tahoma", 0, 12));
        personajesj1.setBounds(50, 135, 150, 35);
        add(personajesj1);
        
        JButton flecha1=new JButton();
        ImageIcon flecha_arriba1=new ImageIcon(getClass().getResource("/Imagenes/flecha1.png"));
        flecha1.setIcon(flecha_arriba1);
        flecha1.setBounds(35, 225, 25, 25);
        add(flecha1);
        
        JButton flecha2=new JButton();
        ImageIcon flecha_arriba2=new ImageIcon(getClass().getResource("/Imagenes/flecharriba.png"));
        flecha2.setIcon(flecha_arriba2);
        flecha2.setBounds(70, 200, 25, 25);
        add(flecha2);
        
        JButton flecha3=new JButton();
        ImageIcon flecha_arriba3=new ImageIcon(getClass().getResource("/Imagenes/flecha3.png"));
        flecha3.setIcon(flecha_arriba3);
        flecha3.setBounds(105, 225, 25, 25);
        add(flecha3);
        
        JButton flecha4=new JButton();
        ImageIcon flecha_arriba4=new ImageIcon(getClass().getResource("/Imagenes/flecha4.png"));
        flecha4.setIcon(flecha_arriba4);
        flecha4.setBounds(70, 255, 25, 25);
        add(flecha4);
        
        //player 2
        JLabel jugador2=new JLabel("player 2");
        jugador2.setText(ventanaConfiguracion.nombrej2);
        jugador2.setFont(new Font("Tahoma", 0, 14));
        jugador2.setBounds(950, 75, 150, 35);
        add(jugador2);
        
        JLabel vidasj2=new JLabel("vidas 2");
        vidasj2.setFont(new Font("Tahoma", 0, 12));
        vidasj2.setBounds(950, 110, 150, 35);
        add(vidasj2);
        
        JLabel personajesj2=new JLabel("Personajes");
        personajesj2.setFont(new Font("Tahoma", 0, 12));
        personajesj2.setBounds(950, 135, 150, 35);
        add(personajesj2);
        
        JButton flechaj2=new JButton();
        ImageIcon flecha_j2=new ImageIcon(getClass().getResource("/Imagenes/flechap4.png"));
        flechaj2.setIcon(flecha_j2);
        flechaj2.setBounds(925, 225, 25, 25);
        add(flechaj2);
        
        JButton flechaj2a=new JButton();
        ImageIcon flecha_j2a=new ImageIcon(getClass().getResource("/Imagenes/flechap2.png"));
        flechaj2a.setIcon(flecha_j2a);
        flechaj2a.setBounds(960, 200, 25, 25);
        add(flechaj2a);
        
        JButton flechaj3a=new JButton();
        ImageIcon flecha_j3a=new ImageIcon(getClass().getResource("/Imagenes/flechap1.png"));
        flechaj3a.setIcon(flecha_j3a);
        flechaj3a.setBounds(995, 225, 25, 25);
        add(flechaj3a);
        
        JButton flechaj4a=new JButton();
        ImageIcon flecha_j4a=new ImageIcon(getClass().getResource("/Imagenes/flechap3.png"));
        flechaj4a.setIcon(flecha_j4a);
        flechaj4a.setBounds(960, 255, 25, 25);
        add(flechaj4a);
        
        add(getjpanel());
       
    }
    
    JLabel [][] bMatriz;
    JPanel Panel;
    JLabel texto;

    /*public int tamMatriz(){
        int tam=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese tamanio",JOptionPane.QUESTION_MESSAGE));
        
        return tam;
    }*/
    
    public  JPanel getjpanel(){
        JPanel panel=new JPanel();
        
        int tam=ventanaConfiguracion.n_casillas;
        bMatriz=new JLabel[tam][tam];
        panel.setLayout(new GridLayout(tam,tam));
        panel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0)));
        int numr=(int)Math.random()*10;
        panel.setBounds(240, 60, 600, 600);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                bMatriz[i][j]=new JLabel(String.valueOf(numr));
                panel.add(bMatriz[i][j]);
            }
        }
        return panel;
        
    }
    
     private void iniciaHiloCronometro() {
        
        if(iniciarCronometro==true){
            Cronometro miCronometro=new Cronometro(lbtiempo);
            miCronometro.start();
            
            System.out.println("inicia hilo");

        
        }
            
    }
     
    
}
