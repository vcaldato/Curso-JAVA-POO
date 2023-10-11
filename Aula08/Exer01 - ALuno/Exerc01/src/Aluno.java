public class Aluno extends Pessoa {
    protected String matricula;

    public Aluno(String nome, String cpf,String DataNasc,
    String matricula){
        super(nome, cpf, DataNasc);
        this.matricula = matricula;
    }
    void mostrarAluno(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Data de nascimento: "+DataNasc);
        System.out.println("matricula: "+matricula);

    }
    
}
