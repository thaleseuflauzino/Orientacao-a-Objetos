import javax.swing.JOptionPane;

class ContaBancaria {
    private double valor = 0;

    ContaBancaria(double valor) {
        this.valor = valor;
    }

    public void depositar(double deposito) {
        valor = valor + deposito;
    }

    public double getValorAtual() {
        return valor;
    }

}
public class Ex20 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial na sua conta bancária"));
        ContaBancaria contaBancaria = new ContaBancaria(valor);
        JOptionPane.showMessageDialog(null, "O valor inicial de sua conta é: " + contaBancaria.getValorAtual() + ".");
        int i = 0;
        while (true) {
            double depositoT = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "º depósito\nDigite 0 para sair"));
            if (depositoT == 0) {
                JOptionPane.showMessageDialog(null, "O seu saldo final foi " + contaBancaria.getValorAtual() + ".\nPrograma encerrado, não foi reconhecido valor do deposito");
                break;
            }
            contaBancaria.depositar(depositoT);
            JOptionPane.showMessageDialog(null, "O valor atual de sua Conta Bancária é: " + contaBancaria.getValorAtual() + ".");
            i++;
        }
    }
}
