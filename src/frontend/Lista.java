/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.Pedido;
import java.util.ArrayList;

/**
 *
 * @author robo
 */
public class Lista extends javax.swing.JFrame {
    
    //Instanciando as arrays
    ArrayList<Pedido> lista;

    /**
     * Creates new form Lista
     */
    
    // Construtores que serão utilizados por outras classes (Interfaces)
    public Lista() {
        initComponents();
    }
    
    public Lista(ArrayList<Pedido> lista){
        this.lista = lista;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtListaT = new javax.swing.JTextArea();
        bttMostrar = new javax.swing.JButton();
        bttVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de pedidos");

        txtListaT.setEditable(false);
        txtListaT.setColumns(20);
        txtListaT.setRows(5);
        jScrollPane1.setViewportView(txtListaT);

        bttMostrar.setText("Mostrar");
        bttMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttMostrarActionPerformed(evt);
            }
        });

        bttVoltar.setText("Voltar");
        bttVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(bttMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(bttVoltar)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttMostrar)
                    .addComponent(bttVoltar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttMostrarActionPerformed
        //Caso o usuario clique no mostrar
        //Será setado na txt box todos os pedidos já cadastrados
        String msg = "";
        
        // Looping para concatenar todos os pedidos da lista de Pedidos em uma unica variavel
        for(Pedido p : this.lista){
            msg += p;
        }
        
        //Setando a txt box com esta variavel
        txtListaT.setText(msg);
        
    }//GEN-LAST:event_bttMostrarActionPerformed

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        //Caso o usuario clique no voltar
        //Mudando de uma interface gráfica para a outra (Lista -> Controle), passando uma listas
        new Controle(this.lista).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttMostrar;
    private javax.swing.JButton bttVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtListaT;
    // End of variables declaration//GEN-END:variables
}
