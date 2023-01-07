public class Procedimento {

    protected static final double animalP = 1d;
    protected static final double animalM = 1.2d;
    protected static final double animalG = 1.4d;
    private String nomeProcedimento;
    private Double precoProcedimento;

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }

    public Double getPrecoProcedimento() {
        return precoProcedimento;
    }

    public void setPrecoProcedimento(Double precoProcedimento) {
        this.precoProcedimento = precoProcedimento;
    }
}
