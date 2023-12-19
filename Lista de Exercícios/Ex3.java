import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        while (true) {
            String comando = JOptionPane.showInputDialog(getMenu());

            if (comando == null || comando.equalsIgnoreCase("sair")) {
                JOptionPane.showMessageDialog(null, "Programa encerrado. Até mais!");
                break;
            }

            switch (comando.toLowerCase()) {
                case "adicionar":
                    adicionarTarefa(tarefas);
                    break;
                case "listar":
                    listarTarefas(tarefas);
                    break;
                case "concluir":
                    concluirTarefa(tarefas);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um comando válido");
            }
        }
    }
    private static String getMenu() {
        return "Comandos disponíveis:\n" + "- \"adicionar\" para adicionar uma nova tarefa\n" + "- \"listar\" para listar as tarefas\n" + "- \"concluir\" para marcar uma tarefa como concluída\n" + "- \"sair\" para sair do programa";
    }

    private static void adicionarTarefa(ArrayList<String> tarefas) {
        String descricao = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
        tarefas.add(descricao);
        JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
    }

    private static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa pendente.");
        } else {
            StringBuilder lista = new StringBuilder("Tarefas pendentes:\n");
            for (int i = 0; i < tarefas.size(); i++) {
                lista.append(i + 1).append(". ").append(tarefas.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    private static void concluirTarefa(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há tarefas para concluir.");
            return;
        }

        int numeroTarefa = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da tarefa a ser concluída:"));
        if (numeroTarefa >= 1 && numeroTarefa <= tarefas.size()) {
            String tarefaConcluida = tarefas.remove(numeroTarefa - 1);
            JOptionPane.showMessageDialog(null, "Tarefa \"" + tarefaConcluida + "\" marcada como concluída.");
        } else {
            JOptionPane.showMessageDialog(null, "Número de tarefa inválido. Tente novamente.");
        }
    }
}
