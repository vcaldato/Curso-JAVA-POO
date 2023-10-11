public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String DataNasc;

    public Pessoa(String nome, String cpf, String DataNasc){
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.DataNasc = DataNasc;
    }
    void mostrarPessoa(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Data de nascimento: "+DataNasc);
        

    }

}
