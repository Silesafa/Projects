using System.Linq;
using Entidades;


namespace AccesoDatos
{
        public class TipoVideoJuego
        {
            private static TipoVideoJuego[] tipos = new TipoVideoJuego[10];
            private static int contador = 0;

            public string Agregar(TipoVideoJuego nuevo)
            {
                if (contador >= tipos.Length)
                    return "No se pueden ingresar más registros.";

                foreach (var tipo in tipos)
                {
                    if (tipo != null && tipo.Id == nuevo.Id)
                        return "Ya existe un tipo de videojuego con ese ID.";
                }

                tipos[contador++] = nuevo;
                return "Registro ingresado correctamente.";
            }

            public TipoVideoJuego[] ObtenerTodos()
            {
                return tipos.Where(t => t != null).ToArray();
            }
        }
    }

}
