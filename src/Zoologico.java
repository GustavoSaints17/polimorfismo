class Animal {
    private String nome;

    Animal(String nome){
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