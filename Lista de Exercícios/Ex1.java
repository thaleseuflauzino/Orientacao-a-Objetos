import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main (String[] args) {

        String V_Totalstr, P_Gorjetastr, Gorjetastr, V_Contastr;
        double V_Conta, V_Total, P_Gorjeta, Gorjeta;


        V_Contastr = JOptionPane.showInputDialog("Digite o valor total da conta:");
        V_Conta = Double.parseDouble(V_Contastr);

        P_Gorjetastr = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar (por exemplo, 15 para 15%):");
        P_Gorjeta = Integer.parseInt(P_Gorjetastr);

        Gorjeta = (V_Conta * P_Gorjeta) / 100;
        V_Total = V_Conta + Gorjeta;

        DecimalFormat df = new DecimalFormat("#.##");
        Gorjetastr = df.format(Gorjeta);
        V_Totalstr = df.format(V_Total);

        JOptionPane.showMessageDialog(null, "Valor da gorjeta: $" + Gorjetastr);
        JOptionPane.showMessageDialog(null, "Total a ser pago: $" + V_Totalstr);
    }
}