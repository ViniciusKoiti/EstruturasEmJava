import org.estruturasJava.Listas.ListaEncadeadaImpl;
import org.estruturasJava.No;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaImpl<Integer> lista = new ListaEncadeadaImpl<>();

        // Testando adição de elementos
        System.out.println("Adicionando elementos...");
        lista.adicionar(new No<>(1)); // Adiciona no início
        lista.adicionar(new No<>(3), 1); // Adiciona no índice 1
        lista.adicionar(new No<>(2), 1); // Adiciona no índice 1, empurrando o 3 para trás
        lista.adicionar(new No<>(4), lista.tamanho()); // Adiciona no final

        exibirLista(lista);

        // Testando remoção de elementos
        System.out.println("\nRemovendo elementos...");
        lista.removerNo(0); // Remove o primeiro elemento
        lista.removerNo(lista.tamanho() - 1); // Remove o último elemento
        // Remover um elemento no meio (se houver)
        if (lista.tamanho() > 1) {
            lista.removerNo(1);
        }

        exibirLista(lista);
    }

    private static void exibirLista(ListaEncadeadaImpl<Integer> lista) {
        System.out.println("Tamanho da lista: " + lista.tamanho());
        for (int i = 0; i < lista.tamanho(); i++) {
            No<Integer> noAtual = lista.acessarNo(i);
            System.out.println("Elemento no índice " + i + ": " + noAtual.getConteudo());
        }
    }
}
