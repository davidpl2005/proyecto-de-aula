
package co.edu.unicolombo.pb.proaula.views;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
         SetImageLabel(etiImagenPastas,"src/imagenes/pastas2.jpg");
         SetImageLabel(etiImagenBebidas,"src/imagenes/bebidas.jpg");
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
        etiProductoPizza = new javax.swing.JLabel();
        etiPrecioPizza = new javax.swing.JLabel();
        etiCantidadPizza = new javax.swing.JLabel();
        butonPizzaNapolitana = new javax.swing.JRadioButton();
        butonPizzaMargarita = new javax.swing.JRadioButton();
        butonPizzaCapricciosa = new javax.swing.JRadioButton();
        butonPizzaHawaiana = new javax.swing.JRadioButton();
        butonPizzaPepperoni = new javax.swing.JRadioButton();
        butonPizzaChampiñones = new javax.swing.JRadioButton();
        precioPizzaNapolitana = new javax.swing.JLabel();
        precioPizzaMargarita = new javax.swing.JLabel();
        precioPizzaCapricciosa = new javax.swing.JLabel();
        precioPizzaHawaiana = new javax.swing.JLabel();
        precioPizzaPepperoni = new javax.swing.JLabel();
        precioPizzaChampiñones = new javax.swing.JLabel();
<<<<<<< HEAD
        cantidadPizzaNapolitana = new javax.swing.JTextField();
        cantidadPizzaMargarita = new javax.swing.JTextField();
        cantidadPizzaCapricciosa = new javax.swing.JTextField();
        cantidadPizzaHawaiana = new javax.swing.JTextField();
        cantidadPizzaPepperoni = new javax.swing.JTextField();
        cantidadPizzaChampiñones = new javax.swing.JTextField();
        etiImagenPastas = new javax.swing.JLabel();
        etiProductoPasta = new javax.swing.JLabel();
        etiPrecioPasta = new javax.swing.JLabel();
        etiCantidadPasta = new javax.swing.JLabel();
        butonPastaMarinera = new javax.swing.JRadioButton();
        butonPastaPesto = new javax.swing.JRadioButton();
        butonPastaAlfredo = new javax.swing.JRadioButton();
        butonPastaCarbonara = new javax.swing.JRadioButton();
        butonPastaBolognesa = new javax.swing.JRadioButton();
        butonPastaCamarones = new javax.swing.JRadioButton();
        precioPastaMarinera = new javax.swing.JLabel();
        precioPastaPesto = new javax.swing.JLabel();
        precioPastaAlfredo = new javax.swing.JLabel();
        precioPastaCarbonara = new javax.swing.JLabel();
        precioPastaBolognesa = new javax.swing.JLabel();
        precioPastaCamarones = new javax.swing.JLabel();
        cantidadPastaMarinera = new javax.swing.JTextField();
        cantidadPastaPesto = new javax.swing.JTextField();
        cantidadPastaAlfredo = new javax.swing.JTextField();
        cantidadPastaCarbonara = new javax.swing.JTextField();
        cantidadPastaBolognesa = new javax.swing.JTextField();
        cantidadPastaCamarones = new javax.swing.JTextField();
        etiImagenBebidas = new javax.swing.JLabel();
        etiProductoBebida = new javax.swing.JLabel();
        etiPrecioBebida = new javax.swing.JLabel();
        etiCantidadBebida = new javax.swing.JLabel();
        butonAgua = new javax.swing.JRadioButton();
        butonCoca = new javax.swing.JRadioButton();
        butonMargarita = new javax.swing.JRadioButton();
        butonLimonada = new javax.swing.JRadioButton();
        butonVino = new javax.swing.JRadioButton();
        butonAguaMineral = new javax.swing.JRadioButton();
        precioAgua = new javax.swing.JLabel();
        precioCoca = new javax.swing.JLabel();
        precioMargarita = new javax.swing.JLabel();
        precioLimonada = new javax.swing.JLabel();
        precioVino = new javax.swing.JLabel();
        precioAguaMineral = new javax.swing.JLabel();
        cantidadAgua = new javax.swing.JTextField();
        cantidadCoca = new javax.swing.JTextField();
        cantidadMargarita = new javax.swing.JTextField();
        cantidadLimonada = new javax.swing.JTextField();
        cantidadVino = new javax.swing.JTextField();
        cantidadAguaMineral = new javax.swing.JTextField();
        botonFactura = new javax.swing.JButton();
