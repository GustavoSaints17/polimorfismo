package ex4;

public class ContaCorrente extends ContaBancaria{

    ContaCorrente(String titular, int numero, double saldo){
        super(titular, numero, saldo);
    }

    @Override
    double calcularTributos(){
        return 0;
    }

}
