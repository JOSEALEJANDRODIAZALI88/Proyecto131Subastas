package proyecto131subasta;

public class OfertaParticipante {
    private int idObra;
    private int montoOfertado;
    private String fecha;

    public OfertaParticipante(int idObra, int montoOfertado, String fecha) {
        this.idObra = idObra;
        this.montoOfertado = montoOfertado;
        this.fecha = fecha;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public int getMontoOfertado() {
        return montoOfertado;
    }

    public void setMontoOfertado(int montoOfertado) {
        this.montoOfertado = montoOfertado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void mostrar() {
        System.out.println("Obra: " + idObra + " | Monto: " + montoOfertado + " | Fecha: " + fecha);
    }
}
