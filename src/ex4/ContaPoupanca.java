package ex4;

public class ContaPoupanca extends ContaBancaria{

    ContaPoupanca(String titular, int numero, double saldo){
        super(titular, numero, saldo);
    }

    @Override
    double calcularTributos(){
        return getSaldo() * 0.01;
    }
}
