/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Cliente;

/**
 *
 * @author samue
 */
public class ClienteModel {
    
    public Cliente getClientePorCpf(String cpf){
        
        //TODO: implementar acesso a dados arqui:
        return new Cliente("Eduardo", cpf);
    }
    
}
