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
public class VeiculoDinamico {
    private String PlacaVeiculo;
    private String MarcaVeiculo;
    private String ModeloVeiculo;
    private VeiculoDinamico proximo;
    private VeiculoDinamico anterior;

    public String getPlacaVeiculo() {
        return PlacaVeiculo;
    }

    public void setPlacaVeiculo(String PlacaVeiculo) {
        this.PlacaVeiculo = PlacaVeiculo;
    }

    public String getMarcaVeiculo() {
        return MarcaVeiculo;
    }

    public void setMarcaVeiculo(String MarcaVeiculo) {
        this.MarcaVeiculo = MarcaVeiculo;
    }

    public String getModeloVeiculo() {
        return ModeloVeiculo;
    }

    public void setModeloVeiculo(String ModeloVeiculo) {
        this.ModeloVeiculo = ModeloVeiculo;
    }

    public VeiculoDinamico getProximo() {
        return proximo;
    }

    public void setProximo(VeiculoDinamico proximo) {
        this.proximo = proximo;
    }

    public VeiculoDinamico getAnterior() {
        return anterior;
    }

    public void setAnterior(VeiculoDinamico anterior) {
        this.anterior = anterior;
    }
    
    
    
}
