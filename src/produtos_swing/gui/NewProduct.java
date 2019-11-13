/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos_swing.gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import produtos_swing.dao.ProdutoDAO;
import produtos_swing.model.*;
        
/**
 *
 * @author patrick
 */
public class NewProduct extends javax.swing.JFrame {
    
    private int editProductId = Integer.MIN_VALUE;
    private boolean editMode = false;

    /**
     * Creates new form NewProduct
     */
    public NewProduct() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        verifyEditMode();
    }

    public int getEditProductId() {
        return editProductId;
    }

    public void setEditProductId(int editProductId) {
        this.editProductId = editProductId;
        verifyEditMode();
    }   
    
    private void verifyEditMode() {
        editMode = editProductId >= 0;
        if(editMode) {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            try {
                Produto produto = produtoDAO.buscarPorCodigo(editProductId);
                nomeFd.setText(produto.getNome());
                preçoFd.setText(String.valueOf(produto.getPreco()));
                fabricanteFd.setText(produto.getEspecificacao().getSistema());
                corFd.setText(produto.getEspecificacao().getCor());
                sistemaFd.setText(produto.getEspecificacao().getSistema());
                detalhesFd.setText(produto.getEspecificacao().getDetalhes());                
            } catch (SQLException ex) {
                Logger.getLogger(NewProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeFd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        preçoFd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fabricanteFd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        corFd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sistemaFd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        detalhesFd = new javax.swing.JTextField();
        salvarBtn = new javax.swing.JButton();
        cancelarBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Novo Produto");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nome");

        nomeFd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Preco");

        preçoFd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Fabricante");

        fabricanteFd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Cor");

        corFd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Sistema");

        sistemaFd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Detalhes");

        detalhesFd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        detalhesFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalhesFdActionPerformed(evt);
            }
        });

        salvarBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        salvarBtn.setText("Salvar");
        salvarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salvarBtnMousePressed(evt);
            }
        });

        cancelarBtn1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cancelarBtn1.setText("Cancelar");
        cancelarBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarBtn1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(188, 188, 188))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(detalhesFd, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(sistemaFd, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(corFd, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(fabricanteFd, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(preçoFd, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nomeFd, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preçoFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fabricanteFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sistemaFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detalhesFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtn1MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelarBtn1MousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void detalhesFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalhesFdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detalhesFdActionPerformed

    private void salvarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarBtnMousePressed
        // TODO add your handling code here:
        String nome = nomeFd.getText();
        Float preco = Float.parseFloat(preçoFd.getText());
        String fabricante = fabricanteFd.getText();
        String cor = corFd.getText();
        String sistema = sistemaFd.getText();
        String detalhes = detalhesFd.getText();
        
        Especificacao esp = new Especificacao(0, fabricante, cor, sistema, detalhes);
        Produto prod = new Produto(editProductId, nome, preco, esp);
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            if(editMode) {
                int espId = produtoDAO.buscarPorCodigo(editProductId).getEspecificacao().getCodigo();
                prod.getEspecificacao().setCodigo(espId);
                produtoDAO.editar(prod);
                
            } else {
                produtoDAO.inserir(prod);   
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_salvarBtnMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalAccessException {
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
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn1;
    private javax.swing.JTextField corFd;
    private javax.swing.JTextField detalhesFd;
    private javax.swing.JTextField fabricanteFd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomeFd;
    private javax.swing.JTextField preçoFd;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JTextField sistemaFd;
    // End of variables declaration//GEN-END:variables
}
