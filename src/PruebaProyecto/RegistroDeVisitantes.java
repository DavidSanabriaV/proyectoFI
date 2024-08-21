/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PruebaProyecto;

/**
 *
 * @author estef
 */
public class RegistroDeVisitantes extends javax.swing.JFrame {

    /**
     * Creates new form RegistroDeVisitantes
     */
    public RegistroDeVisitantes() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        AgregarVis = new javax.swing.JButton();
        totalingresados = new javax.swing.JButton();
        TotalAdultos = new javax.swing.JButton();
        TotalNinos = new javax.swing.JButton();
        AtrasAAL = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Visitantes");

        AgregarVis.setBackground(new java.awt.Color(0, 0, 0));
        AgregarVis.setForeground(new java.awt.Color(255, 255, 255));
        AgregarVis.setText("Agregar Visitante");
        AgregarVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVisActionPerformed(evt);
            }
        });

        totalingresados.setBackground(new java.awt.Color(0, 0, 0));
        totalingresados.setForeground(new java.awt.Color(255, 255, 255));
        totalingresados.setText("Total personas ingresadas");
        totalingresados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalingresadosActionPerformed(evt);
            }
        });

        TotalAdultos.setBackground(new java.awt.Color(0, 0, 0));
        TotalAdultos.setForeground(new java.awt.Color(255, 255, 255));
        TotalAdultos.setText("Total Adultos Ingresados");
        TotalAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalAdultosActionPerformed(evt);
            }
        });

        TotalNinos.setBackground(new java.awt.Color(0, 0, 0));
        TotalNinos.setForeground(new java.awt.Color(255, 255, 255));
        TotalNinos.setText("Total de ninos ingresados");
        TotalNinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalNinosActionPerformed(evt);
            }
        });

        AtrasAAL.setText("Atras");
        AtrasAAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAALActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(608, 608, 608)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgregarVis, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(totalingresados, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addComponent(TotalNinos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(645, 645, 645)
                        .addComponent(AtrasAAL)))
                .addContainerGap(4752, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(2652, 2652, 2652))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(2768, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(2768, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(AgregarVis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(totalingresados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(TotalAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(TotalNinos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(AtrasAAL)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(444, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(445, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasAALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAALActionPerformed
        Menu atrasMenu = new Menu();
        atrasMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAALActionPerformed

    private void TotalNinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalNinosActionPerformed
        TotalNinos ninos = new TotalNinos();
        ninos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TotalNinosActionPerformed

    private void TotalAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalAdultosActionPerformed
        TotalAdultos adul = new TotalAdultos();
        adul.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TotalAdultosActionPerformed

    private void totalingresadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalingresadosActionPerformed
        totalingresados ingre = new totalingresados();
        ingre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_totalingresadosActionPerformed

    private void AgregarVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVisActionPerformed
        AgregarVis visi = new AgregarVis();
        visi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarVisActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeVisitantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVis;
    private javax.swing.JButton AtrasAAL;
    private javax.swing.JButton TotalAdultos;
    private javax.swing.JButton TotalNinos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton totalingresados;
    // End of variables declaration//GEN-END:variables
}
