public class Main {
    public static void main(String[] args) throws Exception {
        dirigir d = new dirigir(5, "Fusca", 90);
        futebol f = new futebol("Grêmio", 7, "Ponta");
        pessoa p = new pessoa("Vini", 190, 78);
        valorant v = new valorant(10, 12, 89);

        System.out.println("\nDADOS DO FUTEBOL");
        System.out.println("Time: "+f.time);
        System.out.println("Numero da camiseta: "+ f.nrCamiseta);
        System.out.println("Posição: "+ f.posicao);

        System.out.println("\nDADOS DA PESSOA");
       System.out.println("Nome: "+p.nome);
       System.out.println("Altura: "+ p.altura);
       System.out.println("Peso: "+ p.peso);

       System.out.println("\nDADOS DO VALORANT");
       System.out.println("Horas Jogadas: "+v.HorasJogadas);
       System.out.println("Número de jogadores: "+ v.nrJogador);
       System.out.println("Quantidade de mapa: "+ v.qntMapa);

       System.out.println("\nDADOS DO OBJETO DIRIGIR");
       System.out.println("Nome do carro: "+d.carro);
       System.out.println("Número de marchas: "+ d.numMarcha);
       System.out.println("Numero de cavalos: "+ d.cavalos);

    }
}
