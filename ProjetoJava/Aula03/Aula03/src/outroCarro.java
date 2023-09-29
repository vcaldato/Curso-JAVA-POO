public class outroCarro {
    String placa;
    String cor;
    String tipo;
    String marca;
    String modelo;
    int anoFabricacao;
    String tipoCombustivel;

    outroCarro(){
        this.placa = "";
        this.cor = "";
        this.tipo = "";
        this.marca = "";
        this.modelo = "";
        this.tipoCombustivel = "";
        this.anoFabricacao = 0;
}
    outroCarro(String placa, String cor, String tipo,
     String marca, String modelo, int anoFabricacao, String tipoCombustivel ){
        this.placa = placa;
        this.cor = cor;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.anoFabricacao = 1980;
     }
}
