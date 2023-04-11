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
public class Vendas {
    private int idvendas;
    private Date data;
    private String total;
    private int vendedor_id_vendedor;
    private int fornecedor_id_fornecedor;
    private int produto_id_produto;   

    /**
     * @return the idVendas
     */
    public int getIdVendas() {
        return idvendas;
    }

    /**
     * @param idVendas the idVendas to set
     */
    public void setIdVendas(int idVendas) {
        this.idvendas = idVendas;
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
}
