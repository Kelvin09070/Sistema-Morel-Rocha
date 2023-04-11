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
public class Produto {
    private int id_produto;
    private String nome;
    private String descricao;
    private String preco;
    private int vendas_produto_id_vendasProdutos;
    private int compra_produto_idcompra_produto;
    private int fornecedor_id_fornecedor;
    private int vendedor_id_vendedor;

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }

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
     * @return the compra_produto_idcompra_produto
     */
    public int getCompra_produto_idcompra_produto() {
        return compra_produto_idcompra_produto;
    }

    /**
     * @param compra_produto_idcompra_produto the compra_produto_idcompra_produto to set
     */
    public void setCompra_produto_idcompra_produto(int compra_produto_idcompra_produto) {
        this.compra_produto_idcompra_produto = compra_produto_idcompra_produto;
    }

    /**
     * @return the fornecedor_id_fornecedor
     */
    public int getFornecedor_id_fornecedor() {
        return fornecedor_id_fornecedor;
    }

    /**
     * @param fornecedor_id_fornecedor the fornecedor_id_fornecedor to set
     */
    public void setFornecedor_id_fornecedor(int fornecedor_id_fornecedor) {
        this.fornecedor_id_fornecedor = fornecedor_id_fornecedor;
    }

    /**
     * @return the vendedor_id_vendedor
     */
    public int getVendedor_id_vendedor() {
        return vendedor_id_vendedor;
    }

    /**
     * @param vendedor_id_vendedor the vendedor_id_vendedor to set
     */
    public void setVendedor_id_vendedor(int vendedor_id_vendedor) {
        this.vendedor_id_vendedor = vendedor_id_vendedor;
    }
}
