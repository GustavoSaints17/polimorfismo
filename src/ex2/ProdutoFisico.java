package ex2;

import ex2.Produto;

public class ProdutoFisico extends Produto {
    private double pesoKg;

    ProdutoFisico(String nome, double preco, double pesoKg){
        super(nome, preco);
        this.pesoKg = pesoKg;
    }

    double getPesoKg(){
        return pesoKg;
    }

    @Override
    double calcularFrete(){
        return 10.0 + (this.pesoKg * 5.0);
    }

}
