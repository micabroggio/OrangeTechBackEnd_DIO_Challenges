public class SolicitacaoServico{

    private static int SEQUENCIAL = 1;

    protected int numeroSolicitacao;
    protected double precoFinal;

    protected Cliente cliente;
    protected Animal animal;
    protected Procedimento procedimento;

    public void solicitacao(Cliente cliente,Animal animal,Procedimento procedimento) {
        this.numeroSolicitacao = SEQUENCIAL++;
        this.cliente = cliente;
        this.animal = animal;
        this.procedimento = procedimento;
        this.precoFinal = precoFinal(procedimento,animal);
    }

    private double precoFinal(Procedimento procedimento,Animal animal){
        double precofinal = procedimento.getPrecoProcedimento();
        double peso = animal.getPeso();
        if (peso < 5d){
            precofinal = precofinal * Procedimento.animalP;
        } else if (peso >= 5d & peso < 10d){
            precofinal = precofinal * Procedimento.animalM;
        } else {
            precofinal = precofinal * Procedimento.animalG;
        }
        return precofinal;
    }

    public int getNumeroSolicitacao() {
        return numeroSolicitacao;
    }

    public void setNumeroSolicitacao(int numeroSolicitacao) {
        this.numeroSolicitacao = numeroSolicitacao;
    }

    public double getPrecoFinal() {
        return precoFinal(procedimento,animal);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    protected void imprimirInfos() {
        System.out.println(String.format("\nSolicitaçao: %s", this.numeroSolicitacao));
        System.out.println(String.format("--"));
        System.out.println(String.format("Cliente: %s", cliente.getNomeCliente()));
        System.out.println(String.format("Animal: %s", animal.getNomeAnimal()));
        System.out.println(String.format("Procedimento: %s", procedimento.getNomeProcedimento()));
        System.out.println(String.format("Preço do Procedimento: R$%.2f", this.precoFinal));
        if (animal.getPeso() < 5d){
            System.out.println(String.format("Sem acrescimo por animal porte P."));
        }else if (animal.getPeso() >= 5d & animal.getPeso() < 10d){
            System.out.println(String.format("Acrescimo por animal de porte M: %.0f%%", (Procedimento.animalM - 1) * 100));
        }else {
            System.out.println(String.format("Acrescimo por animal de porte G: %.0f%%", (Procedimento.animalG - 1) * 100));
        }
    }
}
