package vehiculos;
import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public Pais getPais() {
        return this.pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public static Fabricante fabricaMayorVentas() {
        Map<Fabricante, Integer> diccionario = new HashMap<>();
        for (Vehiculo V : Vehiculo.listadoVehiculos) {
            Fabricante fabricante = V.getFabricante();
            if (diccionario.containsKey(fabricante)) {
                int valorActual = diccionario.get(fabricante);
                diccionario.put(fabricante, valorActual + 1);
            } else {
                diccionario.put(fabricante, 1);
            }
        }
        Fabricante fabricanteMayorVentas = null;
        int ventasMaximas = 0;
        
        for (Map.Entry<Fabricante, Integer> entry : diccionario.entrySet()) {
            Fabricante fabricante = entry.getKey();
            int ventas = entry.getValue();
            if (ventas > ventasMaximas) {
                ventasMaximas = ventas;
                fabricanteMayorVentas = fabricante;
            }
        }
        return fabricanteMayorVentas;
    }
}
