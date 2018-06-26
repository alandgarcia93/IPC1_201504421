/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alan David
 */
public class Ventana extends JFrame{
    
    public static JTextArea area;
    
    ColaPasajero clp=new ColaPasajero();
    Cola_Servicio cls=new Cola_Servicio();
    ListaAvion lta=new ListaAvion();
    Lista_Equipaje lte=new Lista_Equipaje();
    Lista_Mantenimiento ltm=new Lista_Mantenimiento();
    
    int tipo_Aviones,cantidad_Avion,cant_Pasajeros,cant_Desbordaje,cant_Mantenimiento,cant_Maletas,cant_Documentos,num_Identificacion;
    int inicio_Maletas,num_Estaciones; //ini_Male,fin_Male;
    public Ventana(){
        
        super("ListAirport");
        setSize(950, 725);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel cantidad_A=new JLabel("Cantidad Aviones");
        cantidad_A.setBounds(30, 30, 100, 35);
        add(cantidad_A);
        
        JTextField txt_A=new JTextField();
        txt_A.setBounds(150, 30, 100, 35);
        add(txt_A);
        
        JLabel cantidad_E=new JLabel("Cantidad Estaciones");
        cantidad_E.setBounds(30, 100, 150, 35);
        add(cantidad_E);
        
        JTextField txt_E=new JTextField();
        txt_E.setBounds(150, 100, 100, 35);
        add(txt_E);
        
        JButton btn_Empezar=new JButton("Empezar");
        btn_Empezar.setBounds(30, 175, 100, 35);
        add(btn_Empezar);
        btn_Empezar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad_Avion=Integer.parseInt(txt_A.getText());
              for(int i=1;i<=cantidad_Avion;i++){  
             tipo_Aviones=(int)(Math.random()*3)+1;
             switch(tipo_Aviones){
                 
                case 1:
                     area.append("Tipo Pequenio");
                     area.append("\n");
                     cant_Pasajeros=(int)(Math.random()*10)+1;
                     cant_Mantenimiento=(int)(Math.random()*3)+1;
                     cant_Desbordaje=1;
                     lta.insertarFinal(new NodoAvion(i, cant_Pasajeros, cant_Desbordaje, cant_Mantenimiento));

                     //lta.recorrer();
                     area.append("\n");
                     
                break;
                
                case 2:
                     area.append("Tipo Mediano");
                     area.append("\n");
                     cant_Pasajeros=(int) Math.floor(Math.random()*(15-25+1)+25);
                     cant_Mantenimiento=(int)Math.floor(Math.random()*(2-4+1)+4);
                     cant_Desbordaje=2;
                     lta.insertarFinal(new NodoAvion(i, cant_Pasajeros, cant_Desbordaje, cant_Mantenimiento));

                     //lta.recorrer();
                     area.append("\n");
                break;
                
                case 3:
                    area.append("Tipo Grande");
                     area.append("\n");
                     cant_Pasajeros=(int) Math.floor(Math.random()*(30-40+1)+40);
                     cant_Mantenimiento=(int)Math.floor(Math.random()*(3-6+1)+6);
                     cant_Desbordaje=3;
                     lta.insertarFinal(new NodoAvion(i, cant_Pasajeros, cant_Desbordaje, cant_Mantenimiento));
                     
                     //lta.recorrer();
                     area.append("\n");
                break;
                
             }
             
             area.append("\n");
                           

              }
              lta.recorrer();
                
                
        
            
        
            }
        });
        
        JButton btn_Turno=new JButton("Pasar Turno");
        btn_Turno.setBounds(175, 175, 125, 35);
        add(btn_Turno);
        btn_Turno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.append("============= Pasajeros =============");
                Ventana.area.append("\n");
                for (int i = 1; i < cant_Pasajeros; i++) {
                    
                
                cant_Maletas=(int)(Math.random()*4)+1;
                cant_Documentos=(int)(Math.random()*10)+1;
                num_Identificacion=(int)(Math.random()*10)+1;
                clp.insertarFinal(new NodoPasajero(num_Identificacion, cant_Maletas, cant_Documentos));
                clp.recorrer();
                cant_Pasajeros=cant_Pasajeros-5;
                area.append("\n");
                }
                
                area.append("======== EQUIPAJE ==========");
                area.append("\n");
                inicio_Maletas=(int)(Math.random()*(15-25)+25);
                for (int i = 1; i <=inicio_Maletas ; i++) {
                    
                    area.append( "Inicio "+1);
                    area.append("\n");
                    area.append("Fin "+inicio_Maletas);
                    lte.insertarFinal(new Nodo_Equipaje(i, 0));
                    
                    area.append("\n");
                    lte.recorrer();
                    area.append("\n");
                    
                }
                
                area.append("========== ESTACIONES ==========");
                area.append("\n");
                num_Estaciones=Integer.parseInt(txt_E.getText());
                
                for (int j = 1; j <= num_Estaciones; j++) {
                    area.append("Estacion "+j);
                    area.append("\n");
                    lta.recorrer();
                    area.append("\n");
                    
                }
                
                area.append("============ EN COLA ==========");
                area.append("\n");
                lta.recorrer();
                area.append("\n");
                
            }
        });
        
        area=new JTextArea();
        //area.setBounds(375, 50, 500, 600);
        //add(area);
        
        
        JScrollPane scroll=new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(375, 50, 500, 600);
        add(scroll);
       
    }
    
    
}
