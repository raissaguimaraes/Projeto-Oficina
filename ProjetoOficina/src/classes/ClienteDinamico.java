/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author alunofg
 */
public class ClienteDinamico {
    private int CodigoCliente;
    private String NomeCliente;
    private String EnderecoCliente;
    private ClienteDinamico proximo;
    private ClienteDinamico anterior;

    public ClienteDinamico(){
        CodigoCliente = 0;
        NomeCliente = "";
        EnderecoCliente = "";
        proximo = null;
        anterior = null;
    }

    public int getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(int CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public String getEnderecoCliente() {
        return EnderecoCliente;
    }

    public void setEnderecoCliente(String EnderecoCliente) {
        this.EnderecoCliente = EnderecoCliente;
    }

    public ClienteDinamico getProximo() {
        return proximo;
    }

    public void setProximo(ClienteDinamico proximo) {
        this.proximo = proximo;
    }

    public ClienteDinamico getAnterior() {
        return anterior;
    }

    public void setAnterior(ClienteDinamico anterior) {
        this.anterior = anterior;
    }
    
    
}
