public class Main {
    public static void main(String[] args) {
        
        Carro dodge = new Carro();
    
        dodge.setNrPorta(4);
        dodge.setTipo("Esportivo");
        dodge.setPlaca("ADQWEW2A");
        dodge.setCor("Amarelo");
    
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Vinicius");
        pessoa.setIdade(19);
    
    
        System.out.println("Cor: "+dodge.getCor());
        System.out.println("Placa: "+dodge.getPlaca());
        System.out.println("Tipo: "+dodge.getTipo());
        System.out.println("Número de portas: "+dodge.getNrPorta());
    
        pessoa.setCarro(dodge);
        pessoa.ligarCarro();
        pessoa.setCambioCarro(1);
        pessoa.trocarDMarcha();
        pessoa.setCambioCarro(2);
        pessoa.acelerarCarro();
        pessoa.reduzirVelocidade();
        pessoa.trocarDMarcha();
        pessoa.setCambioCarro(1);
        pessoa.desligarCarro();
    }
}
        
    