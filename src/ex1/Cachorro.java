package ex1;

import ex1.Zoologico;

public class Cachorro extends Zoologico {

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    String emitirSom(){
        return "Au Au";
    }

}
