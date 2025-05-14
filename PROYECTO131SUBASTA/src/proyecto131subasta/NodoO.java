package proyecto131subasta;

public class NodoO {
    private int idObra;
    private String nombre;
    private String artista;
    private int anio;
    private double precioBase;
    private String estado;
    private String tipo;
    private POferta B;
    private NodoO sig, ant;

    public NodoO(int idObra, String nombre, String artista, int anio, double precioBase, String estado, String tipo) {
        this.idObra = idObra;
        this.nombre = nombre;
        this.artista = artista;
        this.anio = anio;
        this.precioBase = precioBase;
        this.estado = estado;
        this.tipo = tipo;
        this.B = new POferta();
        this.sig = null;
        this.ant = null;
    }

    // Getters
    public int getIdObra() {
        return idObra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    public POferta getOfertas() {
        return B;
    }

    public NodoO getSig() {
        return sig;
    }

    public NodoO getAnt() {
        return ant;
    }

    // Setters
    public void setSig(NodoO sig) {
        this.sig = sig;
    }

    public void setAnt(NodoO ant) {
        this.ant = ant;
    }
}
