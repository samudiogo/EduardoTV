package entities;

/**
 *
 * @author Eduardo
 */
public class Plano {

    Plano[] planos = new Plano[100];
    //um plano possui varios canais
    Canal[] canais = new Canal[100];
    
    
    public Plano(){}
    public Plano(String nome, float valor){
        setPlanoId(1);
        setNome(nome);
        setValor(valor);
        
    }
    private int planoId;
    private String nome;
    private float valor;

    public void adquirirCanal() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the PlanoId
     */
    public int getPlanoId() {
        return planoId;
    }

    /**
     * @param PlanoId the PlanoId to set
     */
    public void setPlanoId(int PlanoId) {
        this.planoId = PlanoId;
    }

}
