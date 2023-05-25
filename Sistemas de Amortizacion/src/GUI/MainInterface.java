/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataAccess.DataQuery;
import Entities.CreditType;
import Entities.EntityType;
import Entities.FinancialEntity;
import Entities.InterestRate;
import Entities.UserRoles;
import FrenchAmortization.FrenchAmortizationProcessor;
import GermanAmortization.GermanAmortizationProcessor;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import sistemas.de.amortizacion.DatosUtil;

/**
 *
 * @author User
 */
public class MainInterface extends javax.swing.JFrame {

    DataQuery query = new DataQuery();
    DatosUtil datos = new DatosUtil();
    ArrayList<FinancialEntity> financial = query.queryFinancialEntity();
    ArrayList<CreditType> credit = query.queryCreditType();
    ArrayList<EntityType> entity = query.queryEntityType();
    ArrayList<InterestRate> interest = query.queryInterestRate();
    ArrayList<UserRoles> roles = query.queryUserRoles();
    ArrayList<InterestRate> interes = new ArrayList<>();

    public MainInterface() {
        initComponents();
        cargarDatos();
    }

    public void cargarDatos() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (int i = 0; i < financial.size(); i++) {
            model.addElement(financial.get(i).getNam_Fin_Ent());
        }
        jcbBanco.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        btnSimulador = new javax.swing.JPanel();
        jlblSimuladorIco = new javax.swing.JLabel();
        jlblSimulador = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jlblLoginIco = new javax.swing.JLabel();
        jlblLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblTitulo = new javax.swing.JLabel();
        jlblTituloIco = new javax.swing.JLabel();
        sideInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtDinero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtTiempo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbTipoCredito = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbAmortizacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTablaAmortisacion = new javax.swing.JTable();
        jbtnCalcular = new javax.swing.JButton();
        jbtnDescargar = new javax.swing.JButton();
        jcbBanco = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSimulador.setBackground(new java.awt.Color(85, 55, 118));
        btnSimulador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSimuladorMousePressed(evt);
            }
        });

        jlblSimuladorIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        jlblSimuladorIco.setAlignmentX(0.5F);
        jlblSimuladorIco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblSimulador.setBackground(new java.awt.Color(255, 255, 255));
        jlblSimulador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblSimulador.setForeground(new java.awt.Color(255, 255, 255));
        jlblSimulador.setText("Simulador");

        javax.swing.GroupLayout btnSimuladorLayout = new javax.swing.GroupLayout(btnSimulador);
        btnSimulador.setLayout(btnSimuladorLayout);
        btnSimuladorLayout.setHorizontalGroup(
            btnSimuladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSimuladorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblSimuladorIco)
                .addGap(47, 47, 47)
                .addComponent(jlblSimulador)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        btnSimuladorLayout.setVerticalGroup(
            btnSimuladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSimuladorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnSimuladorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblSimuladorIco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblSimulador))
                .addContainerGap())
        );

        sidePanel.add(btnSimulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 350, 90));

        btnLogin.setBackground(new java.awt.Color(64, 43, 100));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });

        jlblLoginIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jlblLoginIco.setAlignmentX(0.5F);
        jlblLoginIco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblLogin.setBackground(new java.awt.Color(255, 255, 255));
        jlblLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlblLogin.setText("Ingresar");

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLoginIco)
                .addGap(47, 47, 47)
                .addComponent(jlblLogin)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblLoginIco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblLogin))
                .addContainerGap())
        );

        sidePanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 350, -1));

        bg.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 949));

        jPanel1.setBackground(new java.awt.Color(122, 72, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jlblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlblTitulo.setText("Simulador");
        jPanel1.add(jlblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 31, -1, -1));

        jlblTituloIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        jlblTituloIco.setAlignmentX(0.5F);
        jlblTituloIco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jlblTituloIco, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 21, -1, -1));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 71, 1425, -1));

        sideInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Monto de dinero que necesita : ");
        sideInfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jtxtDinero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtDinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDineroKeyTyped(evt);
            }
        });
        sideInfo.add(jtxtDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, 340, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("¿En cuanto tiempo quiere pagarlo?");
        sideInfo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 102, 694, -1));

        jtxtTiempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtTiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtTiempoKeyTyped(evt);
            }
        });
        sideInfo.add(jtxtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 138, 340, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("¿Qué tipo de Crédito esta buscando?");
        sideInfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 13, -1, -1));

        jcbTipoCredito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbTipoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoCreditoActionPerformed(evt);
            }
        });
        sideInfo.add(jcbTipoCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 49, 390, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Sistema de amortización");
        sideInfo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 102, 390, -1));

        jcbAmortizacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sideInfo.add(jcbAmortizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 138, 390, 35));

        jLabel6.setText("USD");
        sideInfo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 49, -1, 35));

        jLabel7.setText("meses");
        sideInfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 138, -1, 35));

        jtblTablaAmortisacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pagos", "Cuota", "Interez", "Capital", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblTablaAmortisacion);

        javax.swing.GroupLayout jpTablaLayout = new javax.swing.GroupLayout(jpTabla);
        jpTabla.setLayout(jpTablaLayout);
        jpTablaLayout.setHorizontalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpTablaLayout.setVerticalGroup(
            jpTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        sideInfo.add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 180, 1367, -1));

        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });
        sideInfo.add(jbtnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 701, 181, 54));

        jbtnDescargar.setText("Descargar");
        jbtnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDescargarActionPerformed(evt);
            }
        });
        sideInfo.add(jbtnDescargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 701, 181, 54));

        bg.add(sideInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 163, 1391, 773));

        jcbBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBancoActionPerformed(evt);
            }
        });
        bg.add(jcbBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 32, 421, 31));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Seleccione un banco : ");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 35, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimuladorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimuladorMousePressed
        setColor(btnSimulador);
        resetColor(btnLogin);
        jlblTitulo.setText("Simulador");
        sideInfo.setVisible(true);
        jlblTituloIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png")));
    }//GEN-LAST:event_btnSimuladorMousePressed

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        setColor(btnLogin);
        resetColor(btnSimulador);
        jlblTitulo.setText("Simulador");
        jlblTituloIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png")));

        loginInterface login = new loginInterface();
        login.setVisible(true);
    }//GEN-LAST:event_btnLoginMousePressed

    private void jtxtDineroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDineroKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtxtDinero.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtDineroKeyTyped

    private void jtxtTiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTiempoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jtxtTiempo.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtTiempoKeyTyped

    private void jcbBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBancoActionPerformed
        int selectedIndex = jcbBanco.getSelectedIndex() + 1;
        String selectedElement = jcbBanco.getSelectedItem().toString();
        System.out.println("Elemento seleccionado: " + selectedElement);
        System.out.println("Índice seleccionado: " + selectedIndex);
        cargarDatosSeleccion(selectedIndex);

    }//GEN-LAST:event_jcbBancoActionPerformed

    private void jcbTipoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoCreditoActionPerformed
        credit.forEach((p) -> {
            if (p.getName_Cred().equals(jcbTipoCredito.getSelectedItem())) {
                interes.forEach((i) -> {
                    if (p.getID_Type_Cred() == i.getCre_Typ_ID()) {
                        setMaxNumericLimit(jtxtTiempo, i.getMax_Time());
                    }
                });
            }
        });

    }//GEN-LAST:event_jcbTipoCreditoActionPerformed

    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        String x[][] = {};
        String[] TITULOS = {"Pagos", "Cuota", "Interes", "Capital", "Saldo"};
        DefaultTableModel modelo = new DefaultTableModel(x, TITULOS);
        double inte = 14;
        for (int i = 0; i < interes.size(); i++) {
            for (int j = 0; j < credit.size(); j++) {
                if (interes.get(i).getCre_Typ_ID() == credit.get(j).getID_Type_Cred()) {
                    inte = interes.get(i).getRat_Year();
                }
            }
        }
        double saldo = Integer.parseInt(jtxtDinero.getText());

        int n = Integer.parseInt(jtxtTiempo.getText());

        if (jcbAmortizacion.getSelectedItem().equals("Francesa")) {
            FrenchAmortizationProcessor frances = new FrenchAmortizationProcessor();
            double cuota = formatearDecimales(frances.calculateMonthlyPayment(saldo, inte, n), 2);
            System.out.println(cuota);
            for (int i = 0; i < n; i++) {
                double interes = formatearDecimales(frances.calculateTotalInterest(saldo, inte, 12), 2);
                double capital = formatearDecimales(frances.calculateCurrentEquity(cuota, interes), 2);
                saldo = formatearDecimales(frances.calculateRemainingBalance(saldo, capital), 2);
                Object[] nuevaFila = {i + 1, cuota, interes, capital, saldo};
                modelo.addRow(nuevaFila);
            }
            jtblTablaAmortisacion.setModel(modelo);
            jtblTablaAmortisacion.repaint();
        } else {
            GermanAmortizationProcessor aleman = new GermanAmortizationProcessor();
            double capital = formatearDecimales(aleman.calculateCurrentEquity(saldo, n), 2);
            for (int i = 0; i < n; i++) {
                double interes = formatearDecimales(aleman.calculateTotalInterest(saldo, inte, 12), 2);
                double cuota = formatearDecimales(aleman.calculateMonthlyPayment(interes, saldo), 2);
                saldo = formatearDecimales(aleman.calculateRemainingBalance(saldo, capital), 2);
                Object[] nuevaFila = {i + 1, cuota, interes, capital, saldo};
                modelo.addRow(nuevaFila);
            }
            jtblTablaAmortisacion.setModel(modelo);
            jtblTablaAmortisacion.repaint();
        }
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    private void jbtnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDescargarActionPerformed
        Convertir conv = new Convertir();
        try {
            String nombre = JOptionPane.showInputDialog(null, "Nombre del archivo: ");
            conv.exportarTablaAPDF(jtblTablaAmortisacion, "d:/Users/Usuario/Documents/NetBeansProjects/SistemaAmortizacion/Sistema_de_Amortizacion/Sistemas de Amortizacion/src/pdf/" + nombre + ".pdf");
            JOptionPane.showMessageDialog(null, "El archivo se han guardado correctamente.");
        } catch (FileNotFoundException ex) {
            System.out.println("Error : " + ex);
        }
    }//GEN-LAST:event_jbtnDescargarActionPerformed

    public Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }

    public void cargarDatosSeleccion(int ID) {
        interes.clear();
        DefaultComboBoxModel<String> modelTC = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> modelAmortizacion = new DefaultComboBoxModel<>();
        modelAmortizacion.addElement("Francesa");
        modelAmortizacion.addElement("Alemana");
        interest.forEach((data) -> {
            if (data.getFin_Ent_ID() == ID) {
                interes.add(data);
            }
        });
        interes.forEach((p) -> {
            credit.forEach((c) -> {
                if (c.getID_Type_Cred() == p.getCre_Typ_ID()) {
                    modelTC.addElement(c.getName_Cred());
                }
            });
        });
        jcbTipoCredito.setModel(modelTC);
        jcbAmortizacion.setModel(modelAmortizacion);
        setMaxNumericLimit(jtxtTiempo, interes.get(0).getMax_Time());
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(85, 65, 118));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(64, 43, 100));
    }

    public static void setMaxNumericLimit(JTextField textField, final int maxNumero) {
        Document document = textField.getDocument();
        if (document instanceof AbstractDocument) {
            AbstractDocument abstractDocument = (AbstractDocument) document;
            abstractDocument.setDocumentFilter(new DocumentFilter() {
                @Override
                public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
                        throws BadLocationException {
                    String newStr = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                    if (newStr.length() <= String.valueOf(maxNumero).length()) {
                        try {
                            int value = Integer.parseInt(newStr);
                            if (value <= maxNumero) {
                                super.insertString(fb, offset, text, attr);
                            }
                        } catch (NumberFormatException e) {
                            // Ignorar inserciones no numéricas
                        }
                    }
                }

                @Override
                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                        throws BadLocationException {
                    String newStr = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                    if (newStr.length() <= String.valueOf(maxNumero).length()) {
                        try {
                            int value = Integer.parseInt(newStr);
                            if (value <= maxNumero) {
                                super.replace(fb, offset, length, text, attrs);
                            }
                        } catch (NumberFormatException e) {
                            // Ignorar reemplazos no numéricos
                        }
                    }
                }
            });
        }
    }

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel bg;
    private javax.swing.JPanel btnLogin;
    public javax.swing.JPanel btnSimulador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JButton jbtnDescargar;
    private javax.swing.JComboBox<String> jcbAmortizacion;
    private javax.swing.JComboBox<String> jcbBanco;
    private javax.swing.JComboBox<String> jcbTipoCredito;
    private javax.swing.JLabel jlblLogin;
    private javax.swing.JLabel jlblLoginIco;
    private javax.swing.JLabel jlblSimulador;
    private javax.swing.JLabel jlblSimuladorIco;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel jlblTituloIco;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JTable jtblTablaAmortisacion;
    private javax.swing.JTextField jtxtDinero;
    private javax.swing.JTextField jtxtTiempo;
    private javax.swing.JPanel sideInfo;
    public javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
