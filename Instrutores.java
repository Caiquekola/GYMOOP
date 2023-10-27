package poogym;

import java.util.ArrayList;

public class Instrutores {
    
    private final String id = "3126";
    private ArrayList<Cliente> clientes = new ArrayList();
    protected int qntClientes=-1;
    
    public Instrutores(){
        cadastro("Caio", "012.345.678-90", "31971902735", "R. Avenida, Matriz, Congonhas-MG");
        CorpoCliente body = new CorpoCliente(18, 'm', 1.75, 65, 79, 35, 40);
        this.clientes.get(0).setCorpoCliente(body);
        this.clientes.get(0).getFicha().adicionar(1, 10, "Seg");
        this.clientes.get(0).getFicha().adicionar(3, 13, "Seg");
        this.clientes.get(0).getFicha().adicionar(8, 20, "Ter");
        this.clientes.get(0).getFicha().adicionar(14, 15, "Qua");
        this.clientes.get(0).getFicha().adicionar(20, 40, "Qui");
        this.clientes.get(0).getFicha().adicionar(21, 30, "Sex");
        this.clientes.get(0).getFicha().adicionar(24, 35, "Sab");
        cadastro("Caique", "987.654.321-01", "31963895839", "Av. Principal, Inconfidentes, Ouro Branco-MG");
        body = new CorpoCliente(18, 'm', 1.7, 57, 70, 35, 40);
        this.clientes.get(1).setCorpoCliente(body);
        this.clientes.get(1).getFicha().adicionar(2, 15, "Seg");
        this.clientes.get(1).getFicha().adicionar(4, 20, "Seg");
        this.clientes.get(1).getFicha().adicionar(9, 25, "Qua");
        this.clientes.get(1).getFicha().adicionar(15, 20, "Sex");
        this.clientes.get(1).getFicha().adicionar(21, 50, "Qui");
        this.clientes.get(1).getFicha().adicionar(22, 35, "Dom");
        this.clientes.get(1).getFicha().adicionar(23, 35, "Sab");
    }
    
    public String getId() {
        return id;
    }
    
    public void cadastro(String nome, String cpf, String telefone, String endereco){
        Cliente cliente = new Cliente(nome, cpf, telefone, endereco);
        clientes.add(cliente);
        qntClientes++;
    }
    
    public void setCorpo(Cliente cliente, int idade,char sexo,double altura,double peso, double cintura,double braco,double panturrilha){
        CorpoCliente corpo = new CorpoCliente(idade, sexo, altura, peso,  cintura, braco, panturrilha);
        cliente.setCorpoCliente(corpo);
    }
    
    public void adcExc(Cliente cliente, String exc, String musc, int rep, int serie,double peso,String dia){
            cliente.getFicha().novo(exc, musc, rep, serie, peso, dia);
    }
    
    public void modfExcNome(Cliente cliente, int indexExc,String nome){
        cliente.getFicha().getExercicio().get(indexExc).setNomeExe(nome);
    }
    
    public void modfExcRepet(Cliente cliente, int indexExc,int rept){
        cliente.getFicha().getExercicio().get(indexExc).setRepet(rept);
    }
    
    public void modfExcSerie(Cliente cliente, int indexExc,int serie){
        cliente.getFicha().getExercicio().get(indexExc).setSeries(serie);
    }
    
    public void modfExcPeso(Cliente cliente, int indexExc,double peso){
        cliente.getFicha().getExercicio().get(indexExc).setPeso(peso);
    }
    
    public void modfExcDia(Cliente cliente, int indexExc,String dia){
        cliente.getFicha().getExercicio().get(indexExc).setDiaSemana(dia);
    }
    
    public void modfExc(Cliente cliente, int indexExc, String exc, String musc, int rep, int serie,float peso, String dia){
        Exercicio modificado = new Exercicio(exc, musc, rep, serie, peso, dia);
        cliente.getFicha().getExercicio().set(indexExc, modificado);
    }
    
    public void apgExc(Cliente cliente,int indexExc){
        cliente.getFicha().apagar(indexExc);
    }
    
    public void exibirFicha(Cliente cliente){
        if(this.qntClientes>=0){
            if(cliente.getFicha().getExercicio().isEmpty()){
                System.out.println("Nao ha exercicios.");
            }
            else cliente.getFicha().listar();}
        else{
            System.out.println("ERRO! Nenhum cliente cadastrado!");
        }
    }
    public void infoPessoal(Cliente cliente){
        System.out.println(cliente.toString());
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    protected int getQntClientes() {
        return qntClientes;
    }
    
}   
