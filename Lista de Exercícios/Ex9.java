import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
        String nota1String, nota2String, nota3String, peso1String, peso2String, peso3String;
        double nota1, nota2, nota3, peso1, peso2, peso3, Media;

        nota1String = JOptionPane.showInputDialog("Digite a nota 1: ");
        peso1String = JOptionPane.showInputDialog("Digite o peso da nota 1: ");

        nota2String = JOptionPane.showInputDialog("Digite a nota 2: ");
        peso2String = JOptionPane.showInputDialog("Digite o peso da nota 2: ");

        nota3String = JOptionPane.showInputDialog("Digite a nota 3: ");
        peso3String = JOptionPane.showInputDialog("Digite o peso da nota 3: ");

        peso1 = Double.parseDouble(peso1String); peso2 = Double.parseDouble(peso2String); peso3 = Double.parseDouble(peso3String);
        nota1 = Double.parseDouble(nota1String); nota2 = Double.parseDouble(nota2String); nota3 = Double.parseDouble(nota3String);
        Media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        String m = "A média ponderada é ";
        if (Media < 60) {
            JOptionPane.showMessageDialog(null, m + Media + ", que corresponde à classificação F.");
        } else if (Media > 89 && Media < 101) {
            JOptionPane.showMessageDialog(null, m + Media + ", que corresponde à classificação A.");
        } else if (Media > 79 && Media < 90) {
            JOptionPane.showMessageDialog(null, m + Media + ", que corresponde à classificação B.");
        } else if (Media > 69 && Media < 80) {
            JOptionPane.showMessageDialog(null, m + Media + ", que corresponde à classificação C.");
        } else if (Media > 59 && Media < 70) {
            JOptionPane.showMessageDialog(null, m + Media + ", que corresponde à classificação D.");
        }

    }

}
/*
* Digite a nota 1: 85
* Digite o peso da nota 1: 0.3
* 
* Digite a nota 2: 78
* Digite o peso da nota 2: 0.4
* 
* Digite a nota 3: 92
* Digite o peso da nota 3: 0.3
A média ponderada é 86.2, que corresponde à classificação B.
*/