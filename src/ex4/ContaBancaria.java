package ex4;

public abstract class ContaBancaria {
    private String titular;
    private int numero;
    private int saldo;

    ContaBancaria(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    String getTitular(){
        return this.titular;
    }

    int getNumero(){
        return this.numero;
    }

    int getSaldo(){
        return this.saldo;
    }

    void depositar(double valor){
        if (valor >= 0){
            saldo += valor;
        } else {
            System.out.println("valor invalido");
        }
    }

    void sacar(double valor){
        if (valor > saldo ){
            saldo -= valor;
        }

    }

    abstract double calcularTributos();
}
