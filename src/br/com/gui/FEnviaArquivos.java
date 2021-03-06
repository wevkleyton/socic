/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.constantes.ConstantesUsers;
import br.com.constantes.TodasAsLojas;

/**
 * 
 * @author tisocic
 */
public class FEnviaArquivos extends javax.swing.JFrame {

	/**
	 * Creates new form FEnviaArquivos
	 */
	public FEnviaArquivos() {
		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEnviaArquivos = new javax.swing.JPanel();
        jLabelLoja = new javax.swing.JLabel();
        jComboBoxLojas = new javax.swing.JComboBox();
        jLabelPathOrigem = new javax.swing.JLabel();
        jLabelPathDestino = new javax.swing.JLabel();
        jLabelArquivo = new javax.swing.JLabel();
        jTextFieldPathOrigem = new javax.swing.JTextField();
        jTextFieldPathDestino = new javax.swing.JTextField();
        jTextFieldNomeArquivos = new javax.swing.JTextField();
        jButtonTrazerArquivos = new javax.swing.JButton();
        jButtonEnviarArquivo = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelLoja.setText("Loja:");

        jComboBoxLojas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TESTE", "TODAS", "IGM", "NRE", "SDN", "VMR", "JAC", "SLL", "ABA", "RED", "COA", "TCM", "TAL", "MJU", "STI", "BNV", "RBC", "BCN", "VDE", "BGC", "AMT", "SAT", "PAP", "PAG", "TUB", "MAR", "ARG", "GUR", "PTO", "CUP", "EDC", "PNA", "SFX", "VIR", "CDC", "ITU", "CAP", "TMC", "RMO", "CPO", "PAF", "ANN", "SDA", "RBV", "PAM", "WAD", "MIT", "BAO", "XIG", "XAB", "FOA", "TOC", "SAA" }));

        jLabelPathOrigem.setText("Path Origem :");

        jLabelPathDestino.setText("Path Destino :");

        jLabelArquivo.setText("Arquivo:");

        jButtonTrazerArquivos.setMnemonic('t');
        jButtonTrazerArquivos.setText("Trazer Arquivos");
        jButtonTrazerArquivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonTrazerArquivosActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonEnviarArquivo.setMnemonic('e');
        jButtonEnviarArquivo.setText("Enviar Arquivos");
        jButtonEnviarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonEnviarArquivoActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEnviaArquivosLayout = new javax.swing.GroupLayout(jPanelEnviaArquivos);
        jPanelEnviaArquivos.setLayout(jPanelEnviaArquivosLayout);
        jPanelEnviaArquivosLayout.setHorizontalGroup(
            jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnviaArquivosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnviaArquivosLayout.createSequentialGroup()
                        .addComponent(jButtonTrazerArquivos)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEnviarArquivo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar))
                    .addGroup(jPanelEnviaArquivosLayout.createSequentialGroup()
                        .addComponent(jLabelLoja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxLojas, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnviaArquivosLayout.createSequentialGroup()
                        .addGroup(jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPathOrigem)
                            .addComponent(jLabelPathDestino)
                            .addComponent(jLabelArquivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPathOrigem)
                            .addComponent(jTextFieldPathDestino)
                            .addComponent(jTextFieldNomeArquivos))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEnviaArquivosLayout.setVerticalGroup(
            jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnviaArquivosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLoja)
                    .addComponent(jComboBoxLojas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPathOrigem)
                    .addComponent(jTextFieldPathOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPathDestino)
                    .addComponent(jTextFieldPathDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnviaArquivosLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabelArquivo))
                    .addGroup(jPanelEnviaArquivosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeArquivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEnviaArquivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTrazerArquivos)
                    .addComponent(jButtonEnviarArquivo)
                    .addComponent(jButtonFechar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEnviaArquivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEnviaArquivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTrazerArquivosActionPerformed(java.awt.event.ActionEvent evt) throws IOException, InterruptedException {//GEN-FIRST:event_jButtonTrazerArquivosActionPerformed
        // TODO add your handling code here:
    	String Todas = "TODAS";
		StringBuilder stringBuilder = new StringBuilder();
		ConstantesUsers contantes = new ConstantesUsers();

		if (jTextFieldPathOrigem.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Você Tem Que Informar o Caminho de Origem!");
			jTextFieldPathOrigem.requestFocus();
			return;
		}
		if (jTextFieldPathDestino.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Você Tem Que Informar o Caminho de Destino!");
			jTextFieldPathDestino.requestFocus();
			return;
		}
		if (jTextFieldNomeArquivos.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Você Tem Que Informar o Nome do Arquivo!");
			jTextFieldNomeArquivos.requestFocus();
			return;
		}

		if (jComboBoxLojas.getSelectedItem().toString() == Todas) {
			TodasAsLojas todas = new TodasAsLojas();
			ArrayList<String> lojas = todas.ListaLojas();
			for (int i = 0; i < lojas.size(); i++) {

				stringBuilder.append("scp -r ")
						.append(contantes.getUser()).append("@")
						.append(lojas.get(i))
						.append(":").append(jTextFieldPathOrigem.getText())
						.append(jTextFieldNomeArquivos.getText()).append(" ")
						.append(jTextFieldPathDestino.getText())
						.append(jTextFieldNomeArquivos.getText());
						
				System.out.println("Executando Comando" + stringBuilder + "\n Aguarde ...!");
				Process process = Runtime.getRuntime().exec(stringBuilder.toString());
				process.waitFor();
				stringBuilder = new StringBuilder();
			}
		} else {
			stringBuilder.append("scp -r ")
					.append(contantes.getUser()).append("@")
					.append(jComboBoxLojas.getSelectedItem().toString())
					.append(":").append(jTextFieldPathOrigem.getText())
					.append(jTextFieldNomeArquivos.getText()).append(" ")
					.append(jTextFieldPathDestino.getText())		
					.append(jTextFieldNomeArquivos.getText());
					
			System.out.println("Executando Comando" + stringBuilder + "\n Aguarde ...!");
			Process process = Runtime.getRuntime().exec(stringBuilder.toString());
			process.waitFor();
		}
    }//GEN-LAST:event_jButtonTrazerArquivosActionPerformed

	private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonFecharActionPerformed
		// TODO add your handling code here:
		setVisible(false);
	}// GEN-LAST:event_jButtonFecharActionPerformed

