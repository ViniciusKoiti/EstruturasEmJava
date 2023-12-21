import org.estruturasJava.Listas.ListaEncadeadaImpl;
import org.estruturasJava.No;

public class Main {
    public static void main(String[] args) {
        ListaEncadeadaImpl<Integer> listaEncadeada = new ListaEncadeadaImpl<>();
        listaEncadeada.adicionar(new No<>(1));
        listaEncadeada.adicionar(new No<>(2));
        listaEncadeada.adicionar(new No<>(3));

        // Acessando e imprimindo elementos
        System.out.println("Elemento no índice 0: " + listaEncadeada.acessarNo(0).getConteudo());
        System.out.println("Elemento no índice 1: " + listaEncadeada.acessarNo(1).getConteudo());
        System.out.println("Elemento no índice 2: " + listaEncadeada.acessarNo(2).getConteudo());

    }
}