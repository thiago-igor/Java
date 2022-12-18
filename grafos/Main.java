package grafos;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("A");
        grafo.adicionarVertice("B");
        grafo.adicionarVertice("C");
        grafo.adicionarVertice("D");
        grafo.adicionarVertice("E");
        
        grafo.adicionarAresta("A", "B");
        grafo.adicionarAresta("B", "C");
        grafo.adicionarAresta("C", "D");
        grafo.adicionarAresta("D", "A");
        grafo.adicionarAresta("A", "E");
        grafo.adicionarAresta("B", "E");
        grafo.adicionarAresta("C", "E");
        grafo.adicionarAresta("D", "E");
        
        System.out.println("Grafo Roda");
    }
}
