import javax.swing.JOptionPane;

public class Principal {
    public void tipoServico() {
        OrdemServico os1 = new OrdemServico();
        String mecanico = OrdemServico.mecanicoResponsavel();
        os1.setMecanicoResponsavel(mecanico);
        String dataEntrada = JOptionPane.showInputDialog(null, "Digite a data de entrada de seu veículo em nossa oficina. ");
        os1.setDataManutencao(dataEntrada);
        int entrada;
        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Você deseja fazer uma destas opções?\n 1. Trocar Peças\n 2. Fazer uma Manutenção.\n 3. Não."));
    
            switch (entrada) {
                case 1:
                    adicionarPeca(os1);
                    break;
                case 2:
                    adicionarManutencao(os1);
                    break;
                case 3:
                    os1.menu();
                    os1.main();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um código válido");
            }
        } while (entrada != 3);
    }
    
    private void adicionarPeca(OrdemServico os1) {
        Peca pecas = new Peca();
        pecas.pecas();
        int peca = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da peça que o senhor deseja"));
    
        switch (peca) {
            case 5:
                configurarPeca(pecas, 5, "Novas Pastilhas de Freio", "Fras-le", "2 unidades", 50);
                break;
            case 6:
                configurarPeca(pecas, 6, "Novos Filtros de Combustível", "BOSCH", "1 unidade", 150);
                break;
            case 7:
                configurarPeca(pecas, 7, "Nova Correia Dentada", "Continental Correias", "1 unidade", 75);
                break;
            case 8:
                configurarPeca(pecas, 8, "Novos Discos de Freio", "Fremax", "2 unidades", 45);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite um código válido");
                return;
        }
    
        os1.adicionarItem(pecas);
    }
    
    private void adicionarManutencao(OrdemServico os1) {
        Servico servico = new Servico();
        servico.servicos();
        int service = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do serviço que o senhor deseja"));
    
        switch (service) {
            case 1:
                servicoOleo(servico, 1, "Troca do óleo do Motor", "Lubrax", "4 Litros", 300, "20 minutos");
                JOptionPane.showMessageDialog(null, "Sua escolha foi: \n" + servico.imprimirTrocaOleo() + "\n\n");
                break;
            case 2:
                configurarServico(servico, 2, "Alinhamento de seu veículo", null, null, 80, "40 minutos");
                break;
            case 3:
                configurarServico(servico, 3, "Balanceamento de seu veículo", null, null, 60, "1 hora");
                break;
            case 4:
                configurarServico(servico, 4, "Diagnóstico do possível problema que há em seu veículo", null, null, 150, "2 horas");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite um código válido");
                return;
        }
    
        os1.adicionarItem(servico);
    }
    
    private void configurarPeca(Peca pecas, int codigo, String descricao, String marca, String unidade, int valor) {
        pecas.setCodigo(codigo);
        pecas.setDescricao(descricao);
        pecas.setMarca(marca);
        pecas.setUnidade(unidade);
        pecas.setValor(valor);
        JOptionPane.showMessageDialog(null, "Sua escolha foi: \n" + pecas.toString() + "\n\n");
    }
    
    private void configurarServico(Servico servico, int codigo, String descricao, String marca, String unidade, int valor, String horas) {
        servico.setCodigo(codigo);
        servico.setDescricao(descricao);
        servico.setMarca(marca);
        servico.setUnidade(unidade);
        servico.setValor(valor);
        servico.setHoras(horas);
        JOptionPane.showMessageDialog(null, "Sua escolha foi: \n" + servico.toString() + "\n\n");
    }
    private void servicoOleo(Servico servico, int codigo, String descricao, String marca, String unidade, int valor, String horas){
        servico.setCodigo(codigo);
        servico.setDescricao(descricao);
        servico.setMarca(marca);
        servico.setUnidade(unidade);
        servico.setValor(valor);
        servico.setHoras(horas);
    }
    
    public void enunciado() {
        String mensagem = "Participantes do Grupo:"; String titulo = " 1. Thales Henrique Euflauzino dos Santos\n 2. Victor Hugo dos Santos Bernardes\n 3. Manoela Silvestre Garcia Chaves\n 4. Pedro Lopes da Cunha\n 5. João Victor Tavares";
        
        JOptionPane.showMessageDialog(null, titulo, mensagem, JOptionPane.INFORMATION_MESSAGE);
    }

}
