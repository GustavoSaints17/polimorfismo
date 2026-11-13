package ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new ProdutoFisico("Notebook", 3000.0, 2.5));
        produtos.add(new ProdutoDigital("E-book Java", 39.90, 15));
        produtos.add(new Produto("Caneta", 45.00));
        produtos.add(new ProdutoFisico("Teste", -100.0, 1.0));

        for (Produto p : produtos){
            System.out.println("Produto: " + p.getNome() +
                    " | Preço: R$ " + p.getPreco() +
                    " | Frete: R$ " + p.calcularFrete() +
                    " | Preço Final: R$ " + p.calcularPrecoFinal());

        }

    }
}
