package ProjetoCarro;

public class Main {
    public static void main (String args[]) {
        Proprietario proprietario = new Proprietario();
        proprietario.nome = "Surama";
        proprietario.bairro = "marambaia";
        proprietario.cep = "66620160";
        proprietario.cidade = "belem";
        proprietario.cpf = "96868588578";
        proprietario.datadenascimento = "12/05/90";
        proprietario.estado = "Para";
        proprietario.rg = "326985";
        proprietario.rua = "portel";
        proprietario.complemento = "medici";

        Carro carro = new Carro();
        carro.nPortas =5;
        carro.proprietario = proprietario;
        carro.marchaAtual = proprietario;
        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        carro.freia();
        System.out.println(carro.velocidadeAtual);

        System.out.println(carro.marchaAtual);
        carro.trocarMarcha(3);
        System.out.println(carro.marchaAtual);
    }
}
