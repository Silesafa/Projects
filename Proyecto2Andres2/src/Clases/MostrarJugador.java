
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Cespedes Sile
 */
public class MostrarJugador extends javax.swing.JFrame {

    /**
     * Creates new form MostrarJugador
     */
    public MostrarJugador() {
        initComponents();    
       
   
        
        
        
    }

    MostrarJugador(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnCerrarJ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDatosJugad = new javax.swing.JTextArea();
        BtnVerDatosJugad = new javax.swing.JButton();
        BtnFiltrarFecha = new javax.swing.JButton();
        BtnFiltrarNombre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Datos de Jugador");

        BtnCerrarJ.setText("Cerrar");
        BtnCerrarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarJActionPerformed(evt);
            }
        });

        TxtDatosJugad.setColumns(20);
        TxtDatosJugad.setRows(5);
        jScrollPane1.setViewportView(TxtDatosJugad);

        BtnVerDatosJugad.setForeground(new java.awt.Color(51, 51, 255));
        BtnVerDatosJugad.setText("ver");
        BtnVerDatosJugad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerDatosJugadActionPerformed(evt);
            }
        });

        BtnFiltrarFecha.setForeground(new java.awt.Color(255, 153, 0));
        BtnFiltrarFecha.setText("Por fecha");
        BtnFiltrarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFiltrarFechaActionPerformed(evt);
            }
        });

        BtnFiltrarNombre.setForeground(new java.awt.Color(153, 255, 255));
        BtnFiltrarNombre.setText("Por Nombre");
        BtnFiltrarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFiltrarNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFiltrarFecha)
                .addGap(28, 28, 28)
                .addComponent(BtnFiltrarNombre)
                .addGap(18, 18, 18)
                .addComponent(BtnVerDatosJugad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(BtnCerrarJ)
                .addGap(38, 38, 38))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCerrarJ)
                    .addComponent(BtnVerDatosJugad)
                    .addComponent(BtnFiltrarFecha)
                    .addComponent(BtnFiltrarNombre)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarJActionPerformed
         this.setVisible(false);
      //Jugador.close();
       dispose();  //destruye proceso Jframe 
    }//GEN-LAST:event_BtnCerrarJActionPerformed

    private void BtnVerDatosJugadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerDatosJugadActionPerformed
 File archivo = null;
        FileReader Jugador = null;
        BufferedReader lector = null;
        try{
            archivo = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Jugador.txt");
            Jugador = new FileReader(archivo);
            lector = new BufferedReader(Jugador);
            String datos = "";
            while (lector.read() > 0) {                
                datos += lector.readLine();
                datos += "\n";
            }
            this.TxtDatosJugad.setText(datos);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error");
        }


   
    }//GEN-LAST:event_BtnVerDatosJugadActionPerformed

    private void BtnFiltrarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFiltrarNombreActionPerformed
/*    
    String NombreJugadorFiltro = txtNombreJugador.getText().trim().toLowerCase();

    if (NombreJugadorFiltro.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un nombre para filtrar.");
        return;
    }

    File archivo = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Jugador.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        StringBuilder resultado = new StringBuilder();
        String linea;
        br.readLine(); // Ignorar encabezado

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split("  +");
            if (partes.length > 1) {
                String NombreJugador = partes[1].toLowerCase();
                if (NombreJugador.contains(NombreJugadorFiltro)) {
                    resultado.append(linea).append("\n");
                }
            }
        }

           TxtResultados.setText(resultado.toString());

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
    }

  */
    }//GEN-LAST:event_BtnFiltrarNombreActionPerformed

    private void BtnFiltrarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFiltrarFechaActionPerformed
/*    Date fechaInicio = FechaInicio.getDate();
    Date fechaFin = FechaFin.getDate();

    if (fechaInicio == null || fechaFin == null) {
        JOptionPane.showMessageDialog(this, "Seleccione ambas fechas para filtrar.");
        return;
    }

    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

    File archivo = new File("C:\\Users\\Andres Cespedes Sile\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto2Andres2\\Jugador.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        StringBuilder resultado = new StringBuilder();
        String linea;
        br.readLine(); // Saltar encabezado

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split("  +");
            if (partes.length > 0) {
                Date fechaRegistro = formatoFecha.parse(partes[0]); // Saltar línea si la fecha no se puede parsear
                if (!fechaRegistro.before(fechaInicio) && !fechaRegistro.after(fechaFin)) {
                    resultado.append(linea).append("\n");
                }
            }
        }

        TxtResultados.setText(resultado.toString());

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
    }*/
    }//GEN-LAST:event_BtnFiltrarFechaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarJ;
    private javax.swing.JButton BtnFiltrarFecha;
    private javax.swing.JButton BtnFiltrarNombre;
    private javax.swing.JButton BtnVerDatosJugad;
    private javax.swing.JTextArea TxtDatosJugad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
