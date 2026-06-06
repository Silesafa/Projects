using System;
using System.Windows.Forms;


namespace Grafica
{
    public partial class RegistrarTipoVideojuego : Form
    {
        public RegistrarTipoVideojuego()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btnSalir_Click(object sender, EventArgs e)
        {
            this.Close();//Salir de ventana
        }

        private void btnGuardar_Click(object sender, EventArgs e)
        {
            try
            {

                if (!int.TryParse(txtIdTipoVideoj.Text.Trim(), out int Id))
                {
                    MessageBox.Show("El ID debe ser un número entero.");
                    return;
                }

                
                string Nombre = txtNombreTipoVideoj.Text.Trim();
                string Descripcion = txtDescripTipoVideoj.Text.Trim();

                if (string.IsNullOrWhiteSpace(Nombre) || string.IsNullOrWhiteSpace(Descripcion))
                {
                    MessageBox.Show("Todos los campos son requeridos.");
                    return;
                }

                var tipo = new TipoVideojuego();
                {
                    Id = id,
                    Nombre = nombre,
                    Descripcion = descripcion
                };

                var datos = new TipoVideojuego();
                string mensaje = datos.Agregar(tipo);
                MessageBox.Show(mensaje);

                dgvTipos.DataSource = null;
                dgvTipos.DataSource = datos.ObtenerTodos();
            }
            catch (FormatException)
            {
                MessageBox.Show("El ID debe ser un número entero.");
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error: " + ex.Message);
            }
        }
    }
}
