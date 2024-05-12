
package co.edu.unicolombo.pb.proaula.views;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alvar
 */
public final class MenuRestaurante extends javax.swing.JFrame {

    /**
     * Creates new form MenuRestaurante
     */
    VentanaPrincipal ventanaPrincipal;
    
    public MenuRestaurante() {
        initComponents();
         SetImageLabel(etiImagenPizza,"src/imagenes/pizza.jpeg");
         SetImageLabel(etiImangenBebidas,"src/imagenes/Limonada.jpg");
          SetImageLabel(etiFondo,"src/imagenes/menu2.jpg");
           
         
         
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiImagenPizza = new javax.swing.JLabel();
        etiImangenBebidas = new javax.swing.JLabel();
        etiProductoPizza = new javax.swing.JLabel();
        etiCantidadPizza = new javax.swing.JLabel();
        etiPrecioPizza = new javax.swing.JLabel();
        butonPizzaNapolitana = new javax.swing.JRadioButton();
        butonPizzaMargarita = new javax.swing.JRadioButton();
        butonPizzaCapricciosa = new javax.swing.JRadioButton();
        butonPizzaHawaiana = new javax.swing.JRadioButton();
        butonPizzaPepperoni = new javax.swing.JRadioButton();
        butonPizzaChampiñones = new javax.swing.JRadioButton();
        cantidadPizzaNapolitana = new javax.swing.JTextField();
        cantidadPizzaMargarita = new javax.swing.JTextField();
        cantidadPizzaCapricciosa = new javax.swing.JTextField();
        cantidadPizzaHawaiana = new javax.swing.JTextField();
        cantidadPizzaPepperoni = new javax.swing.JTextField();
        cantidadPizzaChampiñones = new javax.swing.JTextField();
        precioPizzaNapolitana = new javax.swing.JLabel();
        precioPizzaMargarita = new javax.swing.JLabel();
        precioPizzaCapricciosa = new javax.swing.JLabel();
        precioPizzaHawaiana = new javax.swing.JLabel();
        precioPizzaPepperoni = new javax.swing.JLabel();
        precioPizzaChampiñones = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        etiFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(etiImagenPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 210, 130));
        getContentPane().add(etiImangenBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 210, 140));

        etiProductoPizza.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiProductoPizza.setForeground(new java.awt.Color(255, 255, 255));
        etiProductoPizza.setText("Producto:");
        getContentPane().add(etiProductoPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 60, -1));

        etiCantidadPizza.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiCantidadPizza.setForeground(new java.awt.Color(255, 255, 255));
        etiCantidadPizza.setText("Cantidad:");
        getContentPane().add(etiCantidadPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 80, -1));

        etiPrecioPizza.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiPrecioPizza.setForeground(new java.awt.Color(255, 255, 255));
        etiPrecioPizza.setText("Precio:");
        getContentPane().add(etiPrecioPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        butonPizzaNapolitana.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPizzaNapolitana.setForeground(new java.awt.Color(255, 255, 255));
        butonPizzaNapolitana.setText("Pizza Napolitana");
        getContentPane().add(butonPizzaNapolitana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        butonPizzaMargarita.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPizzaMargarita.setForeground(new java.awt.Color(255, 255, 255));
        butonPizzaMargarita.setText("Pizza Margarita");
        getContentPane().add(butonPizzaMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        butonPizzaCapricciosa.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPizzaCapricciosa.setForeground(new java.awt.Color(255, 255, 255));
        butonPizzaCapricciosa.setText("Pizza Capricciosa");
        getContentPane().add(butonPizzaCapricciosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        butonPizzaHawaiana.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPizzaHawaiana.setForeground(new java.awt.Color(255, 255, 255));
        butonPizzaHawaiana.setText("Pizza Hawaiana");
        getContentPane().add(butonPizzaHawaiana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        butonPizzaPepperoni.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPizzaPepperoni.setForeground(new java.awt.Color(255, 255, 255));
        butonPizzaPepperoni.setText("Pizza de Pepperoni");
        getContentPane().add(butonPizzaPepperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        butonPizzaChampiñones.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPizzaChampiñones.setForeground(new java.awt.Color(255, 255, 255));
        butonPizzaChampiñones.setText("Pizza con champiñones");
        getContentPane().add(butonPizzaChampiñones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));
        getContentPane().add(cantidadPizzaNapolitana, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 40, -1));
        getContentPane().add(cantidadPizzaMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 40, -1));
        getContentPane().add(cantidadPizzaCapricciosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 40, -1));
        getContentPane().add(cantidadPizzaHawaiana, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 40, -1));
        getContentPane().add(cantidadPizzaPepperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 40, -1));
        getContentPane().add(cantidadPizzaChampiñones, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 40, -1));

        precioPizzaNapolitana.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPizzaNapolitana.setForeground(new java.awt.Color(255, 255, 255));
        precioPizzaNapolitana.setText("30000");
        getContentPane().add(precioPizzaNapolitana, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        precioPizzaMargarita.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPizzaMargarita.setForeground(new java.awt.Color(255, 255, 255));
        precioPizzaMargarita.setText("28000");
        getContentPane().add(precioPizzaMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        precioPizzaCapricciosa.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPizzaCapricciosa.setForeground(new java.awt.Color(255, 255, 255));
        precioPizzaCapricciosa.setText("35000");
        getContentPane().add(precioPizzaCapricciosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 40, 20));

        precioPizzaHawaiana.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPizzaHawaiana.setForeground(new java.awt.Color(255, 255, 255));
        precioPizzaHawaiana.setText("30000");
        getContentPane().add(precioPizzaHawaiana, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        precioPizzaPepperoni.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPizzaPepperoni.setForeground(new java.awt.Color(255, 255, 255));
        precioPizzaPepperoni.setText("25000");
        getContentPane().add(precioPizzaPepperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, -1, -1));

        precioPizzaChampiñones.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPizzaChampiñones.setForeground(new java.awt.Color(255, 255, 255));
        precioPizzaChampiñones.setText("29000");
        getContentPane().add(precioPizzaChampiñones, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));
