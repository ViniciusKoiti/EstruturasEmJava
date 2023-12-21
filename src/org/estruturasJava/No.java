package org.estruturasJava;

public class No<T> {

    private T conteudo;
    private No proximoNo;

    public No() {
    }

    public No(T conteudo) {
        this.conteudo = conteudo;
    }


    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        if (proximoNo == null) {
            return "No{" +
                    "conteudo=" + conteudo +
                    ", proximoNo= null" +
                    '}';
        }
        return "No{" +
                    "conteudo=" + conteudo +
                    ", proximoNo=" + proximoNo.toString() +
                '}';

    }
}
