<<<<<<< HEAD

package poogym;
import java.util.ArrayList;
import java.util.List;
public class Instrutores {
    public Instrutores(){
        this.id = "3126";
    }
    private String id;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    int qntClientes=0;
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
    public void adcExc(Cliente cliente, String exc, int rep, int serie,float peso,String dia){
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
        cliente.getFicha().listar();
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

    public int getQntClientes() {
        return qntClientes;
    }
    
}   
=======

package poogym;
import java.util.ArrayList;
public class Instrutores {
    public Instrutores(){
        this.id = "3126";
    }
    String id;
    public void criarFicha(Cliente cliente,Ficha ficha){
        cliente.getFicha().add(ficha);   
        cliente.setQntFichas(cliente.getQntFichas()+1);
    }
    public void adcExc(Cliente cliente, Ficha ficha,String exc, int rep, int serie,float peso){
        if(cliente.getQntFichas()==0){
            System.out.println("Nenhuma ficha foi criada!\nCrie uma ficha antes!");
        }else{
            int nFicha = cliente.getQntFichas()-1;
            cliente.getFicha().get(nFicha).adcExercicio(exc);
            cliente.getFicha().get(nFicha).adcRepeticao(rep);
            cliente.getFicha().get(nFicha).adcSerieExc(serie);
            cliente.getFicha().get(nFicha).adcPeso(peso);
        }
        
    }
//    public void modfExc(Cliente cliente, Ficha ficha,int nExc){
//        
//    }
    public void exibirFicha(Cliente cliente,Ficha ficha,int nFicha){
        cliente.getFicha().get(nFicha).fichaFinal();
    }
    public void infoPessoal(Cliente cliente){
        System.out.println(cliente.toString());
    }
    
    
    
}   
>>>>>>> f7f323cbb9728b61fd8ce6ab009a111d4c43521f
