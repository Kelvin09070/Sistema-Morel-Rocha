/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author Adilio
 */
public class Compra {
    private int id_compra;
    private Date data;
    private String total;
    private int cliente_id_cliente;
    private int fornecedor_id_fornecedor;
    private int compra_produto_idcompra_produto;
    private int vendedor_id_vendedor;

    /**
     * @return the idCompra
     */
    public int getIdCompra() {
        return id_compra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(int idCompra) {
        this.id_compra = idCompra;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
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
