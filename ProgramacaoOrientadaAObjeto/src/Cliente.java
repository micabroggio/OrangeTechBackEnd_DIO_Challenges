public class Cliente {

    private static int SEQUENCIAL = 1;

    private String nomeCliente;
    private String telefone;
    private String cpf;
    protected int registroCliente;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void registroCliente() {
        this.registroCliente = SEQUENCIAL++;
    }
}
