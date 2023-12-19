package org.estruturasJava.Listas;

import org.estruturasJava.No;

public interface ListaEncadeada {
    
    boolean estaVazia();
    
    int tamanho();
    
    No adicionar(No no);
    
    No adicionar(No no, int index);
    
    No removerNo();
    
    No removerNo(int index);
    
    No acessarNo(int index);
    
    

}
