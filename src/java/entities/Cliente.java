package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Cliente {

    private String nome;
    private String nomeDoMeio;
    private String sobreNome;

    public Cliente(String nomeCompleto) {
        setNomeCompleto(nomeCompleto);
    }

    private void setNomeCompleto(String nomeCompleto) {
        List<String> nomeLista = getNomeSeparado(nomeCompleto);

        int tnome = nomeLista.size();
        nome = nomeLista.get(0);
        sobreNome = nomeLista.get(tnome - 1);

        nomeDoMeio = "";
        for (int i = 1; i < tnome - 1; ++i) {
            nomeDoMeio += String.format("%s ", nomeLista.get(i));
        }

        nomeDoMeio = nomeDoMeio.trim();

    }

    private List<String> getNomeSeparado(String nomeCompleto) {
        return Arrays.asList(nome.split("\\s"));
    }

    public String getNomeCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome)
                .append(" ")
                .append(nomeDoMeio)
                .append(" ")
                .append(sobreNome);
        return sb.toString().trim();
    }

}
