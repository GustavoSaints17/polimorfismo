public class Vaca extends Animal {

    public Vaca(String nome){
        super(nome);
    }

    @Override
    String emitirSom(){
        return "Muuu";
    }

}