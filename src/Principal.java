//Apache NetBeans IDE 12.5
//Nome: Silvio Jorge de Oliveira -  RA: 2052261

//JFrame, JMenuBar, JMenu e JMenuItem

import javax.swing.JOptionPane;

class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
        mnItSair.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        mnItSairActionPerformed(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnBarPrincipal = new javax.swing.JMenuBar();
        mnPrincipal = new javax.swing.JMenu();
        mnItCadGuita = new javax.swing.JMenuItem();
        mnItBaixo = new javax.swing.JMenuItem();
        mnItBateria = new javax.swing.JMenuItem();
        mnItSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnPrincipal.setText("Principal");

        mnItCadGuita.setText("Cadastro de Guitarras...");
        mnItCadGuita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadGuitaActionPerformed(evt);
            }
        });
        mnPrincipal.add(mnItCadGuita);

        mnItBaixo.setText("Cadastro de Baixos...");
        mnItBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItBaixoActionPerformed(evt);
            }
        });
        mnPrincipal.add(mnItBaixo);

        mnItBateria.setText("Cadastro de Baterias...");
        mnItBateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItBateriaActionPerformed(evt);
            }
        });
        mnPrincipal.add(mnItBateria);

        mnItSair.setText("Sair");
        mnPrincipal.add(mnItSair);

        mnBarPrincipal.add(mnPrincipal);

        setJMenuBar(mnBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItCadGuitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadGuitaActionPerformed
        CadGuitarra.getGuitarra().setVisible(true);
    }//GEN-LAST:event_mnItCadGuitaActionPerformed

    private void mnItBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItBaixoActionPerformed
        CadBaixo.getBaixo().setVisible(true);
    }//GEN-LAST:event_mnItBaixoActionPerformed

    private void mnItBateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItBateriaActionPerformed
        CadBateria.getBateria().setVisible(true);
    }//GEN-LAST:event_mnItBateriaActionPerformed
    private void mnItSairActionPerformed(java.awt.event.ActionEvent evt) {
        sair();
    }
    
    public void sair(){
	int resp = JOptionPane.showConfirmDialog(
                        null,
			"Deseja realmente sair?",
			"Saida",
			JOptionPane.YES_NO_OPTION
                    );
            if(resp == 0){
                    dispose();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mnBarPrincipal;
    private javax.swing.JMenuItem mnItBaixo;
    private javax.swing.JMenuItem mnItBateria;
    private javax.swing.JMenuItem mnItCadGuita;
    private javax.swing.JMenuItem mnItSair;
    private javax.swing.JMenu mnPrincipal;
    // End of variables declaration//GEN-END:variables
}
