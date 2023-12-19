import javax.swing.JOptionPane;

public class Ex13 {
    public static void main(String[] args) {
        String tamanhoInput = JOptionPane.showInputDialog("Digite o tamanho dos vetores:");
        int tamanho = Integer.parseInt(tamanhoInput);

        double[] vetor1 = new double[tamanho];
        double[] vetor2 = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            String elementoInput1 = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do primeiro vetor:");
            vetor1[i] = Double.parseDouble(elementoInput1);
        }

        for (int i = 0; i < tamanho; i++) {
            String elementoInput2 = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do segundo vetor:");
            vetor2[i] = Double.parseDouble(elementoInput2);
        }

        double produtoEscalar = 0.0;
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + produtoEscalar + ".");
    }
}
