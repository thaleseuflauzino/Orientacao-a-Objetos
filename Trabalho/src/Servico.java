import javax.swing.JOptionPane;

public class Servico extends Item {
    private String horasPrevistas, unidade, marca;

    public Servico(String descricao, int valor, int codigo, String horas, String unidade, String marca) {
        super(descricao, valor, codigo);
        this.unidade = unidade;
        this.marca = marca;
        this.horasPrevistas = horas;
    }
    public Servico(String descricao, int valor, int codigo, String horas) {
        super(descricao, valor, codigo);
        this.horasPrevistas = horas;
    }
    public Servico(String descricao, int valor, String horas){
        super(descricao, valor);
        this.horasPrevistas = horas;
    }
    public Servico(){}
    
    public void setHoras(String horasPrevistas){this.horasPrevistas = horasPrevistas;}
    public String getHoras() {
        return horasPrevistas;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override

    public String toString() {
        return super.toString() +
                "\nTempo previsto: " + getHoras();
    }
    public String imprimirTrocaOleo() {
        return super.toString() +
                "\nTempo previsto: " + getHoras() +
                "\nUnidade: " + unidade +
                "\nMarca: " + marca;
                }

    public void servicos() {
        Servico trocaOleo = new Servico("Troca do óleo do Motor", 300, 1, "20 minutos", "4 Litros", "Lubrax");
        Servico alinhamento = new Servico("Alinhamento de seu veículo", 80, 2, "40 minutos");
        Servico balanceamento = new Servico("Balanceamento de seu veículo", 60, 3, "1 hora");
        Servico diagnostico = new Servico("Diagnóstico do possível problema que há em seu veículo", 150, 4, "2 horas");
        String Lista = trocaOleo.toString() + "\n\n" + alinhamento.toString() + "\n\n" + balanceamento.toString() + "\n\n" + diagnostico.toString() + "\n\n";
        String entrada = JOptionPane.showInputDialog("Você deseja ver a lista de Serviços? (S/N)");
        if (entrada.equalsIgnoreCase("S")) {
            JOptionPane.showMessageDialog(null, Lista);
        } 
        }
    public void valorServicos() {
        Servico trocaOleo = new Servico("Troca do óleo do Motor", 300, "20 minutos");
        Servico alinhamento = new Servico("Alinhamento de seu veículo", 80,  "40 minutos");
        Servico balanceamento = new Servico("Balanceamento de seu veículo", 60,  "1 hora");
        Servico diagnostico = new Servico("Diagnóstico do possível problema que há em seu veículo", 150,  "2 horas");
        String Lista = trocaOleo.toString() + "\n\n" + alinhamento.toString() + "\n\n" + balanceamento.toString() + "\n\n" + diagnostico.toString() + "\n\n";
        JOptionPane.showMessageDialog(null, Lista);
        }
    }

