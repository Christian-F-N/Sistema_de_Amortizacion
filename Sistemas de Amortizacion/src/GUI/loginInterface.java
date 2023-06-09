/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataAccess.DataQuery;
import Entities.UserCredentialsAndRole;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;

/**
 *
 * @author Usuario
 */
public class loginInterface extends javax.swing.JFrame {
    MainInterface ventanaP = new MainInterface();
    JPanel banco;
    JPanel asesor;
    JPanel login;
    /**
     * Creates new form loginInterface
     */
    public loginInterface() {
        initComponents();
        jtxtContrasenia.setBackground(new Color(0, 0, 0, 0));
        jtxtUsuario.setBackground(new Color(0, 0, 0, 0));
        btnIngresar.requestFocus();
        jtxtUsuario.setBorder(new RoundBorder(15));
        jtxtContrasenia.setBorder(new RoundBorder(15));

    }

    private static class RoundBorder extends AbstractBorder {

        private int radius;

        public RoundBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Shape borderShape = new RoundRectangle2D.Double(x, y, width - 1, height - 1, radius, radius);
            g2d.setColor(c.getForeground());
            g2d.draw(borderShape);

            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius, radius, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.right = insets.bottom = insets.top = radius;
            return insets;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtxtContrasenia = new javax.swing.JTextField();
        jtxtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jtxtContrasenia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        jtxtContrasenia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtContrasenia.setText("Contraseña");
        jtxtContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtContraseniaFocusLost(evt);
            }
        });

        jtxtUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtUsuario.setText("Usuario");
        jtxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusLost(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtUsuario)
                    .addComponent(jtxtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

    private void jtxtContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContraseniaFocusGained
        if (jtxtContrasenia.getText().equals("Contraseña")) {
            jtxtContrasenia.setText("");
            //jtxtUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtxtContraseniaFocusGained

    private void jtxtContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtContraseniaFocusLost
        if (jtxtContrasenia.getText().isEmpty()) {
            jtxtContrasenia.setText("Contraseña");
            //jtxtUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtxtContraseniaFocusLost

    private void jtxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusGained
        if (jtxtUsuario.getText().equals("Usuario")) {
            jtxtUsuario.setText("");
            //jtxtUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtxtUsuarioFocusGained

    private void jtxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusLost
        if (jtxtUsuario.getText().isEmpty()) {
            jtxtUsuario.setText("Usuario");
            //jtxtUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtxtUsuarioFocusLost

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = jtxtUsuario.getText();
        String contrasenia = jtxtContrasenia.getText();
        System.out.println(usuario+" _ "+contrasenia);
        DataQuery query = new DataQuery();
        UserCredentialsAndRole user = query.findUserByCredentials(usuario, contrasenia);
        if(user != null){
            System.out.println(user.getName());
            if (user.getRoleName().equals("Manager")){
                AsesorInterfaz venta = new AsesorInterfaz();
                this.dispose();
                venta.pedirID(user.getID_Cred_Adv());
                venta.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Credenciales invalidas");
            }
            //System.out.println(user.getRoleName()));
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        MainInterface v1 = new MainInterface();
        this.dispose();
        v1.setVisible(true);
        
    }//GEN-LAST:event_btnConsultaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new loginInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtContrasenia;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
