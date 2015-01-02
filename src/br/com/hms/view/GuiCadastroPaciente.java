package br.com.hms.view;

import javax.swing.JInternalFrame;

public class GuiCadastroPaciente extends javax.swing.JInternalFrame {

    public GuiCadastroPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();

        jLabel10.setText("Numero:");

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Pacientes");
        setPreferredSize(new java.awt.Dimension(450, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables
}
