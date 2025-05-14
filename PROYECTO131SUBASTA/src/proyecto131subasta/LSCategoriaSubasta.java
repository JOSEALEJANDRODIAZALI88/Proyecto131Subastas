package proyecto131subasta;

public class LSCategoriaSubasta {
    private NodoC p;

    public LSCategoriaSubasta() {
        p = null;
    }

    public void eliFin() {
        if (p == null) return;
        if (p.getSig() == null) {
            p = null;
            return;
        }
        NodoC r = p;
        while (r.getSig().getSig() != null) {
            r = r.getSig();
        }
        r.setSig(null);
    }

    public void eliPrincipio() {
        if (p != null) {
            p = p.getSig();
        }
    }

    public void adiPrincipio(NodoC x) {
        x.setSig(p);
        p = x;
    }

    public void adiFinal(NodoC x) {
        if (p == null) {
            p = x;
        } else {
            NodoC r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(x);
        }
    }

    public void mostrar() {
        NodoC r = p;
        while (r != null) {
            System.out.println("Categoria: " + r.getTipoObra());
            r = r.getSig();
        }
    }
}
