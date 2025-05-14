package proyecto131subasta;

public class Main {
    public static void main(String[] args) {
        // SUBASTAS
        LDobleSubasta subastas = new LDobleSubasta();
        subastas.adiFinal(new NodoS(1, "01/06/2025", "10/06/2025", "Abierta"));
        subastas.adiFinal(new NodoS(2, "05/06/2025", "12/06/2025", "Cerrada"));
        subastas.adiFinal(new NodoS(3, "10/06/2025", "20/06/2025", "Abierta"));
        subastas.adiFinal(new NodoS(4, "15/06/2025", "25/06/2025", "Cerrada"));
        subastas.adiFinal(new NodoS(5, "20/06/2025", "30/06/2025", "Abierta"));

        System.out.println("SUBASTAS");
        subastas.mostrar();

        // CATEGORÍAS
        LSCategoriaSubasta categorias = new LSCategoriaSubasta();
        categorias.adiFinal(new NodoC("Pintura"));
        categorias.adiFinal(new NodoC("Escultura"));
        categorias.adiFinal(new NodoC("Fotografia"));
        categorias.adiFinal(new NodoC("Ceramica"));
        categorias.adiFinal(new NodoC("Digital"));

        System.out.println("\nCATEGORiAS");
        categorias.mostrar();

        // PARTICIPANTES
        LSCircularParticipante participantes = new LSCircularParticipante();
        participantes.adiFinal(new NodoP(1, "Juan Perez", "juan@mail.com"));
        participantes.adiFinal(new NodoP(2, "Maria Gomez", "maria@mail.com"));
        participantes.adiFinal(new NodoP(3, "Carlos Ruiz", "carlos@mail.com"));
        participantes.adiFinal(new NodoP(4, "Ana Torres", "ana@mail.com"));
        participantes.adiFinal(new NodoP(5, "Luis Mejia", "luis@mail.com"));

        System.out.println("\nPARTICIPANTES");
        participantes.mostrar();

        // HISTORIAL VENTAS
        LDHistorialVentas historialVentas = new LDHistorialVentas();
        historialVentas.adiFinal(new NodoHV("Obra1", "Juan Perez", 10000, "01/06/2025"));
        historialVentas.adiFinal(new NodoHV("Obra2", "Maria Gomez", 15000, "02/06/2025"));
        historialVentas.adiFinal(new NodoHV("Obra3", "Carlos Ruiz", 20000, "03/06/2025"));
        historialVentas.adiFinal(new NodoHV("Obra4", "Ana Torres", 25000, "04/06/2025"));
        historialVentas.adiFinal(new NodoHV("Obra5", "Luis Mejia", 30000, "05/06/2025"));

        System.out.println("\nHISTORIAL DE VENTAS");
        historialVentas.mostrar();

        // OFERTAS (Pila)
        POferta ofertas = new POferta();
        ofertas.adiFinal(new Oferta(1, 12000, "01/06/2025"));
        ofertas.adiFinal(new Oferta(2, 18000, "02/06/2025"));
        ofertas.adiFinal(new Oferta(3, 25000, "03/06/2025"));
        ofertas.adiFinal(new Oferta(4, 30000, "04/06/2025"));
        ofertas.adiFinal(new Oferta(5, 35000, "05/06/2025"));

        System.out.println("\nOFERTAS");
        ofertas.mostrar();

        // HISTORIAL PARTICIPACIÓN
        LSHistorialParticipacion historialPart = new LSHistorialParticipacion();
        historialPart.adiFinal(new NodoHP(1, "Obra1", "Pintura", 15000, "Ganada"));
        historialPart.adiFinal(new NodoHP(2, "Obra2", "Escultura", 20000, "Ganada"));
        historialPart.adiFinal(new NodoHP(3, "Obra3", "Fotografia", 25000, "Ganada"));
        historialPart.adiFinal(new NodoHP(4, "Obra4", "Ceramica", 30000, "Perdida"));
        historialPart.adiFinal(new NodoHP(5, "Obra5", "Digital", 35000, "Ganada"));

        System.out.println("\nHISTORIAL DE PARTICIPACION");
        historialPart.mostrar();
    }
}
