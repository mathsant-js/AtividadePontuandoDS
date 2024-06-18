
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Exerc1 extends javax.swing.JFrame {

    /**
     * Creates new form Exerc1
     */
    public Exerc1() {
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

        listSelects = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        subSelect = new javax.swing.JRadioButton();
        somaSelect = new javax.swing.JRadioButton();
        mulSelect = new javax.swing.JRadioButton();
        diviSelect = new javax.swing.JRadioButton();
        resSelect = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        resulText = new javax.swing.JTextField();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jLabel1.setText("N1");

        jLabel2.setText("N2");

        n1.setToolTipText("Digite o primeiro número");

        n2.setToolTipText("Digite o segundo número");

        calcular.setText("Calcular");
        calcular.setToolTipText("Calcula os números com a operação escolhida");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        listSelects.add(subSelect);
        subSelect.setText("Subtração (-)");
        subSelect.setToolTipText("Subtrai os numeros digitados");

        listSelects.add(somaSelect);
        somaSelect.setText("Soma (+)");
        somaSelect.setToolTipText("Soma os numeros digitados");

        listSelects.add(mulSelect);
        mulSelect.setText("Multiplicação (*)");
        mulSelect.setToolTipText("Multiplica os numeros digitados");

        listSelects.add(diviSelect);
        diviSelect.setText("Divisão (/)");
        diviSelect.setToolTipText("Divide os numeros digitados");

        listSelects.add(resSelect);
        resSelect.setText("Resto (%)");
        resSelect.setToolTipText("Calcula o resto dos numeros digitados");

        jLabel3.setText("Resultado");

        resulText.setToolTipText("Mostra o resultado do cálculo");
        resulText.setEnabled(false);

        limpar.setText("Limpar");
        limpar.setToolTipText("Limpa os campos digitados");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(resulText, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(resSelect)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(somaSelect)
                                                .addGap(38, 38, 38))
                                            .addComponent(mulSelect, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(subSelect)
                                                .addComponent(diviSelect))
                                            .addGap(18, 18, 18)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(limpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(somaSelect)
                            .addComponent(calcular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subSelect)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mulSelect)
                .addGap(11, 11, 11)
                .addComponent(diviSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resSelect)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(resulText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        if (n1.getText().toString() == "") {
            JOptionPane.showMessageDialog(null, "Digite a 1a. Nota", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        else if (n2.getText().toString() == "") {
            JOptionPane.showMessageDialog(null, "Digite a 2a. Nota", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        else if (listSelects.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Nenhum cálculo foi selecionado", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        else {
            double numero1 = Double.parseDouble(n1.getText());
            double numero2 = Double.parseDouble(n2.getText());
            double resultado;
                if (somaSelect.isSelected()) {
                    resultado = numero1 + numero2;
                    System.out.println(numero1);
                    System.out.println(numero2);
                    resulText.setText("" + resultado);
                }
                else if (subSelect.isSelected()) {
                    resultado = numero1 - numero2;
                    resulText.setText("" + resultado);
                }
                else if (mulSelect.isSelected()) {
                    resultado = numero1 * numero2;
                    resulText.setText("" + resultado);
                }
                else if (diviSelect.isSelected()) {
                    resultado = numero1 / numero2;
                    resulText.setText("" + resultado);
                }
                else if (resSelect.isSelected()) {
                    resultado = numero1 % numero2;
                    resulText.setText("" + resultado);
                }
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        n1.setText(null);
        n2.setText(null);
        resulText.setText(null);
        
        n1.requestFocus();
    }//GEN-LAST:event_limparActionPerformed

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
            java.util.logging.Logger.getLogger(Exerc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exerc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exerc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exerc1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exerc1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JRadioButton diviSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton limpar;
    private javax.swing.ButtonGroup listSelects;
    private javax.swing.JRadioButton mulSelect;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JRadioButton resSelect;
    private javax.swing.JTextField resulText;
    private javax.swing.JRadioButton somaSelect;
    private javax.swing.JRadioButton subSelect;
    // End of variables declaration//GEN-END:variables
}
