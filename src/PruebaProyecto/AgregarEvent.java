package PruebaProyecto;

import javax.swing.JOptionPane;

public class AgregarEvent extends javax.swing.JFrame {

    //Matriz a utilzar 
    Eventos arrEventos[] = new Eventos[100];

    public AgregarEvent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InputNombreEven = new javax.swing.JTextField();
        NombreEvent = new javax.swing.JLabel();
        FechaEven = new javax.swing.JLabel();
        InputFechaEven = new javax.swing.JTextField();
        InputDescripEven = new javax.swing.JTextField();
        DescripEven = new javax.swing.JLabel();
        IDeven = new javax.swing.JLabel();
        InputIDEven = new javax.swing.JTextField();
        GuardarEven = new javax.swing.JButton();
        MenuEven = new javax.swing.JButton();
        AtrasEven = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(119, 139, 81));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese los datos");

        InputNombreEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreEvenActionPerformed(evt);
            }
        });

        NombreEvent.setText("Nombre");

        FechaEven.setText("Fecha");

        InputFechaEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFechaEvenActionPerformed(evt);
            }
        });

        InputDescripEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDescripEvenActionPerformed(evt);
            }
        });

        DescripEven.setText("Descripcion");

        IDeven.setText("ID");

        InputIDEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIDEvenActionPerformed(evt);
            }
        });

        GuardarEven.setText("Guardar");
        GuardarEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEvenActionPerformed(evt);
            }
        });

        MenuEven.setText("Menu");
        MenuEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEvenActionPerformed(evt);
            }
        });

        AtrasEven.setText("Atras");
        AtrasEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasEvenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputIDEven, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDeven, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputDescripEven, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripEven)
                    .addComponent(InputFechaEven, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaEven, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputNombreEven, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 763, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(GuardarEven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AtrasEven)
                .addGap(439, 439, 439))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(546, 546, 546)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(697, 697, 697)
                        .addComponent(MenuEven)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(NombreEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputNombreEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaEven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputFechaEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DescripEven)
                .addGap(18, 18, 18)
                .addComponent(InputDescripEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IDeven)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputIDEven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarEven)
                    .addComponent(AtrasEven))
                .addGap(43, 43, 43)
                .addComponent(MenuEven)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputNombreEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreEvenActionPerformed
        String NombreEvent = InputNombreEven.getText();
        arrEventos[0].setNombre(NombreEvent);
        JOptionPane.showMessageDialog(null, "Se agrego: "+arrEventos);
        
    }//GEN-LAST:event_InputNombreEvenActionPerformed

    private void InputFechaEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFechaEvenActionPerformed
        String FechaEven = InputFechaEven.getText();
        JOptionPane.showMessageDialog(null, "Se agrego: "+FechaEven);
        arrEventos[0].setFecha(FechaEven);
        
    }//GEN-LAST:event_InputFechaEvenActionPerformed

    private void InputDescripEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDescripEvenActionPerformed
        String descripEven = InputDescripEven.getText();
        JOptionPane.showMessageDialog(null, "Se agrego: "+descripEven);
        arrEventos[0].setDescripcion(descripEven);
        
    }//GEN-LAST:event_InputDescripEvenActionPerformed

    private void InputIDEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIDEvenActionPerformed
        int IDEven = Integer.parseInt(InputIDEven.getText());
        JOptionPane.showMessageDialog(null, "Se agrego: "+IDEven);
        arrEventos[0].setId(IDEven);
        
    }//GEN-LAST:event_InputIDEvenActionPerformed

    private void GuardarEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEvenActionPerformed
        
        
        
    }//GEN-LAST:event_GuardarEvenActionPerformed
    
    private void MenuEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEvenActionPerformed
        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuEvenActionPerformed

    private void AtrasEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasEvenActionPerformed
        RegistroDeEventos atrasEven = new RegistroDeEventos();
        atrasEven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasEvenActionPerformed
    public void MostrarInfo (Eventos[]arreventos){
        JOptionPane.showMessageDialog(null, arrEventos);
    } 
    
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
            java.util.logging.Logger.getLogger(AgregarEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasEven;
    private javax.swing.JLabel DescripEven;
    private javax.swing.JLabel FechaEven;
    private javax.swing.JButton GuardarEven;
    private javax.swing.JLabel IDeven;
    private javax.swing.JTextField InputDescripEven;
    private javax.swing.JTextField InputFechaEven;
    private javax.swing.JTextField InputIDEven;
    private javax.swing.JTextField InputNombreEven;
    private javax.swing.JButton MenuEven;
    private javax.swing.JLabel NombreEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
