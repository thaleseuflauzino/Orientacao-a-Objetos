public abstract class Item {
    private int codigo; private String descricao; private int valor;

    protected Item(String descricao, int valor, int codigo) {
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
    }
    protected Item(String descricao, int valor) {
        this.descricao = descricao; this.valor = valor;
    }
    
    protected Item(){}

    public String toString() {
        return "Descricao: " + getDescricao() + "\nPreco: R$" + getValor() + ",00" + "\nCódigo do Produto: " + getCodigo();
    }
    public String imprimir() {
        return "Descricao: " + getDescricao() + "\nPreco: R$" + getValor() + ",00";
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCodigo() {
        return codigo;
    }
    public int getValor() {
        return valor;
    }
    public String getDescricao() {
        return descricao;
    }
}
