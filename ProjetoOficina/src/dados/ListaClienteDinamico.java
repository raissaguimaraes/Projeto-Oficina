/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.ClienteDinamico;

/**
 *
 * @author alunofg
 */
public class ListaClienteDinamico {
    private ClienteDinamico Inicio;
    private ClienteDinamico Fim;
    
    public ListaClienteDinamico(){
        Inicio = null;
        Fim = null;
    }
    
    public void inserir(ClienteDinamico cliente){
        if(Inicio == null){
            Inicio = cliente;
        }else {
            Fim.setProximo(cliente);
            cliente.setAnterior(Fim);
        }
        Fim = cliente;
    }
    
    public ClienteDinamico buscar(int codigo){
        ClienteDinamico cliente = null;
        ClienteDinamico i = Inicio;
        
        while(i != null){
            if (codigo == i.getCodigoCliente()){
                cliente = i;
                break;
            }
            i = i.getProximo();
        }
        return cliente;
    }
    
    public ClienteDinamico consultar(int codigo){
        ClienteDinamico cliente = null;
        
        cliente = buscar(codigo);
        
        return cliente;
    }
    
    public ClienteDinamico alterar(ClienteDinamico cliente){
        ClienteDinamico resultado = null;
        
        resultado = buscar(cliente.getCodigoCliente());
        if(resultado != null){
            resultado.setEnderecoCliente(cliente.getEnderecoCliente());
            resultado.setNomeCliente(cliente.getNomeCliente());
        }
        return resultado;
    }
    
    public int excluir(int codigo){
        ClienteDinamico cliente = null;
        int resultado = 0;
        
        cliente = buscar(codigo);
        
        if (cliente == null){
            resultado = 1;
        } else {
            if (cliente == Inicio) {
                Inicio = Inicio.getProximo();
                Inicio.getAnterior().setProximo(null);
                Inicio.setAnterior(null);
            }else {
                if (cliente == Fim){
                    Fim = Fim.getAnterior();
                    Fim.getProximo().setAnterior(null);
                    Fim.setProximo(null);
                }else {
                    cliente.getAnterior().setProximo(cliente.getProximo());
                    cliente.getProximo().setAnterior(cliente.getAnterior());
                    cliente.setProximo(null);
                    cliente.setAnterior(null);
                }
            }
        }
        return resultado;
    }
    
}
