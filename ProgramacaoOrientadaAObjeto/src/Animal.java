public class Animal extends Cliente{

    private static int SEQUENCIAL = 1;

    private String nomeAnimal;
    private String raca;
    private double peso;
    protected int registroAnimal;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void registroAnimal() {
        this.registroAnimal = SEQUENCIAL++;
    }

}
