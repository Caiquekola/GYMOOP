package poogym;

import java.util.Scanner;

public class Main {

    static Instrutores claudiano = new Instrutores();

    static Scanner scan = new Scanner(System.in);
    static int resposta = 0, resp = 0, id = 0;

    static void logo() {
        System.out.println("////////////////////////////////");
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
        while (id > claudiano.getQntClientes()) {
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
        System.out.println("  8 - Voltar ao menu anterior");
        System.out.print("  >> ");
    }

    static void menuCadCli() {
        logo();
        System.out.println("  1 - Cadastrar info pessoal");
        System.out.println("  2 - Cadastrar info corporal");
        System.out.println("  3 - Voltar ao menu anterior");
        System.out.print("  >> ");
    }
    
    static void menuInfoCorpo(){
        logo();
        System.out.println("  1 - Indice de Massa Corporal");
        System.out.println("  2 - Taxa metabolica basal");
        System.out.println("  3 - Exibir informacoes gerais");
        System.out.println("  4 - Quantidade de agua diaria");
        System.out.println("  5 - Voltar ao menu anterior");
        System.out.print  ("  >> ");
    }

    static void menuModExc() {
        logo();
        System.out.println("  1 - Modificar nome");
        System.out.println("  2 - Modificar repeticao");
        System.out.println("  3 - Modificar serie");
        System.out.println("  4 - Modificar peso");
        System.out.println("  5 - Modificar dia");
        System.out.println("  6 - Modificar tudo");
        System.out.println("  7 - Voltar ao menu anterior");
        System.out.print("  >> ");
    }

    public static void main(String[] args) {
        do {
            menu0();
            resposta = scan.nextInt();
            scan.nextLine();
            switch (resposta) {
                case 1: //Cliente
                    do {
                        menuCliente1();
                        resp = scan.nextInt();
                        scan.nextLine();
                        switch (resp) {
                            case 1: //Exibir ficha de exercicios
                                claudiano.exibirFicha(claudiano.getClientes().get(menuId()));
                                break;
                            case 2: //Exibir info corporal
                                claudiano.getClientes().get(menuId()).getCorpoCliente().infoGeral();
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
                            case 1: //cadastrar cliente
                                int cad;
                                do {
                                    menuCadCli();
                                    cad = scan.nextInt();
                                    scan.nextLine();
                                    switch (cad) {
                                        case 1: //Cadastrar info pessoal
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
                                            break;

                                        case 2: //Cadastrar info corporal
                                            int id = menuId();
                                            System.out.print("\nIdade...........: ");
                                            int idade = scan.nextInt();
                                            scan.nextLine();
                                            System.out.print("Sexo............: ");
                                            char sexo = scan.nextLine().charAt(0);
                                            System.out.print("Altura(m).......: ");
                                            double altura = scan.nextDouble();
                                            scan.nextLine();
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
                                            claudiano.getClientes().get(id).setCorpoCliente(corpo);
                                            break;
                                    }
                                } while (cad != 3);
                                break;

                            case 2: //adicionar exercicio
                                int id = menuId();
                                System.out.print("Nome do exercicio: ");
                                String nome = scan.nextLine();
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
                                
                            case 3: //modificar exercicio
                                id = menuId();
                                menuModExc();
                                int menu = scan.nextInt();
                                scan.nextLine();
                                switch(menu){
                                    case 1:
                                        claudiano.getClientes().get(id).getFicha().listar();
                                        System.out.print("\nInforme o exercicio a ser modificado: ");
                                        int index = scan.nextInt();
                                        scan.nextLine();
                                        System.out.print("\nNovo nome do exercicio: ");
                                        nome = scan.nextLine();
                                        claudiano.getClientes().get(id).getFicha().getExercicio().get(index).setNomeExe(nome);
                                        break;
                                        
                                }
                                break;
                                
                            case 4: //apagar exercicio
                                id = menuId();
                                claudiano.getClientes().get(id).getFicha().listar();
                                System.out.println("Informe o exercicio a ser excluido: ");
                                System.out.print(">>  ");
                                int nExc = scan.nextInt();
                                scan.nextLine();
                                claudiano.getClientes().get(id).getFicha().apagar(nExc);
                                break;
                                
                            case 5: //exibir ficha
                                claudiano.exibirFicha(claudiano.getClientes().get(menuId()));
                                break;
                                
                            case 6: //exibir info pessoal
                                id = menuId();
                                System.out.println(claudiano.getClientes().get(id).toString());
                                break;
                            
                            case 7:
                                int info;
                                do{
                                    menuInfoCorpo();
                                    info = scan.nextInt();
                                    scan.nextLine();
                                    id = menuId();
                                    switch(info){
                                        case 1: //IMC
                                            claudiano.getClientes().get(id).getCorpoCliente().analisaImc();
                                            break;
                                            
                                        case 2: //TMB
                                            double tmb = claudiano.getClientes().get(id).getCorpoCliente().tmb();
                                            System.out.println("Taxa metabólica basal: " + tmb + " cal");
                                            break;
                                            
                                        case 3: //InfoGeral
                                            claudiano.getClientes().get(id).getCorpoCliente().infoGeral();
                                            break;
                                            
                                        case 4: //Agua
                                            double agua = claudiano.getClientes().get(id).getCorpoCliente().agua();
                                            System.out.println("Quantidade de agua diaria: " + agua + " mL");
                                            break;
                                    }
                                    
                                }while(info != 5);
                                break;
                                
                        }
                    } while (resp != 8);
                default:
            }
        } while (resposta != 3);

    }

}
