/*
apaga este arquivo quando tudo terminar.
 */
package teste;

import entities.Cliente;

/**
 *
 * @author Eduardo
 */
public class MainTest {
    public static void main(String[] args)
    {
        Cliente a  = new Cliente("Samuel Diogo de jesus");
        
        System.out.println(a.getNomeCompleto());
    }
}
