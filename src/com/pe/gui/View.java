/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.gui;

import com.pe.conexion.Conexion;
import com.pe.logica.Celular;
import com.pe.logica.Correo;
import com.pe.logica.Direccion;
import com.pe.logica.Nombre;
import com.pe.logica.Ruc;
import com.pe.logica.Sueldo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.BasicScrollPaneUI;
import javax.swing.plaf.basic.BasicTableUI;



/**
 *
 * @author User
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    Conexion con =new Conexion ();
    private void darkMode(){
        sidePanel.setBackground(new Color(18,18,18));
        jRadioButton2.setBackground(new Color(31, 27, 36));
        jRadioButton3.setBackground(new Color(31, 27, 36));
        JPanel  panels []={jPanel1,jPanel101,jPanel102,jPanel103, jPanel104, jPanel105,
        jPanel106, jPanel107, jPanel108, jPanel109, jPanel110, jPanel111, jPanel112, jPanel113,
        jPanel2, jPanel24, jPanel25, jPanel26, jPanel27, jPanel28, jPanel3, jPanel37, jPanel38, jPanel39,
        jPanel4, jPanel40, jPanel41,jPanel42, jPanel43, jPanel44, jPanel45,jPanel46, jPanel47,
        jPanel48, jPanel49, jPanel54, jPanel55, jPanel56, jPanel57, jPanel58, jPanel59, jPanel65,
        jPanel65, jPanel66, jPanel67, jPanel68, jPanel69, jPanel70, jPanel71, jPanel72, jPanel73,
        jPanel74, jPanel75, jPanel76, jPanel77, jPanel78, jPanel79, jPanel80, jPanel81, jPanel82,
        jPanel81, jPanel82, jPanel83, jPanel84, jPanel85, jPanel86, jPanel87, jPanel88, jPanel89, jPanel90,
        jPanel91, jPanel92, jPanel93, jPanel94, jPanel95, jPanel96};
        
        for (JPanel panel: panels){
            panel.setBackground(new Color (31,27,36));
        }
        JButton botones [] = {jButton2, jButton3, jButton4, jButton5,jButton8,jButton9,jButton1, 
            jButton6, jButton10, jButton11};
        for (JButton boton : botones){
            boton.setBackground(new Color (18,18,18));
        }
    }
    public View() {
        initComponents();
        
        
        jTable2.getTableHeader().setBackground(new Color (0,153,204));
        jTable2.getTableHeader().setForeground(new Color (255,255,254));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setFont(new Font ("Orbitron",Font.PLAIN, 14));
        jButton8.setUI(new BasicButtonUI());
        
        jScrollPane2.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                 this.thumbColor = new Color (0,153,204);
            }
        });;
        jScrollPane2.setOpaque(false);
        jScrollPane2.getVerticalScrollBar().setBackground(new Color (28,34,59));
        
        
        
        
        JButton [] btns = {jButton2, jButton3, jButton4, jButton5, jButton8,jButton9};
        JButton [] btnsside= {jButton1, jButton6, jButton10, jButton11 };
        
        
        for (JButton btn : btns){
            btn.setBackground(new Color (48,61,151));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
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
                    btn.setBackground(new Color (50,30,150));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    
                    btn.setBackground(sidePanel.getBackground());
                }
            });
        }
        for (JButton btn: btnsside){
            btn.setBackground(new Color (48,61,151));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
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
                    btn.setBackground(new Color (50,30,150));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(sidePanel.getBackground());
                }

                
            });
        }
        jButton6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                darkMode();
                jTable2.getTableHeader().setBackground(new Color (18,18,18));
                jTable2.getTableHeader().setForeground(new Color (255,255,254));
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

            
        });
        jButton4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String errorM="";
                Nombre nombre = new Nombre(jTextField8.getText());
                Correo correo = new Correo(jTextField11.getText());
                Direccion direccion = new Direccion(jTextField10.getText());
                Celular celular = new Celular(jTextField12.getText());
                Ruc ruc= new Ruc(jTextField13.getText());
                
                
                        
                if (nombre.Validar()){
                   
                }else{
                    errorM=errorM+"\nNombre no válido";
                }if (correo.Validar()){
                    
                }else{
                    errorM=errorM+"\nCorreo no válido";
                }if (celular.Validar()){
                    
                }else{
                    errorM=errorM+"\nCelular no válido";
                }if (direccion.Validar()){
                    
                }else{
                    errorM=errorM+"\nDireccion no válida";
                }if (ruc.Validar()){
                    
                }else{
                    errorM=errorM+"\nRuc no válido";
                }if (errorM.isEmpty()==false){
                    JOptionPane.showMessageDialog(centerPanel, errorM);
                }else{
                    String[] de={nombre.getNombre(),celular.getCelular(),correo.getCorreo(),
                        
                    direccion.getDireccion(),ruc.getRuc()};
                    con.conexion();
                    con.crearEmpleado(Integer.parseInt(de[4]),de[0] ,de[1], de[2], de[3], de[4],jRadioButton3.isSelected());
                    
                }
                                
            }

            public void mousePressed(MouseEvent e) {
            }

            
            public void mouseReleased(MouseEvent e) {
            }

            
            public void mouseEntered(MouseEvent e) {
            }

            
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rooPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        centerUpPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jPanel87 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel101 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel102 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jPanel103 = new javax.swing.JPanel();
        jPanel104 = new javax.swing.JPanel();
        jPanel105 = new javax.swing.JPanel();
        jPanel106 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel107 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jPanel108 = new javax.swing.JPanel();
        jPanel109 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel110 = new javax.swing.JPanel();
        jPanel111 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel112 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        centerDownPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rooPanel.setBackground(new java.awt.Color(28, 34, 59));
        rooPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(28, 34, 59), 4, true));
        rooPanel.setLayout(new java.awt.BorderLayout(10, 0));

        sidePanel.setBackground(new java.awt.Color(48, 61, 151));
        sidePanel.setMinimumSize(new java.awt.Dimension(149, 900));
        sidePanel.setPreferredSize(new java.awt.Dimension(170, 980));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER NAME");
        jLabel1.setToolTipText("");
        sidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel2.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO");
        jLabel2.setToolTipText("");
        sidePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/Imagen2.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        sidePanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 100));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/black-lightbulb1.png"))); // NOI18N
        sidePanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 170, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/llaves1.png"))); // NOI18N
        sidePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 100));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/trashcan1.png"))); // NOI18N
        sidePanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 170, 100));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/impresora1.png"))); // NOI18N
        sidePanel.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 170, 100));

        rooPanel.add(sidePanel, java.awt.BorderLayout.WEST);

        centerPanel.setBackground(new java.awt.Color(28, 34, 59));
        centerPanel.setPreferredSize(new java.awt.Dimension(1500, 800));
        centerPanel.setLayout(new java.awt.BorderLayout(0, 10));

        centerUpPanel.setBackground(new java.awt.Color(28, 34, 59));
        centerUpPanel.setPreferredSize(new java.awt.Dimension(491, 600));
        centerUpPanel.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        jPanel2.setBackground(new java.awt.Color(58, 120, 220));
        jPanel2.setLayout(new java.awt.GridLayout(8, 0, 0, 20));

        jPanel3.setBackground(new java.awt.Color(58, 120, 220));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(58, 120, 220));
        jLabel3.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATOS PERSONALES");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel54.setLayout(new java.awt.BorderLayout());

        jPanel55.setBackground(new java.awt.Color(58, 120, 220));
        jPanel55.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel55.setLayout(new java.awt.BorderLayout());

        jLabel19.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("   Nombre  ");
        jLabel19.setToolTipText("");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel19.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel55.add(jLabel19, java.awt.BorderLayout.CENTER);

        jPanel54.add(jPanel55, java.awt.BorderLayout.WEST);

        jPanel56.setBackground(new java.awt.Color(58, 120, 220));
        jPanel56.setLayout(new java.awt.BorderLayout());

        jPanel57.setBackground(new java.awt.Color(58, 120, 220));
        jPanel57.setPreferredSize(new java.awt.Dimension(20, 58));
        jPanel57.setLayout(new java.awt.BorderLayout());

        jTextField8.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 51, 51));
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextField8.setPreferredSize(new java.awt.Dimension(2, 30));
        jPanel57.add(jTextField8, java.awt.BorderLayout.SOUTH);

        jPanel58.setBackground(new java.awt.Color(58, 120, 220));
        jPanel58.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel57.add(jPanel58, java.awt.BorderLayout.NORTH);

        jPanel56.add(jPanel57, java.awt.BorderLayout.CENTER);

        jPanel59.setBackground(new java.awt.Color(58, 120, 220));
        jPanel59.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel56.add(jPanel59, java.awt.BorderLayout.EAST);

        jPanel54.add(jPanel56, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel54);

        jPanel65.setLayout(new java.awt.BorderLayout());

        jPanel66.setBackground(new java.awt.Color(58, 120, 220));
        jPanel66.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel66.setLayout(new java.awt.BorderLayout());

        jLabel21.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("   Dirección");
        jLabel21.setToolTipText("");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel66.add(jLabel21, java.awt.BorderLayout.CENTER);

        jPanel65.add(jPanel66, java.awt.BorderLayout.WEST);

        jPanel67.setBackground(new java.awt.Color(58, 120, 220));
        jPanel67.setLayout(new java.awt.BorderLayout());

        jPanel68.setBackground(new java.awt.Color(58, 120, 220));
        jPanel68.setPreferredSize(new java.awt.Dimension(20, 58));
        jPanel68.setLayout(new java.awt.BorderLayout());

        jTextField10.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(51, 51, 51));
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextField10.setPreferredSize(new java.awt.Dimension(2, 30));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel68.add(jTextField10, java.awt.BorderLayout.SOUTH);

        jPanel69.setBackground(new java.awt.Color(58, 120, 220));
        jPanel69.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel68.add(jPanel69, java.awt.BorderLayout.NORTH);

        jPanel67.add(jPanel68, java.awt.BorderLayout.CENTER);

        jPanel70.setBackground(new java.awt.Color(58, 120, 220));
        jPanel70.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel67.add(jPanel70, java.awt.BorderLayout.EAST);

        jPanel65.add(jPanel67, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel65);

        jPanel71.setLayout(new java.awt.BorderLayout());

        jPanel72.setBackground(new java.awt.Color(58, 120, 220));
        jPanel72.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel72.setLayout(new java.awt.BorderLayout());

        jLabel22.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("   Correo  ");
        jLabel22.setToolTipText("");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel72.add(jLabel22, java.awt.BorderLayout.CENTER);

        jPanel71.add(jPanel72, java.awt.BorderLayout.WEST);

        jPanel73.setBackground(new java.awt.Color(58, 120, 220));
        jPanel73.setLayout(new java.awt.BorderLayout());

        jPanel74.setBackground(new java.awt.Color(58, 120, 220));
        jPanel74.setPreferredSize(new java.awt.Dimension(20, 58));
        jPanel74.setLayout(new java.awt.BorderLayout());

        jTextField11.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(51, 51, 51));
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextField11.setPreferredSize(new java.awt.Dimension(2, 30));
        jPanel74.add(jTextField11, java.awt.BorderLayout.SOUTH);

        jPanel75.setBackground(new java.awt.Color(58, 120, 220));
        jPanel75.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel74.add(jPanel75, java.awt.BorderLayout.NORTH);

        jPanel73.add(jPanel74, java.awt.BorderLayout.CENTER);

        jPanel76.setBackground(new java.awt.Color(58, 120, 220));
        jPanel76.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel73.add(jPanel76, java.awt.BorderLayout.EAST);

        jPanel71.add(jPanel73, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel71);

        jPanel77.setLayout(new java.awt.BorderLayout());

        jPanel78.setBackground(new java.awt.Color(58, 120, 220));
        jPanel78.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel78.setLayout(new java.awt.BorderLayout());

        jLabel23.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("   Celular  ");
        jLabel23.setToolTipText("");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel23.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel78.add(jLabel23, java.awt.BorderLayout.CENTER);

        jPanel77.add(jPanel78, java.awt.BorderLayout.WEST);

        jPanel79.setBackground(new java.awt.Color(58, 120, 220));
        jPanel79.setLayout(new java.awt.BorderLayout());

        jPanel80.setBackground(new java.awt.Color(58, 120, 220));
        jPanel80.setPreferredSize(new java.awt.Dimension(20, 58));
        jPanel80.setLayout(new java.awt.BorderLayout());

        jTextField12.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(51, 51, 51));
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextField12.setPreferredSize(new java.awt.Dimension(2, 30));
        jPanel80.add(jTextField12, java.awt.BorderLayout.SOUTH);

        jPanel81.setBackground(new java.awt.Color(58, 120, 220));
        jPanel81.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel80.add(jPanel81, java.awt.BorderLayout.NORTH);

        jPanel79.add(jPanel80, java.awt.BorderLayout.CENTER);

        jPanel82.setBackground(new java.awt.Color(58, 120, 220));
        jPanel82.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel79.add(jPanel82, java.awt.BorderLayout.EAST);

        jPanel77.add(jPanel79, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel77);

        jPanel83.setLayout(new java.awt.BorderLayout());

        jPanel84.setBackground(new java.awt.Color(58, 120, 220));
        jPanel84.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel84.setLayout(new java.awt.BorderLayout());

        jLabel24.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("   RUC  ");
        jLabel24.setToolTipText("");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel24.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel84.add(jLabel24, java.awt.BorderLayout.CENTER);

        jPanel83.add(jPanel84, java.awt.BorderLayout.WEST);

        jPanel85.setBackground(new java.awt.Color(58, 120, 220));
        jPanel85.setLayout(new java.awt.BorderLayout());

        jPanel86.setBackground(new java.awt.Color(58, 120, 220));
        jPanel86.setPreferredSize(new java.awt.Dimension(20, 58));
        jPanel86.setLayout(new java.awt.BorderLayout());

        jTextField13.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(51, 51, 51));
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextField13.setPreferredSize(new java.awt.Dimension(2, 30));
        jPanel86.add(jTextField13, java.awt.BorderLayout.SOUTH);

        jPanel87.setBackground(new java.awt.Color(58, 120, 220));
        jPanel87.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel86.add(jPanel87, java.awt.BorderLayout.NORTH);

        jPanel85.add(jPanel86, java.awt.BorderLayout.CENTER);

        jPanel88.setBackground(new java.awt.Color(58, 120, 220));
        jPanel88.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel85.add(jPanel88, java.awt.BorderLayout.EAST);

        jPanel83.add(jPanel85, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel83);

        jPanel24.setBackground(new java.awt.Color(58, 120, 220));
        jPanel24.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel25.setBackground(new java.awt.Color(58, 120, 220));
        jPanel25.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("   Estado Civil");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel25.add(jLabel9, java.awt.BorderLayout.CENTER);

        jPanel24.add(jPanel25, java.awt.BorderLayout.WEST);

        jPanel26.setBackground(new java.awt.Color(58, 120, 220));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel27.setBackground(new java.awt.Color(58, 120, 220));
        jPanel27.setPreferredSize(new java.awt.Dimension(15, 20));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel27, java.awt.BorderLayout.NORTH);

        jPanel28.setBackground(new java.awt.Color(58, 120, 220));
        jPanel28.setPreferredSize(new java.awt.Dimension(20, 25));
        jPanel28.setLayout(new java.awt.BorderLayout(20, 0));

        jRadioButton2.setBackground(new java.awt.Color(58, 120, 220));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Soltero");
        jPanel28.add(jRadioButton2, java.awt.BorderLayout.LINE_START);

        jRadioButton3.setBackground(new java.awt.Color(58, 120, 220));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Casado");
        jPanel28.add(jRadioButton3, java.awt.BorderLayout.CENTER);

        jPanel26.add(jPanel28, java.awt.BorderLayout.SOUTH);

        jPanel24.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel24);

        jPanel4.setBackground(new java.awt.Color(58, 120, 220));
        jPanel4.setLayout(new java.awt.GridLayout(1, 4));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/lupa2.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/add2.png"))); // NOI18N
        jPanel4.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/actualizar2.png"))); // NOI18N
        jPanel4.add(jButton5);

        jPanel2.add(jPanel4);

        centerUpPanel.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(58, 120, 220));
        jPanel1.setLayout(new java.awt.GridLayout(8, 0, 0, 20));

        jLabel10.setBackground(new java.awt.Color(58, 120, 220));
        jLabel10.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("HORAS");
        jLabel10.setToolTipText("");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10);

        jPanel89.setBackground(new java.awt.Color(58, 120, 220));
        jPanel89.setLayout(new java.awt.GridLayout(1, 2));

        jPanel90.setBackground(new java.awt.Color(58, 120, 220));
        jPanel90.setPreferredSize(new java.awt.Dimension(250, 58));
        jPanel90.setLayout(new java.awt.BorderLayout());

        jPanel101.setBackground(new java.awt.Color(58, 120, 220));
        jPanel101.setPreferredSize(new java.awt.Dimension(120, 58));
        jPanel101.setLayout(new java.awt.BorderLayout());

        jLabel27.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("   Horas  ");
        jLabel27.setToolTipText("");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel101.add(jLabel27, java.awt.BorderLayout.CENTER);

        jPanel90.add(jPanel101, java.awt.BorderLayout.LINE_START);

        jPanel102.setBackground(new java.awt.Color(58, 120, 220));
        jPanel102.setPreferredSize(new java.awt.Dimension(10, 58));
        jPanel102.setLayout(new java.awt.BorderLayout());

        jTextField16.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(51, 51, 51));
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextField16.setPreferredSize(new java.awt.Dimension(2, 30));
        jPanel102.add(jTextField16, java.awt.BorderLayout.SOUTH);

        jPanel103.setBackground(new java.awt.Color(58, 120, 220));
        jPanel103.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel102.add(jPanel103, java.awt.BorderLayout.NORTH);

        jPanel90.add(jPanel102, java.awt.BorderLayout.CENTER);

        jPanel104.setBackground(new java.awt.Color(58, 120, 220));
        jPanel104.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel104Layout = new javax.swing.GroupLayout(jPanel104);
        jPanel104.setLayout(jPanel104Layout);
        jPanel104Layout.setHorizontalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel104Layout.setVerticalGroup(
            jPanel104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel90.add(jPanel104, java.awt.BorderLayout.LINE_END);

        jPanel89.add(jPanel90);

        jPanel105.setBackground(new java.awt.Color(58, 120, 220));
        jPanel105.setPreferredSize(new java.awt.Dimension(300, 58));
        jPanel105.setLayout(new java.awt.BorderLayout());

        jPanel106.setBackground(new java.awt.Color(58, 120, 220));
        jPanel106.setPreferredSize(new java.awt.Dimension(153, 58));
        jPanel106.setLayout(new java.awt.BorderLayout());

        jLabel28.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("   Precio/h  ");
        jLabel28.setToolTipText("");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel106.add(jLabel28, java.awt.BorderLayout.CENTER);

        jPanel105.add(jPanel106, java.awt.BorderLayout.LINE_START);

        jPanel107.setBackground(new java.awt.Color(58, 120, 220));
        jPanel107.setPreferredSize(new java.awt.Dimension(10, 58));
        jPanel107.setLayout(new java.awt.BorderLayout());

        jTextField17.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(51, 51, 51));
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jTextField17.setPreferredSize(new java.awt.Dimension(2, 30));
        jPanel107.add(jTextField17, java.awt.BorderLayout.SOUTH);

        jPanel108.setBackground(new java.awt.Color(58, 120, 220));
        jPanel108.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel108Layout = new javax.swing.GroupLayout(jPanel108);
        jPanel108.setLayout(jPanel108Layout);
        jPanel108Layout.setHorizontalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel108Layout.setVerticalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel107.add(jPanel108, java.awt.BorderLayout.NORTH);

        jPanel105.add(jPanel107, java.awt.BorderLayout.CENTER);

        jPanel109.setBackground(new java.awt.Color(58, 120, 220));
        jPanel109.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel109Layout = new javax.swing.GroupLayout(jPanel109);
        jPanel109.setLayout(jPanel109Layout);
        jPanel109Layout.setHorizontalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel109Layout.setVerticalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel105.add(jPanel109, java.awt.BorderLayout.LINE_END);

        jPanel89.add(jPanel105);

        jPanel1.add(jPanel89);

        jPanel37.setLayout(new java.awt.BorderLayout());

        jPanel38.setBackground(new java.awt.Color(58, 120, 220));
        jPanel38.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel38.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("   Sueldo bruto");
        jLabel13.setToolTipText("");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel38.add(jLabel13, java.awt.BorderLayout.CENTER);

        jPanel37.add(jPanel38, java.awt.BorderLayout.WEST);

        jPanel39.setBackground(new java.awt.Color(58, 120, 220));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel40.setBackground(new java.awt.Color(58, 120, 220));
        jPanel40.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel40, java.awt.BorderLayout.EAST);

        jLabel14.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("   000.00");
        jLabel14.setToolTipText("");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel39.add(jLabel14, java.awt.BorderLayout.CENTER);

        jPanel37.add(jPanel39, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel37);

        jPanel41.setLayout(new java.awt.BorderLayout());

        jPanel42.setBackground(new java.awt.Color(58, 120, 220));
        jPanel42.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel42.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("   Descuento");
        jLabel15.setToolTipText("");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel42.add(jLabel15, java.awt.BorderLayout.CENTER);

        jPanel41.add(jPanel42, java.awt.BorderLayout.WEST);

        jPanel43.setBackground(new java.awt.Color(58, 120, 220));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel44.setBackground(new java.awt.Color(58, 120, 220));
        jPanel44.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel44, java.awt.BorderLayout.EAST);

        jLabel16.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("   000.00");
        jLabel16.setToolTipText("");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel43.add(jLabel16, java.awt.BorderLayout.CENTER);

        jPanel41.add(jPanel43, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel41);

        jPanel45.setLayout(new java.awt.BorderLayout());

        jPanel46.setBackground(new java.awt.Color(58, 120, 220));
        jPanel46.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel46.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("   Bonificación");
        jLabel17.setToolTipText("");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel46.add(jLabel17, java.awt.BorderLayout.CENTER);

        jPanel45.add(jPanel46, java.awt.BorderLayout.WEST);

        jPanel47.setBackground(new java.awt.Color(58, 120, 220));
        jPanel47.setLayout(new java.awt.BorderLayout());

        jPanel48.setBackground(new java.awt.Color(58, 120, 220));
        jPanel48.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel47.add(jPanel48, java.awt.BorderLayout.EAST);

        jLabel18.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("   000.00");
        jLabel18.setToolTipText("");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel47.add(jLabel18, java.awt.BorderLayout.CENTER);

        jPanel45.add(jPanel47, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel45);

        jPanel110.setLayout(new java.awt.BorderLayout());

        jPanel111.setBackground(new java.awt.Color(58, 120, 220));
        jPanel111.setPreferredSize(new java.awt.Dimension(200, 58));
        jPanel111.setLayout(new java.awt.BorderLayout());

        jLabel29.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("   Sueldo neto");
        jLabel29.setToolTipText("");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel111.add(jLabel29, java.awt.BorderLayout.CENTER);

        jPanel110.add(jPanel111, java.awt.BorderLayout.WEST);

        jPanel112.setBackground(new java.awt.Color(58, 120, 220));
        jPanel112.setLayout(new java.awt.BorderLayout());

        jPanel113.setBackground(new java.awt.Color(58, 120, 220));
        jPanel113.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel113Layout = new javax.swing.GroupLayout(jPanel113);
        jPanel113.setLayout(jPanel113Layout);
        jPanel113Layout.setHorizontalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel113Layout.setVerticalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel112.add(jPanel113, java.awt.BorderLayout.EAST);

        jLabel30.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("   000.00");
        jLabel30.setToolTipText("");
        jLabel30.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel112.add(jLabel30, java.awt.BorderLayout.CENTER);

        jPanel110.add(jPanel112, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel110);

        jPanel91.setLayout(new java.awt.BorderLayout());

        jPanel92.setBackground(new java.awt.Color(58, 120, 220));
        jPanel92.setPreferredSize(new java.awt.Dimension(120, 58));
        jPanel92.setLayout(new java.awt.BorderLayout());
        jPanel91.add(jPanel92, java.awt.BorderLayout.WEST);

        jPanel93.setBackground(new java.awt.Color(58, 120, 220));
        jPanel93.setLayout(new java.awt.BorderLayout());

        jPanel94.setBackground(new java.awt.Color(58, 120, 220));
        jPanel94.setPreferredSize(new java.awt.Dimension(20, 58));
        jPanel94.setLayout(new java.awt.BorderLayout());

        jPanel95.setBackground(new java.awt.Color(58, 120, 220));
        jPanel95.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel94.add(jPanel95, java.awt.BorderLayout.NORTH);

        jPanel93.add(jPanel94, java.awt.BorderLayout.CENTER);

        jPanel96.setBackground(new java.awt.Color(58, 120, 220));
        jPanel96.setPreferredSize(new java.awt.Dimension(20, 58));

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel93.add(jPanel96, java.awt.BorderLayout.EAST);

        jPanel91.add(jPanel93, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel91);

        jPanel49.setBackground(new java.awt.Color(58, 120, 220));
        jPanel49.setLayout(new java.awt.GridLayout(1, 2, 1, 0));

        jButton8.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/accounting (2)1.png"))); // NOI18N
        jButton8.setText("Calcular");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel49.add(jButton8);

        jButton9.setFont(new java.awt.Font("Square721 BT", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pe/icons/piggy-bank1.png"))); // NOI18N
        jButton9.setText("Pagar");
        jPanel49.add(jButton9);

        jPanel1.add(jPanel49);

        centerUpPanel.add(jPanel1);

        centerPanel.add(centerUpPanel, java.awt.BorderLayout.PAGE_START);

        centerDownPanel.setBackground(new java.awt.Color(28, 34, 59));
        centerDownPanel.setPreferredSize(new java.awt.Dimension(300, 300));
        centerDownPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBackground(new java.awt.Color(102, 102, 255));

        jTable2.setBackground(new java.awt.Color(250, 250, 250));
        jTable2.setFont(new java.awt.Font("Orbitron", 0, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha", "Sueldo bruto", "Descuento", "Bonificación", "Sueldo neto"
            }
        ));
        jTable2.setFocusable(false);
        jTable2.setRowHeight(25);
        jScrollPane2.setViewportView(jTable2);

        centerDownPanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        centerPanel.add(centerDownPanel, java.awt.BorderLayout.CENTER);

        rooPanel.add(centerPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(rooPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        String ruc = jTextField13.getText();
        if ((new Ruc(ruc)).Validar()){
            con.conexion();
            con.filtrarDatosEmpleado(ruc, jTextField8, jTextField10, jTextField11, jTextField12,
                    jRadioButton2,jRadioButton3);   
            con.mostrarDatosBoleta(ruc, jTable2);
            con.cerrarConexion();
            
        }else{
            JOptionPane.showMessageDialog(centerPanel, "Ingrese un número de RUC válido");
        }
        
              
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        Sueldo sueldo1 =new Sueldo (Integer.parseInt(jTextField16.getText()),Double.parseDouble(jTextField17.getText()),true);
        jLabel14.setText(sueldo1.getSueldoBruto());
        jLabel16.setText(sueldo1.getDescuento(0.13));
        jLabel18.setText(sueldo1.getBonificacion());
        jLabel30.setText(sueldo1.getSueldoNeto());
    }//GEN-LAST:event_jButton8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel centerDownPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel centerUpPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel rooPanel;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
