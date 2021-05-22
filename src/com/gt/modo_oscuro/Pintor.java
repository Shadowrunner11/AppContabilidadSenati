 
package com.gt.modo_oscuro;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;

 
public class Pintor {
    private Color color;
    

    public Pintor(Color color) {
        this.color = color;
        
    } 
    
    public void pintar(JPanel lugar){
        lugar.setBackground(color); 
        for (Component panel : lugar.getComponents()) {
            
            if (panel.getClass() == JPanel.class) {
              panel.setBackground(color);  
            }
            
           if (panel.getClass() == JPanel.class) {
                 pintar((JPanel)panel);
           }
        }
    }
}
