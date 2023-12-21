package org.estruturasJava.Listas;

import org.estruturasJava.No;

public class ListaEncadeadaImpl<T> implements ListaEncadeada<T>{

    private No<T> cabeca;

    public ListaEncadeadaImpl() {
    }

    public ListaEncadeadaImpl(No<T> cabeca) {
        this.cabeca = cabeca;
    }

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
            tamanho++;
            noPercorredo = noPercorredo.getProximoNo();
        }
        return tamanho;
    }

    @Override
    public No<T> adicionar(No<T> no) {
        if(estaVazia()){
           No<T> iniciandoCabeca = new No<>();
           cabeca = iniciandoCabeca;
           cabeca.setProximoNo(no);
        }

        No<T> segundoNo = cabeca;
        cabeca = no;
        cabeca.setProximoNo(segundoNo);
        return no;
    }

    @Override
    public No<T> adicionar(No no, int index) {
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
    public No<T> acessarNo(int index) {
        if(!validaNo(index)){
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamanho: " + tamanho());
        }

        No primeiroNo = cabeca;
        No percorrendoNo = new No();
        for (int i = 0; i < index; i++) {
            if(i == 0) {
                percorrendoNo = primeiroNo.getProximoNo();
            }
            percorrendoNo = percorrendoNo.getProximoNo();
        }
        return percorrendoNo;
    }

    private boolean validaNo(int index){
        if (!estaVazia()){
            return false;
        }

        if(index > tamanho()){
            return false;
        }
        return true;
    }
}
