package proyecto131subasta;

public class COfertaRealizada {
    private int max;
    private OfertaParticipante[] v;
    private int ini, fin;

    public COfertaRealizada() {
        this.max = 50;
        this.v = new OfertaParticipante[max + 1]; 
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacia() {
        return ini == fin;
    }

    public boolean esLlena() {
        return (fin + 1) % (max + 1) == ini;
    }
    public int nroElem() {
        return (fin - ini + v.length) % v.length;
    }

    public void adicionar(OfertaParticipante x) {
        if (!esLlena()) {
            v[fin] = x;
            fin = (fin + 1) % (max + 1);
        } else {
            System.out.println("Cola llena.");
        }
    }

    public void eliminar() {
        if (!esVacia()) {
            ini = (ini + 1) % (max + 1);
        } else {
            System.out.println("Cola vacía.");
        }
    }

    public void mostrar() {
        int k = ini;
        while (k != fin) {
            v[k].mostrar();
            k = (k + 1) % (max + 1);
        }
    }

    public void vaciar(OfertaParticipante z) {
        while (!esVacia()) {
            eliminar();
        }
    }
}
