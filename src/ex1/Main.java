package ex1;

import ex1.Zoologico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Zoologico> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex"));
        animais.add(new Gato("Mimi"));
        animais.add(new Vaca("Mimosa"));
        animais.add(new Zoologico("Bicho"));

        for (Zoologico a : animais){
            System.out.println(a.apresentar());
        }

    }

}