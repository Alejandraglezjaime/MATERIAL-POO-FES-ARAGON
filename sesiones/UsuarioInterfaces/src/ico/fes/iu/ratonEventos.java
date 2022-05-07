/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

/**
 *
 * @author alejandraglezj
 */


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ratonEventos implements MouseListener {
     @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola clic de raton");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("boton presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("boton liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("cursor entro al componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("el cursor salio");
    }
    
    
}
