package proyecto131subasta;

public class LSCircularParticipante {
    private NodoP p;

    public LSCircularParticipante() {
        p = null;
    }

    public NodoP getP() {
        return p;
    }

    public void adiFinal(NodoP nuevo) {
        if (p == null) {
            p = nuevo;
            p.setSig(p);
        } else {
            NodoP r = p;
            while (r.getSig() != p) {
                r = r.getSig();
            }
            r.setSig(nuevo);
            nuevo.setSig(p);
        }
    }

    public void eliInicio() {
        if (p != null) {
            if (p.getSig() == p) {
                p = null;
            } else {
                NodoP r = p;
                while (r.getSig() != p) {
                    r = r.getSig();
                }
                p = p.getSig();
                r.setSig(p);
            }
        }
    }

    public void eliFin() {
        if (p != null) {
            if (p.getSig() == p) {
                p = null;
            } else {
                NodoP r = p;
                while (r.getSig().getSig() != p) {
                    r = r.getSig();
                }
                r.setSig(p);
            }
        }
    }

    public void mostrar() {
        if (p != null) {
            NodoP r = p;
            do {
                System.out.println("Participante ID: " + r.getIdParticipante() +
                                   ", Nombre: " + r.getNombre() +
                                   ", Correo: " + r.getCorreo());
                r = r.getSig();
            } while (r != p);
        } else {
            System.out.println("Lista vacía.");
        }
    }
}
