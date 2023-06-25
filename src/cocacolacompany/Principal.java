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
import java.awt.*;
import java.awt.event.*;


public class Principal extends JFrame implements ActionListener {
    
    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento, labelAntiguedad, 
            labelResultado, labelfooter;
    
    private JTextField txtNombreTrabajdor, txtAPaternoTrabajador, txtAMaternoTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombreAdministrador = "";
    
    
    public Principal(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // esta linea de codigo elimina el proceso de ejecucion en segundo plano
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255,0,20));
        setIconImage(new ImageIcon(getClass().getResource("icon.png ")).getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreAdministrador = ventanaBienvenida.texto;
        
        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);
        
        //boton menu opciones
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(224,224,224));
        menuOpciones.setFont(new Font("Andale Mono",1,14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);
        
        //boton menu calcular        
        menuCalcular = new JMenu("Deducir");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono",1,14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);
        
                
        menuAcercaDe = new JMenu("Acerca De");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono",1,14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        mb.add(menuAcercaDe);
        
        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font("Andale Mono",1,14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);
        
        miCalculo = new JMenuItem("Calcular");
        miCalculo.setFont(new Font("Andale Mono", 1,14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);
        
        
        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono",1,14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);
        
        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono",1,14));
        miNegro.setForeground(new Color(0,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);
        
        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);
        
        miNuevo = new JMenuItem("Limpiar");
        miNuevo.setFont(new Font("Andale Mono",1,14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);
        
        miElCreador = new JMenuItem("Autor");
        miElCreador.setFont(new Font("Andale Mono",1,14));
        miElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);
        
        miSalir = new JMenuItem("Inicio");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);
        
        ImageIcon imagen = new ImageIcon("C:\\Users\\danie\\OneDrive\\Documentos\\NetBeansProjects\\YouTube\\src\\ProyectoCocaCola\\logo-coca.png");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(5,7,250,110);
        add(labelLogo);
        
        labelBienvenido = new JLabel("BIENVENIDO " + "\n" + nombreAdministrador);
        labelBienvenido.setBounds(290,30,400,110);
        labelBienvenido.setFont(new Font("Andale Mono", 3, 32));
        labelBienvenido.setForeground(new Color(255,255,255));
        add(labelBienvenido);
        
        labelTitle = new JLabel("Cálculo Vacacional del Empleado");
        labelTitle.setBounds(45,140,900,25);
        labelTitle.setFont(new Font("Andale Mono",3,22));
        labelTitle.setForeground(new Color(255,255,255));
        add(labelTitle);
       
        
        // disenamos los labels
        
        labelNombre = new JLabel("Nombres Completos:");
        labelNombre.setBounds(25,188,180,25);
        labelNombre.setFont(new Font("Andale Mono",1,12));
        labelNombre.setForeground(new Color(255,255,255));
        add(labelNombre);
        
        txtNombreTrabajdor = new JTextField();
        txtNombreTrabajdor.setBounds(25,213,150,25);
        txtNombreTrabajdor.setBackground(new java.awt.Color(224,224,224));
        txtNombreTrabajdor.setFont(new Font("Andale Mono",1,14));
        txtNombreTrabajdor.setForeground(new Color(255,0,0));
        add(txtNombreTrabajdor);
        
        labelAPaterno = new JLabel("Apellido Paterno:");
        labelAPaterno.setBounds(25,248,180,25);
        labelAPaterno.setFont(new Font("Andale Mono",1,12));
        labelAPaterno.setForeground(new Color(255,255,255));
        add(labelAPaterno);
        
        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25,273,150,25);
        txtAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtAPaternoTrabajador);
        
        labelAMaterno = new JLabel("Apellido Materno:");
        labelAMaterno.setBounds(25,308,180,25);
        labelAMaterno.setFont(new Font("Andale Mono",1,12));
        labelAMaterno.setForeground(new Color(255,255,255));
        add(labelAMaterno);
        
        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25,334,150,25);
        txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
        txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
        txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
        add(txtAMaternoTrabajador);
        
        labelDepartamento = new JLabel("Seleccione su Departamento:");
        labelDepartamento.setBounds(220,188,180,25);
        labelDepartamento.setFont(new Font("Andale Mono",1,12));
        labelDepartamento.setForeground(new Color(255,255,255));
        add(labelDepartamento);
        
        comboDepartamento = new JComboBox();
        comboDepartamento.setBounds(220,213,220,25);
        comboDepartamento.setBackground(new java.awt.Color(224,224,224));
        comboDepartamento.setFont(new Font("Andale Mono",1,14));
        comboDepartamento.setForeground(new java.awt.Color(255,0,0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atencion al Cliente");
        comboDepartamento.addItem("Departamento de Logistica");
        comboDepartamento.addItem("Departamento de Gerencia");
        
        labelAntiguedad = new JLabel("Seleccione su Antiguedad");
        labelAntiguedad.setBounds(220,248,180,25);
        labelAntiguedad.setFont(new Font("Andale Mono",1,12));
        labelAntiguedad.setForeground(new Color(255,255,255));
        add(labelAntiguedad);
        
        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(220,273,220,25);
        comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
        comboAntiguedad.setForeground(new Color(255,0,0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 Año de Servicio");
        comboAntiguedad.addItem("2 a 6 Años de Servicio");
        comboAntiguedad.addItem("7 Años o más de Servicio");
        
        labelResultado = new JLabel("El calculo estimado es:");
        labelResultado.setBounds(220,307,180,25);
        labelResultado.setFont(new Font("Andale Mono",1,12));
        labelResultado.setForeground(new Color(255,255,255));
        add(labelResultado);
        
        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224,224,224));
        textarea1.setFont(new Font("Andale Mono",1,11));
        textarea1.setForeground(new Color(255,0,0));
        textarea1.setText("\n Resultado del calculo de sus Vacaciones: ");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220,333,385,90);
        add(scrollpane1);
        
        labelfooter = new JLabel("©2022 The Coca-Cola Company|Todos los Derechos Reservados");
        labelfooter.setBounds(135,445,500,30);
        labelfooter.setFont(new java.awt.Font("Andale Mono",1,12));
        labelfooter.setForeground(new java.awt.Color(255,255,255));
        add(labelfooter);                              
    }
    
    public void actionPerformed(ActionEvent x){
        if(x.getSource() == miCalculo){
          
            String nombreTrabajador = txtNombreTrabajdor.getText();
            String AP = txtAPaternoTrabajador.getText();
            String AM = txtAMaternoTrabajador.getText();
            String Departamento = comboDepartamento.getSelectedItem().toString();
            String Antiguedad = comboAntiguedad.getSelectedItem().toString();   
            
            if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")){
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
            }
            else{
                if(Departamento.equals("Atencion al Cliente")){
                    
                    if(Antiguedad.equals("1 Año de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 6 dias de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 Años de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 14 dias de vacaciones.");
                    }
                    if(Antiguedad.equals("7 Años o mas de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 20 dias de vacaciones.");
                    }
                }
                if(Departamento.equals("Departamento de Logistica")){
                    
                    if(Antiguedad.equals("1 Año de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 7 dias de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 Años de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 15 dias de vacaciones.");
                    }
                    if(Antiguedad.equals("7 Años o mas de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 22 dias de vacaciones.");
                    } 
                }
                if(Departamento.equals("Departamento de Gerencia")){
                    
                    if(Antiguedad.equals("1 Año de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 10 dias de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 Años de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 20 dias de vacaciones.");
                    }
                    if(Antiguedad.equals("7 Años o mas de servicio")){
                        textarea1.setText("\n El Trabajador " + nombreTrabajador + " " + AP + " " + AM + "\n quien laboral en " + Departamento + " con " + Antiguedad +
                                "\n recibe 30 dias de vacaciones.");
                    }
                    
                }
            }
        }
        if(x.getSource() == miRojo){
            getContentPane().setBackground(new Color(255,0,0));
        }
        if(x.getSource() == miNegro){
            getContentPane().setBackground(new Color(0,0,0));
        }
        if(x.getSource() == miMorado){
            getContentPane().setBackground(new Color(51,0,51));
        }
        if(x.getSource() == miNuevo){
            
            txtNombreTrabajdor.setText("");
            txtAPaternoTrabajador.setText("");
            txtAMaternoTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            textarea1.setText("\n Numero de dias que le corresponde de vacaciones.");
            
        }
        if(x.getSource() == miSalir){
            
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
            
        }
        if(x.getSource() == miElCreador){
            
            JOptionPane.showMessageDialog(null, "Desarrollado por los desarrolladores de SOFTWARE\n" +
                                                               "de The Coca-Cola Company.");
            
        }
    }
    
    public static void main(String[] args){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(615,270,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocale(null);
        
    }
    
    
        
}
