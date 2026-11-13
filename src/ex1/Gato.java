package ex1;

import ex1.Zoologico;

public class Gato extends Zoologico {

    public Gato(String nome){
        super(nome);
    }

    @Override
    String emitirSom(){
        return "Miau";
    }

}