import javax.swing.JOptionPane;

public class Ex12_2 {

    public static void main(String[] args) {
        String tamString = JOptionPane.showInputDialog("Digite o tamanho dos vetores: ");
        int t = Integer.parseInt(tamString);
        int x[] = new int[t];
        int y[] = new int[t];
        int[] soma = new int[t];
        for (int i = 0; i < x.length; i++) {
            String numString = JOptionPane.showInputDialog("Digite os elementos do primeiro vetor " + (i + 1) + ":");
            x[i] = Integer.parseInt(numString);
            
        }

        for (int i = 0; i < y.length; i++) {
            String numString = JOptionPane.showInputDialog("Digite os elementos do segundo vetor " + (i + 1) + ":");
            y[i] = Integer.parseInt(numString);
            
        }

        for (int i = 0; i < t; i++) {
            soma[i] = x[i] + y[i];
        }

        StringBuilder result = new StringBuilder("A soma dos vetores é: [");
        for (int i = 0; i < t; i++) {
            result.append(soma[i]);
            if (i < t - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        JOptionPane.showMessageDialog(null, result.toString());
    }
}
