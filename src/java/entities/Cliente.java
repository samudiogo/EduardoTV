package entities;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Cliente {
    
    private String nome;
    
    public List<String> getNomeSeparado(){
        return Arrays.asList(nome.split("\\s"));
    }
    
    public String getNomeConcatenado(List<String> nomeSeparado){
        StringBuilder sb = new StringBuilder();
        for(String n: nomeSeparado)
            sb.append(n).append(" ");
        return sb.toString().trim();
    }
            
    
}
