import java.time.LocalDate;

public class Cliente extends Fisica{

    private int protocoloAtendimento;

    public Cliente(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int protocoloAtendimento) {
        super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "\n protocoloAtendimento=" + protocoloAtendimento +
                "} " + super.toString();
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
}
