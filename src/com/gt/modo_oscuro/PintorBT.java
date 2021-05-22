package com.gt.modo_oscuro;

import com.sun.swing.internal.plaf.basic.resources.basic;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

public class PintorBT {

    private Color color1;
    private Color color2;

    public PintorBT(Color color1, Color color2) {
        this.color1 = color1;
        this.color2 =color2;

    }

    public void pintar(JPanel lugar) {

        for (Component comp : lugar.getComponents()) {

            if (comp.getClass() == JButton.class) {
                JButton boton = (JButton) comp;
                boton.setBackground(color1);
                boton.setUI(new BasicButtonUI());
                boton.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        boton.setBackground(color2);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        boton.setBackground(color1);
                    }
                });

            }else if (comp.getClass() == JPanel.class){
                pintar((JPanel) comp);
                
            }

        }
    }
}
