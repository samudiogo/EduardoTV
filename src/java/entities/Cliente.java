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
            
    
}
