
package entities;

public class Canal 
{
    Canal[] canal = new Canal[100];
    
    private int numeroCanal;
    private String descricaoCanal;
    //todo canal tem uma serie de programas
    Programa[] programas = new Programa[100];

   
    public int getNumeroCanal() {
        return numeroCanal;
}

   
    public void setNumeroCanal(int numeroCanal) {
        this.numeroCanal = numeroCanal;
    }

    
    public String getDescricaoCanal() {
        return descricaoCanal;
    }

    public void setDescricaoCanal(String descricaoCanal) {
        this.descricaoCanal = descricaoCanal;
    }
}