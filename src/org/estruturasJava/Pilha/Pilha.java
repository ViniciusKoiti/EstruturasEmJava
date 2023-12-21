package org.estruturasJava.Pilha;

import org.estruturasJava.No;

public interface Pilha<T> {

    boolean estaVazia();

    int tamanho();

    No<T> empilhar(No<T> no);

    No<T> desempilhar();

    No<T> verTopo();

}
