package Clases;

/**
 *
 * @author Andres Cespedes Siles
 */
public class Entrenamiento {
    
    
   private String CodigoEntrenamiento;
   private String Descripcion;
   private String CategoriaEntrenamiento;
   

//constructor vacio
   public Entrenamiento ()
   {
      
    this.CodigoEntrenamiento = "";
    this.Descripcion = "";
    this.CategoriaEntrenamiento = "";
   
   } 
   
     //Constructor Sobrecargado
    public Entrenamiento(String PCodigoEntrenamiento,String PDescripcion,String PCategoriaEntrenamiento)
   {
    this.CodigoEntrenamiento = PCodigoEntrenamiento;
    this.Descripcion = PDescripcion;  
    this.CategoriaEntrenamiento = PCategoriaEntrenamiento;
 
       
   }
   

    public void setCodigoEntrenamiento(String CodigoEntrenamiento) {
        this.CodigoEntrenamiento = CodigoEntrenamiento;
    }
    public String getCodigoEntrenamiento() {
        return CodigoEntrenamiento;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
     public String getDescripcion() {
        return Descripcion;
    }

    public void setCategoriaEntrenamiento(String CategoriaEntrenamiento) {
        this.CategoriaEntrenamiento = CategoriaEntrenamiento;
    }

    public String getCategoriaEntrenamiento() {
        return CategoriaEntrenamiento;
    } 
 
   }
