package proyecto131subasta;

public class LSHistorialParticipacion {
    private NodoHP p;
    
    public NodoHP getP() {
        return p;
    }

    public LSHistorialParticipacion() {
        p = null;
    }

    public void eliFin() {
        if (p != null) {
            if (p.getSig() == null) {
                p = null;
            } else {
                NodoHP r = p;
                while (r.getSig().getSig() != null) {
                    r = r.getSig();
                }
                r.setSig(null);
            }
        }
    }

    public void eliPrincipio() {
        if (p != null) {
            p = p.getSig();
        }
    }

    public void adiPrincipio(NodoHP x) {
        x.setSig(p);
        p = x;
    }

    public void adiFinal(NodoHP x) {
        if (p == null) {
            p = x;
        } else {
            NodoHP r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(x);
        }
        x.setSig(null);
    }

    public void mostrar() {
        NodoHP r = p;
        while (r != null) {
            System.out.println("ID Obra: " + r.getIdObra() + 
                               ", Nombre: " + r.getNombre() + 
                               ", Categoria: " + r.getCategoria() + 
                               ", Monto Max Oferta: " + r.getMontoMaxOferta() + 
                               ", Estado Oferta: " + r.getEstadoOferta());
            r = r.getSig();
        }
    }

    
}
