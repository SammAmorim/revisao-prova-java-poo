import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {


Diretor diretor = new Diretor("Sam", "223223", "sam@gmail.com", new Endereco("Condominio", "33", "??", "2000200", "Salvador", UnidadeFederativa.BAHIA), Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1992, Month.MARCH, 12), "2222222", "23444", "123", Setor.OPERACOES, 8000.30);

        Engenheiro engenheiro = new Engenheiro("Samuel", "123456789", "samuel@gmail.com",new Endereco("Casa", "123", "Próximo ao Bar", "41200100", "Salvador", UnidadeFederativa.BAHIA), Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(2004,Month.APRIL,20), "12398799", "1234567", "41234", Setor.ENGENHARIA, 1200.20,  "crea555");
        Motoboy motoboy = new Motoboy("Well", "1234567", "well@gmail.com", new Endereco("Casa", "22", "Próximo ao Hotel", "2000300", "Salvador", UnidadeFederativa.BAHIA), Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1998, Month.DECEMBER, 18), "1234567", "12345", "12345", Setor.OPERACOES, 2000.20, "123");



        //System.out.println(engenheiro.toString());

        diretor.admitir(motoboy);
    }
}
