import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        String peso_str, altura_str;
        double peso, altura, IMC;

        peso_str =  JOptionPane.showInputDialog("Digite seu peso em kg: ");

        altura_str = JOptionPane.showInputDialog("Digite sua altura em metros: ");

        peso = Double.parseDouble(peso_str);
        altura = Double.parseDouble(altura_str);

        IMC = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", IMC));

        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: " + "Baixo peso");
        } else if (18.5 <= IMC && IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: " + "Normal");            
        } else if (25 <= IMC && IMC <= 29.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: " + "Sobrepeso");            
        } else if (30 <= IMC && IMC <= 34.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: " + "Obesidade classe I");            
        } else if (35 <= IMC && IMC <= 39.9) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: " + "Obesidade classe II");            
        } else if (IMC > 40) {
            JOptionPane.showMessageDialog(null, "Classificação de IMC: " + "Obesidade classe III");            
        }
    }
}
