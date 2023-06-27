import java.time.LocalDate;

public class PrestacaoServico extends Juridica {

    private LocalDate contratoInicio;
    private LocalDate contratoFim;


    public PrestacaoServico(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricao, LocalDate contratoInicio, LocalDate contratoFim) {
        super(nome, telefone, email, endereco, cnpj, inscricao);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return "PrestacaoServico{" +
                "contratoInicio=" + contratoInicio +
                "\n contratoFim=" + contratoFim +
                "} " + super.toString();
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }
}
