public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    String emitirSom(){
        return "Au Au";
    }

}
