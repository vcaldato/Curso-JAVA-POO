public class Pessoa {
    Carro carro;
    int idade;
    String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
     void ligarCarro(){
        carro.ligar();
     }
     void acelerarCarro(){
        carro.acelerar();
     }
     void trocarDMarcha(){
        carro.trocarMarcha();
     }
     void reduzirVelocidade(){
        carro.reduzirVelo();
     }
     void desligarCarro(){
        carro.desligar();
     }
     void setCambioCarro(int marcha){
        carro.setCambio(marcha);
     }
     
}
