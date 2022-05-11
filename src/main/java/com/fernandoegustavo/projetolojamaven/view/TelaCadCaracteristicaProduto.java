/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernandoegustavo.projetolojamaven.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.fernandoegustavo.projetolojamaven.model.DAO.CidadeDAO;
import com.fernandoegustavo.projetolojamaven.model.bo.Cidade;
import java.util.List;
import javax.swing.JFormattedTextField;
import com.fernandoegustavo.projetolojamaven.model.DAO.CorDAO;
import com.fernandoegustavo.projetolojamaven.model.DAO.ProdutoDAO;
import com.fernandoegustavo.projetolojamaven.model.DAO.TamanhoDAO;
import com.fernandoegustavo.projetolojamaven.model.bo.Cor;
import com.fernandoegustavo.projetolojamaven.model.bo.Produto;
import com.fernandoegustavo.projetolojamaven.model.bo.Tamanho;

/**
 *
 * @author house
 */
public class TelaCadCaracteristicaProduto extends javax.swing.JFrame {

    /**
     * Creates new form FormModeloCadastros
     */
    public TelaCadCaracteristicaProduto() {
        initComponents();
	carregarComboProduto();
	carregarComboCor();
	carregarComboTamanho();


    }

  public void carregarComboProduto(){

          ProdutoDAO produtoDAO = new ProdutoDAO();
          List<Produto> list = produtoDAO.retrieve();
          for(Produto item: list){
	    jComboBox1.addItem(item.getDescricaoProduto());
          }

    }      


  public void carregarComboCor(){

          CorDAO corDAO = new CorDAO();
          List<Cor> list = corDAO.retrieve();
          for(Cor item: list){
	    jComboBox2.addItem(item.getDescricaoCor());
          }

    }  


  public void carregarComboTamanho(){

          TamanhoDAO tamanhoDAO = new TamanhoDAO();
          List<Tamanho> list = tamanhoDAO.retrieve();
          for(Tamanho item: list){
	    jComboBox3.addItem(item.getDescricaoTamanho());
          }

    }  



    public JButton getjButtonBuscar() {
        return jButtonBuscar;
    }

    public void setjButtonBuscar(JButton jButtonBuscar) {
        this.jButtonBuscar = jButtonBuscar;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public void setjButtonCancelar(JButton jButtonCancelar) {
        this.jButtonCancelar = jButtonCancelar;
    }

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public void setjButtonGravar(JButton jButtonGravar) {
        this.jButtonGravar = jButtonGravar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public void setjButtonNovo(JButton jButtonNovo) {
        this.jButtonNovo = jButtonNovo;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public void setjButtonSair(JButton jButtonSair) {
        this.jButtonSair = jButtonSair;
    }

    public JTextField getjTFIdCidade() {
        return jTFIdCidade;
    }

    public void setjTFIdCidade(JTextField jTFIdCidade) {
        this.jTFIdCidade = jTFIdCidade;
    }

    public JComboBox<String> getjComboBox2() {
	return jComboBox2;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
	this.jComboBox2 = jComboBox2;
    }

    public JComboBox<String> getjComboBox3() {
	return jComboBox3;
    }

    public void setjComboBox3(JComboBox<String> jComboBox3) {
	this.jComboBox3 = jComboBox3;
    }

    public JFormattedTextField getjTFCodBarras() {
	return jTFCodBarras;
    }

    public void setjTFCodBarras(JFormattedTextField jTFCodBarras) {
	this.jTFCodBarras = jTFCodBarras;
    }



    public JTextField getjTFQtdEstoque() {
	return jTFQtdEstoque;
    }

    public void setjTFQtdEstoque(JTextField jTFQtdEstoque) {
	this.jTFQtdEstoque = jTFQtdEstoque;
    }

 

    public JComboBox<String> getjComboBox1() {
	return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
	this.jComboBox1 = jComboBox1;
    }



    public JPanel getjPanelDados() {
        return jPanelDados;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelDados = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jTFIdCidade = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLId1 = new javax.swing.JLabel();
        jLId2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLId3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLId4 = new javax.swing.JLabel();
        jTFQtdEstoque = new javax.swing.JTextField();
        jLId5 = new javax.swing.JLabel();
        jTFCodBarras = new javax.swing.JFormattedTextField();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Bairro");
        setResizable(false);

        jPanelTitulo.setBackground(new java.awt.Color(204, 255, 0));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(533, 75));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 0, 153));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Caracteristica Produto");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelTitulo, java.awt.BorderLayout.NORTH);

        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLId.setText("ID:");

        jTFIdCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLId1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLId1.setText("Produto");

        jLId2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLId2.setText("Cor:");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLId3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLId3.setText("Tamanho:");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLId4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLId4.setText("Código de barras:");

        jTFQtdEstoque.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLId5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLId5.setText("Quantidade do estoque: ");

        try {
            jTFCodBarras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("# ###### ######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTFCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodBarrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLId5)
                        .addGap(18, 18, 18)
                        .addComponent(jTFQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLId2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLId)
                                .addGap(18, 18, 18)
                                .addComponent(jTFIdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jLId1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLId3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, 211, Short.MAX_VALUE))
                        .addGap(65, 65, 65))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLId4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLId)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLId1))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLId2)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLId3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId4)
                    .addComponent(jTFCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId5)
                    .addComponent(jTFQtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDados, java.awt.BorderLayout.LINE_START);

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBotoes.setPreferredSize(new java.awt.Dimension(533, 50));

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/New document.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setPreferredSize(new java.awt.Dimension(100, 30));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonNovo);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanelBotoes.add(jButtonCancelar);

        jButtonGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/OK.png"))); // NOI18N
        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanelBotoes.add(jButtonGravar);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Find.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanelBotoes.add(jButtonBuscar);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanelBotoes.add(jButtonSair);

        getContentPane().add(jPanelBotoes, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTFCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodBarrasActionPerformed

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
            java.util.logging.Logger.getLogger(ModeloCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeloCadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLId1;
    private javax.swing.JLabel jLId2;
    private javax.swing.JLabel jLId3;
    private javax.swing.JLabel jLId4;
    private javax.swing.JLabel jLId5;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JFormattedTextField jTFCodBarras;
    private javax.swing.JTextField jTFIdCidade;
    private javax.swing.JTextField jTFQtdEstoque;
    // End of variables declaration//GEN-END:variables
}