import javax.swing.JOptionPane;

public class Ex11 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Adivinhe o número entre 1 e 10");
        int num = (int) (Math.random() * 10 + 1);
        int tentativas = 1;

        do {
            String inputStr = JOptionPane.showInputDialog("Tentativa " + tentativas +".");

            if (inputStr == null) {
                JOptionPane.showMessageDialog(null, "Jogo encerrado.");
                break;
            }
            try {
                int n = Integer.parseInt(inputStr);

                if (num == n) {
                    JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número "+ n + " em "+ tentativas +  " tentativas.");
                    break;
                } else if (n > num) {
                    JOptionPane.showMessageDialog(null, "Tente novamente. O número é menor.");
                } else {
                    JOptionPane.showMessageDialog(null, "Tente novamente. O número é maior.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
            }
            tentativas++;
        } while (true);
    }
}
