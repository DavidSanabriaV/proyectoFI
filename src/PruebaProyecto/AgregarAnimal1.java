/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PruebaProyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class AgregarAnimal1 extends javax.swing.JFrame {
    
    
    
    
    /**
     * Creates new form AgregarAnimal
     */
    public AgregarAnimal1() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InputNombre = new javax.swing.JTextField();
        NombreAnimal = new javax.swing.JLabel();
        EdadAnimal = new javax.swing.JLabel();
        InputEdad1 = new javax.swing.JTextField();
        Especie = new javax.swing.JLabel();
        InputEspecie = new javax.swing.JTextField();
        AlimentoAnimal = new javax.swing.JLabel();
        InputHorario = new javax.swing.JTextField();
        HorarioAnimal = new javax.swing.JLabel();
        InputHabitat = new javax.swing.JTextField();
        HabitatAnimal = new javax.swing.JLabel();
        InputAlimento = new javax.swing.JTextField();
        IDEAnimal = new javax.swing.JLabel();
        InputIDE = new javax.swing.JTextField();
        FrecuenciaAnimal = new javax.swing.JLabel();
        InputFrecuencia = new javax.swing.JTextField();
        GuardarAni = new javax.swing.JButton();
        MenuAni = new javax.swing.JButton();
        AtrasAA1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese los datos del animal");

        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });

        NombreAnimal.setText("Nombre");

        EdadAnimal.setText("Edad ");

        InputEdad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEdad1ActionPerformed(evt);
            }
        });

        Especie.setText("Especie");

        InputEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEspecieActionPerformed(evt);
            }
        });

        AlimentoAnimal.setText("Alimento");

        InputHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputHorarioActionPerformed(evt);
            }
        });

        HorarioAnimal.setText("Horario");

        InputHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputHabitatActionPerformed(evt);
            }
        });

        HabitatAnimal.setText("Habitat");

        InputAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAlimentoActionPerformed(evt);
            }
        });

        IDEAnimal.setText("# ANI");

        InputIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIDEActionPerformed(evt);
            }
        });

        FrecuenciaAnimal.setText("Frecuencia Alimento");

        InputFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFrecuenciaActionPerformed(evt);
            }
        });

        GuardarAni.setBackground(new java.awt.Color(102, 102, 102));
        GuardarAni.setForeground(new java.awt.Color(255, 255, 255));
        GuardarAni.setText("Guardar");
        GuardarAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAniActionPerformed(evt);
            }
        });

        MenuAni.setBackground(new java.awt.Color(102, 102, 102));
        MenuAni.setForeground(new java.awt.Color(255, 255, 255));
        MenuAni.setText("Menu");
        MenuAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAniActionPerformed(evt);
            }
        });

        AtrasAA1.setBackground(new java.awt.Color(102, 102, 102));
        AtrasAA1.setForeground(new java.awt.Color(255, 255, 255));
        AtrasAA1.setText("Atras");
        AtrasAA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAA1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(GuardarAni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AtrasAA1)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MenuAni)
                .addGap(648, 648, 648))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InputFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorarioAnimal)
                    .addComponent(InputHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlimentoAnimal)
                    .addComponent(InputIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDEAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HabitatAnimal)
                    .addComponent(InputEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Especie)
                    .addComponent(InputEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EdadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FrecuenciaAnimal))
                .addGap(0, 462, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(546, 546, 546)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(NombreAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EdadAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Especie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HabitatAnimal)
                .addGap(18, 18, 18)
                .addComponent(InputHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IDEAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlimentoAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HorarioAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FrecuenciaAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarAni)
                    .addComponent(AtrasAA1))
                .addGap(18, 18, 18)
                .addComponent(MenuAni)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
  
        String nombreAni = InputNombre.getText();
        JOptionPane.showMessageDialog(null, nombreAni);
   
        Home ani= new Home();
        ani.InformacionPrecargada(ani.arrAnimales);
        
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i]==null) {
                ani.arrAnimales[i].setNombre(nombreAni);
            }
        }
    }//GEN-LAST:event_InputNombreActionPerformed

    private void MenuAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAniActionPerformed
        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuAniActionPerformed

    private void InputEdad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEdad1ActionPerformed
        int edadAni = Integer.parseInt(InputEdad1.getText());
        
        Home ani= new Home();
        ani.InformacionPrecargada(ani.arrAnimales);
        
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i]==null) {
                ani.arrAnimales[i].setEdad(edadAni);
            }
        }
    }//GEN-LAST:event_InputEdad1ActionPerformed

    private void InputEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEspecieActionPerformed
        String especieAni = InputEspecie.getText();
        
        Home ani= new Home();
        ani.InformacionPrecargada(ani.arrAnimales);
        
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i]==null) {
                ani.arrAnimales[i].setEspecie(especieAni);
            }
        }
    }//GEN-LAST:event_InputEspecieActionPerformed

    private void InputHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputHabitatActionPerformed
        int HabitatAni = Integer.parseInt(InputEspecie.getText());
        
        Home ani= new Home();
        ani.InformacionPrecargada(ani.arrAnimales);
        
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i]==null) {
                ani.arrAnimales[i].setHabitat(HabitatAni);
            }
        }
    }//GEN-LAST:event_InputHabitatActionPerformed

    private void InputIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIDEActionPerformed
        int IDEAni = Integer.parseInt(InputIDE.getText());
        
        Home ani= new Home();
        ani.InformacionPrecargada(ani.arrAnimales);
        
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i]==null) {
                ani.arrAnimales[i].setAni(IDEAni);
            }
        }
    }//GEN-LAST:event_InputIDEActionPerformed

    private void InputAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAlimentoActionPerformed
        String AlimentoAni = InputAlimento.getText();
        
        Home ani= new Home();
        ani.InformacionPrecargada(ani.arrAnimales);
        
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i]==null) {
                ani.arrAnimales[i].setAlimento(AlimentoAni);
            }
        }
    }//GEN-LAST:event_InputAlimentoActionPerformed

    private void InputHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputHorarioActionPerformed
        int HorarioAni = Integer.parseInt(InputHorario.getText());
        
        Home ani= new Home();
        ani.InformacionPrecargada(ani.arrAnimales);
        
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i]==null) {
                ani.arrAnimales[i].setHorario(HorarioAni);
            }
        }
    }//GEN-LAST:event_InputHorarioActionPerformed

    private void InputFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFrecuenciaActionPerformed
        int FrecuenciaAni = Integer.parseInt(InputEspecie.getText());
        
        Home ani= new Home();
        ani.InformacionPrecargada(ani.arrAnimales);
        
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i]==null) {
                ani.arrAnimales[i].setFrecuencia(FrecuenciaAni);
            }
        }
    }//GEN-LAST:event_InputFrecuenciaActionPerformed

    private void GuardarAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAniActionPerformed
        
    }//GEN-LAST:event_GuardarAniActionPerformed

    private void AtrasAA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAA1ActionPerformed
        RegistroDeAnimales atrasAA1 = new RegistroDeAnimales();
        atrasAA1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAA1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAnimal1().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlimentoAnimal;
    private javax.swing.JButton AtrasAA1;
    private javax.swing.JLabel EdadAnimal;
    private javax.swing.JLabel Especie;
    private javax.swing.JLabel FrecuenciaAnimal;
    private javax.swing.JButton GuardarAni;
    private javax.swing.JLabel HabitatAnimal;
    private javax.swing.JLabel HorarioAnimal;
    private javax.swing.JLabel IDEAnimal;
    private javax.swing.JTextField InputAlimento;
    private javax.swing.JTextField InputEdad1;
    private javax.swing.JTextField InputEspecie;
    private javax.swing.JTextField InputFrecuencia;
    private javax.swing.JTextField InputHabitat;
    private javax.swing.JTextField InputHorario;
    private javax.swing.JTextField InputIDE;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JButton MenuAni;
    private javax.swing.JLabel NombreAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
