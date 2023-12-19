import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        String idadeStr, optionStr;
        int idade, option, idade_convertida;
        idadeStr = JOptionPane.showInputDialog("Digite sua idade em anos");
        idade = Integer.parseInt(idadeStr);

        optionStr = JOptionPane.showInputDialog("Escolha o tipo de conversão\n 1. Anos para meses\n 2. Anos para dias\n 3. Anos para horas\n 4. Anos para minutos");
        option = Integer.parseInt(optionStr);

        if (option == 1) {
            idade_convertida = idade * 12;
            JOptionPane.showMessageDialog(null, "A sua idade em meses é: " + idade_convertida);       
        } else if (option == 2) {
            idade_convertida = idade * 365;
            JOptionPane.showMessageDialog(null, "A sua idade em dias é: " + idade_convertida);
        } else if (option == 3) {
            idade_convertida = idade * 8760;
            JOptionPane.showMessageDialog(null, "A sua idade em horas é: " + idade_convertida);
        } else if (option == 4) {
            idade_convertida = idade * 525600;
            JOptionPane.showMessageDialog(null, "A sua idade em minutos é: " + idade_convertida);    
        }
    }
}
