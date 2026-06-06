
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Cespedes Sile
 */
public class Entrenamientos extends javax.swing.JFrame {
   
      private static String getFechaActual() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       Calendar fecha_actual = new GregorianCalendar();
   
    public Entrenamientos() {
        initComponents();
        
       this.setLocationRelativeTo(null);            // para centrar la pantalla
       FechaActual.setCalendar (fecha_actual);     // calendario fecha actual
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        BtnInsertar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jIngreseCodigo = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        Ingresedescripcion = new javax.swing.JLabel();
        TxtDescripcion = new javax.swing.JTextField();
        ElijaCategoria = new javax.swing.JLabel();
        ComboBCategoria = new javax.swing.JComboBox<>();
        Fecha = new javax.swing.JLabel();
        FechaActual = new com.toedter.calendar.JDateChooser();
        BtnCerrarE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnInsertar.setText("Insertar");
        BtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertarActionPerformed(evt);
            }
        });

        BtnModificar.setForeground(new java.awt.Color(0, 51, 255));
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setForeground(new java.awt.Color(255, 51, 51));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        jIngreseCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIngreseCodigo.setText("Ingrese Código");

        TxtCodigo.setText("ENT 00");

        Ingresedescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ingresedescripcion.setText("Ingrese Descripción");

        ElijaCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ElijaCategoria.setText("Elija Categoria Entrenamiento");

        ComboBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primer Equipo", "Categoria Menor" }));

        Fecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Fecha.setText("Fecha");

        FechaActual.setDateFormatString("dd/MM/yyyy  hh:mm:ss");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Ingresedescripcion)
                                .addGap(18, 18, 18)
                                .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jIngreseCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ElijaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(ComboBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIngreseCodigo)
                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ingresedescripcion)
                    .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ElijaCategoria)
                    .addComponent(ComboBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        BtnCerrarE.setForeground(new java.awt.Color(153, 153, 255));
        BtnCerrarE.setText("Cerrar");
        BtnCerrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnInsertar)
                        .addGap(39, 39, 39)
                        .addComponent(BtnModificar)
                        .addGap(34, 34, 34)
                        .addComponent(BtnEliminar)
                        .addGap(39, 39, 39)
                        .addComponent(BtnCerrarE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar)
                    .addComponent(BtnInsertar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnCerrarE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Datos de Entrenamiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarEActionPerformed
        this.setVisible(false);
      //Jugador.close();
       dispose();  //destruye proceso Jframe 
    }//GEN-LAST:event_BtnCerrarEActionPerformed

    private void BtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertarActionPerformed
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String FechaRegistro = formato.format(FechaActual.getDate());
    String Codigo = TxtCodigo.getText();
    String Descripcion = TxtDescripcion.getText();
    String Categoria = ComboBCategoria.getSelectedItem().toString();

    // Validación simple
    if(Codigo.isEmpty() || Descripcion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
    }
         
       String linea = " -  "+ Codigo +"   " + "   " + Descripcion + "   " +"   " + Categoria + "   "   + FechaRegistro ;
        
    try {
        FileWriter fw = new FileWriter("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Entrenamiento.txt", true); 
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(linea);
        bw.newLine();
        bw.close();
        
      
         
        JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar datos: " + e.getMessage());
    }finally{
    }
    LimpiarDatos();
    }//GEN-LAST:event_BtnInsertarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
                                              
    String Codigo = TxtCodigo.getText().trim();

    if (Codigo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un código para eliminar.");
        return;
    }

    File archivo = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Entrenamiento.txt");
    File archivoTemporal = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Entrenamiento_temp.txt");

    boolean encontrado = false;

    try (
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))
    ) {
        String linea;
        while ((linea = br.readLine()) != null) {
            // Verificamos si la línea contiene el código exacto
            if (!linea.contains(Codigo)) {
                bw.write(linea);
                bw.newLine();
            } else {
                encontrado = true; // No copiamos la línea si la encontramos, se "elimina"
            }
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al procesar el archivo: " + e.getMessage());
        return;
    }

    // Reemplazamos el archivo original por el temporal
    if (archivo.delete()) {
        if (archivoTemporal.renameTo(archivo)) {
            if (encontrado) {
                JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Código no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo renombrar el archivo temporal.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo eliminar el archivo original.");
    }

    LimpiarDatos();


    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String FechaRegistro = formato.format(FechaActual.getDate());                                               
    String Codigo = TxtCodigo.getText().trim();
    String Descripcion = TxtDescripcion.getText().trim();
    String Categoria = ComboBCategoria.getSelectedItem().toString();

    if (Codigo.isEmpty() || Descripcion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe completar todos los campos para modificar.");
        return;
    }

    File archivo = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Entrenamiento.txt");
    File archivoTemporal = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Entrenamiento_temp.txt");

    boolean encontrado = false;

    try (
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))
    ) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.contains(Codigo)) {
                // Reemplazar por la nueva línea con los datos modificados
                String nuevaLinea = " -  " + Codigo + "   " + Descripcion + "   " + Categoria +"   " + FechaRegistro;
                bw.write(nuevaLinea);
                encontrado = true;
            } else {
                // Copiar la línea sin cambios
                bw.write(linea);
            }
            bw.newLine();
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al modificar: " + e.getMessage());
        return;
    }

    // Reemplazar archivo original
    if (archivo.delete()) {
        if (archivoTemporal.renameTo(archivo)) {
            if (encontrado) {
                JOptionPane.showMessageDialog(this, "Registro modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Código no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al renombrar archivo temporal.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar archivo original.");
    }

    LimpiarDatos();


    }//GEN-LAST:event_BtnModificarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarE;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JComboBox<String> ComboBCategoria;
    private javax.swing.JLabel ElijaCategoria;
    private javax.swing.JLabel Fecha;
    private com.toedter.calendar.JDateChooser FechaActual;
    private javax.swing.JLabel Ingresedescripcion;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtDescripcion;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jIngreseCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void LimpiarDatos() {
        
        JOptionPane.showMessageDialog(null, "Información Guardada");
        
        TxtCodigo.setText("ENT ");
        TxtDescripcion.setText(" ");
        ComboBCategoria.setSelectedIndex(0);
        TxtCodigo.requestFocus(); //Para que el cursor vuelva al campo de código
        
    }
}
