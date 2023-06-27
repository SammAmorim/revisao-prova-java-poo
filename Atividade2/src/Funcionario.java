import java.time.LocalDate;

public abstract class Funcionario extends Fisica implements SalarioFinal{

    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double Salario;

    public Funcionario(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        Salario = salario;
    }

    //toString


    @Override
    public String toString() {
        return "Funcionario{" +
                "\n cpf='" + cpf +
                "\n rg='" + rg +
                "\n matricula='" + matricula +
                "\n setor=" + setor +
                "\n Salario=" + Salario +
                "} " + super.toString();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
