package ex1;

class Zoologico {
    private String nome;

    Zoologico(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    String emitirSom(){
        return "...";
    }

    String apresentar(){
        return getNome() + " faz " + emitirSom();
    }


}