public class Main {

    public static void main(String[] args) {

        Procedimento procedimento01 = new Procedimento();
        procedimento01.setNomeProcedimento("banho");
        procedimento01.setPrecoProcedimento(30d);

        Procedimento procedimento02 = new Procedimento();
        procedimento02.setPrecoProcedimento(25d);
        procedimento02.setNomeProcedimento("tosa");

        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Ricardo Bonfin");
        cliente.setTelefone("48919199191");
        cliente.setCpf("33322244401");
        cliente.registroCliente();

        Animal animal01 = new Animal();
        animal01.setNomeAnimal("Lulu");
        animal01.setRaca("pitbull");
        animal01.setPeso(4d);
        animal01.setNomeCliente(cliente.getNomeCliente());
        animal01.setTelefone(cliente.getTelefone());
        animal01.setCpf(cliente.getCpf());
        animal01.registroAnimal();

        Animal animal02 = new Animal();
        animal02.setNomeAnimal("Paola");
        animal02.setRaca("husky");
        animal02.setPeso(9d);
        animal02.setNomeCliente(cliente.getNomeCliente());
        animal02.setTelefone(cliente.getTelefone());
        animal02.setCpf(cliente.getCpf());
        animal02.registroAnimal();

        SolicitacaoServico ss01 = new SolicitacaoServico();
        ss01.solicitacao(cliente, animal01, procedimento02);
        ss01.imprimirInfos();
        SolicitacaoServico ss02 = new SolicitacaoServico();
        ss02.solicitacao(cliente, animal02, procedimento01);
        ss02.imprimirInfos();
    }
}
