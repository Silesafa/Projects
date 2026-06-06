using System;
using System.Windows.Forms;

namespace Grafica
{
    public partial class Menu : Form
    {
        public Menu()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

            RegistrarTipoVideojuego ventana = new RegistrarTipoVideojuego();
            ventana.Show();


        }

        private void button7_Click(object sender, EventArgs e)
        {
            Application.Exit(); //cerrar el app del todo
        }
    }
}
