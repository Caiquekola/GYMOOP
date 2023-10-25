package poogym;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static int resposta = 0, resp = 0, id = 0;

    static void logo() {
        System.out.println("////////////////////////////////");
        System.out.println("/                              /");
        System.out.println("/         FITNESS CLUB         /");
        System.out.println("/                              /");
        System.out.println("////////////////////////////////\n");
    }

    static void menu0() {
        logo();
        System.out.println("  Escolha uma opcao: ");
        System.out.println("  1 - Cliente");
        System.out.println("  2 - Instrutor");
        System.out.println("  3 - Sair");
        System.out.print("  >> ");
    }

    static void menuCliente0() {
        logo();
        System.out.println("  Insira o id: ");
        System.out.print("  >> ");
    }

    static void menuCliente1() {
        logo();
        System.out.println("   1 - Ver ficha");
        System.out.println("   2 - Informacao corpo");
        System.out.println("   3 - Voltar ao menu anterior");
        System.out.print("   >> ");

    }

    static void menuInstrutor0() {
        logo();
        System.out.println("  1 - Cadastrar Cliente");
        System.out.println("  2 - Adicionar exercicio");
        System.out.println("  3 - Modificar exercicio");
        System.out.println("  4 - Apagar exercicio");
        System.out.println("  5 - Exibir ficha");
        System.out.println("  6 - Exibir informacao pessoal");
        System.out.println("  7 - Voltar ao menu anterior");
        System.out.print("  >> ");
    }
    
    static void menuModExc(){
        logo();
        System.out.println("  1 - Modificar nome");
        System.out.println("  2 - Modificar repeticao");
        System.out.println("  3 - Modificar serie");
        System.out.println("  4 - Modificar peso");
        System.out.println("  5 - Modificar dia");
        System.out.println("  6 - Modificar tudo");
        System.out.println("  7 - Voltar ao menu anterior");
        System.out.print  ("  >> ");
    }

    public static void main(String[] args) {
        Instrutores claudiano = new Instrutores();
        do {
            menu0();
            resposta = scan.nextInt();
            scan.nextLine();
            switch (resposta) {
                case 1:
                    do {
                        menuCliente1();
                        resp = scan.nextInt();
                        scan.nextLine();
                        switch (resp) {
                            case 1:
                                menuCliente0();
                                id = scan.nextInt();
                                scan.nextLine();
                                while (id > claudiano.getQntClientes()) {
                                    System.out.println("  ID Invalido!");
                                    System.out.print("  >> ");
                                    id = scan.nextInt();
                                }
                                claudiano.exibirFicha(claudiano.getClientes().get(id));
                                break;
                            case 2:
                                menuCliente0();
                                id = scan.nextInt();
                                scan.nextLine();
                                while (id > claudiano.getQntClientes()) {
                                    System.out.println("  ID Invalido!");
                                    System.out.print("  >> ");
                                    id = scan.nextInt();
                                    scan.nextLine();
                                }
                                claudiano.getClientes().get(id).getCorpoCliente().infoGeral();
                                break;
                            default:

                        }

                    } while (resp != 3);
                    resposta = 0;
                    break;
                case 2:
                    do {
                        menuInstrutor0();
                        resp = scan.nextInt();
                        scan.nextLine();
                        switch (resp) {
                            case 1:
                                System.out.print("\nNome: ");
                                String nome = scan.nextLine();
                                System.out.print("CPF: ");
                                String cpf = scan.next();
                                scan.nextLine();
                                System.out.print("Telefone: ");
                                String telefone = scan.next();
                                scan.nextLine();
                                System.out.print("Endereco: ");
                                String endereco = scan.nextLine();
                                
                                claudiano.cadastro(nome, cpf, telefone, endereco);
                                System.out.println(claudiano.getClientes().get(0).toString());
                                
                                
                                break;
                            case 2:
                                menuCliente0();
                                id = scan.nextInt();
                                scan.nextLine();
                                while (id > claudiano.getQntClientes()) {
                                    System.out.println("  ID Invalido!");
                                    System.out.print("  >> ");
                                    id = scan.nextInt();
                                    scan.nextLine();
                                }
                                System.out.print("Nome do exercicio: ");
                                nome = scan.nextLine();
                                System.out.print("Repeticoes: ");
                                int rep = scan.nextInt();
                                scan.nextLine();
                                System.out.print("Series: ");
                                int serie = scan.nextInt();
                                scan.nextLine();
                                System.out.print("Peso: ");
                                float peso = scan.nextFloat();
                                scan.nextLine();
                                System.out.print("Dia da Semana: ");
                                String dia = scan.next();
                                scan.nextLine();
                                claudiano.adcExc(claudiano.getClientes().get(id), nome, rep, serie, peso, dia);
                                break;
                            case 3:
                                menuCliente0();
                                id = scan.nextInt();
                                while (id > claudiano.getQntClientes()) {
                                    System.out.println("  ID Invalido!");
                                    System.out.print("  >> ");
                                    id = scan.nextInt();
                                }
                                menuModExc();
                                int menu = scan.nextInt();
                                scan.nextLine();
                                switch(menu){
                                    case 1:
                                }
                                break;
                            default:
                                
                        }
                    }while(resp != 7);
                default:
            }
        } while (resposta != 3);

    }

}
