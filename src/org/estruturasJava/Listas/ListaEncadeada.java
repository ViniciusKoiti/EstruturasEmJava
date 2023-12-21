package org.estruturasJava.Listas;

import org.estruturasJava.No;

public interface ListaEncadeada<T> {
    
    boolean estaVazia();
    
    int tamanho();
    
    No<T> adicionar(No<T> no);

    No<T> adicionar(No<T> no, int index);

    No<T> removerNo();

    No<T> removerNo(int index);

    No<T> acessarNo(int index);
    
    

}
