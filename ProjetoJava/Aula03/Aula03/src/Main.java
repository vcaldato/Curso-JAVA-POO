public class Main {
    public static void main(String[] args) throws Exception {
      Carro pampa = new Carro();
      

      System.out.println("DADOS DA PAMPA");
        pampa.setCor("vermelha");
        pampa.setPlaca("ADADA1SA");
        pampa.setTipo("Foda");
        pampa.setMarca("FORD");
        pampa.setModelo("pick up");
        pampa.setAnoFabricacao(1980);
        pampa.setTipoCombustivel("Álcool");


        System.out.println("Cor: " + pampa.getCor());
        System.out.println("Placa: "+pampa.getPlaca());
        System.out.println("Tipo: "+pampa.getTipo());
        System.out.println("Marca: "+pampa.getMarca());
        System.out.println("Modelo: "+pampa.getModelo());
        System.out.println("Ano de Fabricação: "+pampa.getAnoFabricacao());
        System.out.println("Tipo do combustivel: "+pampa.getTipoCombustivel());


        outroCarro vectra = new outroCarro("2ADASTR1", "cinza", "foda",
       "Chevrolet", "elegance", 1980, "Gasolina");
         
        System.out.println("DADOS DO VECTRA TURBO");
       System.out.println("Cor: " +vectra.cor);
        System.out.println("Placa: "+vectra.placa);
        System.out.println("Tipo: "+vectra.tipo);
        System.out.println("Marca: "+vectra.marca);
        System.out.println("Modelo: "+vectra.modelo);
        System.out.println("Ano de Fabricação: "+vectra.anoFabricacao);
        System.out.println("Tipo do combustivel: "+vectra.tipoCombustivel);





    }
}
