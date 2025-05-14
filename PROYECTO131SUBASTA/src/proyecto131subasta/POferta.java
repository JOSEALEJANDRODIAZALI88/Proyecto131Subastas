package proyecto131subasta;

public class POferta {
    private int tope;
    private final int max = 50;
    private Oferta[] v;

    public POferta() {
        tope = -1;
        v = new Oferta[max];
    }

    public boolean esVacia() {
        return tope == -1;
    }

    public boolean esLlena() {
        return tope == max - 1;
    }

    public void adiFinal(Oferta x) {
        if (!esLlena()) {
            v[++tope] = x;
        } else {
            System.out.println("Pila de ofertas llena.");
        }
    }

    public Oferta eliFinal() {
        if (!esVacia()) {
            return v[tope--];
        } else {
            System.out.println("Pila de ofertas vacía.");
            return null;
        }
    }

    public void mostrar() {
        for (int i = 0; i <= tope; i++) {
            v[i].mostrar();
        }
    }
}
