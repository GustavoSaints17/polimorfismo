package ex2;

import ex2.Produto;

public class ProdutoDigital extends Produto {
    private double tamanhoArquivoM;

    ProdutoDigital(String nome,double preco, double tamanhoArquivoM){
        super(nome, preco);
        this.tamanhoArquivoM = tamanhoArquivoM;
    }

    double getTamanhoArquivoM(){
        return tamanhoArquivoM;
    }

    @Override
    double calcularFrete(){
        return 0.0;
    }

}
