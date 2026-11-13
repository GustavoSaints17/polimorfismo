package ex2;

class Produto {
    private String nome;
    private double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    String getNome(){
        return nome;
    }

    double getPreco(){
        return preco;
    }

    void setPreco(double preco){
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("preco invalido");
            this.preco = 0;
        }
    }

    double calcularFrete(){
        return 10.0;
    }

    double calcularPrecoFinal(){
        return getPreco() + calcularFrete();
    }


}
