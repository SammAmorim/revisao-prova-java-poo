import java.time.LocalDate;

public class Engenheiro extends Funcionario {

    private String crea;

//Constructor
    public Engenheiro(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String crea) {
        super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.crea = crea;
    }
//to string
    @Override
    public String toString() {
        return "Engenheiro{" +
                "\n crea='" + crea +
                "} " + super.toString();
    }

//Metodo Abstrato
    @Override
    public double getSalarioFinal() {
        return super.Salario;
    }
//Getters and Setters
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
