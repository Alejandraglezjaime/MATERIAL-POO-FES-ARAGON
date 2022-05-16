/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing;

import ico.fes.ou.swing.modelos.NombresComboModelo;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alejandraglezj
 */
public class ventanaSwing extends JFrame{
    private FlowLayout Layout;
    private JTextField cuadroTexto;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<String> Lista;
    private NombresComboModelo modelo;
    
    
    public ventanaSwing() throws HeadlessException {
      this.setTitle("MI VENTANA SWING");
      this.setSize(300, 220);
      this.setVisible(true);
      Layout = new FlowLayout();
      this.setLayout(Layout);
      cuadroTexto = new JTextField(15);
      boton = new JButton("Convertir a F.");
      resultado = new JLabel("grados F.");
      Lista = new JComboBox<String>();
      //usando un modelo personalizado
      modelo = new NombresComboModelo();
        ArrayList<String> info = new ArrayList();
        info.add("Jesus");
        info.add("Santiago");
        info.add("Elena");
        info.add("Jose");
        modelo.setDatos(info);
        Lista.setModel(modelo);
        
      
     /* Lista.addItem("Rojo");
      Lista.addItem("Verde");
      Lista.addItem("Azul");
      Lista.addItem("Blanco");*/
      
      
      this.getContentPane().add(cuadroTexto);
      this.getContentPane().add(boton);
      this.getContentPane().add(resultado);
      this.getContentPane().add(Lista);
      this.pack();
      this.setVisible(true);
      //this.validate();
              
      
      this.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
            System.exit(0);
          //  ((JFrame)e.getSource()).setVisible(false);
          }
      
      });
    
      this.boton.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {
              float centigrados = Float.parseFloat(cuadroTexto.getText());
              float farenhetit = (centigrados + (9.0f/5.0f))+32.0f;
              resultado.setText(farenhetit + " ºF"); 
              
          }

      });
      
      this.Lista.addItemListener(new ItemAdapter(){
          @Override
          public void itemStateChanged(ItemEvent ie) {
              System.out.println("Cmabio el item");
              System.out.println(ie.getItem());
          }

      
              });
      
    /*  this.Lista.addKeyListener(new KeyAdapter() {
          @Override
          public void keyTyped(KeyEvent e) {
              System.out.println(e.getExtendedKeyCode());
              System.out.println(e.getKeyCode());
              
             
          }
 
      }); */
              
    
    }
}