=======
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
>>>>>>> 77992510917e9fcec59deeb4d73f013300feb1f6
        etiFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(etiImagenPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 210, 130));

        etiProductoPizza.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiProductoPizza.setForeground(new java.awt.Color(255, 255, 255));
        etiProductoPizza.setText("Producto:");
        getContentPane().add(etiProductoPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 60, -1));

        etiPrecioPizza.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiPrecioPizza.setForeground(new java.awt.Color(255, 255, 255));
        etiPrecioPizza.setText("Precio:");
        getContentPane().add(etiPrecioPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        etiCantidadPizza.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiCantidadPizza.setForeground(new java.awt.Color(255, 255, 255));
        etiCantidadPizza.setText("Cantidad:");
        getContentPane().add(etiCantidadPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 80, -1));

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
        getContentPane().add(cantidadPizzaNapolitana, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 40, -1));
        getContentPane().add(cantidadPizzaMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 40, -1));
        getContentPane().add(cantidadPizzaCapricciosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 40, -1));
        getContentPane().add(cantidadPizzaHawaiana, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 40, -1));
        getContentPane().add(cantidadPizzaPepperoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 40, -1));
        getContentPane().add(cantidadPizzaChampiñones, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 40, -1));
        getContentPane().add(etiImagenPastas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 210, 130));

        etiProductoPasta.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiProductoPasta.setForeground(new java.awt.Color(255, 255, 255));
        etiProductoPasta.setText("Producto:");
        getContentPane().add(etiProductoPasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 60, -1));

        etiPrecioPasta.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiPrecioPasta.setForeground(new java.awt.Color(255, 255, 255));
        etiPrecioPasta.setText("Precio:");
        getContentPane().add(etiPrecioPasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        etiCantidadPasta.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiCantidadPasta.setForeground(new java.awt.Color(255, 255, 255));
        etiCantidadPasta.setText("Cantidad:");
        getContentPane().add(etiCantidadPasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        butonPastaMarinera.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPastaMarinera.setForeground(new java.awt.Color(255, 255, 255));
        butonPastaMarinera.setText("Pasta Marinera");
        getContentPane().add(butonPastaMarinera, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        butonPastaPesto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPastaPesto.setForeground(new java.awt.Color(255, 255, 255));
        butonPastaPesto.setText("Pasta al Pesto");
        getContentPane().add(butonPastaPesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, -1, -1));

        butonPastaAlfredo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPastaAlfredo.setForeground(new java.awt.Color(255, 255, 255));
        butonPastaAlfredo.setText("Pasta Alfredo");
        getContentPane().add(butonPastaAlfredo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        butonPastaCarbonara.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPastaCarbonara.setForeground(new java.awt.Color(255, 255, 255));
        butonPastaCarbonara.setText("Pasta Carbonara");
        getContentPane().add(butonPastaCarbonara, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        butonPastaBolognesa.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPastaBolognesa.setForeground(new java.awt.Color(255, 255, 255));
        butonPastaBolognesa.setText("Pasta a la Bolognesa");
        getContentPane().add(butonPastaBolognesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));

        butonPastaCamarones.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonPastaCamarones.setForeground(new java.awt.Color(255, 255, 255));
        butonPastaCamarones.setText("Pasta con Camarones");
        getContentPane().add(butonPastaCamarones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, -1, -1));

        precioPastaMarinera.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPastaMarinera.setForeground(new java.awt.Color(255, 255, 255));
        precioPastaMarinera.setText("25000");
        getContentPane().add(precioPastaMarinera, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        precioPastaPesto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPastaPesto.setForeground(new java.awt.Color(255, 255, 255));
        precioPastaPesto.setText("28000");
        getContentPane().add(precioPastaPesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        precioPastaAlfredo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPastaAlfredo.setForeground(new java.awt.Color(255, 255, 255));
        precioPastaAlfredo.setText("30000");
        getContentPane().add(precioPastaAlfredo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        precioPastaCarbonara.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPastaCarbonara.setForeground(new java.awt.Color(255, 255, 255));
        precioPastaCarbonara.setText("35000");
        getContentPane().add(precioPastaCarbonara, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        precioPastaBolognesa.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPastaBolognesa.setForeground(new java.awt.Color(255, 255, 255));
        precioPastaBolognesa.setText("33000");
        getContentPane().add(precioPastaBolognesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, -1));

        precioPastaCamarones.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioPastaCamarones.setForeground(new java.awt.Color(255, 255, 255));
        precioPastaCamarones.setText("40000");
        getContentPane().add(precioPastaCamarones, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, -1));
        getContentPane().add(cantidadPastaMarinera, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 40, -1));
        getContentPane().add(cantidadPastaPesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 40, -1));
        getContentPane().add(cantidadPastaAlfredo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 40, -1));
        getContentPane().add(cantidadPastaCarbonara, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 40, -1));
        getContentPane().add(cantidadPastaBolognesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 40, -1));
        getContentPane().add(cantidadPastaCamarones, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, 40, -1));
        getContentPane().add(etiImagenBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 220, 130));

        etiProductoBebida.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiProductoBebida.setForeground(new java.awt.Color(255, 255, 255));
        etiProductoBebida.setText("Producto:");
        getContentPane().add(etiProductoBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        etiPrecioBebida.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiPrecioBebida.setForeground(new java.awt.Color(255, 255, 255));
        etiPrecioBebida.setText("Precio:");
        getContentPane().add(etiPrecioBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, -1, -1));

        etiCantidadBebida.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        etiCantidadBebida.setForeground(new java.awt.Color(255, 255, 255));
        etiCantidadBebida.setText("Cantidad:");
        getContentPane().add(etiCantidadBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, -1, -1));

        butonAgua.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonAgua.setForeground(new java.awt.Color(255, 255, 255));
        butonAgua.setText("Agua");
        getContentPane().add(butonAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, -1, -1));

        butonCoca.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonCoca.setForeground(new java.awt.Color(255, 255, 255));
        butonCoca.setText("Cocacola");
        getContentPane().add(butonCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, -1, -1));

        butonMargarita.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonMargarita.setForeground(new java.awt.Color(255, 255, 255));
        butonMargarita.setText("Margarita");
        getContentPane().add(butonMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, -1, -1));

        butonLimonada.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonLimonada.setForeground(new java.awt.Color(255, 255, 255));
        butonLimonada.setText("Limonada");
        getContentPane().add(butonLimonada, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, -1, -1));

        butonVino.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonVino.setForeground(new java.awt.Color(255, 255, 255));
        butonVino.setText("Vino ");
        getContentPane().add(butonVino, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        butonAguaMineral.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        butonAguaMineral.setForeground(new java.awt.Color(255, 255, 255));
        butonAguaMineral.setText("Agua Mineral");
        getContentPane().add(butonAguaMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, -1, -1));

        precioAgua.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioAgua.setForeground(new java.awt.Color(255, 255, 255));
        precioAgua.setText("6000");
        getContentPane().add(precioAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, -1, -1));

        precioCoca.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioCoca.setForeground(new java.awt.Color(255, 255, 255));
        precioCoca.setText("9000");
        getContentPane().add(precioCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, -1, -1));

        precioMargarita.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioMargarita.setForeground(new java.awt.Color(255, 255, 255));
        precioMargarita.setText("12000");
        getContentPane().add(precioMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, -1, -1));

        precioLimonada.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioLimonada.setForeground(new java.awt.Color(255, 255, 255));
        precioLimonada.setText("10000");
        getContentPane().add(precioLimonada, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, -1, -1));

        precioVino.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioVino.setForeground(new java.awt.Color(255, 255, 255));
        precioVino.setText("15000");
        getContentPane().add(precioVino, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        precioAguaMineral.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        precioAguaMineral.setForeground(new java.awt.Color(255, 255, 255));
        precioAguaMineral.setText("8000");
        getContentPane().add(precioAguaMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, -1, -1));
        getContentPane().add(cantidadAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, 40, -1));
        getContentPane().add(cantidadCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 40, -1));
        getContentPane().add(cantidadMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 40, -1));
        getContentPane().add(cantidadLimonada, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 530, 40, -1));
        getContentPane().add(cantidadVino, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 570, 40, -1));
        getContentPane().add(cantidadAguaMineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 610, 40, -1));

        botonFactura.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        botonFactura.setText("Factura");
        botonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(botonFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 680, -1, -1));
        getContentPane().add(etiFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));
