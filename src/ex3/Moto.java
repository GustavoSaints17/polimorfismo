package ex3;


public class Moto extends Veiculo{

    Moto(String modelo){
        super(modelo);
    }

    @Override
    void acelerar(){
        velocidadeAtual += 10;
        System.out.println("DUM DUM");
        if (velocidadeAtual > 100){
            velocidadeAtual = 100;
        }
    }

}
