public class Main {
    public static void main(String[] args) throws Exception {
       Futebol f = new Futebol();
       Pessoa p = new Pessoa();
       Valorant v = new Valorant();
       Dirigir d = new Dirigir();

       f.setTime("Grêmio");
       f.setNrCamiseta(5);
       f.setPosicao("Volante");

       System.out.println("\nDADOS DO FUTEBOL");
       System.out.println("Time: "+f.getTime());
       System.out.println("Numero da camiseta: "+ f.getNrCamiseta());
       System.out.println("Posição: "+ f.getPosicao());

        p.setNome("joao");
       p.setAltura(190);
       p.setPeso(80);

       System.out.println("\nDADOS DA PESSOA");
       System.out.println("Nome: "+p.getNome());
       System.out.println("Altura: "+ p.getAltura());
       System.out.println("Peso: "+ p.getPeso());

         v.setHorasJogadas(299);
       v.setNrJogador(10);
       v.setQntMapa(12);

       System.out.println("\nDADOS DO VALORANT");
       System.out.println("Horas Jogadas: "+v.getHorasJogadas());
       System.out.println("Número de jogadores: "+ v.getNrJogador());
       System.out.println("Quantidade de mapa: "+ v.getQntMapa());

         d.setCarro("GOl");
       d.setCavalos(120);
       d.setNumMarcha(5);

       System.out.println("\nDADOS DO OBJETO DIRIGIR");
       System.out.println("nome: "+d.getCarro());
       System.out.println("cavalos: "+ d.getCavalos());
       System.out.println("numero de marchas: "+ d.getNumMarcha());




    }
}
