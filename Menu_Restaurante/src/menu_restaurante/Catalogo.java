/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu_restaurante;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author danielbisaggio
 */
public class Catalogo extends javax.swing.JFrame implements java.awt.event.ActionListener {

    public static Double cbbPrato1Total = 0d;
    public static Double cbbPrato2Total = 0d;
    public static Double cbbPrato3Total = 0d;
    public static Double cbbPrato4Total = 0d;
   
    public Catalogo() {
        initComponents();
    }

    //armazena o input do usuário quando é realizado a troca de telas
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "cbb_prato1") {
            Catalogo.cbbPrato1Total = Double.parseDouble(cbb_prato1.getSelectedItem().toString()) * 20d;
        }
        else if (e.getActionCommand() == "cbb_prato2") {
            Catalogo.cbbPrato2Total = Double.parseDouble(cbb_prato2.getSelectedItem().toString()) * 17d;
        }
        else if (e.getActionCommand() == "cbb_prato3") {
            Catalogo.cbbPrato3Total = Double.parseDouble(cbb_prato3.getSelectedItem().toString()) * 37d;
        }
        else if (e.getActionCommand() == "cbb_prato4") {
            Catalogo.cbbPrato4Total = Double.parseDouble(cbb_prato4.getSelectedItem().toString()) * 15d;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbb_prato1 = new javax.swing.JComboBox<>();
        cbb_prato2 = new javax.swing.JComboBox<>();
        cbb_prato3 = new javax.swing.JComboBox<>();
        cbb_prato4 = new javax.swing.JComboBox<>();
        btn_sobremesa = new javax.swing.JButton();
        btn_bebidas = new javax.swing.JButton();
        btn_principal = new javax.swing.JButton();
        btn_carrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><h2>Menu</h2></html>");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_restaurante/images/hamburguer-saboroso-isolado-no-fundo-branco-fastfood-de-hamburguer-fresco-com-carne-e-queijo.jpg")).getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_DEFAULT))); // NOI18N

        jLabel6.setText("Prato 1 = R$ 20,00");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_restaurante/images/hamburguer-saboroso-isolado-no-fundo-branco-fastfood-de-hamburguer-fresco-com-carne-e-queijo.jpg")).getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_DEFAULT))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_restaurante/images/hamburguer-saboroso-isolado-no-fundo-branco-fastfood-de-hamburguer-fresco-com-carne-e-queijo.jpg")).getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_DEFAULT))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_restaurante/images/hamburguer-saboroso-isolado-no-fundo-branco-fastfood-de-hamburguer-fresco-com-carne-e-queijo.jpg")).getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_DEFAULT))); // NOI18N

        jLabel7.setText("Prato 2 = R$ 17,00");

        jLabel8.setText("Prato 3 = R$ 37,00");

        jLabel9.setText("Prato 4 = R$ 15,00");

        cbb_prato1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        int prato1Qtd = (int)(Catalogo.cbbPrato1Total / 20d);
        cbb_prato1.setSelectedIndex(prato1Qtd);
        cbb_prato1.addActionListener(this);
        cbb_prato1.setActionCommand("cbb_prato1");

        cbb_prato2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        int prato2Qtd = (int)(Catalogo.cbbPrato2Total / 17d);
        cbb_prato2.setSelectedIndex(prato2Qtd);
        cbb_prato2.addActionListener(this);
        cbb_prato2.setActionCommand("cbb_prato2");

        cbb_prato3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        int prato3Qtd = (int)(Catalogo.cbbPrato3Total / 37d);
        cbb_prato3.setSelectedIndex(prato3Qtd);
        cbb_prato3.addActionListener(this);
        cbb_prato3.setActionCommand("cbb_prato3");

        cbb_prato4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        int prato4Qtd = (int)(Catalogo.cbbPrato4Total / 15d);
        cbb_prato4.setSelectedIndex(prato4Qtd);
        cbb_prato4.addActionListener(this);
        cbb_prato4.setActionCommand("cbb_prato4");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(cbb_prato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(cbb_prato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_prato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbb_prato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_prato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_prato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_prato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_prato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(355, Short.MAX_VALUE))
        );

        btn_sobremesa.setText("Sobremesas");
        btn_sobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sobremesaActionPerformed(evt);
            }
        });

        btn_bebidas.setText("Bebidas");
        btn_bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bebidasActionPerformed(evt);
            }
        });

        btn_principal.setText("Pratos Principais");
        btn_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principalActionPerformed(evt);
            }
        });

        btn_carrinho.setText("Carrinho");
        btn_carrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_carrinho)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btn_principal)
                .addGap(12, 12, 12)
                .addComponent(btn_sobremesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bebidas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_carrinho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sobremesa)
                    .addComponent(btn_bebidas)
                    .addComponent(btn_principal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sobremesaActionPerformed
        
        Sobremesa novaTela = new Sobremesa();
        novaTela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_sobremesaActionPerformed

    private void btn_bebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bebidasActionPerformed
        
        Bebidas novaTela = new Bebidas();
        novaTela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_bebidasActionPerformed

    private void btn_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principalActionPerformed
        
        Catalogo novaTela = new Catalogo();
        novaTela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_principalActionPerformed

    private void btn_carrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinhoActionPerformed
        
        Carrinho novaTela = new Carrinho();
        novaTela.setVisible(true);
        // armazenaValor();
        Carrinho.lbl_selecao.setText("Olá " + Login.usuarioLogado.getName());
        setVisible(false);
    }//GEN-LAST:event_btn_carrinhoActionPerformed

    public void armazenaValor() {
        
        //converte o valor do comboBox para int selecionado pelo user
        int prato1 = Integer.parseInt(cbb_prato1.getSelectedItem().toString());
        int prato2 = Integer.parseInt(cbb_prato2.getSelectedItem().toString());
        int prato3 = Integer.parseInt(cbb_prato3.getSelectedItem().toString());
        int prato4 = Integer.parseInt(cbb_prato4.getSelectedItem().toString());
        
        //armazena o resultado nas variáveis valores
        double valor1 = prato1 * 20f;
        double valor2 = prato2 * 17f;
        double valor3 = prato3 * 37f;
        double valor4 = prato4 * 15f;

        //acrescenta no carrinho
        if (prato1 >= 0 && prato1 <= 8) {
            Carrinho.total += valor1;
        }

        if (prato2 >= 0 && prato2 <= 8) {
            Carrinho.total += valor2;
        }

        if (prato3 >= 0 && prato3 <= 8) {
            Carrinho.total += valor3;
        }

        if (prato4 >= 0 && prato4 <= 8) {
            Carrinho.total += valor4;
        }

        //printa o valor total no carrinho
        Carrinho.lbl_total.setText("Total: R$ " + String.valueOf(Carrinho.total));
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
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bebidas;
    private javax.swing.JButton btn_carrinho;
    private javax.swing.JButton btn_principal;
    private javax.swing.JButton btn_sobremesa;
    private javax.swing.JComboBox<String> cbb_prato1;
    private javax.swing.JComboBox<String> cbb_prato2;
    private javax.swing.JComboBox<String> cbb_prato3;
    private javax.swing.JComboBox<String> cbb_prato4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
