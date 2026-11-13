package ex1;

import ex1.Zoologico;

public class Vaca extends Zoologico {

    public Vaca(String nome){
        super(nome);
    }

    @Override
    String emitirSom(){
        return "Muuu";
    }

}