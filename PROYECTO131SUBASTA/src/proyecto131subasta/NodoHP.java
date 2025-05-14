package proyecto131subasta;

public class NodoHP {
    private int idObra;
    private String nombre;
    private String categoria;
    private int montoMaxOferta;
    private String estadoOferta;
    private NodoHP sig;

    public NodoHP() {
        sig = null;
    }

    public NodoHP(int idObra, String nombre, String categoria, int montoMaxOferta, String estadoOferta) {
        this.idObra = idObra;
        this.nombre = nombre;
        this.categoria = categoria;
        this.montoMaxOferta = montoMaxOferta;
        this.estadoOferta = estadoOferta;
        this.sig = null;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getMontoMaxOferta() {
        return montoMaxOferta;
    }

    public void setMontoMaxOferta(int montoMaxOferta) {
        this.montoMaxOferta = montoMaxOferta;
    }

    public String getEstadoOferta() {
        return estadoOferta;
    }

    public void setEstadoOferta(String estadoOferta) {
        this.estadoOferta = estadoOferta;
    }

    public NodoHP getSig() {
        return sig;
    }

    public void setSig(NodoHP sig) {
        this.sig = sig;
    }
}
