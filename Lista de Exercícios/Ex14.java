import javax.swing.JOptionPane;

public class Ex14 {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra");
        palavra = palavra.toUpperCase();

        char[] vetor = new char[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            vetor[i] = palavra.charAt(i);
        }

        boolean palindromo = true;
        for (int i = 0; i < vetor.length / 2; i++) {
            if (vetor[i] != vetor[vetor.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }
}
