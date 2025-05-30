package parcial;


public class Cargueros extends Naves{
    
    private double capacidadCarga;

    public Cargueros(double capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }
    
    
    
}
