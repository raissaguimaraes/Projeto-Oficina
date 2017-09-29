/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.VeiculoDinamico;

/**
 *
 * @author alunofg
 */
public class FilaVeiculoDinamica {
    private VeiculoDinamico Inicio;
    private VeiculoDinamico Fim;
    
    public FilaVeiculoDinamica(){
        Inicio = null;
        Fim = null;
    }
    
    public void inserir(VeiculoDinamico veiculo){
        if(Inicio == null){
            Inicio = veiculo;
        }else {
            Fim.setProximo(veiculo);
            veiculo.setAnterior(Fim);
        }
        Fim = veiculo;
    }
    
    public VeiculoDinamico buscar(String placa){
        VeiculoDinamico veiculo = null;
        VeiculoDinamico i = Inicio;
        
        while(i != null){
            if (placa.equals(i.getPlacaVeiculo())){
                veiculo = i;
                break;
            }
            i = i.getProximo();
        }
        return veiculo;
    }
    
    public VeiculoDinamico consultar(String placa){
        VeiculoDinamico veiculo = null;
        
        veiculo = buscar(placa);
        
        return veiculo;
    }
    
    public VeiculoDinamico alterar(VeiculoDinamico veiculo){
        VeiculoDinamico resultado = null;
        
        resultado = buscar(veiculo.getPlacaVeiculo());
        if(resultado != null){
            resultado.setMarcaVeiculo(veiculo.getMarcaVeiculo());
            resultado.setModeloVeiculo(veiculo.getModeloVeiculo());
        }
        return resultado;
    }
    
    public int excluir(){
        int resultado = 0;
        
        if (Inicio == null){ // se fila vazia
            resultado = 1;
        } else {
            Inicio = Inicio.getProximo();
            Inicio.getAnterior().setProximo(null);
            Inicio.setAnterior(null);
        }
       
        return resultado;
    }
    
}