=======
        
        getContentPane().add(etiFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1100, 720));

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
>>>>>>> 77992510917e9fcec59deeb4d73f013300feb1f6

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturaActionPerformed
    StringBuilder mensaje = new StringBuilder();
    mensaje.append("Resumen de la Orden:\n\n");
    
    double totalPagar = 0.0;
    
    if(butonPizzaNapolitana.isSelected()){
    double precio1 = Double.parseDouble(precioPizzaNapolitana.getText().replace("$", ""));
    int cantidad1 = Integer.parseInt(cantidadPizzaNapolitana.getText());
    double subtotal1 = precio1 * cantidad1;
    totalPagar += subtotal1;
    
    mensaje.append("Pizza Napolitana\nPrecio: $ ").append(precio1).append("  Cantidad: ").append(cantidad1)
    .append("  Subtotal: $ ").append(subtotal1 + "\n").append("\n");
    }
    
    if(butonPizzaMargarita.isSelected()){
    double precio2 = Double.parseDouble(precioPizzaMargarita.getText().replace("$", ""));
    int cantidad2 = Integer.parseInt(cantidadPizzaMargarita.getText());
    double subtotal2 = precio2 * cantidad2;
    totalPagar += subtotal2;
    
     mensaje.append("Pizza Margarita\nPrecio: $ ").append(precio2).append("  Cantidad: ").append(cantidad2)
    .append("  Subtotal: $ ").append(subtotal2 + "\n").append("\n");
    }
    
    if(butonPizzaCapricciosa.isSelected()){
    double precio3 = Double.parseDouble(precioPizzaCapricciosa.getText().replace("$", ""));
    int cantidad3 = Integer.parseInt(cantidadPizzaCapricciosa.getText());
    double subtotal3 = precio3 * cantidad3;
    totalPagar += subtotal3;
    
     mensaje.append("Pizza Capricciosa\nPrecio: $ ").append(precio3).append("  Cantidad: ").append(cantidad3)
    .append("  Subtotal: $ ").append(subtotal3 + "\n").append("\n");
    }
    
    if(butonPizzaHawaiana.isSelected()){
    double precio4 = Double.parseDouble(precioPizzaHawaiana.getText().replace("$", ""));
    int cantidad4 = Integer.parseInt(cantidadPizzaHawaiana.getText());
    double subtotal4 = precio4 * cantidad4;
    totalPagar += subtotal4;
    
     mensaje.append("Pizza Hawaiana\nPrecio: $ ").append(precio4).append("  Cantidad: ").append(cantidad4)
    .append("  Subtotal: $ ").append(subtotal4 + "\n").append("\n");
    }
    
    if(butonPizzaPepperoni.isSelected()){
    double precio5 = Double.parseDouble(precioPizzaPepperoni.getText().replace("$", ""));
    int cantidad5 = Integer.parseInt(cantidadPizzaPepperoni.getText());
    double subtotal5 = precio5 * cantidad5;
    totalPagar += subtotal5;
    
     mensaje.append("Pizza de Pepperoni\nPrecio: $ ").append(precio5).append("  Cantidad: ").append(cantidad5)
    .append("  Subtotal: $ ").append(subtotal5 + "\n").append("\n");
    }
    
    if(butonPizzaChampiñones.isSelected()){
    double precio6 = Double.parseDouble(precioPizzaChampiñones.getText().replace("$", ""));
    int cantidad6 = Integer.parseInt(cantidadPizzaChampiñones.getText());
    double subtotal6 = precio6 * cantidad6;
    totalPagar += subtotal6;
    
     mensaje.append("Pizza con Champiñones\nPrecio: $ ").append(precio6).append("  Cantidad: ").append(cantidad6)
    .append("  Subtotal: $ ").append(subtotal6 + "\n").append("\n");
    }
    
    if(butonPastaMarinera.isSelected()){
    double precio7 = Double.parseDouble(precioPastaMarinera.getText().replace("$", ""));
    int cantidad7 = Integer.parseInt(cantidadPastaMarinera.getText());
    double subtotal7 = precio7 * cantidad7;
    totalPagar += subtotal7;
    
     mensaje.append("Pasta Marinera\nPrecio: $ ").append(precio7).append("  Cantidad: ").append(cantidad7)
    .append("  Subtotal: $ ").append(subtotal7 + "\n").append("\n");
    }
    
     if(butonPastaPesto.isSelected()){
    double precio8 = Double.parseDouble(precioPastaPesto.getText().replace("$", ""));
    int cantidad8 = Integer.parseInt(cantidadPastaPesto.getText());
    double subtotal8 = precio8 * cantidad8;
    totalPagar += subtotal8;
    
     mensaje.append("Pasta al Pesto\nPrecio: $ ").append(precio8).append("  Cantidad: ").append(cantidad8)
    .append("  Subtotal: $ ").append(subtotal8 + "\n").append("\n");
    }
     
     if(butonPastaAlfredo.isSelected()){
    double precio9 = Double.parseDouble(precioPastaAlfredo.getText().replace("$", ""));
    int cantidad9 = Integer.parseInt(cantidadPastaAlfredo.getText());
    double subtotal9 = precio9 * cantidad9;
    totalPagar += subtotal9;
    
     mensaje.append("Pasta Alfredo\nPrecio: $ ").append(precio9).append("  Cantidad: ").append(cantidad9)
    .append("  Subtotal: $ ").append(subtotal9 + "\n").append("\n");
    } 
     
     if(butonPastaCarbonara.isSelected()){
    double precio10 = Double.parseDouble(precioPastaCarbonara.getText().replace("$", ""));
    int cantidad10 = Integer.parseInt(cantidadPastaCarbonara.getText());
    double subtotal10 = precio10 * cantidad10;
    totalPagar += subtotal10;
    
     mensaje.append("Pasta Carbonara\nPrecio: $ ").append(precio10).append("  Cantidad: ").append(cantidad10)
    .append("  Subtotal: $ ").append(subtotal10 + "\n").append("\n");
    }
     
    if(butonPastaBolognesa.isSelected()){
    double precio11 = Double.parseDouble(precioPastaBolognesa.getText().replace("$", ""));
    int cantidad11 = Integer.parseInt(cantidadPastaBolognesa.getText());
    double subtotal11 = precio11 * cantidad11;
    totalPagar += subtotal11;
    
     mensaje.append("Pasta a la Bolognesa\nPrecio: $ ").append(precio11).append("  Cantidad: ").append(cantidad11)
    .append("  Subtotal: $ ").append(subtotal11 + "\n").append("\n");
    } 
    
     if(butonPastaCamarones.isSelected()){
    double precio12 = Double.parseDouble(precioPastaCamarones.getText().replace("$", ""));
    int cantidad12 = Integer.parseInt(cantidadPastaCamarones.getText());
    double subtotal12 = precio12 * cantidad12;
    totalPagar += subtotal12;
    
     mensaje.append("Pasta con Camarones\nPrecio: $ ").append(precio12).append("  Cantidad: ").append(cantidad12)
    .append("  Subtotal: $ ").append(subtotal12 + "\n").append("\n");
    } 
     
    if(butonAgua.isSelected()){
    double precio13 = Double.parseDouble(precioAgua.getText().replace("$", ""));
    int cantidad13 = Integer.parseInt(cantidadAgua.getText());
    double subtotal13 = precio13 * cantidad13;
    totalPagar += subtotal13;
    
     mensaje.append("Agua\nPrecio: $ ").append(precio13).append("  Cantidad: ").append(cantidad13)
    .append("  Subtotal: $ ").append(subtotal13 + "\n").append("\n");
    }
    
    if(butonCoca.isSelected()){
    double precio14 = Double.parseDouble(precioCoca.getText().replace("$", ""));
    int cantidad14 = Integer.parseInt(cantidadCoca.getText());
    double subtotal14 = precio14 * cantidad14;
    totalPagar += subtotal14;
    
     mensaje.append("Cocacola\nPrecio: $ ").append(precio14).append("  Cantidad: ").append(cantidad14)
    .append("  Subtotal: $ ").append(subtotal14 + "\n").append("\n");
    }
    
    if(butonMargarita.isSelected()){
    double precio15 = Double.parseDouble(precioMargarita.getText().replace("$", ""));
    int cantidad15 = Integer.parseInt(cantidadMargarita.getText());
    double subtotal15 = precio15 * cantidad15;
    totalPagar += subtotal15;
    
     mensaje.append("Margarita\nPrecio: $ ").append(precio15).append("  Cantidad: ").append(cantidad15)
    .append("  Subtotal: $ ").append(subtotal15 + "\n").append("\n");
    }
    
     if(butonLimonada.isSelected()){
    double precio16 = Double.parseDouble(precioLimonada.getText().replace("$", ""));
    int cantidad16 = Integer.parseInt(cantidadLimonada.getText());
    double subtotal16 = precio16 * cantidad16;
    totalPagar += subtotal16;
    
     mensaje.append("Limonada\nPrecio: $ ").append(precio16).append("  Cantidad: ").append(cantidad16)
    .append("  Subtotal: $ ").append(subtotal16 + "\n").append("\n");
    }
     
     if(butonVino.isSelected()){
    double precio17 = Double.parseDouble(precioVino.getText().replace("$", ""));
    int cantidad17 = Integer.parseInt(cantidadVino.getText());
    double subtotal17 = precio17 * cantidad17;
    totalPagar += subtotal17;
    
     mensaje.append("Vino\nPrecio: $ ").append(precio17).append("  Cantidad: ").append(cantidad17)
    .append("  Subtotal: $ ").append(subtotal17 + "\n").append("\n");
    }
     
     if(butonAguaMineral.isSelected()){
    double precio18 = Double.parseDouble(precioAguaMineral.getText().replace("$", ""));
    int cantidad18 = Integer.parseInt(cantidadAguaMineral.getText());
    double subtotal18 = precio18 * cantidad18;
    totalPagar += subtotal18;
    
     mensaje.append("Agua Mineral\nPrecio: $ ").append(precio18).append("  Cantidad: ").append(cantidad18)
    .append("  Subtotal: $ ").append(subtotal18 + "\n").append("\n");
    } 
     
    
    mensaje.append("\n Total a Pagar: $").append(totalPagar);
    
    JOptionPane.showMessageDialog(this, mensaje.toString(), "Resumen de la Orden",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonFacturaActionPerformed

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
    private javax.swing.JButton botonFactura;
    private javax.swing.JRadioButton butonAgua;
    private javax.swing.JRadioButton butonAguaMineral;
    private javax.swing.JRadioButton butonCoca;
    private javax.swing.JRadioButton butonLimonada;
    private javax.swing.JRadioButton butonMargarita;
    private javax.swing.JRadioButton butonPastaAlfredo;
    private javax.swing.JRadioButton butonPastaBolognesa;
    private javax.swing.JRadioButton butonPastaCamarones;
    private javax.swing.JRadioButton butonPastaCarbonara;
    private javax.swing.JRadioButton butonPastaMarinera;
    private javax.swing.JRadioButton butonPastaPesto;
    private javax.swing.JRadioButton butonPizzaCapricciosa;
    private javax.swing.JRadioButton butonPizzaChampiñones;
    private javax.swing.JRadioButton butonPizzaHawaiana;
    private javax.swing.JRadioButton butonPizzaMargarita;
    private javax.swing.JRadioButton butonPizzaNapolitana;
    private javax.swing.JRadioButton butonPizzaPepperoni;
    private javax.swing.JRadioButton butonVino;
    private javax.swing.JTextField cantidadAgua;
    private javax.swing.JTextField cantidadAguaMineral;
    private javax.swing.JTextField cantidadCoca;
    private javax.swing.JTextField cantidadLimonada;
    private javax.swing.JTextField cantidadMargarita;
    private javax.swing.JTextField cantidadPastaAlfredo;
    private javax.swing.JTextField cantidadPastaBolognesa;
    private javax.swing.JTextField cantidadPastaCamarones;
    private javax.swing.JTextField cantidadPastaCarbonara;
    private javax.swing.JTextField cantidadPastaMarinera;
    private javax.swing.JTextField cantidadPastaPesto;
    private javax.swing.JTextField cantidadPizzaCapricciosa;
    private javax.swing.JTextField cantidadPizzaChampiñones;
    private javax.swing.JTextField cantidadPizzaHawaiana;
    private javax.swing.JTextField cantidadPizzaMargarita;
    private javax.swing.JTextField cantidadPizzaNapolitana;
    private javax.swing.JTextField cantidadPizzaPepperoni;
    private javax.swing.JTextField cantidadVino;
    private javax.swing.JLabel etiCantidadBebida;
    private javax.swing.JLabel etiCantidadPasta;
    private javax.swing.JLabel etiCantidadPizza;
    private javax.swing.JLabel etiFondo;
    private javax.swing.JLabel etiImagenBebidas;
    private javax.swing.JLabel etiImagenPastas;
    private javax.swing.JLabel etiImagenPizza;
    private javax.swing.JLabel etiPrecioBebida;
    private javax.swing.JLabel etiPrecioPasta;
    private javax.swing.JLabel etiPrecioPizza;
    private javax.swing.JLabel etiProductoBebida;
    private javax.swing.JLabel etiProductoPasta;
    private javax.swing.JLabel etiProductoPizza;
<<<<<<< HEAD
    private javax.swing.JLabel precioAgua;
    private javax.swing.JLabel precioAguaMineral;
    private javax.swing.JLabel precioCoca;
    private javax.swing.JLabel precioLimonada;
    private javax.swing.JLabel precioMargarita;
    private javax.swing.JLabel precioPastaAlfredo;
    private javax.swing.JLabel precioPastaBolognesa;
    private javax.swing.JLabel precioPastaCamarones;
    private javax.swing.JLabel precioPastaCarbonara;
    private javax.swing.JLabel precioPastaMarinera;
    private javax.swing.JLabel precioPastaPesto;
=======
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
>>>>>>> 77992510917e9fcec59deeb4d73f013300feb1f6
    private javax.swing.JLabel precioPizzaCapricciosa;
    private javax.swing.JLabel precioPizzaChampiñones;
    private javax.swing.JLabel precioPizzaHawaiana;
    private javax.swing.JLabel precioPizzaMargarita;
    private javax.swing.JLabel precioPizzaNapolitana;
    private javax.swing.JLabel precioPizzaPepperoni;
    private javax.swing.JLabel precioVino;
    // End of variables declaration//GEN-END:variables


    
}
