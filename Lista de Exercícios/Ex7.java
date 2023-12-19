import javax.swing.JOptionPane;

public class Ex7 {
    public static void main(String[] args) {
        String nString;
        int n;
        nString = JOptionPane.showInputDialog("Digite um número: ");
        n = Integer.parseInt(nString);
        if (n % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + n + " é par.");
        } else {
                JOptionPane.showMessageDialog(null, "O número " + n + " é impar.");
        }
    }
}
