public abstract class Juridica extends Pessoa{

    protected String cnpj;
    protected String inscricao;

    public Juridica(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricao) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricao = inscricao;
    }

    @Override
    public String toString() {
        return "Juridica{" +
                "\n cnpj='" + cnpj +
                "\n inscricao='" + inscricao +
                "} " + super.toString();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }
}
