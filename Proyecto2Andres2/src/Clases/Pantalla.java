/*Proyecto #2 Andrés Céspedes Siles
Referencias

Tutoria Adriana Rubio
https://www.youtube.com/watch?v=nXLBm9CQV6s 

Tutoria Luis Quesada
https://www.youtube.com/watch?v=IB7ofHPWpvY

TodoCode Java
https://www.youtube.com/watch?v=6q7wHs6cH6Y&list=PLQxX2eiEaqbwxYrMUJ6gRz82mLzUeeJy9

ProgramcionATS
https://www.youtube.com/watch?v=2ZXiuh0rg3M&list=PLWtYZ2ejMVJkjOuTCzIk61j7XKfpIR74K

Deitel, P. J., Deitel, H.  (2021). Cómo programar en Java. [[VitalSource Bookshelf version]].  Retrieved from vbk://9786073255400

*/
package Clases;

import java.awt.HeadlessException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;



public class Pantalla extends javax.swing.JFrame {

    private static String getFechaActual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 private Deportista Jugador;

  
    Calendar fecha_actual = new GregorianCalendar();
  
    public Pantalla() {
        initComponents();
        
        
        this.setLocationRelativeTo(null);            // para centrar la pantalla
        FechaActual.setCalendar (fecha_actual);     // calendario fecha actual
        
        
    }
       
                
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelJugador = new javax.swing.JPanel();
        NombreJugador = new javax.swing.JLabel();
        JFNombreJugador = new javax.swing.JTextField();
        Numero = new javax.swing.JLabel();
        Posicion = new javax.swing.JLabel();
        Estatura = new javax.swing.JLabel();
        TipoEntrenamiento = new javax.swing.JLabel();
        Categoria = new javax.swing.JLabel();
        Peso = new javax.swing.JLabel();
        PorcentajeGrasa = new javax.swing.JLabel();
        ComboBPosicion = new javax.swing.JComboBox<>();
        JFEstatura = new javax.swing.JFormattedTextField();
        JFPeso = new javax.swing.JFormattedTextField();
        JFPorcentajeGrasa = new javax.swing.JFormattedTextField();
        JFCategoria = new javax.swing.JComboBox<>();
        DescripcionCategoria = new javax.swing.JLabel();
        JFDescripcionCategoria = new javax.swing.JComboBox<>();
        JFNumero = new javax.swing.JFormattedTextField();
        BtnSalir = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        TxtTipoEntrenamiento = new javax.swing.JFormattedTextField();
        Fecha = new javax.swing.JLabel();
        FechaActual = new com.toedter.calendar.JDateChooser();
        PanelTipoEnt = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JFTipoEnt = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuJugadores = new javax.swing.JMenu();
        MostrarJugador = new javax.swing.JMenuItem();
        MenuEntrenamientos = new javax.swing.JMenu();
        MenuItemVerE = new javax.swing.JMenuItem();
        MenuItemOpcionesE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Datos de Jugadores");

        NombreJugador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NombreJugador.setText(" Nombre del Jugador");

        JFNombreJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFNombreJugadorActionPerformed(evt);
            }
        });

        Numero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Numero.setText("Número");

        Posicion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Posicion.setText("Posición");

        Estatura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Estatura.setText("Estatura");

        TipoEntrenamiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TipoEntrenamiento.setText("Tipos de Entrenamiento");

        Categoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Categoria.setText("Categoria");

        Peso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Peso.setText("Peso");

        PorcentajeGrasa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PorcentajeGrasa.setText("Porcentaje de Grasa");

        ComboBPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por", "Def", "Med", "Del" }));

        JFEstatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        JFPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        JFPorcentajeGrasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        JFCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Equipo", "Categoria Menor" }));
        JFCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFCategoriaActionPerformed(evt);
            }
        });

        DescripcionCategoria.setText("Descripción Categoria");

        JFDescripcionCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "U-15", "U-17", "U-21" }));

        JFNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        JFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFNumeroActionPerformed(evt);
            }
        });

        BtnSalir.setForeground(new java.awt.Color(0, 153, 0));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        TxtTipoEntrenamiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        Fecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Fecha.setText("Fecha");

        FechaActual.setDateFormatString("dd/MM/yyyy  hh:mm:ss");

        javax.swing.GroupLayout PanelJugadorLayout = new javax.swing.GroupLayout(PanelJugador);
        PanelJugador.setLayout(PanelJugadorLayout);
        PanelJugadorLayout.setHorizontalGroup(
            PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJugadorLayout.createSequentialGroup()
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJugadorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Peso))
                    .addGroup(PanelJugadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JFDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelJugadorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(PanelJugadorLayout.createSequentialGroup()
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelJugadorLayout.createSequentialGroup()
                            .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombreJugador)
                                .addGroup(PanelJugadorLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Estatura))))
                            .addGap(18, 18, 18)
                            .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JFEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JFNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelJugadorLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelJugadorLayout.createSequentialGroup()
                                    .addComponent(TipoEntrenamiento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxtTipoEntrenamiento))
                                .addGroup(PanelJugadorLayout.createSequentialGroup()
                                    .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(JFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelJugadorLayout.createSequentialGroup()
                                        .addComponent(PorcentajeGrasa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JFPorcentajeGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(PanelJugadorLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        PanelJugadorLayout.setVerticalGroup(
            PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreJugador)
                    .addComponent(JFNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Numero)
                    .addComponent(JFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Posicion)
                    .addComponent(ComboBPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estatura)
                    .addComponent(JFEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoEntrenamiento)
                    .addComponent(TxtTipoEntrenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Categoria)
                    .addComponent(JFCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Peso)
                    .addComponent(JFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PorcentajeGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFPorcentajeGrasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DescripcionCategoria)
                    .addComponent(JFDescripcionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(PanelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnGuardar))
                .addContainerGap())
        );

        FechaActual.getAccessibleContext().setAccessibleDescription("");

        JFTipoEnt.setEditable(false);
        JFTipoEnt.setColumns(20);
        JFTipoEnt.setRows(5);
        jScrollPane1.setViewportView(JFTipoEnt);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelTipoEntLayout = new javax.swing.GroupLayout(PanelTipoEnt);
        PanelTipoEnt.setLayout(PanelTipoEntLayout);
        PanelTipoEntLayout.setHorizontalGroup(
            PanelTipoEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTipoEntLayout.setVerticalGroup(
            PanelTipoEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTipoEntLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Tipos de Entrenamiento");
        jLabel13.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Datos del Deportista");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createCompoundBorder(), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));

        MenuJugadores.setText("Jugadores");
        MenuJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuJugadoresActionPerformed(evt);
            }
        });

        MostrarJugador.setText("Ver");
        MostrarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarJugadorActionPerformed(evt);
            }
        });
        MenuJugadores.add(MostrarJugador);

        jMenuBar1.add(MenuJugadores);

        MenuEntrenamientos.setText("Entrenamientos");

        MenuItemVerE.setText("ver");
        MenuItemVerE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVerEActionPerformed(evt);
            }
        });
        MenuEntrenamientos.add(MenuItemVerE);

        MenuItemOpcionesE.setText("Opciones Entreno");
        MenuItemOpcionesE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemOpcionesEActionPerformed(evt);
            }
        });
        MenuEntrenamientos.add(MenuItemOpcionesE);

        jMenuBar1.add(MenuEntrenamientos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTipoEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel13)
                        .addGap(0, 99, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelTipoEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(PanelJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void JFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFNumeroActionPerformed
       
        
        try {
            // Obtener el texto del campo de entrada
            String NumeroJug = JFNumero.getText().trim();

            // Si campo está vacío
            if (NumeroJug.isEmpty()) {
                throw new InputMismatchException("Debe Elegir un número para el jugador.");
            }

            // Intentar convertir el texto a un número entero
            int JFNumero = Integer.parseInt(NumeroJug);

            // Validar que sea un número positivo
            if (JFNumero <=0) {

                throw new InputMismatchException("El número debe ser un entero positivo.");
            }

            // Si pasa todas las validaciones
            JOptionPane.showMessageDialog(this, "Número válido.",
                "Validación Exitosa", JOptionPane.INFORMATION_MESSAGE);
           
        }catch (NumberFormatException e) {
            // Captura el error si el usuario ingresa algo que no es un número
            JOptionPane.showMessageDialog(this, "El número debe ser un entero positivo.",
                "Error", JOptionPane.ERROR_MESSAGE);
        } catch (InputMismatchException e) {
            // Captura errores de validación personalizados
            JOptionPane.showMessageDialog(this, e.getMessage(),
                "El número debe ser un entero positivo.", JOptionPane.ERROR_MESSAGE);

        }

        finally{
        }
    }//GEN-LAST:event_JFNumeroActionPerformed

    private void JFCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFCategoriaActionPerformed
        //Validacion seleccion Categoria
        if (this.JFCategoria.getSelectedIndex()== 0){
            //Selecciona Primer Equipo
            this.Peso.setEnabled(true);
            this.JFPeso.setEnabled(true);
            this.PorcentajeGrasa.setEnabled(true);
            this.JFPorcentajeGrasa.setEnabled(true);
            this.DescripcionCategoria.setEnabled(false);
            this.JFDescripcionCategoria.setEnabled(false);
        }
        //Selecciona Categoria Menor
        else if (this.JFCategoria.getSelectedIndex()== 1){
            this.Peso.setEnabled(false);
            this.JFPeso.setEnabled(false);
            this.PorcentajeGrasa.setEnabled(false);
            this.JFPorcentajeGrasa.setEnabled(false);
            this.DescripcionCategoria.setEnabled(true);
            this.JFDescripcionCategoria.setEnabled(true);

        }
    }//GEN-LAST:event_JFCategoriaActionPerformed

    private void JFNombreJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFNombreJugadorActionPerformed

        try {
            // Obtener Nombre del Jugador
            String nombreJugador = JFNombreJugador.getText().trim();

            // Verificar que la longitud esté entre 5 y 15 caracteres
            if (nombreJugador.length() < 5 || nombreJugador.length() > 15) {
                JOptionPane.showMessageDialog(this, "El nombre debe tener entre 5 y 15 caracteres.",
                    "Error de Validación", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Nombre válido.",
                    "Nombre Válido", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (HeadlessException error) {
            JOptionPane.showMessageDialog(this, "Error: " + error.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }finally{

        }

    }//GEN-LAST:event_JFNombreJugadorActionPerformed

    private void MenuItemVerEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVerEActionPerformed
      File archivo = null;
        FileReader Entreno = null;
        BufferedReader lector = null;
        try{
            archivo = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Entrenamiento.txt");
            Entreno = new FileReader(archivo);
            lector = new BufferedReader(Entreno);
            String datos = "";
            while (lector.read() > 0) {                
                datos += lector.readLine();
                datos += "\n";
            }
            this.JFTipoEnt.setText(datos);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }

    }//GEN-LAST:event_MenuItemVerEActionPerformed

    private void MostrarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarJugadorActionPerformed
        new MostrarJugador().setVisible(true);
          
    }//GEN-LAST:event_MostrarJugadorActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Está seguro de salir?", "Alerta!",
                JOptionPane.YES_NO_OPTION);
        if(opcion == 0)
            System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void MenuJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuJugadoresActionPerformed
        
    }//GEN-LAST:event_MenuJugadoresActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
  
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String FechaRegistro = formato.format(FechaActual.getDate());
    String NombreJugador = JFNombreJugador.getText().trim();
    String Numero = JFNumero.getText().trim();
    String Estatura = JFEstatura.getText().trim();
    String Posicion = ComboBPosicion.getSelectedItem().toString();
    String TipoEntrenamiento= TxtTipoEntrenamiento.getText().trim();
    String Categoria= JFCategoria.getSelectedItem().toString();
    String Peso= JFPeso.getText().trim();
    String PorcentajeGrasa= JFPorcentajeGrasa.getText().trim();
    String DescripcionCategoria= JFDescripcionCategoria.getSelectedItem().toString();
    
      // Verificar que ningún campo esté vacío
    if (NombreJugador.isEmpty() || Numero.isEmpty() || Estatura.isEmpty() || 
        TipoEntrenamiento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.");
        return;
    }

    File archivo = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Jugador.txt");
    boolean archivoExiste = archivo.exists();
    boolean archivoVacio = archivo.length() == 0;

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
        // Escribir Título si archivo es creado
        if (!archivoExiste || archivoVacio) {
            bw.write("Fecha   Nombre  Numero  Estatura  Posicion  TipoEntrenamiento  Categoria  Peso  PorcentajeGrasa  DescripcionCategoria");
            bw.newLine();
        }    
        String linea = FechaRegistro + "  " + NombreJugador + "  " + Numero + "  " + Estatura + " cms " + "  " + Posicion + "  " +
                       TipoEntrenamiento + "  " + Categoria + "  " + Peso + " lbs " + "  " +
                       PorcentajeGrasa + " % "+ "  " + DescripcionCategoria;

        bw.write(linea);
        bw.newLine();

        JOptionPane.showMessageDialog(this, "Jugador guardado correctamente.");
        limpiarDatosJugador(); // Limpia los campos después de guardar

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
    }
    
    
   
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void MenuItemOpcionesEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemOpcionesEActionPerformed
        new Entrenamientos().setVisible(true);
    }//GEN-LAST:event_MenuItemOpcionesEActionPerformed
      
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel Categoria;
    private javax.swing.JComboBox<String> ComboBPosicion;
    private javax.swing.JLabel DescripcionCategoria;
    private javax.swing.JLabel Estatura;
    private javax.swing.JLabel Fecha;
    private com.toedter.calendar.JDateChooser FechaActual;
    private javax.swing.JComboBox<String> JFCategoria;
    private javax.swing.JComboBox<String> JFDescripcionCategoria;
    private javax.swing.JFormattedTextField JFEstatura;
    private javax.swing.JTextField JFNombreJugador;
    private javax.swing.JFormattedTextField JFNumero;
    private javax.swing.JFormattedTextField JFPeso;
    private javax.swing.JFormattedTextField JFPorcentajeGrasa;
    private javax.swing.JTextArea JFTipoEnt;
    private javax.swing.JMenu MenuEntrenamientos;
    private javax.swing.JMenuItem MenuItemOpcionesE;
    private javax.swing.JMenuItem MenuItemVerE;
    private javax.swing.JMenu MenuJugadores;
    private javax.swing.JMenuItem MostrarJugador;
    private javax.swing.JLabel NombreJugador;
    private javax.swing.JLabel Numero;
    private javax.swing.JPanel PanelJugador;
    private javax.swing.JPanel PanelTipoEnt;
    private javax.swing.JLabel Peso;
    private javax.swing.JLabel PorcentajeGrasa;
    private javax.swing.JLabel Posicion;
    private javax.swing.JLabel TipoEntrenamiento;
    private javax.swing.JFormattedTextField TxtTipoEntrenamiento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

      public void limpiarCampos() {
        JOptionPane.showMessageDialog(null, "Información Guardada");
        
        this.NombreJugador.setText("");
        this.Numero.setText("");
        this.Posicion.setText("");
        this.Estatura.setText("");
        this.TipoEntrenamiento.setText("");
        this.Categoria.setText("");
        this.TipoEntrenamiento.setText("");
        //Primer Equipo
        this.JFCategoria.setEnabled(false);
        this.Categoria.setEnabled(false);
       //Categoria Menor
        this.JFCategoria.setEnabled(false);
        this.Categoria.setEnabled(false);
    }


    private void limpiarDatosJugador() {
    JFNombreJugador.setText("");
    JFNumero.setText("");
    JFEstatura.setText("");
    TxtTipoEntrenamiento.setText("");
    JFPeso.setText("");
    JFPorcentajeGrasa.setText("");
    ComboBPosicion.setSelectedIndex(0);
    JFCategoria.setSelectedIndex(0);
    JFDescripcionCategoria.setSelectedIndex(0);
    JFNombreJugador.requestFocus(); // Cursor en el primer campo
}

    
    
}
