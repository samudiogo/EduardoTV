package entities;

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
    private String cpf;

    public Cliente(String nomeCompleto) {
        setNomeCompleto(nomeCompleto);
    }

    public Cliente(String nomeCompleto, String cpf) {
        setNomeCompleto(nomeCompleto);
        setCpf(cpf);
    }

    private void setNomeCompleto(String nomeCompleto) {
        List<String> nomeLista = getNomeSeparado(nomeCompleto);

        int tnome = nomeLista.size();
        nome = nomeLista.get(0);
        nomeDoMeio = "";
        sobreNome = "";
        if (tnome > 1) {

            sobreNome = nomeLista.get(tnome - 1);

            for (int i = 1; i < tnome - 1; ++i) {
                nomeDoMeio += String.format("%s ", nomeLista.get(i));
            }
        }
        nomeDoMeio = nomeDoMeio.trim();

    }

    private List<String> getNomeSeparado(String nomeCompleto) {
        return Arrays.asList(nomeCompleto.split("\\s"));
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

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
