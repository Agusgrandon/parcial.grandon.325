
package parcial;

import java.util.ArrayList;

public class CruceroEstelar extends Naves{
    
    private int cantidadPasajeros;

    public CruceroEstelar(int cantidadPasajeros, String nombre, int capacidadTripulacion, int anioLanzamiento, ArrayList<Nave> naves) {
        super(nombre, capacidadTripulacion, anioLanzamiento, naves);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    
    
}
