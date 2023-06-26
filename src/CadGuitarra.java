//Nome: Silvio Jorge de Oliveira -  RA: 2052261
//JLabel, JTextField, JButtons e JOptionPane, Relatórios Individuais e em Grupo (JTable)

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadGuitarra extends javax.swing.JFrame {
    
    private Guitarra g = new Guitarra();
    private static CadGuitarra guitarraUnic;
    
    public CadGuitarra() {
        initComponents();
    }
    
    public static CadGuitarra getGuitarra(){
        if(guitarraUnic == null){
            guitarraUnic = new CadGuitarra();
        }
        return guitarraUnic;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotIdGui = new javax.swing.JLabel();
        rotNomeGui = new javax.swing.JLabel();
        rotQtdCor = new javax.swing.JLabel();
        rotTipoAlavanc = new javax.swing.JLabel();
        rotQtdCasas = new javax.swing.JLabel();
        cxNomeGui = new javax.swing.JTextField();
        cxQtdCor = new javax.swing.JTextField();
        cxTipoAlavanc = new javax.swing.JTextField();
        cxQtdCasas = new javax.swing.JTextField();
        cxIdGui = new javax.swing.JTextField();
        btInsGui = new javax.swing.JButton();
        btAltGui = new javax.swing.JButton();
        btDelGui = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btConsultGui = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeGui = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotIdGui.setText("ID Guitarra");

        rotNomeGui.setText("Nome do Instrumento");

        rotQtdCor.setText("Quantidade de cordas");

        rotTipoAlavanc.setText("Tipo de Alavanca");

        rotQtdCasas.setText("Quantidade de Casas");

        cxNomeGui.setEditable(false);
        cxNomeGui.setText("Guitarra");
        cxNomeGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeGuiActionPerformed(evt);
            }
        });

        btInsGui.setText("Inserir Guitarra");
        btInsGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsGuiActionPerformed(evt);
            }
        });

        btAltGui.setText("Alterar Guitarra");
        btAltGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltGuiActionPerformed(evt);
            }
        });

        btDelGui.setText("Deletar Guitarra");
        btDelGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelGuiActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btConsultGui.setText("Consultar Guitarra");
        btConsultGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultGuiActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tabeGui.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Guitarra", "Nome do Instrumento", "Quatidade de Cordas", "Tipo de Alavanca", "Quantidade de Casas"
            }
        ));
        jScrollPane1.setViewportView(tabeGui);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotQtdCor)
                            .addComponent(rotTipoAlavanc)
                            .addComponent(rotQtdCasas)
                            .addComponent(rotNomeGui)
                            .addComponent(rotIdGui))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cxTipoAlavanc)
                            .addComponent(cxQtdCasas)
                            .addComponent(cxQtdCor)
                            .addComponent(cxNomeGui, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(cxIdGui))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btInsGui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btConsultGui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAltGui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btDelGui)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotIdGui)
                            .addComponent(cxIdGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotNomeGui)
                            .addComponent(cxNomeGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotQtdCor)
                            .addComponent(cxQtdCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotTipoAlavanc)
                            .addComponent(cxTipoAlavanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotQtdCasas)
                            .addComponent(cxQtdCasas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInsGui)
                    .addComponent(btConsultGui)
                    .addComponent(btAltGui)
                    .addComponent(btDelGui))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInsGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsGuiActionPerformed
        insGui();
        limpar();
        listarTab();
    }//GEN-LAST:event_btInsGuiActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btConsultGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultGuiActionPerformed
        consGuiId();
        limpar();
    }//GEN-LAST:event_btConsultGuiActionPerformed

    private void btAltGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltGuiActionPerformed
        altGuitaId();
        limpar();
        listarTab();
    }//GEN-LAST:event_btAltGuiActionPerformed

    private void btDelGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelGuiActionPerformed
       delGuitaIdGui();
       limpar();
       listarTab();
    }//GEN-LAST:event_btDelGuiActionPerformed

    private void cxNomeGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeGuiActionPerformed
     
    public void delGuitaIdGui() {
        g = new Guitarra();

        try {
            String idGuiStr = cxIdGui.getText();

            // Verificar se a string não está vazia
            if (!idGuiStr.isEmpty()) {
                g.setIdGui(Integer.parseInt(idGuiStr));

                g = BDGuitarra.getBanco().delGuitaIdGui(g);

                if (g == null) {
                    JOptionPane.showMessageDialog(
                        null,
                        "EXCLUSAO efetuada com sucesso!",
                        "Exclusão de Guitarra",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Guitarra inexistente",
                        "Exclusão de Guitarra",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                // Tratar o caso de entrada vazia
                JOptionPane.showMessageDialog(
                    null,
                    "O campo ID da Guitarra deve ser preenchido.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (NumberFormatException e) {
            // Tratar exceção de formato inválido para números
            JOptionPane.showMessageDialog(
                null,
                "Formato inválido para o ID da Guitarra.",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void altGuitaId() {
        g = new Guitarra();

        try {
            String idGuiStr = cxIdGui.getText();

            // Verificar se a string não está vazia
            if (!idGuiStr.isEmpty()) {
                g.setIdGui(Integer.parseInt(idGuiStr));

                g = BDGuitarra.getBanco().altGuitaId(g);

                if (g != null) {
                    cxIdGui.setText(Integer.toString(g.getIdGui()));
                    cxQtdCor.setText(Integer.toString(g.getQtdDeCordas()));
                    cxTipoAlavanc.setText(Integer.toString(g.getQtdDeCasas()));
                    cxQtdCasas.setText(g.getTipoDeAlavanca());


                    JOptionPane.showMessageDialog(
                        null,
                        "Verifique os dados ALTERADOS da Guitarra!",
                        "Alteração de Guitarra",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Guitarra inexistente",
                        "Alteração de Guitarra",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                // Tratar o caso de entrada vazia
                JOptionPane.showMessageDialog(
                    null,
                    "O campo ID da Guitarra deve ser preenchido.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (NumberFormatException e) {
            // Tratar exceção de formato inválido para números
            JOptionPane.showMessageDialog(
                null,
                "Formato inválido para o ID da Guitarra.",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void consGuiId() {
        g = new Guitarra();
    
        String idGuiText = cxIdGui.getText();
        if (!idGuiText.isEmpty()) {
        try {
        g.setIdGui(Integer.parseInt(idGuiText));

        g = BDGuitarra.getBanco().consGuiId(g);

        if (g != null) {
            cxIdGui.setText(Integer.toString(g.getIdGui()));
            cxQtdCor.setText(Integer.toString(g.getQtdDeCordas()));
            cxTipoAlavanc.setText(g.getTipoDeAlavanca());
            cxQtdCasas.setText(Integer.toString(g.getQtdDeCasas()));

            JOptionPane.showMessageDialog(
                    null,
                    "Verifique os dados da Guitarra!",
                    "Consulta de Guitarra",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Guitarra inexistente",
                    "Cadastro de Guitarra",
                    1
            );
        }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado para o ID da guitarra é inválido. Por favor, insira um número válido.", "Erro de formato", JOptionPane.ERROR_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de ID da guitarra está vazio. Por favor, insira um valor.", "Campo vazio", JOptionPane.ERROR_MESSAGE);
        }
}
    
    public void sair(){
		
		int resp = JOptionPane.showConfirmDialog(
				null,
				"Deseja realmente sair?",
				"Saida",
				JOptionPane.YES_NO_OPTION
			);
		if(resp == 0){
			//System.exit(0);
			dispose();
		}
    }
        
        public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tabeGui.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Guitarra g : BDGuitarra.getBanco().getBdGui()){
            tabModel.insertRow(posLin, new Object[]{g.getIdGui(), "Guitarra", g.getQtdDeCordas(), g.getTipoDeAlavanca(), g.getQtdDeCasas()});
            posLin++;
        }
    }
    
    public void selecTab(){
        String valLin = "";
        int posLin = tabeGui.getSelectedRow();
        
        for(int col = 0; col < tabeGui.getColumnCount(); col++){
            valLin += tabeGui.getModel().getValueAt(posLin, col).toString();
            
            if(col+1 < tabeGui.getColumnCount()){
                valLin += " - ";
            }
        }
        
        JOptionPane.showMessageDialog(
                null,
                "O valores são "+ valLin,
                "Extração da tabela",
                2
        );
    
    }
        
    public void limpar(){
        cxIdGui.setText("");
        cxQtdCor.setText("");
	cxQtdCasas.setText("");
	cxTipoAlavanc.setText("");
	cxIdGui.requestFocus();
	}
    public void insGui() {
        g = new Guitarra();

        String idGuiStr = cxIdGui.getText();
        String qtdCordasStr = cxQtdCor.getText();
        String tipoAlavanca = cxTipoAlavanc.getText();
        String qtdCasasStr = cxQtdCasas.getText();

        try {
            // Verificar se as strings não estão vazias
            if (!idGuiStr.isEmpty() && !qtdCordasStr.isEmpty() && !qtdCasasStr.isEmpty()) {
                g.setIdGui(Integer.parseInt(idGuiStr));
                g.setQtdDeCordas(Integer.parseInt(qtdCordasStr));
                g.setTipoDeAlavanca(tipoAlavanca);
                g.setQtdDeCasas(Integer.parseInt(qtdCasasStr));

                g = BDGuitarra.getBanco().cadGuitarra(g);

                if (g != null) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Guitarra cadastrada com sucesso!",
                        "Cadastro de Guitarra",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Guitarra Duplicada!",
                        "Cadastro de Guitarra",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                // Tratar o caso de entrada vazia
                JOptionPane.showMessageDialog(
                    null,
                    "Todos os campos devem ser preenchidos.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (NumberFormatException e) {
            // Tratar exceção de formato inválido para números
            JOptionPane.showMessageDialog(
                null,
                "Formato inválido para números.",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltGui;
    private javax.swing.JButton btConsultGui;
    private javax.swing.JButton btDelGui;
    private javax.swing.JButton btInsGui;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxIdGui;
    private javax.swing.JTextField cxNomeGui;
    private javax.swing.JTextField cxQtdCasas;
    private javax.swing.JTextField cxQtdCor;
    private javax.swing.JTextField cxTipoAlavanc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotIdGui;
    private javax.swing.JLabel rotNomeGui;
    private javax.swing.JLabel rotQtdCasas;
    private javax.swing.JLabel rotQtdCor;
    private javax.swing.JLabel rotTipoAlavanc;
    private javax.swing.JTable tabeGui;
    // End of variables declaration//GEN-END:variables
}
