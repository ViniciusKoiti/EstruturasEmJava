package org.estruturasJava.Pilha;

import org.estruturasJava.No;

import java.util.NoSuchElementException;

public class PilhaImpl<T> implements Pilha<T>{

    private No<T> cabeca;
    @Override
    public boolean estaVazia() {
        if(cabeca == null){
            return true;
        }
        return false;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;
        No<T> noPercorredo = cabeca;
        while (noPercorredo != null){
            noPercorredo = noPercorredo.getProximoNo();
            tamanho++;
        }
        return tamanho;
    }

    @Override
    public No<T> empilhar(No<T> no) {
        if(estaVazia()){
            cabeca = no;
            return no;
        }
        No<T> segundoNo = cabeca;
        cabeca = no;
        cabeca.setProximoNo(segundoNo);
        return no;
    }

    @Override
    public No<T> desempilhar() {
        if(estaVazia()){
            throw new NoSuchElementException("Não é possível remover de uma lista vazia.");
        }
        if(tamanho() == 1){
            No<T> copiaCabeca = new No<>();
            copiaCabeca.setConteudo(cabeca.getConteudo());
            cabeca = null;
            return copiaCabeca;
        }
        No<T> copiaCabeca = new No<>();
        copiaCabeca.setConteudo(cabeca.getConteudo());
        cabeca = cabeca.getProximoNo();
        return copiaCabeca;
    }

    @Override
    public No<T> verTopo() {
        return cabeca;
    }
}
