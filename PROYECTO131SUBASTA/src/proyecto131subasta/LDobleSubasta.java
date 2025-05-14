package proyecto131subasta;

public class LDobleSubasta {
    private NodoS p;

    public LDobleSubasta() {
        p = null;
    }

    public NodoS getP() {
        return p;
    }

    // Agregar al final
    public void adiFinal(NodoS nuevo) {
        if (p == null) {
            p = nuevo;
        } else {
            NodoS r = p;
            while (r.getSig() != null) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }

    // Agregar al inicio
    public void adicionarInicio(NodoS nuevo) {
        if (p == null) {
            p = nuevo;
        } else {
            nuevo.setSig(p);
            p.setAnt(nuevo);
            p = nuevo;
        }
    }

    // Eliminar primer elemento
    public void eliminarInicio() {
        if (p != null) {
            p = p.getSig();
            if (p != null) p.setAnt(null);
        }
    }

    // Eliminar último elemento
    public void eliminarFin() {
        if (p == null) return;
        if (p.getSig() == null) {
            p = null;
            return;
        }
        NodoS r = p;
        while (r.getSig() != null) {
            r = r.getSig();
        }
        r.getAnt().setSig(null);
    }

    // Eliminar por ID de Subasta
    public void eliminarPorId(int id) {
        if (p == null) return;
        if (p.getIdSubasta() == id) {
            eliminarInicio();
            return;
        }
        NodoS r = p;
        while (r != null && r.getIdSubasta() != id) {
            r = r.getSig();
        }
        if (r != null) {
            if (r.getSig() != null) r.getSig().setAnt(r.getAnt());
            if (r.getAnt() != null) r.getAnt().setSig(r.getSig());
        }
    }

    // Buscar subasta por ID
    public NodoS buscarPorId(int id) {
        NodoS r = p;
        while (r != null) {
            if (r.getIdSubasta() == id) return r;
            r = r.getSig();
        }
        return null;
    }

    // Mostrar todas las subastas
    public void mostrar() {
        NodoS r = p;
        while (r != null) {
            System.out.println("Subasta ID: " + r.getIdSubasta() +
                               ", Inicio: " + r.getFechaInicio() +
                               ", Cierre: " + r.getFechaCierre() +
                               ", Estado: " + r.getEstado());
            r = r.getSig();
        }
    }
}