	private void jButtonEnviarArquivoActionPerformed(
			java.awt.event.ActionEvent evt) throws IOException, InterruptedException {// GEN-FIRST:event_jButtonEnviarArquivoActionPerformed
		String Todas = "TODAS";
		StringBuilder stringBuilder = new StringBuilder();
		ConstantesUsers contantes = new ConstantesUsers();
		

		if (jTextFieldPathOrigem.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Você Tem Que Informar o Caminho de Origem!");
			jTextFieldPathOrigem.requestFocus();
			return;
		}
		if (jTextFieldPathDestino.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Você Tem Que Informar o Caminho de Destino!");
			jTextFieldPathDestino.requestFocus();
			return;
		}
		if (jTextFieldNomeArquivos.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"Você Tem Que Informar o Nome do Arquivo!");
			jTextFieldNomeArquivos.requestFocus();
			return;
		}

		if (jComboBoxLojas.getSelectedItem().toString() == Todas) {
			TodasAsLojas todas = new TodasAsLojas();
			ArrayList<String> lojas = todas.ListaLojas();
			for (int i = 0; i < lojas.size(); i++) {

				stringBuilder.append("scp -r ")
						.append(jTextFieldPathOrigem.getText())
						.append(jTextFieldNomeArquivos.getText()).append(" ")
						.append(contantes.getUser()).append("@")
						.append(lojas.get(i))
						.append(":").append(jTextFieldPathDestino.getText())
						.append(jTextFieldNomeArquivos.getText());
				System.out.println("Executando o comando " + stringBuilder + "\n Aguarde ...!");
				Process process = Runtime.getRuntime().exec(stringBuilder.toString());
				process.waitFor();
				stringBuilder = new StringBuilder();
			}
		} else {
			stringBuilder.append("scp -r ")
					.append(jTextFieldPathOrigem.getText())
					.append(jTextFieldNomeArquivos.getText()).append(" ")
					.append(contantes.getUser()).append("@")
					.append(jComboBoxLojas.getSelectedItem().toString())
					.append(":").append(jTextFieldPathDestino.getText())
					.append(jTextFieldNomeArquivos.getText());
			System.out.println("Executando Comando" + stringBuilder + "\n Aguarde ...!");
			Process process = Runtime.getRuntime().exec(stringBuilder.toString());
			process.waitFor();
		}

	}// GEN-LAST:event_jButtonEnviarArquivoActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FEnviaArquivos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FEnviaArquivos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FEnviaArquivos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FEnviaArquivos.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FEnviaArquivos().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviarArquivo;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonTrazerArquivos;
    private javax.swing.JComboBox jComboBoxLojas;
    private javax.swing.JLabel jLabelArquivo;
    private javax.swing.JLabel jLabelLoja;
    private javax.swing.JLabel jLabelPathDestino;
    private javax.swing.JLabel jLabelPathOrigem;
    private javax.swing.JPanel jPanelEnviaArquivos;
    private javax.swing.JTextField jTextFieldNomeArquivos;
    private javax.swing.JTextField jTextFieldPathDestino;
    private javax.swing.JTextField jTextFieldPathOrigem;
    // End of variables declaration//GEN-END:variables
}
