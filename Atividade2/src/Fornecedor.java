public class Fornecedor extends Juridica {

    private Setor setor;
    private Produto produto;

    public Fornecedor(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricao, Setor setor, Produto produto) {
        super(nome, telefone, email, endereco, cnpj, inscricao);
        this.setor = setor;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "\n setor=" + setor +
                "\n produto=" + produto +
                "} " + super.toString();
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
