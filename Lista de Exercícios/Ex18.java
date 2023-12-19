import javax.swing.JOptionPane;

public class Ex18 {

    public static class Ponto {
        private int x;
        private int y;

        public Ponto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static void trocarValoresPonto(Ponto ponto1, Ponto ponto2) {
        int tempX = ponto1.getX();
        int tempY = ponto1.getY();

        ponto1.setX(ponto2.getX());
        ponto1.setY(ponto2.getY());

        ponto2.setX(tempX);
        ponto2.setY(tempY);
    }

    public static void main(String[] args) {
        String valorX1String, valorY1String, valorX2String, valorY2String;
        int valorX1, valorX2, valorY1, valorY2;
        valorX1String = JOptionPane.showInputDialog("Informe o valor da primeira posição do vetor X"); valorY1String = JOptionPane.showInputDialog("Informe o valor da segunda posição do vetor X");
        valorX2String = JOptionPane.showInputDialog("Informe o valor da primeira posição do vetor Y"); valorY2String = JOptionPane.showInputDialog("Informe o valor da segunda posição do vetor Y");

        valorX1 = Integer.parseInt(valorX1String); valorX2 = Integer.parseInt(valorX2String); valorY1 = Integer.parseInt(valorY1String); valorY2 = Integer.parseInt(valorY2String);

        Ponto pontoA = new Ponto(valorX1, valorY1);
        Ponto pontoB = new Ponto(valorX2, valorY2);
        JOptionPane.showMessageDialog(null, "O valor atual do vetor X é: (" +  pontoA.getX() + ", " + pontoA.getY() + "). E o valor atual de Y é (" +  pontoB.getX() + ", " + pontoB.getY() + ")");
        //JOptionPane.showMessageDialog(null, "O valor atual do vetor Y é: " +  pontoB.getX() + ", " + pontoB.getY() );
        trocarValoresPonto(pontoA, pontoB);
        JOptionPane.showMessageDialog(null, "O valor após a troca do vetor X é: (" +  pontoA.getX() + ", " + pontoA.getY() + ") . E o valor após a troca de Y é (" +  pontoB.getX() + ", " + pontoB.getY() + ")");
        
    }
}
