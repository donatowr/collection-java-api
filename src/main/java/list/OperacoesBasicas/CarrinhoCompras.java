package main.java.list.OperacoesBasicas;

public class CarrinhoCompras {

    private String produto;
    private Integer preco;

    public CarrinhoCompras(String produto, Integer preco) {
        this.produto = produto;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public Integer getPreco() {
        return preco;
    }

}
