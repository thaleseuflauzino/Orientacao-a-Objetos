import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
        

        String nString = JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação: ");
        int num = Integer.parseInt(nString);  
        JOptionPane.showMessageDialog(null, "Tabela de multiplicação para: " + num + ".");
        for (int i = 1; i < 11; i++) {
            int result = i * num;
            JOptionPane.showMessageDialog(null, i +" x " + num + " = " + result + ".");
        }
    }
}
