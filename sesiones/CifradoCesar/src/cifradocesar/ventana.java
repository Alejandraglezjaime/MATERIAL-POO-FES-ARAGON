/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alejandraglezj
 */
class ventana extends JFrame{
    private FlowLayout layout;
    private JButton boton;
    JTextField cuadroTexto;
    private JLabel resultado;
    private JLabel texto;
    private JLabel desplazamiento;
    JTextField num;


    public ventana() throws HeadlessException {
    this.setTitle("CIFRADO CESAR");
    this.setSize(1000,500);
    this.setVisible(true);
    layout = new FlowLayout();
    this.setLayout(layout);
    texto = new JLabel("Ingresa un mensaje");
    cuadroTexto = new JTextField(20);
    desplazamiento = new JLabel("Tipo de desplazamiento");
    num = new JTextField(2);
    boton = new JButton("CIFRAR");
    resultado = new JLabel("Mensaje cifrado: ");
    
    this.getContentPane().add(texto);
    this.getContentPane().add(cuadroTexto);
    this.getContentPane().add(desplazamiento);
    this.getContentPane().add(num);
    this.getContentPane().add(boton);
    this.getContentPane().add(resultado);      
    this.pack();
    this.setVisible(true);
    
    ArrayList<String> x = new ArrayList<>();
    x.add("A");   x.add("B");  x.add("C");
    x.add("D");   x.add("E");  x.add("F");
    x.add("G");   x.add("H");  x.add("I");
    x.add("J");   x.add("K");  x.add("L");
    x.add("M");   x.add("N");  x.add("Ñ");
    x.add("O");   x.add("P");  x.add("Q");
    x.add("R");   x.add("S");  x.add("T");
    x.add("U");   x.add("V");  x.add("W");
    x.add("X");   x.add("Y");  x.add("Z");

    
    this.addWindowListener(new WindowAdapter() {
        @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                
            }

        });
   
    
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            String texto = cuadroTexto.getText();
            Integer codigo =Integer.parseInt(num.getText());
            resultado.setText("Mesanje cifrado: " + cifradoCesar(texto, codigo));    
                }
             
        });

  } 

    
    public String cifradoCesar(String texto, int codigo) {
   
    StringBuilder cifrado = new StringBuilder(); //almacenara una cadena de caracteres
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }
    
   
    }
    

