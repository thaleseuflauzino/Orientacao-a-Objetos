import javax.swing.JOptionPane;

public class Ex16 {

    public static void main(String[] args) {
        int linhas1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da primeira matriz: "));
        int colunas1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da primeira matriz: "));

        int[][] matriz1 = new int[linhas1][colunas1];

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento [," + i + "][," + j + "]: "));
            }
        }

        int linhas2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da segunda matriz: "));
        int colunas2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da segunda matriz: "));

        if (colunas1 != linhas2) {
            JOptionPane.showMessageDialog(null, "As matrizes não são compatíveis.");
            return;
        }

        int[][] matriz2 = new int[linhas2][colunas2];

        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento [," + i + "][," + j + "]: "));
            }
        }

        int[][] matrizMultiplicacao = new int[linhas1][colunas2];
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int k = 0; k < colunas1; k++) {
                    matrizMultiplicacao[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                JOptionPane.showMessageDialog(null, matrizMultiplicacao[i][j] + " ");
            }
        }
    }
}