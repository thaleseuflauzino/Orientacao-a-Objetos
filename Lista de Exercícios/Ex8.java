import javax.swing.JOptionPane;

public class Ex8 {
    public static void main(String[] args) {
        String opStr, num1String, num2String;
        double num1, num2;
        int operacao;
        double result;

        num1String = JOptionPane.showInputDialog("Digite o primeiro número: ");
        num1 = Double.parseDouble(num1String);

        num2String = JOptionPane.showInputDialog("Digite o segundo número:");
        num2 = Double.parseDouble(num2String);

        opStr = JOptionPane.showInputDialog("Escolha a operação:\n 1. Adição\n 2. Subtração\n 3. Multiplicação\n 4. Divisão\n");
        operacao = Integer.parseInt(opStr);
        
        switch (operacao) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0 ) {
                    result = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
                return;
        }
        JOptionPane.showMessageDialog(null,"Resultado: " + result);
    }
}
