package vehiculos;

public class Pais {
    private String nombre;
    public Pais(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public static Pais paisMasVendedor() {
        return;
    }
}
