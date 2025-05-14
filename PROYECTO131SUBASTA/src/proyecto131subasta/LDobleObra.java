package proyecto131subasta;

public class LDobleObra {
    private NodoO p;

    public LDobleObra() {
        p = null;
    }

    public void eliFin() {
        if (p == null) return;
        if (p.getSig() == null) {
            p = null;
            return;
        }
        NodoO r = p;
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

    public void adiPrincipio(NodoO x) {
        x.setSig(p);
        if (p != null) p.setAnt(x);
        p = x;
    }

    public void adiFinal(NodoO x) {
        if (p == null) {
            p = x;
        } else {
            NodoO r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(x);
            x.setAnt(r);
        }
    }

    public void mostrar() {
        NodoO r = p;
        while (r != null) {
            System.out.println("Obra: " + r.getNombre() + ", Artista: " + r.getArtista() + ", Precio Base: " + r.getPrecioBase());
            r = r.getSig();
        }
    }
}
