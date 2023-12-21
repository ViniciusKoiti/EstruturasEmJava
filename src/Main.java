import org.estruturasJava.Listas.ListaEncadeadaImpl;
import org.estruturasJava.No;

public class Main {
    public static void main(String[] args) {
        No<String> no = new No<>("Teste");
        No<String> segundoNo = new No<>("Teste1");
        no.setProximoNo(segundoNo);
        ListaEncadeadaImpl<String> listaEncadeada = new ListaEncadeadaImpl<>();
        listaEncadeada.adicionar(no);
        listaEncadeada.adicionar(segundoNo);
        No primeiroNo = listaEncadeada.acessarNo(1);
        System.out.println(primeiroNo.toString());



    }
}