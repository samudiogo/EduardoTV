/*
apaga este arquivo quando tudo terminar.
 */
package program;

import entities.Cliente;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class MainProgram {

    public static void main(String[] args) {
        int opcaoMenu = 0;
        do {
            Scanner scan = new Scanner(System.in);
            Util.listaMenu();

            try {
                opcaoMenu = scan.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Valor digitado está incorreto.");
            }

            switch (opcaoMenu) {
                case 1:
                    Util.consultarCliente();
                    break;
                case 2:
                    Util.consultarPlano();
                    break;
                case 3:
                    Util.consultarPrograma();
                    break;
                case 4:
                    Util.addCanal();
                    break;
                case 5:
                    System.out.println("Desligando.. Obrigado por usar este programa..");
                    break;
                default:
                    System.out.println("Insira uma opcao valida");
                    break;

            }

        } while (opcaoMenu != 5);
    }
}
