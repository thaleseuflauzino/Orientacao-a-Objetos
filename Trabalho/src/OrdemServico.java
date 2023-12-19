import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class OrdemServico {
    static CadastroClientes cadastro = new CadastroClientes();
    private static List<String> itensSelecionados = new ArrayList<>();
    private String dataManutencao;
    private String servico, mecanicoResponsavel;
    private static int valorFinal;

    public void adicionarItem(Item item) {
        itensSelecionados.add(item.getDescricao());
        valorFinal += item.getValor();
    }

    public void menu(){
        JOptionPane.showMessageDialog(null,"Dados do seu atendimento:" +
                "\n Mecanico Responsável: " + getMecanicoResponsavel() +
                "\n Data de entrada: " + getDataManutencao() 
                );
    }
    
    public void setDataManutencao(String dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public String getDataManutencao() {
        return dataManutencao;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getServico() {
        return servico;
    }

    public void setMecanicoResponsavel(String mecanicoResponsavel) {
        this.mecanicoResponsavel = mecanicoResponsavel;
    }

    public static String mecanicoResponsavel(){
        List<String> nomes = new ArrayList<>();
        Random random = new Random();
        nomes.add("Thales Henrique"); nomes.add("Victor Hugo"); nomes.add("Pedro Lopes"); nomes.add("João Victor"); nomes.add("André Lanna");
        int indiceSorteado = random.nextInt(nomes.size());
        return nomes.get(indiceSorteado);
    }
    
    public String getMecanicoResponsavel() {
        return mecanicoResponsavel;
    }

    public static String menuGeral(){
        return "Os serviços que o senhor comprou foi :\n" + itensSelecionados + "\nE o valor final foi de: R$" + valorFinal + ",00";
    }

    public void main() {
    int entrada = Integer.parseInt(JOptionPane.showInputDialog("Você deseja fazer um serviço?\n 1. Sim \n 2. Não \n 3. Encerrar Atendimento \n 4. Encerrar Programa" ));
    while (entrada > 0  && entrada <= 4) {
        if (entrada == 4) {
            break;
        }
        CadastroClientes cadastrar = new CadastroClientes();
        switch (entrada) {
            case 1:
                JOptionPane.showMessageDialog(null, "Tudo bem, então antes, nós precisamos fazer o seu cadastro.");
                cadastrar.cadastrarCliente();
                Principal prin = new Principal();
                prin.tipoServico();
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Você deseja fazer um outro serviço?\n 1. Sim \n 2. Não \n 3. Encerrar Atendimento \n 4. Encerrar Programa" ));
                entrada = opcao;
                break;
            case 2:
            int mensagem = Integer.parseInt(JOptionPane.showInputDialog("Então você deseja fazer algo dessa lista?\n 1. Verificar se já estou cadastrado\n 2. Verificar valor das peças\n 3. Verificar valor das manutenções\n 4. Verificar se meu veículo está cadastrado\n 5. Voltar ao menu anterior "));
            switch (mensagem) {
                    case 1:
                        String cpf = JOptionPane.showInputDialog("Digite seu cpf");              
                        cadastrar.procurarCliente(cpf);
                        break;
                    case 2:
                        Peca pecas = new Peca();
                        pecas.valorPecas();
                        break;
                    case 3:
                        Servico servico = new Servico();
                        servico.valorServicos();
                        break;
                    case 4:
                        String placa = JOptionPane.showInputDialog("Digite a placa de seu veículo");   
                        cadastrar.procurarVeiculo(placa);
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Digite um número válido");
                        break;
                }
                int opcao2 = Integer.parseInt(JOptionPane.showInputDialog("Você deseja fazer um novo serviço?\n 1. Sim \n 2. Não \n 3. Encerrar Atendimento\n 4. Encerrar Programa" ));
                entrada = opcao2;
                break;
            case 3:
                if (!itensSelecionados.isEmpty()) {
                    JOptionPane.showMessageDialog(null, OrdemServico.menuGeral());
                }
                JOptionPane.showMessageDialog(null,"Obrigado por nos visitar, Até mais!");
                entrada = -1;
                break;
        default:
            JOptionPane.showMessageDialog(null,"Digite um número válido");
            break;
        }
    }
}

}
