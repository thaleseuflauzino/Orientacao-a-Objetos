import javax.swing.JOptionPane;

public class Peca extends Item{
    private String marca, unidade;
    public Peca() {}
    public Peca(String descricao, int valor, int codigo, String unidade, String marca) {
        super(descricao, valor, codigo);
        this.unidade = unidade;
        this.marca = marca;
    }
    public Peca(String descricao, int valor) {
        super(descricao, valor);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public String getMarca() {
        return marca;
    }
    public String getUnidade() {
        return unidade;
    }

    @Override

    public String toString() {
        return super.toString();      
    }

    public String imprimir(){
        return super.imprimir();
    }

    public void pecas(){
        Peca pastilhaFreio = new Peca("Novas Pastilhas de Freio", 50, 5, "2 unidades", "Fras-le");
        Peca filtroCombustível = new Peca("Novos Filtros de Combustível", 150, 6, "1 unidade", "BOSCH");
        Peca correia = new Peca("Nova Correia Dentada", 75, 7, "1 unidade", "Continental Correias");
        Peca discoFreio = new Peca("Novos Discos de Freio", 45, 8, "2 unidades", "Fremax");
        String Lista = pastilhaFreio.toString() + "\n\n" + filtroCombustível.toString() + "\n\n" + correia.toString() + "\n\n" + discoFreio.toString() + "\n\n";
        String entrada = JOptionPane.showInputDialog("Você deseja ver a lista de Peças? (S/N)");
        if (entrada.equalsIgnoreCase("S")) {
            JOptionPane.showMessageDialog(null, Lista);
        } 
    }
    public void valorPecas(){
        Peca pastilhaFreio = new Peca("Novas Pastilhas de Freio", 50);
        Peca filtroCombustível = new Peca("Novos Filtros de Combustível", 150);
        Peca correia = new Peca("Nova Correia Dentada", 75);
        Peca discoFreio = new Peca("Novos Discos de Freio", 45);
        String Lista = pastilhaFreio.imprimir() + "\n\n" + filtroCombustível.imprimir() + "\n\n" + correia.imprimir() + "\n\n" + discoFreio.imprimir() + "\n\n";
        JOptionPane.showMessageDialog(null, Lista);
    }
    }

