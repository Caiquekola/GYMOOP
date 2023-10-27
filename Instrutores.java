
package poogym;
import java.util.ArrayList;
public class Instrutores {
    public Instrutores(){
        this.id = "3126";
    }
    private String id;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    protected int qntClientes=-1;
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
    public void adcExc(Cliente cliente, String exc, int rep, int serie,double peso,String dia){
            cliente.getFicha().novo(exc, rep, serie, peso, dia);
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
    public void modfExc(Cliente cliente, int indexExc, String exc, int rep, int serie,float peso,String dia){
        Exercicio modiciado = new Exercicio(exc,rep,serie,peso,dia);
        cliente.getFicha().getExercicio().set(indexExc, modiciado);
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
    private void setQntClientes(int qnt){
        this.qntClientes = qnt;
    }
    protected int getQntClientes() {
        return qntClientes;
    }
    
}   
