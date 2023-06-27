public class Produto {

    private String nome;
    private String categoria;
    private double preço;

    public Produto(String nome, String categoria, double preço) {
        this.nome = nome;
        this.categoria = categoria;
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome +
                "\n categoria='" + categoria +
                "\n preço=" + preço +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
