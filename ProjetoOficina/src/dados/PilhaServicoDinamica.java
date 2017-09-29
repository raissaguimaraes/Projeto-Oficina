/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;
import classes.ServicoDinamico;
/**
 *
 * @author Raissa
 */
public class PilhaServicoDinamica {
    private ServicoDinamico Inicio;
    private ServicoDinamico Fim;
    
    public PilhaServicoDinamica(){
        Inicio = null;
        Fim = null;
    }
    public void inserir(ServicoDinamico servico){
        if(Inicio == null){
            Inicio = servico;
        }else {
            Fim.setProximo(servico);
            servico.setAnterior(Fim);
        }
        Fim = servico;
    }
    public ServicoDinamico buscar(int codigo){
        ServicoDinamico servico = null;
        ServicoDinamico i = Inicio;
        
        while(i != null){
            if (codigo == i.getCodigoServico()){
                servico = i;
                break;
            }
            i = i.getProximo();
        }
        return servico;
    }
    public ServicoDinamico consultar(int codigo){
        ServicoDinamico servico = null;
        
        servico = buscar(codigo);
        
        return servico;
    }
    public ServicoDinamico alterar(ServicoDinamico servico){
        ServicoDinamico resultado = null;
        
        resultado = buscar(servico.getCodigoServico());
        if(resultado != null){
            resultado.setNomeServico(servico.getNomeServico());
            resultado.setPrecoServico(servico.getPrecoServico());
        }
        return resultado;
    }
    public int excluir(int codigo){
        ServicoDinamico servico = null;
        int resultado = 0;
        
        servico = buscar(codigo);
        
        if (servico == null){
            resultado = 1;
        } else {
            if (servico == Inicio) {
                Inicio = Inicio.getProximo();
                Inicio.getAnterior().setProximo(null);
                Inicio.setAnterior(null);
            }else {
                if (servico == Fim){
                    Fim = Fim.getAnterior();
                    Fim.getProximo().setAnterior(null);
                    Fim.setProximo(null);
                }else {
                    servico.getAnterior().setProximo(servico.getProximo());
                    servico.getProximo().setAnterior(servico.getAnterior());
                    servico.setProximo(null);
                    servico.setAnterior(null);
                }
            }
        }
        return resultado;
    }
}
