public class Cliente extends Oficina {
    private String cpfCliente, nomeCompleto, dataNascimento, email;
    protected Veiculo veiculo;
    private int idade;

    public Cliente(String cpfCliente, String nomeCompleto, String dataNascimento, String email, int idade, Veiculo veiculo) {
        this.cpfCliente = cpfCliente;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.idade = idade;
        this.veiculo = veiculo;
    }

    public Cliente(){
    }

    public void setCpf(String cpf) {
        this.cpfCliente = cpf;
    }
    
    public String getCpf() {
        return cpfCliente;
    }

    public void setNome(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNome() {
        return nomeCompleto;
    }
    
    public void setIdade(int i) {
        this.idade = i;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override

    public String imprimir() {
        return super.imprimir() + "\n\n Seus Dados:" +
        "\n Cpf: " + cpfCliente +
        "\n Nome Completo: " + nomeCompleto +
        "\n Email: " + email +
        "\n Data de Nascimento: " + dataNascimento +
        "\n Idade: " + idade +
        "\n Placa do Veiculo: " + veiculo.getPlaca(); 
                
    }
}
