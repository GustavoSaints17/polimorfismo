public class Gato extends Animal {

    public Gato(String nome){
        super(nome);
    }

    @Override
    String emitirSom(){
        return "Miau";
    }

}