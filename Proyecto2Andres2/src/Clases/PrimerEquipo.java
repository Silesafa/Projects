package Clases;
/* @author Andres Cespedes Siles
 */
public class PrimerEquipo extends Deportista{

    private double Peso;
    private double PorcentajeGrasa;
    
     public PrimerEquipo(){
     super();
     this.Peso = 0;
     this.PorcentajeGrasa= 0;
}

    public PrimerEquipo(String NombreJugador, int Numero, String Posicion, int Estatura, String TipoEntrenamiento,String Categoria, double PPeso, double PPorcentajeGrasa) {
        super(NombreJugador,Numero,Posicion,Estatura,TipoEntrenamiento,Categoria);
        
        this.Peso = PPeso;
        this.PorcentajeGrasa = PPorcentajeGrasa;
    }

        public double getPeso() {
        return Peso;
    }
        public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    public double getPorcentajeGrasa() {
        return PorcentajeGrasa;
    }
    public void setPorcentajeGrasa(double PorcentajeGrasa) {
        this.PorcentajeGrasa = PorcentajeGrasa;
    }
    
}
