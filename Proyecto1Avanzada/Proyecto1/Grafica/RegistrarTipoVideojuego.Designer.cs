namespace Grafica
{
    partial class RegistrarTipoVideojuego
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.labRegTipoVideoj = new System.Windows.Forms.Label();
            this.labIdTipoVideoj = new System.Windows.Forms.Label();
            this.labNombreTipoVideoj = new System.Windows.Forms.Label();
            this.labDescripTipoVideoj = new System.Windows.Forms.Label();
            this.txtIdTipoVideoj = new System.Windows.Forms.TextBox();
            this.txtNombreTipoVideoj = new System.Windows.Forms.TextBox();
            this.txtDescripTipoVideoj = new System.Windows.Forms.TextBox();
            this.btnGuardar = new System.Windows.Forms.Button();
            this.btnSalir = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // labRegTipoVideoj
            // 
            this.labRegTipoVideoj.AutoSize = true;
            this.labRegTipoVideoj.Location = new System.Drawing.Point(254, 9);
            this.labRegTipoVideoj.Name = "labRegTipoVideoj";
            this.labRegTipoVideoj.Size = new System.Drawing.Size(230, 20);
            this.labRegTipoVideoj.TabIndex = 0;
            this.labRegTipoVideoj.Text = "Registrar Tipos de Videojuegos";
            // 
            // labIdTipoVideoj
            // 
            this.labIdTipoVideoj.AutoSize = true;
            this.labIdTipoVideoj.Location = new System.Drawing.Point(50, 70);
            this.labIdTipoVideoj.Name = "labIdTipoVideoj";
            this.labIdTipoVideoj.Size = new System.Drawing.Size(233, 30);
            this.labIdTipoVideoj.TabIndex = 1;
            this.labIdTipoVideoj.Text = "Id tipo de videojuego";
            this.labIdTipoVideoj.Click += new System.EventHandler(this.label1_Click);
            // 
            // labNombreTipoVideoj
            // 
            this.labNombreTipoVideoj.AutoSize = true;
            this.labNombreTipoVideoj.Location = new System.Drawing.Point(50, 134);
            this.labNombreTipoVideoj.Name = "labNombreTipoVideoj";
            this.labNombreTipoVideoj.Size = new System.Drawing.Size(333, 30);
            this.labNombreTipoVideoj.TabIndex = 2;
            this.labNombreTipoVideoj.Text = "Nombre del tipo de videojuego";
            // 
            // labDescripTipoVideoj
            // 
            this.labDescripTipoVideoj.AutoSize = true;
            this.labDescripTipoVideoj.Location = new System.Drawing.Point(50, 195);
            this.labDescripTipoVideoj.Name = "labDescripTipoVideoj";
            this.labDescripTipoVideoj.Size = new System.Drawing.Size(374, 30);
            this.labDescripTipoVideoj.TabIndex = 3;
            this.labDescripTipoVideoj.Text = "Descripción del tipo de videojuego";
            // 
            // txtIdTipoVideoj
            // 
            this.txtIdTipoVideoj.Location = new System.Drawing.Point(384, 67);
            this.txtIdTipoVideoj.Name = "txtIdTipoVideoj";
            this.txtIdTipoVideoj.Size = new System.Drawing.Size(100, 26);
            this.txtIdTipoVideoj.TabIndex = 4;
            // 
            // txtNombreTipoVideoj
            // 
            this.txtNombreTipoVideoj.Location = new System.Drawing.Point(384, 131);
            this.txtNombreTipoVideoj.Name = "txtNombreTipoVideoj";
            this.txtNombreTipoVideoj.Size = new System.Drawing.Size(390, 26);
            this.txtNombreTipoVideoj.TabIndex = 5;
            // 
            // txtDescripTipoVideoj
            // 
            this.txtDescripTipoVideoj.Location = new System.Drawing.Point(384, 195);
            this.txtDescripTipoVideoj.Name = "txtDescripTipoVideoj";
            this.txtDescripTipoVideoj.Size = new System.Drawing.Size(390, 26);
            this.txtDescripTipoVideoj.TabIndex = 6;
            // 
            // btnGuardar
            // 
            this.btnGuardar.Location = new System.Drawing.Point(155, 316);
            this.btnGuardar.Name = "btnGuardar";
            this.btnGuardar.Size = new System.Drawing.Size(128, 46);
            this.btnGuardar.TabIndex = 7;
            this.btnGuardar.Text = "Guardar";
            this.btnGuardar.UseVisualStyleBackColor = true;
            this.btnGuardar.Click += new System.EventHandler(this.btnGuardar_Click);
            // 
            // btnSalir
            // 
            this.btnSalir.Location = new System.Drawing.Point(440, 316);
            this.btnSalir.Name = "btnSalir";
            this.btnSalir.Size = new System.Drawing.Size(143, 46);
            this.btnSalir.TabIndex = 8;
            this.btnSalir.Text = "Salir";
            this.btnSalir.UseVisualStyleBackColor = true;
            this.btnSalir.Click += new System.EventHandler(this.btnSalir_Click);
            // 
            // RegistrarTipoVideojuego
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(798, 447);
            this.Controls.Add(this.btnSalir);
            this.Controls.Add(this.btnGuardar);
            this.Controls.Add(this.txtDescripTipoVideoj);
            this.Controls.Add(this.txtNombreTipoVideoj);
            this.Controls.Add(this.txtIdTipoVideoj);
            this.Controls.Add(this.labDescripTipoVideoj);
            this.Controls.Add(this.labNombreTipoVideoj);
            this.Controls.Add(this.labIdTipoVideoj);
            this.Controls.Add(this.labRegTipoVideoj);
            this.Name = "RegistrarTipoVideojuego";
            this.Text = "RegistrarTipoVideojuego";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label labRegTipoVideoj;
        private System.Windows.Forms.Label labIdTipoVideoj;
        private System.Windows.Forms.Label labNombreTipoVideoj;
        private System.Windows.Forms.Label labDescripTipoVideoj;
        private System.Windows.Forms.TextBox txtIdTipoVideoj;
        private System.Windows.Forms.TextBox txtNombreTipoVideoj;
        private System.Windows.Forms.TextBox txtDescripTipoVideoj;
        private System.Windows.Forms.Button btnGuardar;
        private System.Windows.Forms.Button btnSalir;
    }
}