package proyecto131subasta;

public class NodoS {
    private int idSubasta;
    private String fechaInicio;
    private String fechaCierre;
    private String estado;
    private LSCategoriaSubasta categoriaSubastaX;
    private LDHistorialVentas historialVentas;
    private NodoS ant, sig;

    public NodoS(int id, String fechaInicio, String fechaCierre, String estado) {
        this.idSubasta = id;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.estado = estado;
        this.categoriaSubastaX = new LSCategoriaSubasta();
        this.historialVentas = new LDHistorialVentas();
        this.ant = null;
        this.sig = null;
    }

    // Getters
    public int getIdSubasta() { return idSubasta; }
    public String getFechaInicio() { return fechaInicio; }
    public String getFechaCierre() { return fechaCierre; }
    public String getEstado() { return estado; }
    public LSCategoriaSubasta getCategoriaSubastaX() { return categoriaSubastaX; }
    public LDHistorialVentas getHistorialVentas() { return historialVentas; }
    public NodoS getAnt() { return ant; }
    public NodoS getSig() { return sig; }

    // Setters
    public void setIdSubasta(int idSubasta) { this.idSubasta = idSubasta; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setFechaCierre(String fechaCierre) { this.fechaCierre = fechaCierre; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setAnt(NodoS ant) { this.ant = ant; }
    public void setSig(NodoS sig) { this.sig = sig; }
}

