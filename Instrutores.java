
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
