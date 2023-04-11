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
public class Compra_produto {
    private int compra_id_compra;
    private int compra_produto_idcompra_produto;
    private int quantidade;
    private int vendedor_id_vendedor;
    private int fornecedor_id_fornecedor;
    private int cliente_id_cliente;

    /**
     * @return the compra_id_compra
     */
    public int getCompra_id_compra() {
        return compra_id_compra;
    }

    /**
     * @param compra_id_compra the compra_id_compra to set
     */
    public void setCompra_id_compra(int compra_id_compra) {
        this.compra_id_compra = compra_id_compra;
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
     * @return the cliente_id_cliente
     */
    public int getCliente_id_cliente() {
        return cliente_id_cliente;
    }

    /**
     * @param cliente_id_cliente the cliente_id_cliente to set
     */
    public void setCliente_id_cliente(int cliente_id_cliente) {
        this.cliente_id_cliente = cliente_id_cliente;
    }
}
