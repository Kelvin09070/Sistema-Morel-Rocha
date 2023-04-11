/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Adilio
 */
public class Venda_produto {
    private int vendas_produto_id_vendasProdutos;
    private int vendas_idvendas;
    private int produto_id_produto;
    private int quantidade;
    private String valor_unit;

    /**
     * @return the vendas_produto_id_vendasProdutos
     */
    public int getVendas_produto_id_vendasProdutos() {
        return vendas_produto_id_vendasProdutos;
    }

    /**
     * @param vendas_produto_id_vendasProdutos the vendas_produto_id_vendasProdutos to set
     */
    public void setVendas_produto_id_vendasProdutos(int vendas_produto_id_vendasProdutos) {
        this.vendas_produto_id_vendasProdutos = vendas_produto_id_vendasProdutos;
    }

    /**
     * @return the vendas_idvendas
     */
    public int getVendas_idvendas() {
        return vendas_idvendas;
    }

    /**
     * @param vendas_idvendas the vendas_idvendas to set
     */
    public void setVendas_idvendas(int vendas_idvendas) {
        this.vendas_idvendas = vendas_idvendas;
    }

    /**
     * @return the produto_id_produto
     */
    public int getProduto_id_produto() {
        return produto_id_produto;
    }

    /**
     * @param produto_id_produto the produto_id_produto to set
     */
    public void setProduto_id_produto(int produto_id_produto) {
        this.produto_id_produto = produto_id_produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor_unit
     */
    public String getValor_unit() {
        return valor_unit;
    }

    /**
     * @param valor_unit the valor_unit to set
     */
    public void setValor_unit(String valor_unit) {
        this.valor_unit = valor_unit;
    }
}
