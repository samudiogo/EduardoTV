/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Plano;

/**
 *
 * @author samue
 */
public class PlanoModel {
    public Plano getPlanoCliente(String cpfCliente){
        //TODO: implementar consulta de banco aqui
        return new Plano("Plano Master Plus HD", 300);
    }
}
