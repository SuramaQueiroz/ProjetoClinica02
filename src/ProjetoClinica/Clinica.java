package ProjetoClinica;


import java.util.Scanner;

public class Clinica {


    static void cadastraM (Medico m01,Scanner sc){
        System.out.println(" Entre com o nome do Medico");
        m01.nome = sc.next();
        System.out.println(" Entre com o CRM ");
        m01.CRM = sc.next();
        System.out.println(" Entre com especialidade ");
        m01.especialidade = sc.next();
    }
    static void cadastraP ( Paciente p01,Scanner sc){
        int op2;
        do {
            System.out.println("Entre com nome do Paciente ");
            p01.nome = sc.next();
            System.out.println(" Entre com RG:");
            p01.rg = sc.next();
            System.out.println(" Entre com o CPF: ");
            p01.cpf = sc.next();
            System.out.println(" Entre a data de nascimento");
            p01.datadenascimento = sc.next();
            System.out.println(" Entre com a rua: ");
            p01.rua = sc.next();
            System.out.println(" Entre com o Bairro ");
            p01.bairro = sc.next();
            System.out.println(" Entre com a cidade");
            p01.cidade = sc.next();
            System.out.println(" Entre com  o estado");
            p01.estado = sc.next();
            System.out.println(" Entre com o Estado Clinico ");
            p01.estadoClinico = sc.next();
            System.out.println("Entre com o plano de saude ");
            p01.planodesaude = sc.next();

            System.out.println(" Deseja corrigir alguma informação? \n 1) Sim \n 2) Nao ");
            op2 = sc.nextInt();
        }
        while (op2 == 1);
        System.out.println(" Cadastro com concluido!");

    }
    static void cadastraA( AtendimentoMedico a02,Scanner e){
        System.out.println( " Entre com data ? ");
        a02.data = e.next();
        System.out.println(" Entre com horario ? ");
        a02.horario = e.next();
        System.out.println(" Entre o tipo do atendimento ");
        a02.tipo = e.next();
        //System.out.println(" Informe o Medico ");
        //System.out.println(" 1)"+ m01.nome +"\n");
    }


    public static void main  (String args []){
        Scanner sc = new Scanner (System.in);
        int op;
        int escolha=0;

       do {
            System.out.println(" Deseja fazer um novo cadastro ?");
            System.out.print(" 1) Paciente \n ");
            System.out.print(" 2) Medico \n");
            System.out.print(" 3) Atendimento \n");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Paciente p01 = new Paciente();
                    cadastraP(p01,sc);
                    break;
                case 2:
                    Medico m01 = new Medico();
                    cadastraM(m01,sc);
                    break;
                case 3:
                    AtendimentoMedico a01 = new AtendimentoMedico();
                    int escolha2;
                    if(a01.p01 == null || a01.m01 == null){
                        System.out.println(" Ainda não há medico cadastrados ou Paciente cadastrados ");
                        System.out.println("Deseja cadastrar ? \n1)Medico  \n2)Paciente \n3)Não ");
                        escolha2 = sc.nextInt();
                        if(escolha2 == 1){
                            Medico m02 = new Medico();
                            cadastraM(m02,sc);
                            System.out.println(" cadastro concluido");
                        }
                        else if(escolha2 == 2){
                            Paciente p02 = new Paciente();
                            cadastraP(p02,sc);
                            System.out.println(" cadastro concluido");
                        }else {
                            System.exit(0);
                        }
                    }else{
                    cadastraA(a01,sc);
                    }
                    break;
                default:
                    System.out.println(" Opção Invalida!!!");
            }
           System.out.println(" Deseja iniciar o atendimento ? \n1) Sim \n2) Não ");
            escolha = sc.nextInt();
            if(escolha == 1){
                AtendimentoMedico a01 = new AtendimentoMedico();
                cadastraA(a01,sc);
                System.out.println(" Atendimento encerrado");
            }
       }
      while(escolha==1);


    }
}
