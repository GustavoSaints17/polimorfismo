class Produto {
    private String nome;
    private double preco = 0;

    Produto(String nome){
        this.nome = nome;
        this.preco = 0;
    }

    String getNome(){
        return this.nome;
    }

    double getPreco(){
        return this.preco;
    }

    void setPreco(double preco){
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("preco invalido");
            this.preco = 0;
        }
    }

    void calcularFrete(){
        return "R$ 10.00"
    }
}
