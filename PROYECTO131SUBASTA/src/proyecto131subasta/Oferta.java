package proyecto131subasta;

public class Oferta {
    private int idParticipante;
    private double monto;
    private String fecha;

    public Oferta(int idParticipante, double monto, String fecha) {
        this.idParticipante = idParticipante;
        this.monto = monto;
        this.fecha = fecha;
    }

    // Getters
    public int getIdParticipante() {
        return idParticipante;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void mostrar() {
        System.out.println("ID Participante: " + idParticipante + 
                           ", Monto: " + monto + 
                           ", Fecha: " + fecha);
    }
}
