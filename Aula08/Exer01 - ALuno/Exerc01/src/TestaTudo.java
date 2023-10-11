public class TestaTudo {
        public static void main(String[] args) {
        Pessoa p = new Pessoa("vinicius", "42342523424", "07/08/2004");
        Funcionario f = new Funcionario("William", "2342342234532", "15/04/2005",
     "3432342", "12/03/2022", 4000);
        ChefeDepartamento cd = new ChefeDepartamento("Gustavo", "42324234234",
      "04/10/2000",
       "2342342", "03/02/2021", 8000, "Cargo",
        "21/10/2023", 400);
        Aluno a = new Aluno("Victor", "324234234232", "22/10/2012", "2423432");   

        System.out.println("Dados da Pessoa: ");
        p.mostrarPessoa();
        System.out.println("Dados do Funcionario: ");
        f.mostrarFuncionario();
         System.out.println("Dados do Chefe: ");
        cd.mostrarChefe();
        System.out.println("Dados do Aluno ");
        a.mostrarAluno();

       


        }
  





       

        
}
