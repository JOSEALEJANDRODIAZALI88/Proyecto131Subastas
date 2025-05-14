package proyecto131subasta;

public class NodoC {
    private String tipoObra;
    private LDobleObra A; // Lista de Obras
    private NodoC sig;

    public NodoC(String tipoObra) {
        this.tipoObra = tipoObra;
        this.A = new LDobleObra();
        this.sig = null;
    }

    // Getters
    public String getTipoObra() {
        return tipoObra;
    }

    public LDobleObra getObras() {
        return A;
    }

    public NodoC getSig() {
        return sig;
    }

    // Setters
    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }
}
