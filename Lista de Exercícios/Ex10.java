import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
        String nString;
        int n;
        nString = JOptionPane.showInputDialog("Digite o numero inicial");
        n = Integer.parseInt(nString);

        while (n != 0) {
            JOptionPane.showMessageDialog(null, n);
            n--;
        }
    }
}
