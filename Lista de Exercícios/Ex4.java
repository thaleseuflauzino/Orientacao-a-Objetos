import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        String nota1Str, nota2Str, nota3Str, peso1Str, peso2Str, peso3Str;
        double nota1, nota2, nota3, peso1, peso2, peso3, MediaFinal;
        
        nota1Str = JOptionPane.showInputDialog("Digite a primeira nota");
        nota2Str = JOptionPane.showInputDialog("Digite a segunda nota");
        nota3Str = JOptionPane.showInputDialog("Digite a terceira nota");

        nota1 = Double.parseDouble(nota1Str);
        nota2 = Double.parseDouble(nota2Str);
        nota3 = Double.parseDouble(nota3Str);

        peso1Str = JOptionPane.showInputDialog("Digite o peso da primeira nota");
        peso2Str = JOptionPane.showInputDialog("Digite o peso da segunda nota");
        peso3Str = JOptionPane.showInputDialog("Digite o peso da terceira nota"); 

        peso1 = Double.parseDouble(peso1Str);
        peso2 = Double.parseDouble(peso2Str);
        peso3 = Double.parseDouble(peso3Str);

        MediaFinal = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        JOptionPane.showMessageDialog(null, "A média final é: " + MediaFinal);
    }
}
