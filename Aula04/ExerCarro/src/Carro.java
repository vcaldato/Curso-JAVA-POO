public class Carro{
      int cambio;
      String placa;
      String cor;
      int nrPorta;
      String tipo;
      boolean ligado;
      int velocidade;

      public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
      public int getNrPorta() {
        return nrPorta;
    }
    public void setNrPorta(int nrPorta) {
        this.nrPorta = nrPorta;
    }
      public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
      public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setCambio(int marcha) {
        this.cambio = marcha;
    }

    public int getCambio() {
        return this.cambio;
    }
    void ligar(){
        this.ligado = true;
        System.out.println("Seu carro está ligado!!");
    }
    void trocarMarcha(){
       System.out.println("Mudou a marcha!");
    }
    void acelerar(){
        this.velocidade += 20;
        System.out.println("O carro aumentou sua velocidade para 40km!");

    }
    void reduzirVelo(){
        this.velocidade -= 20;
        System.out.println("O carro diminuiu a velocidade para 20km!");

    }
    void desligar(){
        this.ligado = false;
        System.out.println("O carro esta desligado");

    }

    


}