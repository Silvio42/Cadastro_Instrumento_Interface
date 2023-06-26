//Nome: Silvio Jorge de Oliveira -  RA: 2052261
//JLabel, JTextField, JButtons e JOptionPane, Relatórios Individuais e em Grupo (JTable)

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadBaixo extends javax.swing.JFrame {

    private Baixo b = new Baixo();
    private static CadBaixo baixoUnic;
    
    public CadBaixo() {
        initComponents();
    }
    
    public static CadBaixo getBaixo(){
        if(baixoUnic == null){
            baixoUnic = new CadBaixo();
        }
        return baixoUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotIdBai = new javax.swing.JLabel();
        rotNomeIns = new javax.swing.JLabel();
        rotQtdCor = new javax.swing.JLabel();
        rotGroCor = new javax.swing.JLabel();
        rotQtdCap = new javax.swing.JLabel();
        cxIdBai = new javax.swing.JTextField();
        cxNomeIns = new javax.swing.JTextField();
        cxQtdCor = new javax.swing.JTextField();
        cxGroCor = new javax.swing.JTextField();
        cxQtdBai = new javax.swing.JTextField();
        btInsBai = new javax.swing.JButton();
        btConBai = new javax.swing.JButton();
        btAltBai = new javax.swing.JButton();
        btDelBai = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeBai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotIdBai.setText("ID Baixo");

        rotNomeIns.setText("Nome do Instrumento");

        rotQtdCor.setText("Quantidade de cordas");

        rotGroCor.setText("Grossura das cordas");

        rotQtdCap.setText("Quantidade de captadores");

        cxNomeIns.setEditable(false);
        cxNomeIns.setText("Baixo");

        btInsBai.setText("Inserir Baixo");
        btInsBai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsBaiActionPerformed(evt);
            }
        });

        btConBai.setText("Consultar Baixo");
        btConBai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConBaiActionPerformed(evt);
            }
        });

        btAltBai.setText("Alterar Baixo");
        btAltBai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltBaiActionPerformed(evt);
            }
        });

        btDelBai.setText("Deletar Baixo");
        btDelBai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelBaiActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tabeBai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Baixo", "Nome Instrumento", "Quantidade de cordas", "Grossura das cordas", "Quantidade de captadores"
            }
        ));
        jScrollPane1.setViewportView(tabeBai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotNomeIns)
                                    .addComponent(rotQtdCor)
                                    .addComponent(rotIdBai))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxNomeIns)
                                    .addComponent(cxIdBai)
                                    .addComponent(cxQtdCor)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotGroCor)
                                .addGap(40, 40, 40)
                                .addComponent(cxGroCor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rotQtdCap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxQtdBai))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btInsBai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConBai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAltBai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btDelBai)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotIdBai)
                            .addComponent(cxIdBai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotNomeIns)
                            .addComponent(cxNomeIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotQtdCor)
                            .addComponent(cxQtdCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotGroCor)
                            .addComponent(cxGroCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotQtdCap)
                            .addComponent(cxQtdBai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btInsBai)
                            .addComponent(btConBai)
                            .addComponent(btAltBai)
                            .addComponent(btDelBai)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInsBaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsBaiActionPerformed
        insBai();
        limpar();
        listarTab();
    }//GEN-LAST:event_btInsBaiActionPerformed

    private void btConBaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConBaiActionPerformed
        consBaiId();
        limpar();
    }//GEN-LAST:event_btConBaiActionPerformed

    private void btAltBaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltBaiActionPerformed
        altBaiId();
        limpar();
        listarTab();
    }//GEN-LAST:event_btAltBaiActionPerformed

    private void btDelBaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelBaiActionPerformed
       delGuitaIdBai();
       limpar();
       listarTab();
    }//GEN-LAST:event_btDelBaiActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed
     
    public void delGuitaIdBai() {
        b = new Baixo();

        try {
            String idBaiStr = cxIdBai.getText();

            // Verificar se a string não está vazia
            if (!idBaiStr.isEmpty()) {
                b.setIdBai(Integer.parseInt(idBaiStr));

                b = BDBaixo.getBDBaixo().delBaixoIdBai(b);

                if (b == null) {
                    JOptionPane.showMessageDialog(
                        null,
                        "EXCLUSAO efetuada com sucesso!",
                        "Exclusão de Guitarra",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Baixo inexistente",
                        "Exclusão do Baixo",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                // Tratar o caso de entrada vazia
                JOptionPane.showMessageDialog(
                    null,
                    "O campo ID do Baixo deve ser preenchido.",
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
     
    public void altBaiId() {
        b = new Baixo();

        try {
            String idBaiStr = cxIdBai.getText();

            // Verificar se a string não está vazia
            if (!idBaiStr.isEmpty()) {
                b.setIdBai(Integer.parseInt(idBaiStr));

                b = BDBaixo.getBDBaixo().altBaiId(b);

                if (b != null) {
                    cxIdBai.setText(Integer.toString(b.getIdBai()));
                    cxQtdCor.setText(Integer.toString(b.getQtdDeCordas()));
                    cxGroCor.setText(Integer.toString(b.getGrossuraDasCordas()));
                    cxQtdBai.setText(Integer.toString(b.getQtdDeCaptadores()));


                    JOptionPane.showMessageDialog(
                        null,
                        "Verifique os dados ALTERADOS do Baixo!",
                        "Alteração de Baixo",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Baixo inexistente",
                        "Alteração de Baixo",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            } else {
                // Tratar o caso de entrada vazia
                JOptionPane.showMessageDialog(
                    null,
                    "O campo ID do Baixo deve ser preenchido.",
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
        
    public void consBaiId() {
        b = new Baixo();
    
        String idBaiText = cxIdBai.getText();
        if (!idBaiText.isEmpty()) {
        try {
        b.setIdBai(Integer.parseInt(idBaiText));

        b = BDBaixo.getBDBaixo().consBaiId(b);

        if (b != null) {
            cxIdBai.setText(Integer.toString(b.getIdBai()));
            cxQtdCor.setText(Integer.toString(b.getQtdDeCordas()));
            cxGroCor.setText(Integer.toString(b.getGrossuraDasCordas()));
            cxQtdBai.setText(Integer.toString(b.getQtdDeCaptadores()));

            JOptionPane.showMessageDialog(
                    null,
                    "Verifique os dados do Baixo!",
                    "Consulta de Baixo",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Baixo inexistente",
                    "Cadastro de Guitarra",
                    1
            );
        }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado para o ID do baixo é inválido. Por favor, insira um número válido.", "Erro de formato", JOptionPane.ERROR_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de ID da baixo está vazio. Por favor, insira um valor.", "Campo vazio", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insBai() {
        b = new Baixo();

        String idBaiStr = cxIdBai.getText();
        String qtdCordasStr = cxQtdCor.getText();
        String grossuraDasCordasStr = cxGroCor.getText();
        String qtdCapStr = cxQtdBai.getText();

        try {
            // Verificar se as strings não estão vazias
            if (!idBaiStr.isEmpty() && !qtdCordasStr.isEmpty() && !qtdCapStr.isEmpty() && !grossuraDasCordasStr.isEmpty()) {
                b.setIdBai(Integer.parseInt(idBaiStr));
                b.setQtdDeCordas(Integer.parseInt(qtdCordasStr));
                b.setGrossuraDasCordas(Integer.parseInt(grossuraDasCordasStr));
                b.setQtdDeCaptadores(Integer.parseInt(qtdCapStr));

                b = BDBaixo.getBDBaixo().cadBaixo(b);

                if (b != null) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Baixo cadastrado com sucesso!",
                        "Cadastro de Baixo",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null,
                        "Baixo duplicado!",
                        "Cadastro de Baixo",
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
        
    public void listarTab(){
        DefaultTableModel tabModel = (DefaultTableModel) tabeBai.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        
        for(Baixo b : BDBaixo.getBDBaixo().getBdBai()){
            tabModel.insertRow(posLin, new Object[]{b.getIdBai(), "Baixo", b.getQtdDeCordas(), b.getGrossuraDasCordas(), b.getQtdDeCaptadores()});
            posLin++;
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
    
    public void limpar(){
        cxIdBai.setText("");
        cxQtdBai.setText("");
	cxQtdCor.setText("");
	cxGroCor.setText("");
	cxIdBai.requestFocus();
	}
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltBai;
    private javax.swing.JButton btConBai;
    private javax.swing.JButton btDelBai;
    private javax.swing.JButton btInsBai;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxGroCor;
    private javax.swing.JTextField cxIdBai;
    private javax.swing.JTextField cxNomeIns;
    private javax.swing.JTextField cxQtdBai;
    private javax.swing.JTextField cxQtdCor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotGroCor;
    private javax.swing.JLabel rotIdBai;
    private javax.swing.JLabel rotNomeIns;
    private javax.swing.JLabel rotQtdCap;
    private javax.swing.JLabel rotQtdCor;
    private javax.swing.JTable tabeBai;
    // End of variables declaration//GEN-END:variables
}
