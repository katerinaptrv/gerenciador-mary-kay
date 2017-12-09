/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Actions.Passwords;
import Actions.Verificacao;
import Exceptions.EmailInvalido;
import JavaBeans.ConexaoBD;
import JavaBeans.Usuario;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Configuracoes extends javax.swing.JFrame {

    ConexaoBD conexao;
    Usuario usuario;
    Passwords pass;

    public Configuracoes() {
        initComponents();
        this.setLocationRelativeTo(null);
        incorreta.setVisible(false);
        combinam.setVisible(false);
        conexao = new ConexaoBD();
        usuario = new Usuario();
        pass = new Passwords();
        try {
            pegarDados();
        } catch (IOException ex) {
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (URISyntaxException ex) {
        } catch (Exception ex){   
        }

    }

    public void pegarDados() throws IOException, SQLException, ClassNotFoundException, URISyntaxException, Exception {
        usuario = conexao.getUsuario();
        tlogin.setText(usuario.getUser());
        temail.setText(usuario.getEmail());
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
        login = new javax.swing.JLabel();
        tlogin = new javax.swing.JTextField();
        senhaAntiga = new javax.swing.JLabel();
        senhaNova = new javax.swing.JLabel();
        tsenhaNova = new javax.swing.JPasswordField();
        confirmarSenha = new javax.swing.JLabel();
        tconfirmarSenha = new javax.swing.JPasswordField();
        tsenhaAntiga = new javax.swing.JPasswordField();
        email = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        incorreta = new javax.swing.JLabel();
        combinam = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar Configurações"));

        login.setText("Digite o novo login:");

        senhaAntiga.setText("Digite a senha antiga:");

        senhaNova.setText("Digite a nova senha:");

        confirmarSenha.setText("Confirme a senha:");

        tconfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tconfirmarSenhaKeyReleased(evt);
            }
        });

        tsenhaAntiga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsenhaAntigaKeyReleased(evt);
            }
        });

        email.setText("E-mail:");

        incorreta.setForeground(new java.awt.Color(255, 0, 0));
        incorreta.setText("Senha Incorreta");

        combinam.setForeground(new java.awt.Color(255, 0, 0));
        combinam.setText("Senhas diferentes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(senhaNova)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tsenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(email)
                        .addGap(18, 18, 18)
                        .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(senhaAntiga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tsenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(confirmarSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tconfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(incorreta)
                            .addComponent(combinam, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(tlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaAntiga)
                    .addComponent(tsenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incorreta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaNova)
                    .addComponent(tsenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tconfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarSenha)
                    .addComponent(combinam))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        salvar.setText("Salvar Alterações");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(salvar)
                .addGap(18, 18, 18)
                .addComponent(voltar)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(voltar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tconfirmarSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tconfirmarSenhaKeyReleased
        if (tsenhaNova.getText().equals(tconfirmarSenha.getText())) {
            combinam.setVisible(false);
        } else {
            combinam.setVisible(true);
        }
    }//GEN-LAST:event_tconfirmarSenhaKeyReleased

    private void tsenhaAntigaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsenhaAntigaKeyReleased
        try {
            if (pass.encripta(tsenhaAntiga.getText()).equals(usuario.getSenha())) {
                incorreta.setVisible(false);
            } else {
                incorreta.setVisible(true);
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Configuracoes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Configuracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tsenhaAntigaKeyReleased

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        try {
            Verificacao verificar = new Verificacao();
            verificar.verificarEmail(temail.getText());
            int res = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja alterar as configurações?", "AVISO!", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                if (tsenhaNova.getText().equals("")) {
                    if (pass.encripta(tsenhaAntiga.getText()).equals(usuario.getSenha())) {
                        usuario.setEmail(temail.getText());
                        conexao.setUsuario(usuario);
                        tsenhaAntiga.setText("");
                        tsenhaNova.setText("");
                        tconfirmarSenha.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Você deve preencher o campo Senha Antiga com a senha atual para editar os outros campos!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    if (pass.encripta(tsenhaAntiga.getText()).equals(usuario.getSenha()) && tsenhaNova.getText().equals(tconfirmarSenha.getText())) {
                        usuario.setUser(tlogin.getText());
                        usuario.setSenha(pass.encripta(tsenhaNova.getText()));
                        usuario.setEmail(temail.getText());
                        conexao.setUsuario(usuario);
                        tsenhaAntiga.setText("");
                        tsenhaNova.setText("");
                        tconfirmarSenha.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "Você deve corrigir os campos de senha!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (EmailInvalido ex) {
            JOptionPane.showMessageDialog(null, "Digite um e-mail válido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Configuracoes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Configuracoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel combinam;
    private javax.swing.JLabel confirmarSenha;
    private javax.swing.JLabel email;
    private javax.swing.JLabel incorreta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel senhaAntiga;
    private javax.swing.JLabel senhaNova;
    private javax.swing.JPasswordField tconfirmarSenha;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tlogin;
    private javax.swing.JPasswordField tsenhaAntiga;
    private javax.swing.JPasswordField tsenhaNova;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}