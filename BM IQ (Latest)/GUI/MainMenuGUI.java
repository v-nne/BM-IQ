package GUI;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author VXNNE
 */
public class MainMenuGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainMenuGUI.class.getName());

    /**
     * Creates new form MainMenuGUI
     */
    public MainMenuGUI(String username) {
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/cardiogram.png")).getImage());
        addHoverEffect(btnBMI);
        addHoverEffect(btnIDW);
        addHoverEffect(btnWater);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        btnBMI = new javax.swing.JButton();
        btnWater = new javax.swing.JButton();
        btnIDW = new javax.swing.JButton();
        btnLeave = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));
        setForeground(new java.awt.Color(102, 255, 51));

        jPanel1.setBackground(new java.awt.Color(26, 26, 46));
        jPanel1.setForeground(new java.awt.Color(153, 255, 102));

        lblHeading.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 255, 136));
        lblHeading.setText("BM-IQ");
        lblHeading.setToolTipText("");

        btnBMI.setBackground(new java.awt.Color(0, 255, 136));
        btnBMI.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBMI.setText("1. BMI Calculator");
        btnBMI.setBorder(null);
        btnBMI.addActionListener(this::btnBMIActionPerformed);

        btnWater.setBackground(new java.awt.Color(0, 255, 136));
        btnWater.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnWater.setText("3. Water Intake Calculator");
        btnWater.setBorder(null);
        btnWater.addActionListener(this::btnWaterActionPerformed);

        btnIDW.setBackground(new java.awt.Color(0, 255, 136));
        btnIDW.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIDW.setText("2. Ideal Weight Calc");
        btnIDW.setBorder(null);
        btnIDW.addActionListener(this::btnIDWActionPerformed);

        btnLeave.setBackground(new java.awt.Color(255, 70, 70));
        btnLeave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLeave.setText("Exit ");
        btnLeave.setBorder(null);
        btnLeave.addActionListener(this::btnLeaveActionPerformed);

        lblUsername.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Welcome User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIDW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBMI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWater, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lblUsername)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblHeading)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addGap(35, 35, 35)
                .addComponent(btnBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIDW, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnLeave)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBMIActionPerformed
        BmiCalculatorGUI.run();
    }//GEN-LAST:event_btnBMIActionPerformed

    private void btnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLeaveActionPerformed

    private void btnIDWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDWActionPerformed
        IDWGUI.run();
    }//GEN-LAST:event_btnIDWActionPerformed

    private void btnWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaterActionPerformed
        WaterCalcGUI.run();
    }//GEN-LAST:event_btnWaterActionPerformed


    public static void run(Scanner sc, String username) {
        java.awt.EventQueue.invokeLater(() -> new MainMenuGUI(username).setVisible(true));
    }

    public void addHoverEffect(javax.swing.JButton button){
    java.awt.Color normal = new java.awt.Color(0, 255, 136);
    java.awt.Color hover = new java.awt.Color(0, 200, 100);
    java.awt.Color text = new java.awt.Color(26, 26, 46);

        button.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent e){
                button.setBackground(hover);
                button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent e){
                button.setBackground(normal);
                button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBMI;
    private javax.swing.JButton btnIDW;
    private javax.swing.JButton btnLeave;
    private javax.swing.JButton btnWater;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
