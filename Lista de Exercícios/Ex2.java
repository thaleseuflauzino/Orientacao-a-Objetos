import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        String optionStr, celsiusStr, fahreStr;
        double option, celsius, Fahrenheit;
        optionStr = JOptionPane.showInputDialog("Escolha o tipo de conversão\n 1. Celsius para Fahrenheit\n 2. Fahrenheit para Celsius");
        option = Integer.parseInt(optionStr);

        if (option == 1) {
        celsiusStr  = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
        celsius = Double.parseDouble(celsiusStr);
        Fahrenheit = (celsius * 1.8) + 32;
        JOptionPane.showMessageDialog(null, "Resultado em graus Fahrenheit: " + Fahrenheit);
        } else if (option == 2) {
            fahreStr  = JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit:");
            Fahrenheit = Double.parseDouble(fahreStr);
            celsius = (Fahrenheit - 32) / 1.8;
            JOptionPane.showMessageDialog(null, "Resultado em graus Celsius: " + celsius);
        }

    }
}
