package ProjetoCarro;

public class Carro {
    String modelo;
    String cor;
    String marca;
    String chassi;
    int ano;
    int nPortas;
    int nMarcha;
    int marchaAtual;
    double velocidade;
    double velocidadeMaxima;
    double velocidadeAtual;
    double volumeCombustivel;
    boolean tetoSolar;
    boolean cambioAutomatico;
    Proprietario proprietario;

    void acelera(){
        velocidadeAtual +=1;
    }

    void freia(){
        velocidadeAtual =0;

    }

    void trocarMarcha(int marchaDesejada){
        marchaAtual = marchaDesejada;
    }

    void reduzirMarcha(){
        marchaAtual = marchaAtual -1;
    }
}
