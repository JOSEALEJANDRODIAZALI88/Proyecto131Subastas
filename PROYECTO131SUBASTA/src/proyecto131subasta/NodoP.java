package proyecto131subasta;

public class NodoP {
    private int idParticipante;
    private String nombre;
    private String correo;
    private MultiColaOferta C;
    private LSHistorialParticipacion D;
    private NodoP sig;

    public NodoP(int id, String nombre, String correo) {
        this.idParticipante = id;
        this.nombre = nombre;
        this.correo = correo;
        this.C = new MultiColaOferta();
        this.D = new LSHistorialParticipacion();
        this.sig = null;
    }

    // Getters
    public int getIdParticipante() {
        return idParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public MultiColaOferta getC() {
        return C;
    }

    public LSHistorialParticipacion getD() {
        return D;
    }

    public NodoP getSig() {
        return sig;
    }

    // Setters
    public void setSig(NodoP sig) {
        this.sig = sig;
    }
}
