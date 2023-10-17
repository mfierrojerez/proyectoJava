
package sistemapeaje.vehiculos;


public class Camion extends Vehiculo {
    
    private int numEjes;
    
    public Camion(String placa, int numEjes){
        super(placa);
        this.numEjes=numEjes;
    }
    
    public int calcularPeaje(){
        return 5000 * numEjes;
    }
    
}
