package Clases;



import java.util.Date;

/**
 *
 * @author Andres Cespedes Siles
 */
public abstract class Deportista {
    
   protected String NombreJugador;
   protected int Numero;
   protected double Estatura;
   protected String Posicion;
   protected String TipoEntrenamiento;
   protected String Categoria;
   
   //constructor vacio
   public Deportista ()
   {
      
    this.NombreJugador = "";
    this.Numero = 0;
    this.Posicion = "";
    this.Estatura=0;
    this.TipoEntrenamiento = "";
    this.Categoria = "";

   }
   
   //constructor sobrecargado
   
   public Deportista(String PNombreJugador, int PNumero, String PPosicion, int PEstatura, String PTipoEntrenamiento,String PCategoria)
   {
    this.NombreJugador = PNombreJugador;
    this.Numero = PNumero;
    this.Posicion = PPosicion;
    this.Estatura= PEstatura;
    this.TipoEntrenamiento = PTipoEntrenamiento;
    this.Categoria = PCategoria;
       
   }
       //metodos set/get

   

    public String getNombreJugador() {
      return NombreJugador;      
    }

    public void setNombreJugador(String NombreJugador) {
       this.NombreJugador = NombreJugador;
        
    }

    public int getNumero() {         
      return Numero;
    }

    public void setNumero(int Numero) {
       this.Numero = Numero;
       
    }

    public String getPosicion() {
        return Posicion;
    }

     public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }
        public void setTipoEntrenamiento(String TipoEntrenamiento) {
        this.TipoEntrenamiento = TipoEntrenamiento;
    }
            public String getTipoEntrenamiento() {
        return TipoEntrenamiento;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    public String getCategoria() {
        return Categoria;
    }
    
    


    @Override
    public String toString() {
        return "Jugador:\n " + "NombreJugador=" + NombreJugador + "\n Numero=" + Numero + "\n Estatura=" + Estatura + " centimetros, "+ "\n  Tipo de Entrenamiento "+ TipoEntrenamiento + "\n Posicion=" + Posicion + "\n";
    }

    void setFechaActual(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 }