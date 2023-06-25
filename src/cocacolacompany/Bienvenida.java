/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocacolacompany;

/**
 *
 * @author Daniel
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;


public class Bienvenida extends JFrame implements ActionListener {
    
    // objetos declarados con lo que trabajaremos
    private JTextField textfield1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    public static String texto = ""; // declaramos una variable y todo esto es publico, es decir la podemos usar con otra interfaz
    
    // constructor es decir nuestar interfaz1
    public Bienvenida(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,20));
        //para agregar un icono se hace con lo siguiente
        //getImage: vas a obtener una imagen
        //getResource: carga la imagen
        //getClass es nuestra clase de tipo Bienvenido
        // ImageIcon es un objeto
        //setIconImagen, le estamos diciendo que va a colocar nuestra imagen en esa interfaz grafica
        setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
        //vamos a poner dentro de un labale
        
        ImageIcon imagen = new ImageIcon("C:\\Users\\danie\\OneDrive\\Documentos\\NetBeansProjects\\YouTube\\src\\ProyectoCocaCola\\logo-coca.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);
        
        label2 = new JLabel("Bienvenido al Sistema Vacacional");                           
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono", 3, 18)); // texto normal(0), texto negrita (1), text cursiva(2), texto negrita y crusiva(3)
        //orden de la fuente (formato, tipo, tamano)
        label2.setForeground(new Color(255,255,255)); // texto color blanco
        add(label2);
        
        label3 = new JLabel("Nombres y Apellidos Completos: ");
        label3.setBounds(45,209,300,30);
        label3.setFont(new Font("Andale Mono", 1, 13)); // texto normal(0), texto negrita (1), text cursiva(2), texto negrita y crusiva(3)
        label3.setForeground(new Color(255,255,255)); // texto color blanco
        add(label3);
        
        label4 = new JLabel("©2022 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono", 1, 13)); // texto normal(0), texto negrita (1), text cursiva(2), texto negrita y crusiva(3)
        label4.setForeground(new Color(255,255,255)); // texto color blanco
        add(label4);
        
        
        textfield1 = new JTextField();
        textfield1.setBounds(45,240,255,25);
        textfield1.setBackground(new Color(224,224,224));
        textfield1.setFont(new Font("Andale Mono", 1, 14));
        textfield1.setForeground(new Color(0,0,0));
        add(textfield1);
        
        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setBackground(new Color(255,255,255));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.setForeground(new Color(255,0,0));
        boton1.addActionListener(this); // al boton1 se le agrega el evento
        add(boton1);                                          
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){ // compare que realmente se haya ejecutado en el boton1
           texto = textfield1.getText().trim(); // .trim nos permite que si el usuario da espacios es borrar los espacios innecesarios
           if(texto.equals("")){
              JOptionPane.showMessageDialog(null, "Ingrese su Nombre.");
           }
           else{
              Licencia ventanalicencia = new Licencia();
              ventanalicencia.setBounds(615,270,600,360);
              ventanalicencia.setVisible(true);
              ventanalicencia.setResizable(false);
              ventanalicencia.setLocationRelativeTo(null); 
              this.setVisible(false);
           }
        }
        
    }
    
    public static void main(String [] args){
        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setBounds(615,270,350,450);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
        
    }
    
    
    
}
