public class Main {
    public static void main(String[] args) {
       // Considerando o código das classes Transporte, Terrestre e Automóvel apresentados
       // na Figura 4, finalize a implementação delas, adicionando os métodos get() e set() 
       //para cada um de seus atributos. Em seguida, crie uma
        //classe Principal com um método main() que cria um objeto da classe Automóvel, e chama todos
        // os métodos set() e get()
        //criados, inclusive das classes Transporte e Terrestre. Observe no seu exemplo, 
        //que é possível chamar todos os métodos get() e set() herdados pela classe Automóvel.
        Automovel dodge = new Automovel();

        dodge.setCapacidade(4);
        dodge.setCor("Dourado");
        dodge.setNrDePortas(2);
        dodge.setNrDeRodas(4);
        dodge.setPlaca("VINI312");

        System.out.println("*******************Dados do DODGE *********************\n");
        System.out.println("A capacidade do dodge é: "+dodge.getCapacidade());
        System.out.println("A cor dele é: "+dodge.getCor());
        System.out.println("O número de portas são: "+dodge.getNrDePortas());
        System.out.println("O número de rodas são: "+dodge.getNrDeRodas());
        System.out.println("A placa dele: "+dodge.getPlaca());

        




        
    }
}
