
public class Autos {
    public static void main(String[] args) {
        Carro opalao = new Carro();
        OutroCarro dodge = new OutroCarro();

        System.out.println("DADOS DO OPALA");
        opalao.setCor("rosa");
        opalao.setPlaca("ADADA1SA");
        opalao.setTipo("Foda");

        System.out.println("Cor: " + opalao.getCor());
        System.out.println("Placa: "+opalao.getPlaca());
        System.out.println("Tipo: "+opalao.getTipo());

        dodge.setCor("marrom");
        dodge.setPlaca("ASDA12SA");
        dodge.setTipo("Insano");

        System.out.println("DADOS DO DODGE");
        System.out.println("Cor: " + dodge.getCor());
        System.out.println("Placa: "+dodge.getPlaca());
        System.out.println("Tipo: "+dodge.getTipo());



    }
    
}
