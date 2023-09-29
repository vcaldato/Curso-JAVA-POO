public class pessoa {
    int altura;
    int peso;
    String nome;

    pessoa(){
        this.altura = 0;
        this.nome = "";
        this.peso = 0;

    }
    pessoa(String nome, int altura, int peso){
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        
    }
}
