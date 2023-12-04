package poogym;

import java.util.Scanner;

public class Main {

    protected static Instrutores admin = new Instrutores();
    private static Scanner scan = new Scanner(System.in);
    private static int resposta = 0, resp = 0, id = 0;

    static void logo() {
        System.out.println("\n////////////////////////////////");
        System.out.println("//        FITNESS CLUB        //");
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

    private static int menuId() {
        logo();
        System.out.println("  Insira o id: ");
        System.out.print("  >> ");
        id = scan.nextInt();
        scan.nextLine();
        while (id > admin.getQntClientes()) {
            System.out.println("  ID Invalido!");
            System.out.print("  >> ");
            id = scan.nextInt();
        }
        return id;

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
        System.out.println("  7 - Exibir informacao corporal");
        System.out.println("  8 - Listar todos os clientes");
        System.out.println("  9 - Voltar ao menu anterior");
        System.out.print("  >> ");
    }

    static void menuCadCli() {
        logo();
        System.out.println("  1 - Cadastrar info pessoal");
        System.out.println("  2 - Cadastrar info corporal");
        System.out.println("  3 - Voltar ao menu anterior");
        System.out.print("  >> ");
    }

    static void menuInfoCorpo() {
        logo();
        System.out.println("  1 - Indice de Massa Corporal");
        System.out.println("  2 - Taxa metabolica basal");
        System.out.println("  3 - Exibir informacoes gerais");
        System.out.println("  4 - Quantidade de agua diaria");
        System.out.println("  5 - Voltar ao menu anterior");
        System.out.print("  >> ");
    }

    static void menuModExc() {
        logo();
        System.out.println("  1 - Modificar nome");
        System.out.println("  2 - Modificar series e repeticoes: ");
        System.out.println("  3 - Modificar dia da semana");
        System.out.println("  4 - Modificar peso");
        System.out.println("  5 - Modificar tudo");
        System.out.println("  6 - Voltar ao menu anterior");
        System.out.print("  >> ");
    }

    static int menuExc() {
        admin.getClientes().get(id).getFicha().listar();
        System.out.print("\nInforme o exercicio a ser modificado: ");
        int index = scan.nextInt();
        scan.nextLine();
        return index;
    }

    static void erro() {
        System.out.println("\nERRO! Nenhuma pessoa cadastrada!");
    }

    public static void main(String[] args) {
        do {
            menu0();
            resposta = scan.nextInt();
            scan.nextLine();
            switch (resposta) {
                case 1: //Cliente
                    if (admin.qntClientes >= 0) {
                        int id = menuId();
                        do {
                            menuCliente1();
                            resp = scan.nextInt();
                            scan.nextLine();
                                switch (resp) {
                                    case 1: //Exibir ficha de exercicios
                                        if (admin.qntClientes >= 0) {
                                            admin.exibirFicha(admin.getClientes().get(id));
                                        } else {
                                            erro();
                                        }
                                        break;
                                    case 2: //Exibir info corporal
                                        if (admin.qntClientes >= 0 && admin.getClientes().get(id).getCorpoCliente() != null) {
                                            admin.getClientes().get(id).getCorpoCliente().infoGeral();
                                        } else {
                                            System.out.println("ERRO! Informacoes corporais nao cadastradas");
                                        }
                                        break;
                                }
                        } while (resp != 3);
                    }else {
                        erro();
                        System.out.println("Acesse Instrutor e cadastre um Cliente!");
                    }
                    resposta = 0;
                    break;
                case 2:
                    System.out.print("\nInsira a senha: ");
                    String senha = scan.nextLine();
                    if (senha.equals(admin.getId())) {
                        do {
                            menuInstrutor0();
                            resp = scan.nextInt();
                            scan.nextLine();
                            if (resp == 1|resp==9 | admin.qntClientes >= 0) {
                                switch (resp) {
                                    case 1: //cadastrar cliente
                                        int cad;
                                        do {
                                            menuCadCli();
                                            cad = scan.nextInt();
                                            scan.nextLine();
                                            if(cad==1|admin.getQntClientes()>=0){
                                            switch (cad) {
                                                case 1: //Cadastrar info pessoal
                                                    System.out.print("Nome....: ");
                                                    String nome = scan.nextLine();
                                                    System.out.print("CPF.....: ");
                                                    String cpf = scan.next();
                                                    scan.nextLine();
                                                    System.out.print("Telefone: ");
                                                    String telefone = scan.next();
                                                    scan.nextLine();
                                                    System.out.print("Endereco: ");
                                                    String endereco = scan.nextLine();
                                                    
                                                    System.out.println("Id de " + nome + ": " + (admin.getQntClientes()+1));
                                                    admin.cadastro(nome, cpf, telefone, endereco);
                                                    break;

                                                case 2: //Cadastrar info corporal
                                                    int id = menuId();
                                                    System.out.print("\nIdade...........: ");
                                                    int idade = scan.nextInt();
                                                    scan.nextLine();
                                                    System.out.print("Sexo.......(f/m): ");
                                                    char sexo = scan.nextLine().charAt(0);
                                                    System.out.print("Altura(cm).......: ");
                                                    int altura = scan.nextInt();
                                                    System.out.print("Peso(Kg)........: ");
                                                    double peso = scan.nextDouble();
                                                    scan.nextLine();
                                                    System.out.print("Cintura(cm).....: ");
                                                    double cintura = scan.nextDouble();
                                                    scan.nextLine();
                                                    System.out.print("Braco(cm).......: ");
                                                    double braco = scan.nextDouble();
                                                    scan.nextLine();
                                                    System.out.print("Panturrilha(cm).: ");
                                                    double panturrilha = scan.nextDouble();
                                                    scan.nextLine();

                                                    CorpoCliente corpo;
                                                    corpo = new CorpoCliente(idade, sexo, altura, peso, cintura, braco, panturrilha);
                                                    admin.getClientes().get(id).setCorpoCliente(corpo);
                                                    break;
                                            }
                                            }else{
                                                erro();
                                                System.out.println("Selecione a opcao 1");
                                            }
                                        } while (cad != 3);
                                        break;

                                    case 2: //adicionar exercicio
                                        int id = menuId();
                                        admin.getClientes().get(id).getFicha().listarOpcoes();
                                        System.out.println("\nExercicio a ser adicionado: ");
                                        int opc = scan.nextInt();
                                        scan.nextLine();
                                        System.out.print("Peso(Kg).....: ");
                                        double peso = scan.nextDouble();
                                        scan.nextLine();
                                        System.out.print("Dia da Semana: ");
                                        String dia = scan.next();
                                        scan.nextLine();
                                        admin.getClientes().get(id).getFicha().adicionar(opc, peso, dia);
                                        break;

                                    case 3: //modificar exercicio
                                        int menu;
                                        do {
                                            id = menuId();
                                            menuModExc();
                                            menu = scan.nextInt();
                                            scan.nextLine();
                                            switch (menu) {
                                                case 1: //modificar nome do exercicio
                                                    int index = menuExc();
                                                    System.out.print("\nNovo nome do exercicio: ");
                                                    String nome = scan.nextLine();
                                                    admin.getClientes().get(id).getFicha().getExercicio().get(index).setNomeExe(nome);
                                                    break;

                                                case 2: //modificar serie X repeticao
                                                    index = menuExc();
                                                    System.out.print("\nNova serie: ");
                                                    int serie = scan.nextInt();
                                                    scan.nextLine();
                                                    System.out.print("\nNova repeticao: ");
                                                    int rep = scan.nextInt();
                                                    scan.nextLine();
                                                    admin.getClientes().get(id).getFicha().getExercicio().get(index).setSeries(serie);
                                                    admin.getClientes().get(id).getFicha().getExercicio().get(index).setRepet(rep);
                                                    break;

                                                case 3: //modificar dia da semana
                                                    index = menuExc();
                                                    System.out.print("\nNovo dia da semana: ");
                                                    dia = scan.nextLine();
                                                    admin.getClientes().get(id).getFicha().getExercicio().get(index).setDiaSemana(dia);
                                                    break;

                                                case 4: //modificar peso
                                                    index = menuExc();
                                                    System.out.print("\nNovo peso: ");
                                                    peso = scan.nextInt();
                                                    admin.getClientes().get(id).getFicha().getExercicio().get(index).setPeso(peso);
                                                    break;

                                                case 5: //modificar tudo
                                                    index = menuExc();
                                                    System.out.print("Nome do exercicio: ");
                                                    nome = scan.nextLine();
                                                    System.out.print("Musculos: ");
                                                    String musculo = scan.nextLine();
                                                    System.out.print("Repeticoes: ");
                                                    rep = scan.nextInt();
                                                    scan.nextLine();
                                                    System.out.print("Series: ");
                                                    serie = scan.nextInt();
                                                    scan.nextLine();
                                                    System.out.print("Peso: ");
                                                    peso = scan.nextFloat();
                                                    scan.nextLine();
                                                    System.out.print("Dia da Semana: ");
                                                    dia = scan.nextLine();
                                                    Exercicio ex = new Exercicio(nome, musculo, rep, serie, peso, dia);
                                                    admin.getClientes().get(id).getFicha().getExercicio().set(index, ex);
                                                    break;
                                            }
                                        } while (menu != 6);
                                        break;

                                    case 4: //apagar exercicio
                                        id = menuId();
                                        admin.getClientes().get(id).getFicha().listar();
                                        System.out.println("Informe o exercicio a ser excluido: ");
                                        System.out.print(">>  ");
                                        int nExc = scan.nextInt();
                                        scan.nextLine();
                                        admin.getClientes().get(id).getFicha().apagar(nExc);
                                        break;

                                    case 5: //exibir ficha
                                        admin.exibirFicha(admin.getClientes().get(menuId()));
                                        break;

                                    case 6: //exibir info pessoal
                                        id = menuId();
                                        System.out.println(admin.getClientes().get(id).toString());
                                        break;

                                    case 7: //exibir info corporal
                                        id = menuId();
                                        if(admin.getClientes().get(id).getCorpoCliente() != null){
                                            int info;
                                            do {
                                                menuInfoCorpo();
                                                info = scan.nextInt();
                                                scan.nextLine();
                                                switch (info) {
                                                    case 1: //IMC
                                                        admin.getClientes().get(id).getCorpoCliente().analisaImc();
                                                        break;

                                                    case 2: //TMB
                                                        double tmb = admin.getClientes().get(id).getCorpoCliente().tmb();
                                                        System.out.println("\nTaxa metabolica basal: " + tmb + " cal");
                                                        break;

                                                    case 3: //InfoGeral
                                                        admin.getClientes().get(id).getCorpoCliente().infoGeral();
                                                        break;

                                                    case 4: //Agua
                                                        double agua = admin.getClientes().get(id).getCorpoCliente().agua();
                                                        System.out.println("\nQuantidade de agua diaria: " + agua + " mL");
                                                        break;
                                                }

                                            } while (info != 5);
                                        }else{
                                            System.out.println("ERRO! Cadastre as informacoes corporais primeiro!");
                                            System.out.println("Va em: (1)Cadastrar cliente >> (2)Cadastrar info corporal");
                                        }
                                    break;
                                    
                                    case 8: //listar clientes
                                        admin.listarClientes();
                                        break;
                                }
                            }else{
                                erro();
                                System.out.println("Selecione a opcao 1");
                            }
                        } while (resp != 9);
                    } else {
                        System.out.println("\nSenha incorreta!");
                    }
            }
        } while (resposta != 3);

    }

}