package br.com.devairon.generics;

public class Box<T> {
    /*
    * PARA QUESTIONAMENTO FUTURO
    * Essa abordagem fere os princípios do clean code e SOLID?
    * fazer pesquisa futura para encontrar a resposta.
    * */
    private T t;

    Box(T t){
        this.t = t;
    }
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }



}
