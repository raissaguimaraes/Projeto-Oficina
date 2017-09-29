/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Raissa
 */
public class ServicoDinamico {
    private int CodigoServico;
    private String NomeServico;
    private double PrecoServico;
    private ServicoDinamico proximo;
    private ServicoDinamico anterior;

    /**
     * @return the CodigoServico
     */
    public int getCodigoServico() {
        return CodigoServico;
    }

    /**
     * @param CodigoServico the CodigoServico to set
     */
    public void setCodigoServico(int CodigoServico) {
        this.CodigoServico = CodigoServico;
    }

    /**
     * @return the NomeServico
     */
    public String getNomeServico() {
        return NomeServico;
    }

    /**
     * @param NomeServico the NomeServico to set
     */
    public void setNomeServico(String NomeServico) {
        this.NomeServico = NomeServico;
    }

    /**
     * @return the PrecoServico
     */
    public double getPrecoServico() {
        return PrecoServico;
    }

    /**
     * @param PrecoServico the PrecoServico to set
     */
    public void setPrecoServico(double PrecoServico) {
        this.PrecoServico = PrecoServico;
    }

    /**
     * @return the proximo
     */
    public ServicoDinamico getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(ServicoDinamico proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the anterior
     */
    public ServicoDinamico getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(ServicoDinamico anterior) {
        this.anterior = anterior;
    }
    
    
}
