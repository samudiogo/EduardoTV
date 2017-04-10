/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Scanner;
import model.*;
import entities.*;


/**
 *
 * @author samue
 */
public class Util {

    public static void listaMenu() {
        System.out.println("===============================================");
        System.out.println("O que deseja fazer?");
        System.out.println("[1] Consultar dados de cliente");
        System.out.println("[2] Consultar canais no plano");
        System.out.println("[3] Consultar programas de um canal");
        System.out.println("[4] Adquirir canal");
        System.out.println("[5]Sair");
        System.out.println("===============================================");
    }

    public static void consultarCliente() {
        System.out.println("===============================================");
        System.out.println("Digite o seu cpf completo (somente números) ou V "
                + "para voltar ao menu principal:");

        Scanner scan = new Scanner(System.in);
        String cpf = scan.nextLine();

        if (!cpf.equals("V")) {
            Cliente cli = new ClienteModel().getClientePorCpf(cpf);
            System.out.println("Nome: " + cli.getNomeCompleto());
            System.out.println("CPF: " + cli.getCpf());
            System.out.println("===============================================");
        }
    }

    public static void consultarPlano() {
        System.out.println("===============================================");
        System.out.println("Digite o seu cpf completo (somente números) ou V "
                + "para voltar ao menu principal:");

        Scanner scan = new Scanner(System.in);
        String cpf = scan.nextLine();

        if (!cpf.equals("V")) {
            Plano plan = new PlanoModel().getPlanoCliente(cpf);
            System.out.println("Id: " + plan.getPlanoId());
            System.out.println("Nome: " + plan.getNome());
            System.out.println("Valor: R$" + plan.getValor());
            System.out.println("===============================================");
        }
    }

    public static void consultarPrograma() {

    }

    public static void addCanal() {

    }
}
