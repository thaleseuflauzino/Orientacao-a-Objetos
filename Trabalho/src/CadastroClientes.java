import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroClientes extends Oficina{
    private static List<Cliente> listaClientes = new ArrayList<>();
    private static List<Veiculo> listaVeiculos = new ArrayList<>();
    
    public static ResultadoCadastro cadastrarCliente() {
        String cpfCliente = JOptionPane.showInputDialog("Informe o cpf do cliente");
        String nomeCompleto = JOptionPane.showInputDialog("Informe o nome completo do cliente");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente"));
        String email = JOptionPane.showInputDialog("Informe o email do cliente");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do cliente");
        JOptionPane.showMessageDialog(null, "Agora informe os dados de seu veículo");
        String marca = JOptionPane.showInputDialog("Informe a marca do veiculo");
        String modelo = JOptionPane.showInputDialog("Informe a modelo do veiculo");
        int anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do veiculo"));
        String cor = JOptionPane.showInputDialog("Informe a cor do veiculo");
        String placa = JOptionPane.showInputDialog("Informe a placa do veiculo");
        int quilometragem = Integer.parseInt(JOptionPane.showInputDialog("Informe a quilometragem do veiculo"));
        double nivelCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Informe o nivel de combustível do veiculo em porcentagem"));
        Veiculo v1 = new Veiculo(marca, modelo, anoFabricacao, cor, placa, quilometragem, nivelCombustivel);
        Cliente cliente = new Cliente(cpfCliente, nomeCompleto, dataNascimento, email, idade, v1);
        v1.setDono(cliente);
        listaClientes.add(cliente);
        listaVeiculos.add(v1);
        return new ResultadoCadastro(listaClientes, listaVeiculos);
    }
    public static void procurarCliente(String cpf) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                JOptionPane.showMessageDialog(null,cliente.imprimir());}
        }
    }   
    public static void procurarVeiculo(String placa) {
        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                JOptionPane.showMessageDialog(null,veiculo.imprimir());}
        }
    } 
}

class ResultadoCadastro {
    private List<Cliente> listaClientes;
    private List<Veiculo> listaVeiculos;

    public ResultadoCadastro(List<Cliente> listaClientes, List<Veiculo> listaVeiculos) {
        this.listaClientes = listaClientes;
        this.listaVeiculos = listaVeiculos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
}
