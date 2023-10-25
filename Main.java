<<<<<<< HEAD
package poogym;


import java.util.Scanner;
public class Main {

    
    static Scanner scan = new Scanner(System.in);
    static int resposta=0, resp=0, id=0;
    static void logo(){
        System.out.println("///////////////////////");
        System.out.println("\n     FITNESS CLUB\n");
        System.out.println("///////////////////////\n");
    }
    static void menu0(){
        logo();
        System.out.println("  Escolha uma opcao: ");
        System.out.println("  1 - Cliente");
        System.out.println("  2 - Instrutor");
        System.out.println("  3 - Sair");
        System.out.print("  >> ");
    }
    static void menuCliente0(){
        logo();
        System.out.println("  Insira seu id: ");
        System.out.print("  >> ");
    }
    static void menuCliente1(){
        logo();
        System.out.println("   1 - Ver ficha");
        System.out.println("   2 - Informacao corpo");
        System.out.println("   3 - Voltar ao menu anterior");
        System.out.print("   >> ");
        
    }
    public static void main(String[] args) {
        Instrutores claudiano = new Instrutores();
        do{
            menu0();
            resposta = scan.nextInt();
            switch(resposta){
                case 1: 
                    do{
                        menuCliente1();
                        resp = scan.nextInt();
                        switch(resp){
                            case 1:
                                menuCliente0();
                                id = scan.nextInt();
                                while(id>claudiano.getQntClientes()){
                                System.out.println("  ID Invalido!");
                                System.out.print("  >> ");
                                id = scan.nextInt();
                                }
                                claudiano.exibirFicha(claudiano.getClientes().get(id));
                                break;
                            case 2:
                                menuCliente0();
                                id = scan.nextInt();
                                while(id>claudiano.getQntClientes()){
                                System.out.println("  ID Invalido!");
                                System.out.print("  >> ");
                                id = scan.nextInt();
                                }
                                claudiano.getClientes().get(id).getCorpoCliente().infoGeral();
                                break;
                            default:
                                
                        }
                        
                    }while(resp!=3);
                    resposta = 0;
                    break;
                case 2:
                    
                    break;
                default:
                
            }
        }while(resposta!=3);
        
    }

    
}
=======
package poogym;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static Scanner scan = new Scanner(System.in);
    static String resposta="null";
    public static void main(String[] args) {
        
        do{
            System.out.println("----------------------");
            System.out.println("    /nFITNESS CLUB/n");
System.out.println("----------------------/n");
System.out.println("");


            
            
            
            resposta = scan.nextLine().trim().toUpperCase();
        }while(!resposta.startsWith("S"));
        
    }

    
}
>>>>>>> f7f323cbb9728b61fd8ce6ab009a111d4c43521f
