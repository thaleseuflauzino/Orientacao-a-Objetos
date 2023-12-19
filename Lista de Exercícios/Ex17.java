import javax.swing.JOptionPane;

public class Ex17 {

    public static void main(String[] args) {
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas: "));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas: "));

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento [, " + i + "][, " + j + "]: "));
            }
        }

        int[][] matrizTransposta = new int[colunas][linhas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        JOptionPane.showMessageDialog(null, "A matriz transposta é: ");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                JOptionPane.showMessageDialog(null, matrizTransposta[i][j] + " ");
            }
        }
    }
}