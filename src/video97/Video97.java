/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video97;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author gleez
 */
public class Video97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame_Sliders mimarco = new Frame_Sliders(); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } 
    
}

    
class Frame_Sliders extends JFrame{
    public Frame_Sliders(){
        setBounds(500,400,550,350); 
        
        Lamina_Sliders milamina = new Lamina_Sliders(); 
        add(milamina); 
        setVisible(true);
    }
    
}

class Lamina_Sliders extends JPanel{
    
    public Lamina_Sliders(){
        setLayout(new BorderLayout()); 
        rotulo = new JLabel("En algun lugar..."); 
        add(rotulo, BorderLayout.CENTER); 
        control = new JSlider(8,50,12);
        control.setMajorTickSpacing(25); 
        control.setMinorTickSpacing(5); 
        control.setPaintTicks(true); 
        control.setPaintLabels(true); 
        control.setFont(new Font("Serif", Font.ITALIC, 10)); 
        control.addChangeListener(new EventoSlider()); 
        JPanel laminaSlider = new JPanel(); 
        laminaSlider.add(control); 
        add(laminaSlider, BorderLayout.NORTH); 
        
        
    }
    
    private class EventoSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
             //To change body of generated methods, choose Tools | Templates.
             contador++; 
             System.out.println("Estas manipulando el deslizante"+contador);
        }
        
        
        
    }
    private JLabel rotulo; 
    private JSlider control; 
    private static int contador; 
}