<<<<<<< HEAD
=======
        getContentPane().add(etiFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1100, 720));
>>>>>>> 13bff20e4ba3f6f303326cd7fff705ccc70dec64

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Factura");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 660, -1, -1));

        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 660, -1, -1));
        getContentPane().add(etiFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1100, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void SetImageLabel(JLabel nombrelabel, String root){
        ImageIcon imagen = new ImageIcon(root); 
        Icon icon = new ImageIcon(
                imagen.getImage().getScaledInstance(nombrelabel.getWidth(), nombrelabel.getHeight(), Image.SCALE_DEFAULT));
        nombrelabel.setIcon(icon);
        this.repaint();
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
            java.util.logging.Logger.getLogger(MenuRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton butonPizzaCapricciosa;
    private javax.swing.JRadioButton butonPizzaChampiñones;
    private javax.swing.JRadioButton butonPizzaHawaiana;
    private javax.swing.JRadioButton butonPizzaMargarita;
    private javax.swing.JRadioButton butonPizzaNapolitana;
    private javax.swing.JRadioButton butonPizzaPepperoni;
    private javax.swing.JTextField cantidadPizzaCapricciosa;
    private javax.swing.JTextField cantidadPizzaChampiñones;
    private javax.swing.JTextField cantidadPizzaHawaiana;
    private javax.swing.JTextField cantidadPizzaMargarita;
    private javax.swing.JTextField cantidadPizzaNapolitana;
    private javax.swing.JTextField cantidadPizzaPepperoni;
    private javax.swing.JLabel etiCantidadPizza;
    private javax.swing.JLabel etiFondo;
    private javax.swing.JLabel etiImagenPizza;
    private javax.swing.JLabel etiImangenBebidas;
    private javax.swing.JLabel etiPrecioPizza;
    private javax.swing.JLabel etiProductoPizza;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel precioPizzaCapricciosa;
    private javax.swing.JLabel precioPizzaChampiñones;
    private javax.swing.JLabel precioPizzaHawaiana;
    private javax.swing.JLabel precioPizzaMargarita;
    private javax.swing.JLabel precioPizzaNapolitana;
    private javax.swing.JLabel precioPizzaPepperoni;
    // End of variables declaration//GEN-END:variables


    
}
