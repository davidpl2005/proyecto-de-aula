/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(etiImagen, "src/imagenes/comida italiana.jpg");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenida = new javax.swing.JLabel();
        etiNombre = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        documentoText = new javax.swing.JTextField();
        etiDocumento = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        etiMensaje2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textMensaje = new javax.swing.JTextArea();
        etiImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bienvenida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        bienvenida.setText("Registro del cliente");
        bienvenida.setAlignmentX(0.5F);
        getContentPane().add(bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        etiNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etiNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiNombre.setText("Nombre completo:");
        getContentPane().add(etiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 107, 24));
        getContentPane().add(nombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 218, 31));
        getContentPane().add(documentoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 218, 31));

        etiDocumento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etiDocumento.setForeground(new java.awt.Color(255, 255, 255));
        etiDocumento.setText("Número documento:");
        getContentPane().add(etiDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 126, 24));

        btnSiguiente.setBackground(new java.awt.Color(153, 255, 153));
        btnSiguiente.setText("Siguiente");
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        etiMensaje2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etiMensaje2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(etiMensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 198, 25));

        textMensaje.setEditable(false);
        textMensaje.setColumns(20);
        textMensaje.setRows(5);
        textMensaje.setBorder(null);
        jScrollPane1.setViewportView(textMensaje);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 326, 92));
        getContentPane().add(etiImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = nombreText.getText();
        String documento = documentoText.getText();
        if(!validarCaracteres(nombre) || nombre.charAt(0)==' ' || nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"Nombre invalido.");
            return;
        }
        
        if(!validarNumeros(documento) || documento.isEmpty()){
            JOptionPane.showMessageDialog(null, "Número de documento invalido.");
            return;
        }
        
        textMensaje.setText("Sr(a) "+nombre+"\nEstamos muy felices de atenderlo(a) el día de hoy.\n" +"\nNumero de identificación del cliente: "+documento);
        etiMensaje2.setText("Registro realizado con exito");
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    public void SetImageLabel(JLabel nombrelabel, String root){
        ImageIcon imagen = new ImageIcon(root); 
        Icon icon = new ImageIcon(
                imagen.getImage().getScaledInstance(nombrelabel.getWidth(), nombrelabel.getHeight(), Image.SCALE_DEFAULT));
        nombrelabel.setIcon(icon);
        this.repaint();
    }
    public static boolean validarCaracteres(String datos){
        return datos.matches("[a-z A-Z]*");
    }
    public static boolean validarNumeros(String datos){
        return datos.matches("[0-9]*");
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JTextField documentoText;
    private javax.swing.JLabel etiDocumento;
    private javax.swing.JLabel etiImagen;
    private javax.swing.JLabel etiMensaje2;
    private javax.swing.JLabel etiNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextArea textMensaje;
    // End of variables declaration//GEN-END:variables
}
