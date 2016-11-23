/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.interfaces;

import br.furb.enumerator.EnumData;
import br.furb.nucleo.MVM;
import br.furb.interfaces.NumberedBorder;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Bernardi
 */
public class CodeCompilerDialog extends javax.swing.JDialog {
    
    private String code;
    private MVM mvm;
    private boolean isRun;
    
    /**
     * Creates new form CodeCompilerDialog
     */
    public CodeCompilerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public CodeCompilerDialog() {
    }
    
    public CodeCompilerDialog(Object parent) {
        super((JFrame) parent, true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.codigoFonteJTA.setBorder(new NumberedBorder());
        this.startRelogio();
    }
    
    public void startRelogio() {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                horaJL.setText(sdf.format(new Date()));
            }
        };
        new Timer().scheduleAtFixedRate(task, 0, 1000);
        try {
            wait();
        }
        catch (Exception ex)
        {}
    }
    
    public void init(String code){ 
        try {
            this.code = code;
            this.codigoFonteJTA.setText(code);
            mvm = new MVM();
            mvm.traduzirCodigoFonte(this.code, 0);
            this.isRun = false;
            this.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao traduzir o código fonte: " + e.getMessage());
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
        java.awt.GridBagConstraints gridBagConstraints;

        fundoJP = new javax.swing.JPanel();
        ferramentaJTB = new javax.swing.JToolBar();
        stepJB = new javax.swing.JButton();
        runJB = new javax.swing.JButton();
        stopJB = new javax.swing.JButton();
        codigoFonteJSP = new javax.swing.JScrollPane();
        codigoFonteJTA = new javax.swing.JTextArea();
        relogioJP = new javax.swing.JPanel();
        horaJL = new javax.swing.JLabel();
        stackJP = new javax.swing.JPanel();
        stackJL = new javax.swing.JLabel();
        stackJSP = new javax.swing.JScrollPane();
        stackJTA = new javax.swing.JTextArea();
        consoleJP = new javax.swing.JPanel();
        consoleJSP = new javax.swing.JScrollPane();
        consoleJTA = new javax.swing.JTextArea();
        consoleJL = new javax.swing.JLabel();
        saidaJP = new javax.swing.JPanel();
        linhaJTF = new javax.swing.JTextField();
        saidaJL = new javax.swing.JLabel();
        registradorJP = new javax.swing.JPanel();
        registradorJSP = new javax.swing.JScrollPane();
        registradorJTA = new javax.swing.JTextArea();
        registradorJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fundoJP.setPreferredSize(new java.awt.Dimension(800, 600));
        fundoJP.setLayout(new java.awt.GridBagLayout());

        ferramentaJTB.setFloatable(false);
        ferramentaJTB.setRollover(true);
        ferramentaJTB.setPreferredSize(new java.awt.Dimension(100, 10));

        stepJB.setText("Step");
        stepJB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stepJB.setPreferredSize(new java.awt.Dimension(70, 35));
        stepJB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stepJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepJBActionPerformed(evt);
            }
        });
        ferramentaJTB.add(stepJB);

        runJB.setText("Run");
        runJB.setFocusable(false);
        runJB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        runJB.setPreferredSize(new java.awt.Dimension(70, 35));
        runJB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        runJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runJBActionPerformed(evt);
            }
        });
        ferramentaJTB.add(runJB);

        stopJB.setText("Stop/Reset");
        stopJB.setFocusable(false);
        stopJB.setPreferredSize(new java.awt.Dimension(70, 35));
        stopJB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stopJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopJBActionPerformed(evt);
            }
        });
        ferramentaJTB.add(stopJB);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        fundoJP.add(ferramentaJTB, gridBagConstraints);

        codigoFonteJTA.setEditable(false);
        codigoFonteJTA.setColumns(20);
        codigoFonteJTA.setRows(5);
        codigoFonteJTA.setPreferredSize(new java.awt.Dimension(164, 110));
        codigoFonteJSP.setViewportView(codigoFonteJTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        fundoJP.add(codigoFonteJSP, gridBagConstraints);

        relogioJP.setLayout(new java.awt.BorderLayout());

        horaJL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        horaJL.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        relogioJP.add(horaJL, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        fundoJP.add(relogioJP, gridBagConstraints);

        stackJP.setLayout(new java.awt.BorderLayout());

        stackJL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        stackJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stackJL.setText("Stack:");
        stackJP.add(stackJL, java.awt.BorderLayout.PAGE_START);

        stackJTA.setEditable(false);
        stackJTA.setColumns(20);
        stackJTA.setRows(5);
        stackJSP.setViewportView(stackJTA);

        stackJP.add(stackJSP, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        fundoJP.add(stackJP, gridBagConstraints);

        consoleJP.setLayout(new java.awt.BorderLayout());

        consoleJTA.setEditable(false);
        consoleJTA.setColumns(20);
        consoleJTA.setRows(5);
        consoleJSP.setViewportView(consoleJTA);

        consoleJP.add(consoleJSP, java.awt.BorderLayout.CENTER);

        consoleJL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        consoleJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consoleJL.setText("Console:");
        consoleJP.add(consoleJL, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.weightx = 1.0;
        fundoJP.add(consoleJP, gridBagConstraints);

        saidaJP.setLayout(new java.awt.BorderLayout());

        linhaJTF.setEditable(false);
        linhaJTF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        saidaJP.add(linhaJTF, java.awt.BorderLayout.CENTER);

        saidaJL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        saidaJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saidaJL.setText("Saída:");
        saidaJP.add(saidaJL, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.weightx = 1.0;
        fundoJP.add(saidaJP, gridBagConstraints);

        registradorJP.setLayout(new java.awt.BorderLayout());

        registradorJTA.setEditable(false);
        registradorJTA.setColumns(20);
        registradorJTA.setRows(5);
        registradorJSP.setViewportView(registradorJTA);

        registradorJP.add(registradorJSP, java.awt.BorderLayout.CENTER);

        registradorJL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registradorJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registradorJL.setText("Registers:");
        registradorJP.add(registradorJL, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 1.0;
        fundoJP.add(registradorJP, gridBagConstraints);

        getContentPane().add(fundoJP, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stepJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepJBActionPerformed
        try {
            if (isRun){
                this.init(code);
            }
            mvm.executaInstrucao();
            this.limparCampos();
            this.popularCampos();
            this.verificaTerminoPrograma();
            this.isRun = false;
        } catch (Exception ex) {
            Logger.getLogger(CodeCompilerDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stepJBActionPerformed

    private void runJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runJBActionPerformed
        try {
            this.init(code);
            mvm.decodificador();
            this.limparCampos();
            this.popularCampos();
            this.isRun = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha na execução do programa.\nErro: " + e.getMessage());
        }
    }//GEN-LAST:event_runJBActionPerformed

    private void stopJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopJBActionPerformed
        this.init(code);
        this.limparCampos();
    }//GEN-LAST:event_stopJBActionPerformed

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
            java.util.logging.Logger.getLogger(CodeCompilerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeCompilerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeCompilerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeCompilerDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CodeCompilerDialog dialog = new CodeCompilerDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane codigoFonteJSP;
    private javax.swing.JTextArea codigoFonteJTA;
    private javax.swing.JLabel consoleJL;
    private javax.swing.JPanel consoleJP;
    private javax.swing.JScrollPane consoleJSP;
    private javax.swing.JTextArea consoleJTA;
    private javax.swing.JToolBar ferramentaJTB;
    private javax.swing.JPanel fundoJP;
    private javax.swing.JLabel horaJL;
    private javax.swing.JTextField linhaJTF;
    private javax.swing.JLabel registradorJL;
    private javax.swing.JPanel registradorJP;
    private javax.swing.JScrollPane registradorJSP;
    private javax.swing.JTextArea registradorJTA;
    private javax.swing.JPanel relogioJP;
    private javax.swing.JButton runJB;
    private javax.swing.JLabel saidaJL;
    private javax.swing.JPanel saidaJP;
    private javax.swing.JLabel stackJL;
    private javax.swing.JPanel stackJP;
    private javax.swing.JScrollPane stackJSP;
    private javax.swing.JTextArea stackJTA;
    private javax.swing.JButton stepJB;
    private javax.swing.JButton stopJB;
    // End of variables declaration//GEN-END:variables

    private void popularCampos(){
        Map<EnumData, String> datas = this.mvm.getDatas();
        if (datas.get(EnumData.REGISTRADORES) != null){
            this.registradorJTA.append(datas.get(EnumData.REGISTRADORES) + "\n");
        }
        
        if (datas.get(EnumData.STACK) != null){
            this.stackJTA.append(datas.get(EnumData.STACK) + "\n");
        }
        
        if (datas.get(EnumData.OUT) != null){
            this.linhaJTF.setText(datas.get(EnumData.OUT));
        }
        
        if (datas.get(EnumData.TRACE_CODE) != null){
            this.consoleJTA.append(datas.get(EnumData.TRACE_CODE));
        }
    }
    
    private void verificaTerminoPrograma(){
        String console[] = this.consoleJTA.getText().toUpperCase().split("\n");
        for (String string : console) {
            if ("HALT".equals(string)){
                this.init(this.code);
                break;
            }
        }
    }
    
    private void limparCampos(){
        this.registradorJTA.setText("");
        this.stackJTA.setText("");
        this.linhaJTF.setText("");
        this.consoleJTA.setText("");
    }
}
