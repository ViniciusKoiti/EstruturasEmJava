package org.estruturasJava.Listas;

import org.estruturasJava.No;

public class ListaEncadeadaImpl implements ListaEncadeada{

    private No cabeca;
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
        No noPercorredo = cabeca;
        while (noPercorredo != null){
            tamanho++;
            noPercorredo = noPercorredo.getProximoNo();
        }
        return tamanho;
    }

    @Override
    public No adicionar(No no) {
        No segundoNo = cabeca;
        cabeca = no;
        cabeca.setProximoNo(segundoNo);
        return no;
    }

    @Override
    public No adicionar(No no, int index) {
        return null;
    }

    @Override
    public No removerNo() {
        return null;
    }

    @Override
    public No removerNo(int index) {
        return null;
    }

    @Override
    public No acessarNo(int index) {
        return null;
    }
}
