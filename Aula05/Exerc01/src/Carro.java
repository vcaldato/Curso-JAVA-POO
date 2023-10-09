public class Carro {
    private int cambio;
   private String placa;
   private String cor;
    private String tipo;
    public boolean ligado;
    private int velocidade;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
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

    private int getCambio() {
        return this.cambio;
    }
    
    private void ligar(){
        this.ligado = true;
        System.out.println("Seu carro está ligado!!");
    }

}
