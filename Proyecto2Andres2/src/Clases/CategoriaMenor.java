package Clases;
/* @author Andres Cespedes Siles
 */
public class CategoriaMenor extends Deportista {
    private String DescripcionCategoria;
    
    public CategoriaMenor(){
     super();
     this.DescripcionCategoria = "";
    }

    public CategoriaMenor(String NombreJugador, int Numero, String Posicion, int Estatura, String TipoEntrenamiento,String Categoria,String PDescripcionCategoria) {
        super(NombreJugador,Numero,Posicion,Estatura,TipoEntrenamiento,Categoria);
        
        this.DescripcionCategoria = PDescripcionCategoria;
    }
    
    public String getDescripcionCategoria() {
        return DescripcionCategoria;
    }
    public void setDescripcionCategoria(String DescripcionCategoria) {
        this.DescripcionCategoria = DescripcionCategoria;
    }
    
}
 