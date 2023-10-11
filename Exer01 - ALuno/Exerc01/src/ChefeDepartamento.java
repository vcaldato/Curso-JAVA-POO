public class ChefeDepartamento extends Funcionario {
    private String departamento;
    private String dataPromocao;
    private double gratificacao;
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getDataPromocao() {
        return dataPromocao;
    }
    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }
    public double getGratificacao() {
        return gratificacao;
    }
    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    public ChefeDepartamento(String nome, String cpf,String DataNasc, String matricula,
    String DataAdmissao, double salario, String departamento, String dataPromocao, double gratificacao ){
        super(nome, cpf, DataNasc, matricula, DataAdmissao, salario);
        this.departamento =departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;

    }
    void mostrarChefe(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Data de nascimento: "+DataNasc);
        System.out.println("Matricula: "+matricula);
        System.out.println("Data de Admissao: "+DataAdmissao);
        System.out.println("Salário: "+salario);
        System.out.println("Departamento: "+departamento);
        System.out.println("Data de promoção: "+dataPromocao);
        System.out.println("Gratificação: "+gratificacao);


    }

    }


