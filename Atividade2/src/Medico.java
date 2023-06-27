import java.time.LocalDate;

public class Medico extends Funcionario {

    private String crm;

    //Constructor

    public Medico(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String crm) {
        super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.crm = crm;
    }

    //toString


    @Override
    public String toString() {
        return "Medico{" +
                "\n crm='" + crm +
                "} " + super.toString();


    }
//Metodo Abstrato
    @Override
    public double getSalarioFinal() {
        return super.Salario;
    }

    //Getters and Setters


    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }


}
