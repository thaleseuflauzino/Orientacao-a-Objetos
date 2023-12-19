public class Veiculo extends Oficina {
    private String marca, modelo, cor, placa;
    private int anoFabricacao, quilometragem;
    private double nivelCombustivel;
    private Cliente dono;

    public Veiculo(String marca, String modelo, int anoFabricacao, String cor, String placa, int quilometragem, double nivelCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.nivelCombustivel = nivelCombustivel;
        this.placa = placa;
    }
    public Veiculo() {}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }
    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    @Override

    public String imprimir() {
        return super.imprimir() + "\n\n Dados:" +
        "\nMarca: " + getMarca() + "\nModelo: " + getModelo() +
                        "\nAno de Fabricação: " + getAnoFabricacao() +
                        "\nPlaca: " + getPlaca() + "\nCor: " + getCor() + "\nQuilometragem: " + getQuilometragem()
                        + " Km\nNível do Combustível: " + getNivelCombustivel() + "% \nDono registrado: "+ dono.getNome() + "\nCpf do Dono Registrado: " + dono.getCpf();
                
    }
}