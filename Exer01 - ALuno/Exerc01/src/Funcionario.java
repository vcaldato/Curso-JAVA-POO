public class Funcionario extends Pessoa{
    protected String matricula;
    protected String DataAdmissao;
    protected double salario;

    public Funcionario(String nome, String cpf,String DataNasc, String matricula,
    String DataAdmissao, double salario ){
        super(nome, cpf, DataNasc);
        this.matricula = matricula;
        this.DataAdmissao = DataAdmissao;
        this.salario = salario;
    }
    void mostrarFuncionario(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Data de nascimento: "+DataNasc);
        System.out.println("Matricula: "+matricula);
        System.out.println("Data de Admissao: "+DataAdmissao);
        System.out.println("Salário: "+salario);

    }
}
