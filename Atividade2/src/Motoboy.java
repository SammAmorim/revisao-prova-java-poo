import java.time.LocalDate;

public class Motoboy extends Funcionario {

    private String carteirDeHabilitacao;

    //Constructor
    public Motoboy(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String carteirDeHabilitacao) {
        super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.carteirDeHabilitacao = carteirDeHabilitacao;
    }

    //toString

    @Override
    public String toString() {
        return "Motoboy{" +
                "\n carteirDeHabilitacao='" + carteirDeHabilitacao +
                "} " + super.toString();
    }

//Metodo Abstrato
    @Override
    public double getSalarioFinal() {
        return super.Salario;
    }

    //Getters and Setters


    public String getCarteirDeHabilitacao() {
        return carteirDeHabilitacao;
    }

    public void setCarteirDeHabilitacao(String carteirDeHabilitacao) {
        this.carteirDeHabilitacao = carteirDeHabilitacao;
    }
}
