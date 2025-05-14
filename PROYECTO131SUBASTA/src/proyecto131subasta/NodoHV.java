package proyecto131subasta;
public class NodoHV {
    private String obra;
    private String comprador;
    private double precioFinal;
    private String fecha;
    private NodoHV sig;

    public NodoHV(String obra, String comprador, double precioFinal, String fecha) {
        this.obra = obra;
        this.comprador = comprador;
        this.precioFinal = precioFinal;
        this.fecha = fecha;
        this.sig = null;
    }

    // Getters
    public String getObra() {
        return obra;
    }

    public String getComprador() {
        return comprador;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public String getFecha() {
        return fecha;
    }

    public NodoHV getSig() {
        return sig;
    }

    // Setters
    public void setSig(NodoHV sig) {
        this.sig = sig;
    }
}
