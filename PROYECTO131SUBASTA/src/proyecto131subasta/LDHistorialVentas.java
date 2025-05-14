package proyecto131subasta;


public class LDHistorialVentas {
    private NodoHV p;

    public LDHistorialVentas() {
        p = null;
    }

    public void eliFin() {
        if (p == null) return;
        if (p.getSig() == null) {
            p = null;
            return;
        }
        NodoHV r = p;
        while (r.getSig().getSig() != null) {
            r = r.getSig();
        }
        r.setSig(null);
    }

    public void eliInicio() {
        if (p != null) {
            p = p.getSig();
        }
    }

    public void adiPrincipio(NodoHV x) {
        x.setSig(p);
        p = x;
    }

    public void adiFinal(NodoHV x) {
        if (p == null) {
            p = x;
        } else {
            NodoHV r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(x);
        }
    }

    public void mostrar() {
        NodoHV r = p;
        while (r != null) {
            System.out.println("Obra: " + r.getObra() + ", Comprador: " + r.getComprador() + ", Precio Final: " + r.getPrecioFinal() + ", Fecha: " + r.getFecha());
            r = r.getSig();
        }
    }
}
