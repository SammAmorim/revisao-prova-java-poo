import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao{


    private final double PREMIO = 0.2;

    //Constructor

    public Diretor(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);

    }

    //toString

    @Override
    public String toString() {
        return "Diretor{" +
                "\n PREMIO=" + PREMIO +
                "} " + super.toString();
    }


    //Metodos abstratos


    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo o funcionário: \n" + funcionario);

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Admitindo o funcionário: \n" + funcionario);
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.Salario * PREMIO;
        salarioFinal += super.Salario;
        return salarioFinal;
    }
}
