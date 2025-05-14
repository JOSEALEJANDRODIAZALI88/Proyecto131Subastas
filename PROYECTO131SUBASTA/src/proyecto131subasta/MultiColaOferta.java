package proyecto131subasta;

public class MultiColaOferta {
    private int n;
    private COfertaRealizada[] v;

    public MultiColaOferta() {
        n = 0;
        v = new COfertaRealizada[50]; // Capacidad máxima de colas
        for (int i = 0; i < 50; i++) {
            v[i] = new COfertaRealizada();
        }
    }

    public boolean esVacia(int i) {
        return v[i].esVacia();
    }

    public boolean esLlena(int i) {
        return v[i].esLlena();
    }

    public int nroElem(int i) {
        return v[i].nroElem();
    }

    public void eliminar(int i) {
        v[i].eliminar();
    }

    public void adicionar(int i, COfertaRealizada x) {
        if (!esLlena(i)) {
            v[i] = x;
        } else {
            System.out.println("La cola en la posición " + i + " está llena.");
        }
    }

    public void mostrar() {
        for (int i = 0; i < n; i++) {
            System.out.println("Cola " + (i + 1) + ":");
            v[i].mostrar();
        }
    }

    public void vaciar(COfertaRealizada z) {
        for (int i = 0; i < n; i++) {
            v[i] = z;
        }
    }

    public void vaciar(int i, COfertaRealizada z) {
        if (i >= 0 && i < v.length) {
            v[i] = z;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}
