package org.estruturasJava.Listas;

import org.estruturasJava.No;

import java.util.NoSuchElementException;

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
            cabeca = no;
            return no;
        }

        No<T> segundoNo = cabeca;
        cabeca = no;
        cabeca.setProximoNo(segundoNo);
        return no;
    }

    @Override
    public No<T> adicionar(No no, int index) {
        if(!validaNo(index)){
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamanho: " + tamanho());
        }



        return null;
    }

    @Override
    public No<T> removerNo() {
        if(estaVazia()) {
            throw new NoSuchElementException("Não é possível remover de uma lista vazia.");
        }
        if(tamanho() == 1){
            No<T> cloneNoCabeca = new No<>();
            cloneNoCabeca.setConteudo(cabeca.getConteudo());
            cabeca = null;
            return cloneNoCabeca;
        }
        No<T> penultimoNo = acessarNo(tamanho() - 1);
        No<T> ultimoNo = acessarNo(tamanho());
        penultimoNo.setProximoNo(null);
        return ultimoNo;
    }

    @Override
    public No<T> removerNo(int index) {
        if(!validaNo(index)){
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamanho: " + tamanho());
        }

        if(index == tamanho() - 1){
            return removerNo();
        }

        if(index == 0){
            No<T> noAcessado = acessarNo(index);
            No<T> proximoNo = acessarNo(index + 1);
            cabeca.setProximoNo(proximoNo);
            noAcessado.setProximoNo(null);
            return noAcessado;
        }

        No<T> noAnteriorAcessado = acessarNo(index - 1);
        No<T> noAcessado = acessarNo(index);
        No<T> noPosteriorAcessado = acessarNo(index + 1);

        noAnteriorAcessado.setProximoNo(noPosteriorAcessado);
        noAcessado.setProximoNo(null);

        return noAcessado;
    }

    @Override
    public No<T> acessarNo(int index) {
        if(!validaNo(index)){
            throw new IndexOutOfBoundsException("Índice: " + index + ", Tamanho: " + tamanho());
        }
        No<T> primeiroNo = cabeca;
        for (int i = 0; i < index; i++) {
            primeiroNo = primeiroNo.getProximoNo();
        }
        return primeiroNo;
    }

    private boolean validaNo(int index){
        if (estaVazia()){
            return false;
        }

        return index <= tamanho();
    }

}
